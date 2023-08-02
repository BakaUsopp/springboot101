package com.example.springboot101.controller;

import com.example.springboot101.dto.Person;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping( "/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return "Hello, "+ name +"!";
    }

    @PostMapping("/bye")
    public String postname(@RequestBody Person person) {
        return "Bye, "+ person.getName() + "!";
    }

    @GetMapping("/get")
    public List<Person> getALlPerson() {

        Person person = new Person();
        person.setName("Yatsu");
//        person.setName("Yats");
//        person.setName("Yat");
//        person.setName("Ya");
        return Arrays.asList(person);
    }

    @GetMapping("response")
    public void statusAnno(HttpServletResponse response){
        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
    }

}

