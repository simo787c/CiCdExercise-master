package com.example.cicdexercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/page1")
    public String page1() {
        return "page1";
    }

    @GetMapping("/4")
    public String html4(){return "4.html";}

    @GetMapping("/pony") //hans
    public String pony() {return "mlp"; }

    @GetMapping("/page2")
    public String page2(){return "page2";}
}
