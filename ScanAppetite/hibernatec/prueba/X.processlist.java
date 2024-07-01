package prueba;
// Generated 18 dic 2023 23:11:31 by Hibernate Tools 4.3.6.Final


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import prueba.X.processlistId;

/**
 * X.processlist generated by hbm2java
 */
@Entity
@Table(name="x$processlist"
    ,catalog="sys"
)
public class X.processlist  implements java.io.Serializable {


     private X.processlistId id;

    public X.processlist() {
    }

    public X.processlist(X.processlistId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="thdId", column=@Column(name="thd_id", nullable=false) ), 
        @AttributeOverride(name="connId", column=@Column(name="conn_id") ), 
        @AttributeOverride(name="user", column=@Column(name="user", length=288) ), 
        @AttributeOverride(name="db", column=@Column(name="db", length=64) ), 
        @AttributeOverride(name="command", column=@Column(name="command", length=16) ), 
        @AttributeOverride(name="state", column=@Column(name="state", length=64) ), 
        @AttributeOverride(name="time", column=@Column(name="time") ), 
        @AttributeOverride(name="currentStatement", column=@Column(name="current_statement") ), 
        @AttributeOverride(name="executionEngine", column=@Column(name="execution_engine", length=9) ), 
        @AttributeOverride(name="statementLatency", column=@Column(name="statement_latency") ), 
        @AttributeOverride(name="progress", column=@Column(name="progress", precision=26) ), 
        @AttributeOverride(name="lockLatency", column=@Column(name="lock_latency") ), 
        @AttributeOverride(name="cpuLatency", column=@Column(name="cpu_latency") ), 
        @AttributeOverride(name="rowsExamined", column=@Column(name="rows_examined") ), 
        @AttributeOverride(name="rowsSent", column=@Column(name="rows_sent") ), 
        @AttributeOverride(name="rowsAffected", column=@Column(name="rows_affected") ), 
        @AttributeOverride(name="tmpTables", column=@Column(name="tmp_tables") ), 
        @AttributeOverride(name="tmpDiskTables", column=@Column(name="tmp_disk_tables") ), 
        @AttributeOverride(name="fullScan", column=@Column(name="full_scan", nullable=false, length=3) ), 
        @AttributeOverride(name="lastStatement", column=@Column(name="last_statement") ), 
        @AttributeOverride(name="lastStatementLatency", column=@Column(name="last_statement_latency") ), 
        @AttributeOverride(name="currentMemory", column=@Column(name="current_memory", precision=41, scale=0) ), 
        @AttributeOverride(name="lastWait", column=@Column(name="last_wait", length=128) ), 
        @AttributeOverride(name="lastWaitLatency", column=@Column(name="last_wait_latency", length=20) ), 
        @AttributeOverride(name="source", column=@Column(name="source", length=64) ), 
        @AttributeOverride(name="trxLatency", column=@Column(name="trx_latency") ), 
        @AttributeOverride(name="trxState", column=@Column(name="trx_state", length=11) ), 
        @AttributeOverride(name="trxAutocommit", column=@Column(name="trx_autocommit", length=3) ), 
        @AttributeOverride(name="pid", column=@Column(name="pid", length=1024) ), 
        @AttributeOverride(name="programName", column=@Column(name="program_name", length=1024) ) } )
    public X.processlistId getId() {
        return this.id;
    }
    
    public void setId(X.processlistId id) {
        this.id = id;
    }




}


