package com.example.RestController;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.entitys.Catalogo;
import com.example.entitys.Mesa;

public class RestauranteController {


    @GetMapping("/{restauranteId}/menu")
    public ResponseEntity<Catalogo> obtenerMenu(@PathVariable Long restauranteId) {
        Catalogo menu = restauranteService.obtenerMenuRestaurante(restauranteId);
        return ResponseEntity.ok(menu);
    }

    @GetMapping("/{restauranteId}/mesas")
    public ResponseEntity<List<Mesa>> obtenerEstadoMesas(@PathVariable Long restauranteId) {
        List<Mesa> estadoMesas = restauranteService.obtenerEstadoMesasRestaurante(restauranteId);
        return ResponseEntity.ok(estadoMesas);
    }
}
