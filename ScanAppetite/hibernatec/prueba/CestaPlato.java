package prueba;
// Generated 18 dic 2023 23:11:31 by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CestaPlato generated by hbm2java
 */
@Entity
@Table(name = "cesta_plato", catalog = "scanappetite")
public class CestaPlato implements java.io.Serializable {

	private int id;
	private Cesta cesta;
	private Plato plato;

	public CestaPlato() {
	}

	public CestaPlato(int id, Cesta cesta, Plato plato) {
		this.id = id;
		this.cesta = cesta;
		this.plato = plato;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CestaId", nullable = false)
	public Cesta getCesta() {
		return this.cesta;
	}

	public void setCesta(Cesta cesta) {
		this.cesta = cesta;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PlatoID", nullable = false)
	public Plato getPlato() {
		return this.plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

}