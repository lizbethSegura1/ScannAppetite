package com.example.entitys;

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

	//Clase para representar la clave primaria compuesta

	public class CestaPlatoId {

		private String catalogo;
		private Long plato;
		
	}



