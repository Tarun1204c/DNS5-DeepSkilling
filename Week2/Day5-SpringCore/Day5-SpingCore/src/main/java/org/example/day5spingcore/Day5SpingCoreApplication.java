package org.example.day5spingcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Day5SpingCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day5SpingCoreApplication.class, args);
    }

    @Component
    static class Runner implements CommandLineRunner {

        @Autowired
        private Greeting greeting;

        @Override
        public void run(String... args) {
            System.out.println(greeting.sayHello());
        }
    }
}
