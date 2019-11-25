package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/about")
    public String contact() {
        return "about";
    }

    @RequestMapping("/contact")
    public String about() {
        return "contact";
    }
}
