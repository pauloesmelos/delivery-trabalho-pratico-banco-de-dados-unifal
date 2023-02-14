package com.delivery.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="telefone")
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment
    private Long idtelefone;

    private String numero;
    private String codigo;

    @OneToMany(mappedBy = "telefone",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<ClienteTelefone> clienteTelefoneList = new ArrayList<>();
    public Telefone(String numero,String codigo){
        this.numero = numero;
        this.codigo = codigo;
    }
    public Telefone(){

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<ClienteTelefone> getClienteTelefoneList() {
        return clienteTelefoneList;
    }

    public void setClienteTelefoneList(List<ClienteTelefone> clienteTelefoneList) {
        this.clienteTelefoneList = clienteTelefoneList;
    }
}
