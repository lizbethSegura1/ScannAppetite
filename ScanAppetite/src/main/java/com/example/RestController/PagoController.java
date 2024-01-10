package com.example.RestController;

import org.springframework.beans.factory.annotation.Autowired;
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

    private final DetallesPagoService detallesPagoService;

    @Autowired
    public PagoController(DetallesPagoService detallesPagoService) {
        this.detallesPagoService = detallesPagoService;
    }

    @PostMapping("/{mesaId}")
    public String procesarFormularioPago(@PathVariable Long mesaId, 
                                         @RequestBody DetallesPago detallesPago) {
        detallesPagoService.guardarDetallesPago(detallesPago, mesaId);
        return "Pago procesado con éxito para la mesa " + mesaId;
    }
}