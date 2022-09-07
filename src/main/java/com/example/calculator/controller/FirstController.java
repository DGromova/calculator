package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {
    @GetMapping
    public String showHelloWorld() {
        return "Hello, world";
    }
}
