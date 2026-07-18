package org.example.day6springjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@SpringBootApplication
public class Day6SpringJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day6SpringJpaApplication.class, args);
    }

    @org.springframework.stereotype.Component
    static class Runner implements CommandLineRunner {

        @Autowired
        private StudentRepository studentRepository;

        @Override
        public void run(String... args) {
            Student s1 = new Student();
            s1.setName("Tarun");
            s1.setCourse("DN5.0 Deep Skilling");
            studentRepository.save(s1);

            Student s2 = new Student();
            s2.setName("Rahul");
            s2.setCourse("Java Backend");
            studentRepository.save(s2);

            List<Student> students = studentRepository.findAll();
            System.out.println("---- All Students ----");
            for (Student s : students) {
                System.out.println("ID: " + s.getId() + ", Name: " + s.getName() + ", Course: " + s.getCourse());
            }
        }
    }
}