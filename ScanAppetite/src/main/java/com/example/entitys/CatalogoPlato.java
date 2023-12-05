package com.example.entitys;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
@IdClass(CatalogoPlatoId.class)

public class CatalogoPlato {

    @Id
    @ManyToOne
    @JoinColumn(name = "catalogo_id")
    private Catalogo catalogo;

    @Id
    @ManyToOne
    @JoinColumn(name = "PlatoId")
    private Plato plato;

    @OneToMany
    private List<Plato> platos;
    
    public CatalogoPlato(Catalogo catalogo, List<Plato> platos) {
        this.catalogo = catalogo;
        this.platos = platos;
    }
    
	public CatalogoPlato(Catalogo catalogo, Plato plato, List<Plato> platos) {
		super();
		this.catalogo = catalogo;
		this.plato = plato;
		this.platos = platos;
	}
	
	public CatalogoPlato() {
	
	}



	public Catalogo getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
	}

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	public List<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(List<Plato> platos) {
		this.platos = platos;
	}

	

}