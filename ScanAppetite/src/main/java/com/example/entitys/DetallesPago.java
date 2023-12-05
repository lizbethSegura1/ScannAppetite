package com.example.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DetallesPago {
	private String titularTarjeta;
	@Id
	private String numeroTarjeta;
	private String fechaVencimiento;
	private int codigoSeguridad;

	public DetallesPago() {
	}

	public DetallesPago(String titularTarjeta, String numeroTarjeta, String fechaVencimiento, int codigoSeguridad) {
		this.titularTarjeta = titularTarjeta;
		this.numeroTarjeta = numeroTarjeta;
		this.fechaVencimiento = fechaVencimiento;
		this.codigoSeguridad = codigoSeguridad;
	}

	public String getTitularTarjeta() {
		return titularTarjeta;
	}

	public void setTitularTarjeta(String titularTarjeta) {
		this.titularTarjeta = titularTarjeta;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getCodigoSeguridad() {
		return codigoSeguridad;
	}

	public void setCodigoSeguridad(int codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}
}
