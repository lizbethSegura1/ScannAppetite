package com.example.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.entitys.PedidoResponse;
import com.example.entitys.ResumenPedidoDTO;
import com.example.services.CatalogoService;
import com.example.services.PedidoService;
import com.google.gson.Gson;


@RestController
@RequestMapping("/ScanAppetite")
public class ScanAppetiteController {

    @Autowired
    private CatalogoService catalogoService;

    @Autowired
    private PedidoService pedidoService;

    private final Logger logger = LoggerFactory.getLogger(CatalogoController.class);

    @GetMapping("/{restauranteId}/{mesaId}")
    public ResponseEntity<?> obtenerCatalogoParaMesa(
            @PathVariable String restauranteId,
            @PathVariable Long mesaId) {
        try {
            ResponseEntity<?> responseEntity = catalogoService.obtenerCatalogoParaMesa(restauranteId, mesaId);
            return responseEntity;
        } catch (Exception e) {
            return new ResponseEntity<>("Error al procesar la solicitud", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/ppedido")
    public String procesarSeleccion(@RequestBody String platosSeleccionados, Model model) {
        logger.info(platosSeleccionados);
        if (platosSeleccionados != null && !platosSeleccionados.isEmpty()) {
            Gson gson = new Gson();
            PedidoResponse pedidoResponse = gson.fromJson(platosSeleccionados, PedidoResponse.class);
            logger.info("Clase PedidoResponse: " + pedidoResponse);

            pedidoService.guardarPedido(pedidoResponse);

            model.addAttribute("mensaje", "Platos seleccionados: " + platosSeleccionados);
        } else {
            model.addAttribute("mensaje", "No se seleccionaron platos");
        }
        return "resultadoProcesamiento";
    }

   
}
