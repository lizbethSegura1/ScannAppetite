/**
 * 
 */
package com.example.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * 
 */

@Entity
@Table(name="plato_pedido")
public class PlatoPedido {

	@ManyToOne
	@JoinColumn(name = "PlatoID")
	@Id
	private Plato plato;

	@ManyToOne
	@JoinColumn(name = "PedidoId")
	@Id
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
