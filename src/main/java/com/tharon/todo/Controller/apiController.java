package com.tharon.todo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiController {
    @GetMapping(value = "/")
        public String getPage() {
        return "Hello World";
    }
}
