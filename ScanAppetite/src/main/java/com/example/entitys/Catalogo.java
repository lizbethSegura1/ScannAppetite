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
public class Catalogo {
	@Id
	private String id;

	private String descripcion;

	@Column(name = "Horario")
	private java.sql.Timestamp horario;

	@ManyToOne
	@JoinColumn(name = "RestauranteID")
	private Restaurante restaurante;

	public Catalogo(String id, String descripcion, Timestamp horario, Restaurante restaurante) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.horario = horario;
		this.restaurante = restaurante;
	}

	public Catalogo() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public java.sql.Timestamp getHorario() {
		return horario;
	}

	public void setHorario(java.sql.Timestamp horario) {
		this.horario = horario;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

}
