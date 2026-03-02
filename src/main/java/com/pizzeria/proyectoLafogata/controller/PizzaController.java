package com.pizzeria.proyectoLafogata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.pizzeria.proyectoLafogata.model.Pizza;
import com.pizzeria.proyectoLafogata.service.PizzaService;

@Controller
@RequestMapping("/pizzas")
public class PizzaController {

    private final PizzaService pizzaService;

    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping
    public String listarPizzas(Model model) {
        model.addAttribute("pizzas", pizzaService.getAll());
        return "pizzas";
    }

    @GetMapping("/{id}")
    public String verPizza(@PathVariable Long id, Model model) {
        Pizza pizza = pizzaService.getPizzaWithPedidos(id);
        if (pizza == null)
            return "redirect:/pizzas";
        model.addAttribute("pizza", pizza);
        model.addAttribute("pedidos", pizza.getPedidos());
        return "pizza-detalle";
    }

    @GetMapping("/nuevo")
    public String mostrarFormulario(Pizza pizza) {
        return "pizza-form";
    }

    @PostMapping("/guardar")
    public String guardarPizza(Pizza pizza) {
        pizzaService.save(pizza);
        return "redirect:/pizzas";
    }
}