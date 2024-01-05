package com.example.services;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

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

    @Autowired
    private CatalogoRepository catalogoRepository;

    @Autowired
    private MesaRepository mesaRepository;

    public Catalogo obtenerMenuRestaurante(String restauranteId) {
        // Obtener el restaurante
        Restaurante restaurante = restauranteRepository.findById(restauranteId)
                .orElseThrow(() -> new NoSuchElementException("Restaurante no encontrado con ID: " + restauranteId));

        // Obtener el catálogo asociado al restaurante en el horario adecuado
        Time horaActual = java.sql.Time.valueOf(LocalDateTime.now().toString()); 
        List<Catalogo> catalogo = catalogoRepository
                .findByRestauranteAndHorarioInicioBeforeAndHorarioFinAfter(restaurante, horaActual, horaActual);

        if (catalogo.isEmpty()) {
            throw new NoSuchElementException("Menú no encontrado para el restaurante con ID: " + restauranteId);
        }

        // Devolver el primer elemento de la lista
        return catalogo.get(0);
    }
    
    
    public List<Mesa> obtenerEstadoMesasRestaurante(String restauranteId) {
        // Obtener el estado de las mesas para un restaurante
        List<Mesa> mesas = mesaRepository.findByRestauranteId(restauranteId);

        return mesas;
    }
    
 
	public Restaurante obtenerRestaurantePorId(String restauranteId) {
	    return restauranteRepository.findById(restauranteId)
	            .orElseThrow(() -> new NoSuchElementException("Restaurante no encontrado con ID: " + restauranteId));
	}
	
	
}

