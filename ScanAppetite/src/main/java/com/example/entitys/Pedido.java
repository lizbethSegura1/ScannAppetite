package com.example.entitys;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Pedido {

	@Id
	@Column(columnDefinition = "int(10)")
	private Long id;

	private int estado;

	@Column(name = "Tipo_Pago")
	private String tipo_pago;

	@Column(name = "Hora")
	private java.sql.Timestamp hora;
	
	

	@ManyToOne
	@JoinColumn(name = "MesaID")
	private Mesa mesa;
	public Pedido() {
		
	}
	public Pedido(Long id, int estado, String tipoPago, Timestamp hora, Mesa mesa) {
		super();
		this.id = id;
		this.estado = estado;
		this.tipo_pago = tipoPago;
		this.hora = hora;
		this.mesa = mesa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getTipo_pago() {
		return tipo_pago;
	}

	public void setTipo_pago(String tipoPago) {
		this.tipo_pago = tipoPago;
	}

	public java.sql.Timestamp getHora() {
		return hora;
	}

	public void setHora(java.sql.Timestamp hora) {
		this.hora = hora;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	
}
