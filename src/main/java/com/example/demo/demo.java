package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class demo {
    @RequestMapping("/demo")
    public String demo(Model model){
        return "demo";

    }
}