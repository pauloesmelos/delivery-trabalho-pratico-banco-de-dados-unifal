package com.delivery.models.repository;

import com.delivery.models.Cliente;
import com.delivery.models.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TelefoneRepository extends JpaRepository<Telefone,Long> {
    List<Telefone> findAll();
    Telefone findById(long idTelefone);
    Telefone save(Telefone telefone);
}
