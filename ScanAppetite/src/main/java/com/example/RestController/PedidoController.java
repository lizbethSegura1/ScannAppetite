package com.example.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entitys.ResumenPedidoDTO;
import com.example.services.PedidoService;

@RestController
public class PedidoController {
	@Autowired
	private PedidoService pedidoService;
	 private final Logger logger = LoggerFactory.getLogger(CatalogoController.class);

	@GetMapping("/resumenPedido/{mesaId}")
    public ResponseEntity<ResumenPedidoDTO> obtenerResumenPedido(@PathVariable Long mesaId) {
        try {
            ResumenPedidoDTO resumenPedido = pedidoService.obtenerResumenPedido(mesaId);
            return ResponseEntity.ok(resumenPedido);
        } catch (Exception e) {
            logger.error("Error al obtener resumen de pedido", e);
            return ResponseEntity.internalServerError().build();
        }
    }
}
