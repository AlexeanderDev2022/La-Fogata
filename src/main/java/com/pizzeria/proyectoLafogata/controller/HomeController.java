package com.pizzeria.proyectoLafogata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "redirect:/pedido";
	}
}
