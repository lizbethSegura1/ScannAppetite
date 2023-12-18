package com.example.services;
/*
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.entitys.Plato;
import com.example.config.Bundler;
import com.example.dto.CestaDto;
import com.example.dto.ItemDto;
import com.example.dto.PlatoDto;
import com.example.entitys.Cesta;
import com.example.entitys.Mesa;
import com.example.repository.CestaRepository;
import com.example.repository.PlatoRepository;
import com.example.utils.Mapper;

import lombok.NonNull;

@Service
public class CestaService {
	private final CestaRepository cestaRepository;
	private final PlatoRepository platoRepository;
	private final Bundler bundler;

	@Autowired
	public CestaService(CestaRepository cestaRepository, PlatoRepository platoRepository, Bundler bundler) {
		this.cestaRepository = cestaRepository;
		this.platoRepository = platoRepository;
		this.bundler = bundler;
	}

	/**
	 * Obtener todos los platos que están en la cesta identificado con el id de la
	 * Mesa.
	 *
	 * @param mesaId ID de la mesa asociada con la cesta
	 * @return Lista de platos en la cesta
	 */
	/*/public CestaDto findAllPlatosEnCesta(String mesaId) {
		List<Cesta> cestas = cestaRepository.findAllByMesa_Id(mesaId);

		if (cestas.isEmpty()) {
			throw new NoSuchElementException("No se encontró una cesta para la mesa con ID: " + mesaId);
		}

		List<PlatoDto> platosDto = Mapper.cestaToPlatoDto(cestas);

		return CestaDto.builder().platos(platosDto).totalPrice(Mapper.getTotalPrice(platosDto)).build();
	}

	@Transactional
	public Cesta saveNewItem(@PathVariable String restauranteId, @PathVariable String mesaId, ItemDto itemDto) {
		// Aquí puedes usar los valores de restauranteId y mesaId según lo proporcionado
		// en el QR
		// No necesitas obtener el usuario autenticado en este contexto

		// Buscar el platillo en el repositorio de platillos por su ID
		Plato plato = platoRepository.findById(itemDto.getItemId()).orElseThrow(
				() -> new NoSuchElementException("Error message when dish is not found: " + itemDto.getItemId()));
		// Crear una nueva cesta o recuperar la cesta existente asociada a la mesa
		Cesta cesta = cestaRepository.findByMesa_Id(mesaId).orElse(Cesta.builder().mesa(new Mesa(mesaId)).build());

		// Agregar el platillo a la cesta
		cesta.getPlatos().add(plato);

		// Guardar la cesta en el repositorio
		cestaRepository.save(cesta);

		// Resto del código si es necesario...

		return cesta;

	}

	/**
	 * 
	 * eliminar un artículo de la cesta de los usuarios (puede haber más de un plato
	 * idéntico)
	 */

	/*@Transactional
	public void delete(@NonNull Long id) {
	    List<Cesta> list = cestaRepository.findCestasByPlato_Id(id);
	    for (Cesta cesta : list) {
	        cestaRepository.delete(cesta);
	    }
	}
	/**
	 * eliminar todos los artículos de la cesta de los usuarios
	 * 
	 * @param id authorized user id
	 */
	/*@Transactional
	public void deleteByMesa(@NonNull String id) {
		cestaRepository.deleteByMesa_Id(id);
	}

}
*/
