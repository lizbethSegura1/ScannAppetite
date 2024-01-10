package com.example.services;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.example.entitys.Catalogo;
import com.example.entitys.Mesa;
import com.example.entitys.Pedido;
import com.example.entitys.Plato;
import com.example.entitys.Restaurante;
import com.example.repository.CatalogoRepository;

@Service
public class CatalogoService {

	@Autowired
	private CatalogoRepository catalogoRepository;

	@Autowired
	private RestauranteService restauranteService;

	@Autowired
	private MesaService mesaService;

	private final RestTemplate restTemplate;

	@Autowired
	public CatalogoService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Transactional(readOnly = true)
	public List<Catalogo> obtenerCatalogoPorRestauranteYHorario(Restaurante restaurante, LocalDateTime hora) {
		Timestamp horarioInicio = Timestamp.valueOf(hora);
		Timestamp horarioFin = Timestamp.valueOf(hora.plusHours(1));
		return catalogoRepository.findByRestauranteAndHorario(restaurante, horarioInicio, horarioFin);
	}

	@Transactional
	public ResponseEntity<?> obtenerCatalogoParaMesa(String restauranteId, Long mesaId) {
		// Verificar de mesa libre
		if (!mesaService.verificarMesaLibre(restauranteId, mesaId)) {
			return new ResponseEntity<>("La mesa no está libre", HttpStatus.BAD_REQUEST);
		}

		// Obtener el restaurante por ID
		Restaurante restaurante = restauranteService.obtenerRestaurantePorId(restauranteId);

		// hora actual
		LocalDateTime horaActual = LocalDateTime.now();
		// Obtener el catálogo para el restaurante y la hora actual
		List<Catalogo> catalogos = obtenerCatalogoPorRestauranteYHorario(restaurante, horaActual);

		// Verificar si se encontró un catálogo para la hora actual
		if (!catalogos.isEmpty()) {
			// Asignar la lista de platos para el catálogo
			catalogos.forEach(cat -> cat.setPlatos(obtenerPlatosPorCatalogoId(cat.getId())));

			// Cambiar el estado de la mesa a "O" (ocupada)
			mesaService.cambiarEstadoMesa(mesaId, "O");
			return new ResponseEntity<>(catalogos.get(0), HttpStatus.OK);
		} else {
			// No hay catálogo disponible en este momento
			return new ResponseEntity<>("No hay catálogo disponible en este momento", HttpStatus.NOT_FOUND);
		}
	}

	public List<Plato> obtenerPlatosPorCatalogoId(String catalogoId) {
		Optional<Catalogo> optionalCatalogo = catalogoRepository.findById(catalogoId);

		return optionalCatalogo.map(Catalogo::getPlatos)
				.orElseThrow(() -> new NoSuchElementException("Catálogo no encontrado con ID: " + catalogoId));
	}

	public List<Catalogo> getCatalogo() {
		return catalogoRepository.findAll();
	}

	public Optional<Catalogo> obtenerCatalogoPorRestauranteId(String restauranteId) {
		return catalogoRepository.findByRestauranteId(restauranteId);
	}

	public List<Catalogo> obtenerCatalogosConPlatos() {
		return catalogoRepository.obtenerCatalogosConPlatos();

	}

	public void procesarPlatosSeleccionados(List<Long> platosSeleccionados) {
		// URL del backend donde procesarás la selección de platos
		String backendUrl = "http://localhost:8080/procesar-seleccion";

		// Configuración de encabezados para la solicitud
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		// Crear la entidad HTTP con los platos seleccionados
		HttpEntity<List<Long>> requestEntity = new HttpEntity<>(platosSeleccionados, headers);

		// Realizar la solicitud POST y obtener la respuesta
		String respuesta = restTemplate.postForObject(backendUrl, requestEntity, String.class);

	}
	
	

}
