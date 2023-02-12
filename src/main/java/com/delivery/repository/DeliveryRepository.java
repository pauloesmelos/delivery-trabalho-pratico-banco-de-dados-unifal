package com.delivery.repository;

import com.delivery.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Produto,Long> {
}
