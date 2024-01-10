package com.example.entitys;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "catalogo", catalog = "scanappetite")
public class Catalogo implements java.io.Serializable {

	private String id;
	private Restaurante restaurante;
	private String descripcion;
	private Date horarioInicio;
	private Date horarioFin;
	private List<Plato> platos = new ArrayList<Plato>();

	public Catalogo() {
	}

	public Catalogo(String id, Restaurante restaurante) {
		this.id = id;
		this.restaurante = restaurante;
	}

	public Catalogo(String id, Restaurante restaurante, String descripcion, Date horarioInicio, Date horarioFin,
			List<Plato> platos) {
		this.id = id;
		this.restaurante = restaurante;
		this.descripcion = descripcion;
		this.horarioInicio = horarioInicio;
		this.horarioFin = horarioFin;
		this.platos = platos;

	}

	@Id

	@Column(name = "Id", unique = true, nullable = false)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RestauranteID", nullable = false)
	@JsonIgnore
	public Restaurante getRestaurante() {
		return this.restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	@Column(name = "Descripcion")
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "horario_inicio", length = 15)
	public Date getHorarioInicio() {
		return this.horarioInicio;
	}

	public void setHorarioInicio(Date horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "horario_fin", length = 15)
	public Date getHorarioFin() {
		return this.horarioFin;
	}

	public void setHorarioFin(Date horarioFin) {
		this.horarioFin = horarioFin;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "catalogo")
	public List<Plato> getPlatos() {
		return this.platos;
	}

	public void setPlatos(List<Plato> platos) {
		this.platos = platos;
	}

}
