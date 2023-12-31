package com.example.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.services.MesaService;

public class MesaController {
	   @Autowired
	    private MesaService mesaService;

	    @PostMapping("/{mesaId}/cambiar-estado")
	    public ResponseEntity<Void> cambiarEstadoMesa(@PathVariable String mesaId, @RequestParam String nuevoEstado) {
	        mesaService.cambiarEstadoMesa(mesaId, nuevoEstado);
	        return ResponseEntity.noContent().build();
	    }
}
