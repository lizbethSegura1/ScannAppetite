package com.example.entitys;

import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Restaurante {

	@Id
    private String id;
	
    private String direccion;
    
    @Column(name = "HoraApertura")
    private java.sql.Time horaApertura;

    @Column(name = "HoraCierre")
    private java.sql.Time horaCierre;

 

    @ManyToOne
    @JoinColumn(name = "MesaID")
    private Mesa mesa;
    public Restaurante() {
    	
    }
	public Restaurante(String id, String direccion, Time horaApertura, Time horaCierre, String title,
			Mesa mesa) {
		super();
		this.id = id;
		this.direccion = direccion;
		this.horaApertura = horaApertura;
		this.horaCierre = horaCierre;
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

	public java.sql.Time getHoraApertura() {
		return horaApertura;
	}

	public void setHoraApertura(java.sql.Time horaApertura) {
		this.horaApertura = horaApertura;
	}

	public java.sql.Time getHoraCierre() {
		return horaCierre;
	}

	public void setHoraCierre(java.sql.Time horaCierre) {
		this.horaCierre = horaCierre;
	}


	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
    
    

}
