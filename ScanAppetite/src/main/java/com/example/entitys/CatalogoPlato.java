package com.example.entitys;

import java.util.List;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

@Entity
@IdClass(CatalogoPlatoId.class)
@Table(name="catalogo_plato")

public class CatalogoPlato {

	@Id
	@ManyToOne
	@JoinColumn(name = "catalogoid")
	private Catalogo catalogo;

	
	@JdbcTypeCode(SqlTypes.JSON)
	@Id
	@ManyToOne
	@JoinColumn(name = "PlatoId")
	private Plato plato;

	@OneToMany
	private List<Plato> platos;

	public CatalogoPlato(Catalogo catalogo, List<Plato> platos) {
		this.catalogo = catalogo;
		this.platos = platos;
	}

}