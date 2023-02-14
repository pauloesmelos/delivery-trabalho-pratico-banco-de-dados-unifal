package com.delivery.controllers;

import com.delivery.models.Cliente;
import com.delivery.models.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerCliente {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/cliente")
    public String cliente(){
        return "/cliente";
    }
    @PostMapping("/addCliente")
    public String novoCliente(Cliente cliente, BindingResult result){
        if(result.hasFieldErrors()){
            return "redirect:/";
        }
        clienteRepository.save(cliente);
        return "redirect:/";
    }

}
