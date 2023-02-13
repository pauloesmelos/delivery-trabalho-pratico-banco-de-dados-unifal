package com.delivery.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Component
@Entity
@Table(name="Cliente")
public class Cliente{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment
    private Long idCliente;
    private String nome;
    private String email;

   // @OneToOne(cascade = CascadeType.PERSIST)
   // @JoinColumn(name="idEndereco")
    //private Endereco endereco;

    public Cliente(){
        //telefones = new ArrayList<>();
    }
    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //public Endereco getEndereco() {
    //    return endereco;
    //}

  //  public void setEndereco(Endereco endereco) {
   //     this.endereco = endereco;
   // }
}
