package com.delivery.controllers;

import com.delivery.models.Cliente;
import com.delivery.models.Endereco;
import com.delivery.models.Telefone;
import com.delivery.models.repository.ClienteRepository;
import com.delivery.models.repository.EnderecoRepository;
import com.delivery.models.repository.TelefoneRepository;
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
    @Autowired
    private TelefoneRepository telefoneRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;

    @GetMapping("/cliente")
    public String cliente(Cliente cliente,Telefone telefone,Endereco endereco){
        return "/cliente";
    }
    @PostMapping("/addCliente")
    public String novoCliente(Cliente cliente, Telefone telefone, Endereco endereco, BindingResult result){
        if(result.hasFieldErrors()){
            return "redirect:/";
        }
        clienteRepository.save(cliente);
        telefoneRepository.save(telefone);
        enderecoRepository.save(endereco);
        return "redirect:/";
    }

}
