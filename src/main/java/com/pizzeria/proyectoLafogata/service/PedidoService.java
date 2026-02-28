package com.pizzeria.proyectoLafogata.service;

import com.pizzeria.proyectoLafogata.model.Pedido;
import com.pizzeria.proyectoLafogata.repository.PedidoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PedidoService {
    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<Pedido> getAll() { return pedidoRepository.findAll(); }
    public Pedido save(Pedido pedido) { return pedidoRepository.save(pedido); 
    }
    public void eliminarPorId(Long id) {
		pedidoRepository.deleteById(id);
	}
	public Pedido buscarPorId(Long id) {
		return pedidoRepository.findById(id).orElse(null);
    
}}