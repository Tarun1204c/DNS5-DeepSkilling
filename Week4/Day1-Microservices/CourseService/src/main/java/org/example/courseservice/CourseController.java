package org.example.courseservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @GetMapping("/{id}")
    public String getCourseById(@PathVariable Long id) {
        // Simple hardcoded logic for demo
        if (id == 1) {
            return "DN5.0 Deep Skilling Program";
        } else if (id == 2) {
            return "Java Backend Development";
        }
        return "Course not found";
    }
}
