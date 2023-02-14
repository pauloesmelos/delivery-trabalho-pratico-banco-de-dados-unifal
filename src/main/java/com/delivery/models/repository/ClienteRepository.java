package com.delivery.models.repository;

import com.delivery.models.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long>{
    List<Cliente> findAll();
    Cliente findById(long idCliente);

    Cliente save(Cliente cliente);
}
