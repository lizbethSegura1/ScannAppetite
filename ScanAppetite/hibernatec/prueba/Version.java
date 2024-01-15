package prueba;
// Generated 18 dic 2023 23:11:31 by Hibernate Tools 4.3.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Version generated by hbm2java
 */
@Entity
@Table(name = "version", catalog = "sys")
public class Version implements java.io.Serializable {

	private VersionId id;

	public Version() {
	}

	public Version(VersionId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "sysVersion", column = @Column(name = "sys_version", nullable = false, length = 5)),
			@AttributeOverride(name = "mysqlVersion", column = @Column(name = "mysql_version", nullable = false, length = 6)) })
	public VersionId getId() {
		return this.id;
	}

	public void setId(VersionId id) {
		this.id = id;
	}

}