package com.example.entitys;

import java.sql.Time;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
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


	@JdbcTypeCode(SqlTypes.JSON)
	@ManyToMany
	@JoinTable(name = "catalogo_plato", joinColumns = @JoinColumn(name = "catalogoId"), inverseJoinColumns = @JoinColumn(name = "PlatoId"))


	public List<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(List<Plato> platos) {
		this.platos = platos;
	}

	@ManyToOne
	@JoinColumn(name = "RestauranteID")
	private Restaurante restaurante;

}
