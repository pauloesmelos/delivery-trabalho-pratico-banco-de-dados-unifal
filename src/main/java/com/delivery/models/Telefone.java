package com.delivery.models;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Telefone")
public class Telefone{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTelefone;
    private String telefonefixo;
    private String telefonemovel;

    public Telefone() {

    }

    public String getTelefonefixo() {
        return telefonefixo;
    }

    public void setTelefonefixo(String telefonefixo) {
        this.telefonefixo = telefonefixo;
    }

    public String getTelefonemovel() {
        return telefonemovel;
    }

    public void setTelefonemovel(String telefonemovel) {
        this.telefonemovel = telefonemovel;
    }

}
