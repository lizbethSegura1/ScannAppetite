package com.example.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Plato {

    @Id
    @Column(name = "ID")
    private String id;

    private double precio;
    private int stock;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "CatalogoId")
    private Catalogo catalogo;

    public Plato() {
    
    }
	public Plato(String id, double precio, int stock, String descripcion, Catalogo catalogo) {
		super();
		this.id = id;
		this.precio = precio;
		this.stock = stock;
		this.descripcion = descripcion;
		this.catalogo = catalogo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Catalogo getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
	}
    
    

	
}
