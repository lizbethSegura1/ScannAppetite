package com.example.RestController;



import org.springframework.web.bind.annotation.*;

import com.example.services.PagoService;

@RestController
@RequestMapping("/api/pago")
public class PagoController {

    private final PagoService pagoService;

    public PagoController(PagoService pagoService) {
        this.pagoService = pagoService;
    }

    @GetMapping("/formulario")
    public String mostrarFormularioPago() {
        return "formulario-pago";
    }
 /*
    @PostMapping("/iniciar")
    public ResponseEntity<String> iniciarPago(@RequestBody DetallesPago detallesPago) {
        // Lógica para iniciar el proceso de pago y obtener la URL del formulario de pago
        //String urlFormularioPago = pagoService.iniciarProcesoPago(detallesPago);

        return ResponseEntity.ok(urlFormularioPago);
    }

    @PostMapping("/realizar-pago") // Integrar Redsys más adelante
    public String realizarPago(@RequestParam double monto, Model model) {
        boolean pagoExitoso = pagoService.procesarPago(monto);

        if (pagoExitoso) {
            model.addAttribute("mensaje", "¡Pago exitoso!");
        } else {
            model.addAttribute("mensaje", "El pago no pudo ser procesado");
        }

        return "resultado-pago";
    }
    */
}
