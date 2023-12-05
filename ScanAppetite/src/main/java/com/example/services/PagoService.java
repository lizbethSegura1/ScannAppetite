package com.example.services;

import org.springframework.stereotype.Service;

@Service
public class PagoService {
	public boolean procesarPago(double monto) {
		return  Math.random() < 0.9;   //prueba pre Redsys
	}

}
