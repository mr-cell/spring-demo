package mr.cell.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello, world!";
    }
}
