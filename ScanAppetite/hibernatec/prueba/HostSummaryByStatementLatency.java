package prueba;
// Generated 18 dic 2023 23:11:31 by Hibernate Tools 4.3.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * HostSummaryByStatementLatency generated by hbm2java
 */
@Entity
@Table(name = "host_summary_by_statement_latency", catalog = "sys")
public class HostSummaryByStatementLatency implements java.io.Serializable {

	private HostSummaryByStatementLatencyId id;

	public HostSummaryByStatementLatency() {
	}

	public HostSummaryByStatementLatency(HostSummaryByStatementLatencyId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "host", column = @Column(name = "host")),
			@AttributeOverride(name = "total", column = @Column(name = "total", precision = 42, scale = 0)),
			@AttributeOverride(name = "totalLatency", column = @Column(name = "total_latency", length = 11)),
			@AttributeOverride(name = "maxLatency", column = @Column(name = "max_latency", length = 11)),
			@AttributeOverride(name = "lockLatency", column = @Column(name = "lock_latency", length = 11)),
			@AttributeOverride(name = "cpuLatency", column = @Column(name = "cpu_latency", length = 11)),
			@AttributeOverride(name = "rowsSent", column = @Column(name = "rows_sent", precision = 42, scale = 0)),
			@AttributeOverride(name = "rowsExamined", column = @Column(name = "rows_examined", precision = 42, scale = 0)),
			@AttributeOverride(name = "rowsAffected", column = @Column(name = "rows_affected", precision = 42, scale = 0)),
			@AttributeOverride(name = "fullScans", column = @Column(name = "full_scans", precision = 43, scale = 0)) })
	public HostSummaryByStatementLatencyId getId() {
		return this.id;
	}

	public void setId(HostSummaryByStatementLatencyId id) {
		this.id = id;
	}

}
