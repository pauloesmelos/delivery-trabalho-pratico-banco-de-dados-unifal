package com.delivery.controllers;

import com.delivery.models.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerCliente {
    @GetMapping("/cliente")
    public String cliente(){

        return "/cliente";
    }
}
