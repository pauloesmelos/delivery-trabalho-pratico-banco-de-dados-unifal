package com.delivery.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerApplication {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
