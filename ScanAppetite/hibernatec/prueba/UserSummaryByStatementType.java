package prueba;
// Generated 18 dic 2023 23:11:31 by Hibernate Tools 4.3.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * UserSummaryByStatementType generated by hbm2java
 */
@Entity
@Table(name = "user_summary_by_statement_type", catalog = "sys")
public class UserSummaryByStatementType implements java.io.Serializable {

	private UserSummaryByStatementTypeId id;

	public UserSummaryByStatementType() {
	}

	public UserSummaryByStatementType(UserSummaryByStatementTypeId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "user", column = @Column(name = "user", length = 32)),
			@AttributeOverride(name = "statement", column = @Column(name = "statement", length = 128)),
			@AttributeOverride(name = "total", column = @Column(name = "total", nullable = false)),
			@AttributeOverride(name = "totalLatency", column = @Column(name = "total_latency", length = 11)),
			@AttributeOverride(name = "maxLatency", column = @Column(name = "max_latency", length = 11)),
			@AttributeOverride(name = "lockLatency", column = @Column(name = "lock_latency", length = 11)),
			@AttributeOverride(name = "cpuLatency", column = @Column(name = "cpu_latency", length = 11)),
			@AttributeOverride(name = "rowsSent", column = @Column(name = "rows_sent", nullable = false)),
			@AttributeOverride(name = "rowsExamined", column = @Column(name = "rows_examined", nullable = false)),
			@AttributeOverride(name = "rowsAffected", column = @Column(name = "rows_affected", nullable = false)),
			@AttributeOverride(name = "fullScans", column = @Column(name = "full_scans", nullable = false)) })
	public UserSummaryByStatementTypeId getId() {
		return this.id;
	}

	public void setId(UserSummaryByStatementTypeId id) {
		this.id = id;
	}

}