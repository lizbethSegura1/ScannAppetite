package com.example.entitys;

//Clase para representar la clave primaria compuesta
public class CatalogoPlatoId {

	private String catalogo;
	private String plato;
	
	public CatalogoPlatoId(String catalogo, String plato) {
		super();
		this.catalogo = catalogo;
		this.plato = plato;
	}
	public String getCatalogo() {
		return catalogo;
	}
	public void setCatalogo(String catalogo) {
		this.catalogo = catalogo;
	}
	public String getPlato() {
		return plato;
	}
	public void setPlato(String plato) {
		this.plato = plato;
	}

}
