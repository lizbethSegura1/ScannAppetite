package prueba;
// Generated 18 dic 2023 23:11:31 by Hibernate Tools 4.3.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PlatoPedido generated by hbm2java
 */
@Entity
@Table(name = "plato_pedido", catalog = "scanappetite")
public class PlatoPedido implements java.io.Serializable {

	private PlatoPedidoId id;
	private Pedido pedido;

	public PlatoPedido() {
	}

	public PlatoPedido(PlatoPedidoId id, Pedido pedido) {
		this.id = id;
		this.pedido = pedido;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "pedidoId", column = @Column(name = "pedido_id", nullable = false)),
			@AttributeOverride(name = "platoid", column = @Column(name = "platoid", nullable = false)) })
	public PlatoPedidoId getId() {
		return this.id;
	}

	public void setId(PlatoPedidoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pedido_id", nullable = false, insertable = false, updatable = false)
	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}