package org.example.day6springjpa;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> getAllStudents() {
        logger.info("Fetching all students");
        return studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Long id) {
        logger.info("Fetching student with id: {}", id);
        Student student = studentRepository.findById(id).orElse(null);
        if (student == null) {
            logger.warn("Student not found with id: {}", id);
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Student not found with id: " + id);
        }
        return ResponseEntity.ok(student);
    }

    @PostMapping
    public ResponseEntity<?> createStudent(@Valid @RequestBody Student student) {
        logger.info("Creating new student: {}", student.getName());
        return ResponseEntity.ok(studentRepository.save(student));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable Long id, @Valid @RequestBody Student updatedStudent) {
        logger.info("Updating student with id: {}", id);
        Student student = studentRepository.findById(id).orElse(null);
        if (student == null) {
            logger.warn("Cannot update. Student not found with id: {}", id);
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Cannot update. Student not found with id: " + id);
        }
        student.setName(updatedStudent.getName());
        student.setCourse(updatedStudent.getCourse());
        return ResponseEntity.ok(studentRepository.save(student));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable Long id) {
        logger.info("Deleting student with id: {}", id);
        if (!studentRepository.existsById(id)) {
            logger.warn("Cannot delete. Student not found with id: {}", id);
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Cannot delete. Student not found with id: " + id);
        }
        studentRepository.deleteById(id);
        return ResponseEntity.ok("Student deleted with id: " + id);
    }

    // Microservices - Inter-service communication demo
    @GetMapping("/{id}/course-info")
    public String getStudentCourseInfo(@PathVariable Long id) {
        logger.info("Fetching course info for student id: {}", id);
        Student student = studentRepository.findById(id).orElse(null);
        if (student == null) {
            return "Student not found";
        }

        RestTemplate restTemplate = new RestTemplate();
        String courseDetails = restTemplate.getForObject(
                "http://localhost:8082/courses/1", String.class
        );

        return "Student: " + student.getName() + " | Course Details: " + courseDetails;
    }
}
