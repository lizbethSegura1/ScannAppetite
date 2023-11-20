package com.example.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.entitys.Catalogo;
import com.example.entitys.Mesa;
import com.example.services.RestauranteService;

public class RestauranteController {

	@Autowired
	private RestauranteService restaurante;

	@GetMapping("/{restauranteId}/menu")
	public ResponseEntity<Catalogo> obtenerMenu(@PathVariable String restauranteId) {
		Catalogo menu = restaurante.obtenerMenuRestaurante(restauranteId);
		return ResponseEntity.ok(menu);
	}

	@GetMapping("/{restauranteId}/mesas")
	public ResponseEntity<List<Mesa>> obtenerEstadoMesas(@PathVariable String restauranteId) {
		List<Mesa> estadoMesas = restaurante.obtenerEstadoMesasRestaurante(restauranteId);
		return ResponseEntity.ok(estadoMesas);
	}
}
