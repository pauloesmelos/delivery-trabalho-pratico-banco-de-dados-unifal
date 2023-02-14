package com.delivery.models;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment
    private Long idendereco;
    private String rua;
    private String cidade;
    private String estado;
    private String cep;
    public Endereco(Long idendereco,String rua,String cidade,String estado,String cep){
        this.idendereco = idendereco;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
    @OneToOne(mappedBy = "endereco",cascade = CascadeType.ALL)
    private Cliente cliente;
    @OneToOne(mappedBy = "endereco",cascade = CascadeType.ALL)
    private Pedido pedido;
    public Endereco() {

    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

}
