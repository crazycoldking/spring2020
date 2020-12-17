package org.codeboy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(value = "/hi")
    public String sayHello(@RequestParam(value = "name", defaultValue = "world") String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping(value = "/")
    public ResponseEntity systemInfo() {
        return new ResponseEntity("Welcome to Spring World!", HttpStatus.OK);
    }

}
