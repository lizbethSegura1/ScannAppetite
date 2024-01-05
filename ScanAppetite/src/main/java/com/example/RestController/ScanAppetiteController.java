package com.example.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.services.CatalogoService;

@RestController
@RequestMapping("/ScanAppetite")
public class ScanAppetiteController {

	@Autowired
	private CatalogoService catalogoService;

	@GetMapping("/{restauranteId}/{mesaId}")
	
	public ResponseEntity<?> obtenerCatalogoParaMesa(@PathVariable String restauranteId, @PathVariable String mesaId) {
		try {
			// Llamada al servicio para obtener el catálogo y cambiar el estado de la mesa
			ResponseEntity<?> responseEntity = catalogoService.obtenerCatalogoParaMesa(restauranteId, mesaId);
			return responseEntity;
		} catch (Exception e) {
			// Manejar excepciones generales, puedes personalizar esto según tus necesidades
			return new ResponseEntity<>("Error al procesar la solicitud", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}