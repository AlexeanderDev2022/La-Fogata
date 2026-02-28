package com.pizzeria.proyectoLafogata.repository;

import com.pizzeria.proyectoLafogata.model.Pedido;
import com.pizzeria.proyectoLafogata.model.Pizza;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {}