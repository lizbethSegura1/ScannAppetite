package com.example.entitys;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Mesa {

	@Id
    @Column(name = "ID")
    private String id;

    private String ubicacion;
    
    @Column(name="estado",columnDefinition="char(255)")
    private String estado;
    

    @Column(name = "RestauranteID") // Asegúrate de que este nombre coincida con la columna en la base de datos
    private String restauranteId;
    
    public String getRestauranteId() {
		return restauranteId;
	}
	public void setRestauranteId(String restauranteId) {
		this.restauranteId = restauranteId;
	}
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
