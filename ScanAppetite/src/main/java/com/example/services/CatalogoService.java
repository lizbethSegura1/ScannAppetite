package com.example.services;

import java.sql.Time;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entitys.Catalogo;
import com.example.entitys.Plato;
import com.example.entitys.Restaurante;
import com.example.repository.CatalogoRepository;
import com.example.repository.PlatoRepository;

@Service
public class CatalogoService {

	@Autowired
	private CatalogoRepository catalogoRepository;

	@Autowired
	private PlatoRepository platoRepository;

	public List<Catalogo> obtenerCatalogoPorRestauranteYHorario(Restaurante restaurante, Time hora) {
		return catalogoRepository.findByRestauranteAndHorarioInicioBeforeAndHorarioFinAfter(restaurante, hora, hora);
	}

	public List<Catalogo> getCatalogo() {
		return catalogoRepository.findAll();
	}

	public Optional<Catalogo> obtenerCatalogoPorRestauranteId(String restauranteId) {
		return catalogoRepository.findByRestauranteId(restauranteId);
	}

	public List<Catalogo> obtenerCatalogosConPlatos() {
		List<Catalogo> catalogos = catalogoRepository.findAll();

		for (Catalogo catalogo : catalogos) {
			catalogo.setPlatos(obtenerPlatosPorCatalogoId(catalogo.getId()));
		}

		return catalogos;
	}

	public List<Plato> obtenerPlatosPorCatalogoId(String CatalogoId) {
		Optional<Catalogo> optionalCatalogo = catalogoRepository.findById(CatalogoId);

		if (optionalCatalogo.isPresent()) {
			Catalogo catalogo = optionalCatalogo.get();
			return catalogo.getPlatos();
		} else {
			throw new NoSuchElementException("Catálogo no encontrado con ID: " + CatalogoId);
		}
	}

}
