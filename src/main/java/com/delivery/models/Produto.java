package com.delivery.models;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Produto")
public class Produto{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto incremente
    private Long idProduto;
    private String descricao;
    private double preco;
    public Produto(){

    }
    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Long getIdProduto(){
        return idProduto;
    }
    public void setIdProduto(Long idProduto){
        this.idProduto = idProduto;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

}
