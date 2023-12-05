package com.example.entitys;

import java.sql.Time;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Catalogo {

	@Id
	private String Id;

	private String descripcion;

	@Column(name = "horario_inicio")
	private Time horarioInicio;

	@Column(name = "horario_fin")
	private Time horarioFin;

	@OneToMany(mappedBy = "catalogo", cascade = CascadeType.ALL)
	private List<Plato> platos;

	@ManyToMany
	@JoinTable(name = "catalogo_plato", joinColumns = @JoinColumn(name = "catalogo_id"), inverseJoinColumns = @JoinColumn(name = "PlatoId"))
	
	public List<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(List<Plato> platos) {
		this.platos = platos;
	}

	public Catalogo(String id, String descripcion, Time horarioInicio, Time horarioFin, Restaurante restaurante) {
		super();
		Id = id;
		this.descripcion = descripcion;
		this.horarioInicio = horarioInicio;
		this.horarioFin = horarioFin;
		this.restaurante = restaurante;
	}

	@ManyToOne
	@JoinColumn(name = "RestauranteID")
	private Restaurante restaurante;

	public Time getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(Time horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public Time getHorarioFin() {
		return horarioFin;
	}

	public void setHorarioFin(Time horarioFin) {
		this.horarioFin = horarioFin;
	}

	public Catalogo() {

	}

	public String getId() {
		return Id;
	}

	public void setId(String Id) {
		this.Id = Id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

}
