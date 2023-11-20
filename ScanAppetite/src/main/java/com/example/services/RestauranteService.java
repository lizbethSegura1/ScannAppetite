package com.example.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entitys.Catalogo;
import com.example.entitys.Mesa;
import com.example.entitys.Restaurante;
import com.example.repository.CatalogoRepository;
import com.example.repository.MesaRepository;
import com.example.repository.RestauranteRepository;

@Service
public class RestauranteService {
	@Autowired

	private RestauranteRepository restauranteRepository;

//	public List<RestauranteRepository> getRestaurante() {
//		return restauranteRepository.findAll();
//
//	}
	
	@Autowired
    private CatalogoRepository catalogoRepository;

    @Autowired
    private MesaRepository mesaRepository;

    public Catalogo obtenerMenuRestaurante(String restauranteId) {
        // Obtener el restaurante y su catálogo asociado
    	   Restaurante restaurante = restauranteRepository.findById(restauranteId)
                   .orElseThrow(() -> new NoSuchElementException("Restaurante no encontrado con ID: " + restauranteId));

           Catalogo catalogo = catalogoRepository.findByRestauranteIdRestaurante(restauranteId)
                   .orElseThrow(() -> new NoSuchElementException("Catálogo no encontrado para el restaurante con ID: " + restauranteId));


        return catalogo;
    }

    public List<Mesa> obtenerEstadoMesasRestaurante(String restauranteId) {
        // Obtener el estado de las mesas para un restaurante
        List<Mesa> mesas = mesaRepository.findByRestauranteIdRestaurante(restauranteId);

        return mesas;
    }

}