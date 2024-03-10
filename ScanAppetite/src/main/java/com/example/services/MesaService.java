package com.example.services;

import java.util.NoSuchElementException;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entitys.Mesa;
import com.example.repository.MesaRepository;

@Service
public class MesaService {

    @Autowired
    private MesaRepository repository;

    @Transactional
    public void cambiarEstadoMesa(Long mesaId, String nuevoEstado) {
        Mesa mesa = repository.findById(mesaId)
                .orElseThrow(() -> new NoSuchElementException("Mesa no encontrada con ID: " + mesaId));
       
        mesa.setEstado(nuevoEstado);
        repository.save(mesa);
    }

    @Transactional(readOnly = true)
 boolean verificarMesaLibre(String restauranteId, Long mesaId) {
        Optional<Mesa> optionalMesa = repository.findById(mesaId);
        return optionalMesa.map(mesa -> "L".equalsIgnoreCase(mesa.getEstado())).orElse(false);
    }
    
    @Transactional(readOnly = true)
    public Mesa obtenerPorId(Long mesaId) {
        return repository.findById(mesaId)
                .orElseThrow(() -> new NoSuchElementException("Mesa no encontrada con ID: " + mesaId));
    }
}


