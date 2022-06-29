package com.example.springcijenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCiJenkinsApplication {

    @GetMapping
    public ResponseEntity<String> greeting() {
        return new ResponseEntity<>("Hello World!!!", HttpStatus.OK);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCiJenkinsApplication.class, args);
    }

}
