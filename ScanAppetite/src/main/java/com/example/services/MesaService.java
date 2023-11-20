package com.example.services;

import java.util.List;
import java.util.NoSuchElementException;

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
	public void cambiarEstadoMesa(Long mesaId, String nuevoEstado) {
		 Mesa mesa = MesaRepository.findById(mesaId)
	                .orElseThrow(() -> new NoSuchElementException("Mesa no encontrada con ID: " + mesaId));

	        // Actualizar el estado de la mesa
	        mesa.setEstado(nuevoEstado);
	        MesaRepository.save(mesa);
		
	}
}
