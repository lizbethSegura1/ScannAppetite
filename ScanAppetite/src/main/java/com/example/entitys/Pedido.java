package com.example.entitys;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int estado;

	@Column(name = "TipoPago")
	private String tipoPago;

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
		this.tipoPago = tipoPago;
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

	public String getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
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
