package com.delivery.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Entity
@Table(name="Telefone")
//@IdClass(Cliente.class)
public class Telefone{

    @Id
    private Long idTelefone;
    //@Id
    //private Long idCliente;
    private String telefonefixo;
    private String telefonemovel;

    public Telefone(){

    }
    public Long getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(Long idTelefone) {
        this.idTelefone = idTelefone;
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
