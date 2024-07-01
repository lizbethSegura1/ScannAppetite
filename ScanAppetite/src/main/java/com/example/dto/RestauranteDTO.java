package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class RestauranteDTO {

	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	public class RestauranteDto {
	    private String id;
	    private String direccion;
	    private String horaApertura;
	    private String horaCierre;
	    private String mesa;
	}
}
