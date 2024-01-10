package com.example.entitys;

import java.util.List;

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
public class PedidoResponse{
	private Long mesaId;
	private String restauranteNombre;
	private List<Integer> platosSeleccionados;
		

}
