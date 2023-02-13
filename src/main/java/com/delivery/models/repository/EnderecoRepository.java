package com.delivery.models.repository;

import com.delivery.models.Cliente;
import com.delivery.models.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnderecoRepository extends JpaRepository<Endereco,Long> {
    List<Endereco> findAll();
    Endereco findById(long idEndereco);
    Endereco save(Endereco endereco);
}
