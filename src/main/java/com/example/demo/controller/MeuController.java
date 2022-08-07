package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/professor")

public class MeuController {

    //http://localhost:8080/professor/
    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("boa noite pessoal");
    }

    //http://localhost:8080/professor/
    @GetMapping(value="/find")
    public ResponseEntity<String> teste(@RequestParam(required = true) Long id) {
        return ResponseEntity.ok("boa noite pessoal e amigos" + id);
    }

}
