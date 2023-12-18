package prueba;
// Generated 18 dic 2023 23:11:31 by Hibernate Tools 4.3.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * StatementsWithRuntimesIn95thPercentile generated by hbm2java
 */
@Entity
@Table(name = "statements_with_runtimes_in_95th_percentile", catalog = "sys")
public class StatementsWithRuntimesIn95thPercentile implements java.io.Serializable {

	private StatementsWithRuntimesIn95thPercentileId id;

	public StatementsWithRuntimesIn95thPercentile() {
	}

	public StatementsWithRuntimesIn95thPercentile(StatementsWithRuntimesIn95thPercentileId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "query", column = @Column(name = "query")),
			@AttributeOverride(name = "db", column = @Column(name = "db", length = 64)),
			@AttributeOverride(name = "fullScan", column = @Column(name = "full_scan", nullable = false, length = 1)),
			@AttributeOverride(name = "execCount", column = @Column(name = "exec_count", nullable = false)),
			@AttributeOverride(name = "errCount", column = @Column(name = "err_count", nullable = false)),
			@AttributeOverride(name = "warnCount", column = @Column(name = "warn_count", nullable = false)),
			@AttributeOverride(name = "totalLatency", column = @Column(name = "total_latency", length = 11)),
			@AttributeOverride(name = "maxLatency", column = @Column(name = "max_latency", length = 11)),
			@AttributeOverride(name = "avgLatency", column = @Column(name = "avg_latency", length = 11)),
			@AttributeOverride(name = "rowsSent", column = @Column(name = "rows_sent", nullable = false)),
			@AttributeOverride(name = "rowsSentAvg", column = @Column(name = "rows_sent_avg", nullable = false, precision = 21, scale = 0)),
			@AttributeOverride(name = "rowsExamined", column = @Column(name = "rows_examined", nullable = false)),
			@AttributeOverride(name = "rowsExaminedAvg", column = @Column(name = "rows_examined_avg", nullable = false, precision = 21, scale = 0)),
			@AttributeOverride(name = "firstSeen", column = @Column(name = "first_seen", nullable = false, length = 26)),
			@AttributeOverride(name = "lastSeen", column = @Column(name = "last_seen", nullable = false, length = 26)),
			@AttributeOverride(name = "digest", column = @Column(name = "digest", length = 64)) })
	public StatementsWithRuntimesIn95thPercentileId getId() {
		return this.id;
	}

	public void setId(StatementsWithRuntimesIn95thPercentileId id) {
		this.id = id;
	}

}
