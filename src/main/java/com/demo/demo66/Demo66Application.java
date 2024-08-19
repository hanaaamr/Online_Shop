package com.demo.demo66;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo66Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo66Application.class, args);
    }


    @GetMapping
    public String  hello(){
       return "Hanouna";
    }
}
