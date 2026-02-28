package com.pizzeria.proyectoLafogata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.pizzeria.proyectoLafogata.model.Pedido;
import com.pizzeria.proyectoLafogata.service.PedidoService;
import com.pizzeria.proyectoLafogata.service.PizzaService;

@Controller
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService ped;

    @Autowired
    private PizzaService serv;

    @GetMapping
    public String pedidoList(Model model) {
        model.addAttribute("pedido", new Pedido());
        model.addAttribute("pedidos", ped.getAll());
        model.addAttribute("Pizza", serv.getAll());
        return "pedido"; 
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Pedido pedido, @RequestParam Long pizzaId) {
        pedido.setPizza(serv.buscarPorId(pizzaId));
        ped.save(pedido);
        return "redirect:/pedido";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Long id) {
        ped.eliminarPorId(id);
        return "redirect:/pedido";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") Long id, Model model) {
        model.addAttribute("pedidos", ped.getAll());
        model.addAttribute("pedido", ped.buscarPorId(id));
        model.addAttribute("Pizza", serv.getAll());
        return "pedido";
    }
}