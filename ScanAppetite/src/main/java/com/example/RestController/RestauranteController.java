package com.example.RestController;

import java.time.LocalDateTime;
import java.util.logging.Logger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entitys.Catalogo;

import com.example.entitys.Plato;
import com.example.entitys.Restaurante;
import com.example.services.CatalogoService;
import com.example.services.MesaService;
import com.example.services.RestauranteService;

@RestController
@RequestMapping("/ScanAppetite")
public class RestauranteController {

	private static final Logger log = Logger.getLogger(RestauranteController.class.getName());

	@Autowired
	private CatalogoService catalogoService;

	@Autowired
	private MesaService mesaService;

	@Autowired
	private RestauranteService restauranteService;

	@GetMapping("/{restauranteId}/{mesaId}/catalogo")
	public ResponseEntity<?> obtenerCatalogo(@PathVariable String restauranteId, @PathVariable String mesaId) {
		// Verificar si la mesa está libre
		if (mesaService.verificarMesaLibre(restauranteId, mesaId)) {
			// Obtener el restaurante por ID
			Restaurante restaurante = restauranteService.obtenerRestaurantePorId(restauranteId);

			// Obtener la hora actual
			LocalDateTime horaActual = LocalDateTime.now();

			java.sql.Time hora = java.sql.Time
					.valueOf(String.format("%d:%d:00", horaActual.getHour(), horaActual.getMinute()));

			// Obtener el catálogo para el restaurante y la hora actual
			List<Catalogo> catalogo = catalogoService.obtenerCatalogoPorRestauranteYHorario(restaurante, hora);

			// Verificar si se encontró un catálogo para la hora actual
			if (!catalogo.isEmpty()) {
				//List<Plato> platos = catalogoService.obtenerPlatosPorCatalogoId(catalogo.get(0).getId());

				// Cambiar el estado de la mesa a "O" (ocupada)
				mesaService.cambiarEstadoMesa(mesaId, "O");

				/* Crea objeto CatalogoPlato para la respuesta
				//log.info("Antes de crear CatalogoPlato");
				//CatalogoPlato catalogoPlato = new CatalogoPlato(catalogo.get(0), platos);
				//log.info("Después de crear CatalogoPlato");
				// objeto CatalogoPlato en el cuerpo de la respuesta
				//return new ResponseEntity<>(catalogoPlato, HttpStatus.OK);
				 				 */
				return new ResponseEntity<>(catalogo, HttpStatus.OK);
			} else {
				return new ResponseEntity<>("No hay catálogo disponible en este momento", HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<>("La mesa no está libre", HttpStatus.BAD_REQUEST);
		}
			
	}
}
