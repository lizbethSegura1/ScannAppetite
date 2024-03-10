package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entitys.DetallesPago;
import com.example.entitys.Mesa;
import com.example.repository.DetallesPagoRepository;
import com.example.repository.MesaRepository;

import jakarta.transaction.Transactional;

@Service
public class DetallesPagoService {

	@Autowired
	private DetallesPagoRepository detallesPagoRepository;

	@Autowired
	private MesaRepository mesaRepository;
	
	 public void guardarDetallesPago(DetallesPago detallesPago, Long mesaId) {
	        Mesa mesa = mesaRepository.findById(mesaId)
	                .orElseThrow(() -> new RuntimeException("Mesa no encontrada con ID: " + mesaId));
	        detallesPago.setMesa(mesa);
	        detallesPagoRepository.save(detallesPago);
	    }


}
