package com.delivery.models;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Cliente")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment
    private Long idcliente;
    private String nome;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="idendereco")
    private Endereco endereco;
    @OneToOne(mappedBy = "cliente",cascade = CascadeType.ALL)
    private Pedido pedido;

    @OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<ClienteTelefone> clienteTelefones = new ArrayList<>();
    public Cliente(String nome,String email){
        this.nome = nome;
        this.email = email;
    }
    public Cliente(){

    }
    public Long getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Long idcliente) {
        this.idcliente = idcliente;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public List<ClienteTelefone> getClienteTelefones() {
        return clienteTelefones;
    }

    public void setClienteTelefones(List<ClienteTelefone> clienteTelefones) {
        this.clienteTelefones = clienteTelefones;
    }
}