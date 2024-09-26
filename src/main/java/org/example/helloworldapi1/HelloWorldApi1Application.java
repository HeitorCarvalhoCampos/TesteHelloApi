package org.example.helloworldapi1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApi1Application {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApi1Application.class, args);
    }

    @GetMapping("/hi")
    public String hello() {
        return "Hello World!";
    }

}
