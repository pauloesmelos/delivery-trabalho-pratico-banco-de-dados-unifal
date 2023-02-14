package com.delivery.models.repository;

import com.delivery.models.Cliente;
import com.delivery.models.Produto;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    List<Cliente> findAll();
    Cliente findById(long idCliente);

    Cliente save(Cliente cliente);
}
