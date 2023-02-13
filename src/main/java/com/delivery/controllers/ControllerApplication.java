package com.delivery.controllers;
import com.delivery.models.Pedido;
import com.delivery.models.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerApplication {
    @Autowired
    private PedidoRepository pedidoRepository;
    @GetMapping("/")
    public String index(Pedido pedido){

        return "index";
    }
    @PostMapping("/addPedido")//mapear um elemento com o mesmo nome de um elemento de outro Controller gera ERRO!!!
    public String novoPedido(Pedido pedido, BindingResult result){
        if(result.hasFieldErrors()){
            return "redirect:/";
        }
        pedidoRepository.save(pedido);
        return "redirect:/";
    }
}
