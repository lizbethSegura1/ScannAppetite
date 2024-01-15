package prueba;
// Generated 18 dic 2023 23:11:31 by Hibernate Tools 4.3.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pedido generated by hbm2java
 */
@Entity
@Table(name = "pedido", catalog = "scanappetite")
public class Pedido implements java.io.Serializable {

	private Integer id;
	private Mesa mesa;
	private Integer estado;
	private String tipoPago;
	private Date hora;
	private Byte status;
	private Date time;
	private Set platoPedidos = new HashSet(0);

	public Pedido() {
	}

	public Pedido(Mesa mesa) {
		this.mesa = mesa;
	}

	public Pedido(Mesa mesa, Integer estado, String tipoPago, Date hora, Byte status, Date time, Set platoPedidos) {
		this.mesa = mesa;
		this.estado = estado;
		this.tipoPago = tipoPago;
		this.hora = hora;
		this.status = status;
		this.time = time;
		this.platoPedidos = platoPedidos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MesaID", nullable = false)
	public Mesa getMesa() {
		return this.mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	@Column(name = "Estado")
	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	@Column(name = "tipo_pago")
	public String getTipoPago() {
		return this.tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "hora", length = 26)
	public Date getHora() {
		return this.hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	@Column(name = "status")
	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "time", length = 26)
	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pedido")
	public Set getPlatoPedidos() {
		return this.platoPedidos;
	}

	public void setPlatoPedidos(Set platoPedidos) {
		this.platoPedidos = platoPedidos;
	}

}