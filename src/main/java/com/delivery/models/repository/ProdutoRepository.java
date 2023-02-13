package com.delivery.models.repository;

import com.delivery.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
    List<Produto> findAll();
    Produto findById(long idProduto);
    Produto save(Produto produto);
}
