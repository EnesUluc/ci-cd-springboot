package com.enes.jenkinsspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping(path = "/")
    public String hello(){
        return """
                <h1>Welcome to my app</h1>
                <p>This is an example spring boot project.</p>
                """;
    }
}
