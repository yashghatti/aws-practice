package ca.yashghatti.tm.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    public String helloWorld() {
        return "<h1>Hello World</h1>";
    }

}
