package prueba;
// Generated 18 dic 2023 20:02:34 by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CestaPlatoId generated by hbm2java
 */
@Embeddable
public class CestaPlatoId implements java.io.Serializable {

	private long platoId;
	private int cestaId;

	public CestaPlatoId() {
	}

	public CestaPlatoId(long platoId, int cestaId) {
		this.platoId = platoId;
		this.cestaId = cestaId;
	}

	@Column(name = "PlatoID", nullable = false)
	public long getPlatoId() {
		return this.platoId;
	}

	public void setPlatoId(long platoId) {
		this.platoId = platoId;
	}

	@Column(name = "CestaId", nullable = false)
	public int getCestaId() {
		return this.cestaId;
	}

	public void setCestaId(int cestaId) {
		this.cestaId = cestaId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CestaPlatoId))
			return false;
		CestaPlatoId castOther = (CestaPlatoId) other;

		return (this.getPlatoId() == castOther.getPlatoId()) && (this.getCestaId() == castOther.getCestaId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getPlatoId();
		result = 37 * result + this.getCestaId();
		return result;
	}

}
