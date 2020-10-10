package com.luv2code.springdemo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processing(){
        return "shalom";
    }

    @RequestMapping("/processingNumberTwo")
    public String letsShoutName(HttpServletRequest request, Model model){
        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
        String res = "Yo! " + theName;
        model.addAttribute("message", res);

        return "letsShoutName";
    }

    @RequestMapping("/processingNumberThree")
    public String letsShoutNameTwo(@RequestParam("studentName") String theName, Model model){
        theName = theName.toUpperCase();
        String res = "Hello, bro! " + theName;
        model.addAttribute("message", res);

        return "letsShoutName";
    }

}
