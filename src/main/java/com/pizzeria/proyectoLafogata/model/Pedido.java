package com.pizzeria.proyectoLafogata.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name = "tblpedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;

    private String codPed;
    private String nombreCliente;
    private Integer nroMesa;
    private Boolean esParaLlevar;
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "id_pizza")
    private Pizza pizza;

    private String tamano;

    @Column(updatable = false)
    private LocalDateTime fecha = LocalDateTime.now();

    @PostPersist
    private void generarCodigo() {
        if (this.codPed == null) {
            this.codPed = "PD-" + this.idPedido;
        }
    }

    // Getters y Setters
    public Long getIdPedido() { return idPedido; }
    public void setIdPedido(Long idPedido) { this.idPedido = idPedido; }

    public String getCodPed() { return codPed; }
    public void setCodPed(String codPed) { this.codPed = codPed; }

    public String getNombreCliente() { return nombreCliente; }
    public void setNombreCliente(String nombreCliente) { this.nombreCliente = nombreCliente; }

    public Integer getNroMesa() { return nroMesa; }
    public void setNroMesa(Integer nroMesa) { this.nroMesa = nroMesa; }

    public Boolean getEsParaLlevar() { return esParaLlevar; }
    public void setEsParaLlevar(Boolean esParaLlevar) { this.esParaLlevar = esParaLlevar; }

    public Integer getCantidad() { return cantidad; }
    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }

    public Pizza getPizza() { return pizza; }
    public void setPizza(Pizza pizza) { this.pizza = pizza; }

    public String getTamano() { return tamano; }
    public void setTamano(String tamano) { this.tamano = tamano; }

    public LocalDateTime getFecha() { return fecha; }
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }
}