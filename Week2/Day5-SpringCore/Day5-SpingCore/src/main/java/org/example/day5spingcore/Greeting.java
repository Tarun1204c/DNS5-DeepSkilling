package org.example.day5spingcore;

import org.springframework.stereotype.Component;

@Component
public class Greeting {
    public String sayHello() {
        return "Hello from Spring Bean";
    }

}
