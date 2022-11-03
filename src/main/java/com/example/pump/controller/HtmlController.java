package com.example.pump.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping("/index")
    public String getIndex(){
        return "index.html";
    }
}
