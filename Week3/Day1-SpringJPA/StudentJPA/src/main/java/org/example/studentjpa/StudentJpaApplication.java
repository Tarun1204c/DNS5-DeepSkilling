package org.example.studentjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.List;

@SpringBootApplication
public class StudentJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentJpaApplication.class, args);
    }

    @Component
    static class Runner implements CommandLineRunner {

        @Autowired
        private StudentRepository studentRepository;

        @Override
        public void run(String... args) {
            Student s1 = new Student();
            s1.setName("Tarun");
            studentRepository.save(s1);

            Student s2 = new Student();
            s2.setName("Durgesh");
            studentRepository.save(s2);

            Student s3 = new Student();
            s3.setName("Harshita");
            studentRepository.save(s3);

            List<Student> students = studentRepository.findAll();
            System.out.println("---- Stored Student Names ----");
            for (Student s : students) {
                System.out.println("ID: " + s.getId() + ", Name: " + s.getName());
            }
        }
    }
}
