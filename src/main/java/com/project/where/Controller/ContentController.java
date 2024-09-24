package com.project.where.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentController {

    @GetMapping("/login")
    public String login() {
        return "login"; // returns login.html template
    }

    @GetMapping("/req/signup")
    public String signup() {
        return "signup";
    }

}
