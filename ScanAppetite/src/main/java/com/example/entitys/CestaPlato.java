package com.example.entitys;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

    @Getter
	@Setter
	@AllArgsConstructor

	@Entity
	@IdClass(CatalogoPlatoId.class)
	@Table(name="cesta_plato")

	public class CestaPlato {

		@Id
		@ManyToOne
		@JoinColumn(name = "cestaid")
		private Cesta cesta;

		
		@JdbcTypeCode(SqlTypes.JSON)
		@Id
		@ManyToOne
		@JoinColumn(name = "PlatoId")
		private Plato plato;

		
	}
	

