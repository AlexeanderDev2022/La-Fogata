package com.pizzeria.proyectoLafogata.service;

import com.pizzeria.proyectoLafogata.model.Pizza;
import com.pizzeria.proyectoLafogata.repository.PizzaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PizzaService {

    private final PizzaRepository pizzaRepository;

    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    // Obtener todas las pizzas
    public List<Pizza> getAll() {
        return pizzaRepository.findAll();
    }

    // Guardar o actualizar pizza
    public Pizza save(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    // Buscar pizza por ID
    public Pizza buscarPorId(Long id) {
        Optional<Pizza> pizza = pizzaRepository.findById(id);
        return pizza.orElse(null);
    }

    // Obtener pizza con lista de pedidos
    public Pizza getPizzaWithPedidos(Long id) {
        Pizza pizza = buscarPorId(id);
        if (pizza != null) {
            pizza.getPedidos().size(); // fuerza la carga de pedidos si es lazy
        }
        return pizza;
    }

    // Eliminar pizza
    public void eliminarPorId(Long id) {
        pizzaRepository.deleteById(id);
    }
}