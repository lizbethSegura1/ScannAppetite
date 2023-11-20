/**
 * 
 */
package com.example.entitys;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 
 */

@Entity
public class PlatoPedido {

	@ManyToOne
	@JoinColumn(name = "PlatoID")
	private Plato plato;

	@ManyToOne
	@JoinColumn(name = "PedidoId")
	private Pedido pedido;
	public PlatoPedido() {
		
	}
	public Plato getPlato() {
		return plato;
	}
	public void setPlato(Plato plato) {
		this.plato = plato;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
}
