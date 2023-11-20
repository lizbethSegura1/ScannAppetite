package com.example.entitys;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Restaurante {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String direccion;
    
    @Column(name = "HoraApertura")
    private java.sql.Timestamp horaApertura;

    @Column(name = "HoraCierre")
    private java.sql.Timestamp horaCierre;

    private String title;

    @ManyToOne
    @JoinColumn(name = "MesaID")
    private Mesa mesa;
    public Restaurante() {
    	
    }
	public Restaurante(String id, String direccion, Timestamp horaApertura, Timestamp horaCierre, String title,
			Mesa mesa) {
		super();
		this.id = id;
		this.direccion = direccion;
		this.horaApertura = horaApertura;
		this.horaCierre = horaCierre;
		this.title = title;
		this.mesa = mesa;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public java.sql.Timestamp getHoraApertura() {
		return horaApertura;
	}

	public void setHoraApertura(java.sql.Timestamp horaApertura) {
		this.horaApertura = horaApertura;
	}

	public java.sql.Timestamp getHoraCierre() {
		return horaCierre;
	}

	public void setHoraCierre(java.sql.Timestamp horaCierre) {
		this.horaCierre = horaCierre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
    
    

}
