package com.luv2code.springdemo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/joe")
public class JoeController {
    @RequestMapping("/showForm")
    public String getOut(){
        return "silly";
    }
}
