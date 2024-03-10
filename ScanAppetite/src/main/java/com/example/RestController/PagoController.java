package com.example.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.entitys.DetallesPago;
import com.example.services.DetallesPagoService;

@RestController
@RequestMapping("/procesarPago")
public class PagoController {

	@Autowired
	    private DetallesPagoService detallesPagoService;

	@PostMapping("/{mesaId}")
    public ResponseEntity<?> procesarFormularioPago(@PathVariable Long mesaId, @RequestBody DetallesPago detallesPago) {
        try {
            detallesPagoService.guardarDetallesPago(detallesPago, mesaId);
            return ResponseEntity.ok("Pago procesado con éxito para la mesa " + mesaId);
        } catch (Exception e) {     
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al procesar el pago");
        }
	}
}
