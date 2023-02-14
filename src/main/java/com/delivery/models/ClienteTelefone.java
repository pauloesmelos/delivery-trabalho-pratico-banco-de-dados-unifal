package com.delivery.models;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@IdClass(ClienteTelefoneKey.class)
public class ClienteTelefone {
    @Id
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Cliente cliente;
    @Id
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Telefone telefone;
}
