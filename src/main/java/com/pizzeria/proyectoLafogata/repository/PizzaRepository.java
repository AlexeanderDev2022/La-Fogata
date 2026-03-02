package com.pizzeria.proyectoLafogata.repository;

import com.pizzeria.proyectoLafogata.model.Pedido;
import com.pizzeria.proyectoLafogata.model.Pizza;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
    // @Query("SELECT p FROM Pizza p LEFT JOIN FETCH p.pedidos WHERE p.id = :id")
    // Optional<Pizza> findByIdWithPedidos(@Param("id") Long id);
    // }
}