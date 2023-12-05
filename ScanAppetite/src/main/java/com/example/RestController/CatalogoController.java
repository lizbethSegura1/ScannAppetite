package com.example.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entitys.Catalogo;
import com.example.entitys.Restaurante;
import com.example.services.CatalogoService;

/*
@RestController
@RequestMapping("/catalogo")
public class CatalogoController {

    @Autowired
    private CatalogoService catalogoService;

    @GetMapping("/restaurante/")
    public ResponseEntity<List<Catalogo>> obtenerCatalogoPorRestauranteYHora(
            @PathVariable String restauranteId,
            @RequestParam String hora) {

        Restaurante restaurante = new Restaurante();
        restaurante.setId(restauranteId); // Puedes cargar el restaurante desde la base de datos según sea necesario

        LocalDateTime horaActual = LocalDateTime.parse(hora); // Ajusta el formato según tus necesidades

        try {
            List<Catalogo> catalogo = catalogoService.obtenerCatalogoPorRestauranteYHorario(restaurante, horaActual);
            return ResponseEntity.ok(catalogo);
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
*/
