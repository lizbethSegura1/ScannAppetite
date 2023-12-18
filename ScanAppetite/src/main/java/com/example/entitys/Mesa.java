package com.example.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

@Entity
public class Mesa {

	@Id
	@Column(name = "ID")
	private String id;

	private String ubicacion;

	@Column(name = "estado", columnDefinition = "char(255)")
	private String estado;

	@Column(name = "RestauranteID")
	private String restauranteId;

	public Mesa(String mesaId) {
		this.id = mesaId;
		// Puedes inicializar otros atributos si es necesario
	}

}
