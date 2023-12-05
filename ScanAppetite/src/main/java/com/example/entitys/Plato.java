package com.example.entitys;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Plato {

    @Id
    @Column(name = "ID")
    private String id;

    private double precio;
    private int stock;
    private String descripcion;
    
 //  @Column(name = "catalogoId", insertable = false, updatable = false)
   //public String catalogo_Id;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "catalogo_id") // Evita que Hibernate actualice esta columna
    public Catalogo catalogo;
    
    @OneToMany(mappedBy = "plato")
    private List<CatalogoPlato> catalogoPlatos;
    
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
