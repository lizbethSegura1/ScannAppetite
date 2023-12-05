package com.example.services;

import java.util.List;
import java.util.NoSuchElementException;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entitys.Mesa;
import com.example.repository.MesaRepository;

@Service
public class MesaService {

	@Autowired
	private MesaRepository repository;
	public List<Mesa>getMesas(){
		return repository.findAll();
	}
	public void cambiarEstadoMesa(String mesaId, String nuevoEstado) {
		 Mesa mesa = repository.findById(mesaId)
	                .orElseThrow(() -> new NoSuchElementException("Mesa no encontrada con ID: " + mesaId));

	        // Actualizar el estado de la mesa
	        mesa.setEstado(nuevoEstado);
	        repository.save(mesa);
		
	}
/*	public boolean verificarMesaLibre(String restauranteId, String mesaId) {
	    Optional<Mesa> mesaOptional = repository.findById(mesaId, Mesa.class);

	    // Verificar si la mesa existe
	    if (mesaOptional.isPresent()) {
	        Mesa mesa = mesaOptional.get();

	        // Verificar si la mesa está libre (estado "L")
	        return "L".equalsIgnoreCase(mesa.getEstado());
	    }

	    // Si la mesa no existe, puedes manejarlo según tus requerimientos
	    throw new NoSuchElementException("Mesa no encontrada con ID: " + mesaId);
	}
	*/
	public boolean verificarMesaLibre(String restauranteId, String mesaId) {
	    try {
	        Optional<Mesa> mesa = repository.findById(mesaId);
	        if(mesa.isPresent()) {
	        	// Verificar si la mesa está libre (estado "L")
	        	Mesa mesaDevuelta =  mesa.get();
	        	return "L".equalsIgnoreCase(mesaDevuelta.getEstado());
	        } else
	        	return false;
	    } catch (javax.persistence.EntityNotFoundException e) {
	        // If the mesa is not found, handle it as needed (throw an exception or return false)
	        throw new NoSuchElementException("Mesa no encontrada con ID: " + mesaId);
	    }
	}
	
}
