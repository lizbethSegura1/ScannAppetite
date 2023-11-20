package com.example.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Mesa {

	@Id
    @Column(name = "ID")
    private String id;

    private String ubicacion;
    private String estado;
    public Mesa() {
    	
    }
	public Mesa(String id, String ubicacion, String estado) {
		super();
		this.id = id;
		this.ubicacion = ubicacion;
		this.estado = estado;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
    
    
    
	
	
}
