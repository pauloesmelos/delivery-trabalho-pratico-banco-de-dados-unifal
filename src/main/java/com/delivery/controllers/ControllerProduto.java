package com.delivery.controllers;
import com.delivery.models.Produto;
import com.delivery.models.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
public class ControllerProduto {
    @Autowired//injeção se dependencia
    private ProdutoRepository produtoRepository;
    @GetMapping("/produto")
    public String produtosForm(Produto produto){
        return "/produto";
    }
    @PostMapping("/add")
    public String novo(Produto produto, BindingResult result){
        if(result.hasFieldErrors()){
            return "redirect:/";
        }
        produtoRepository.save(produto);
        return "redirect:/produto";
    }

}
