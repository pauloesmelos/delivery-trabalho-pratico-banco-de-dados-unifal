package com.delivery.models.repository;

import com.delivery.models.Pedido;
import com.delivery.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {
    List<Pedido> findAll();
    Pedido findById(long idPedido);
    Pedido save(Pedido pedido);
}
