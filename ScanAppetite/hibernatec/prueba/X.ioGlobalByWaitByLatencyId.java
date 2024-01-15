package prueba;
// Generated 18 dic 2023 23:11:31 by Hibernate Tools 4.3.6.Final


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * X.ioGlobalByWaitByLatencyId generated by hbm2java
 */
@Embeddable
public class X.ioGlobalByWaitByLatencyId  implements java.io.Serializable {


     private String eventName;
     private long total;
     private long totalLatency;
     private long avgLatency;
     private long maxLatency;
     private long readLatency;
     private long writeLatency;
     private long miscLatency;
     private long countRead;
     private long totalRead;
     private BigDecimal avgRead;
     private long countWrite;
     private long totalWritten;
     private BigDecimal avgWritten;

    public X.ioGlobalByWaitByLatencyId() {
    }

	
    public X.ioGlobalByWaitByLatencyId(long total, long totalLatency, long avgLatency, long maxLatency, long readLatency, long writeLatency, long miscLatency, long countRead, long totalRead, BigDecimal avgRead, long countWrite, long totalWritten, BigDecimal avgWritten) {
        this.total = total;
        this.totalLatency = totalLatency;
        this.avgLatency = avgLatency;
        this.maxLatency = maxLatency;
        this.readLatency = readLatency;
        this.writeLatency = writeLatency;
        this.miscLatency = miscLatency;
        this.countRead = countRead;
        this.totalRead = totalRead;
        this.avgRead = avgRead;
        this.countWrite = countWrite;
        this.totalWritten = totalWritten;
        this.avgWritten = avgWritten;
    }
    public X.ioGlobalByWaitByLatencyId(String eventName, long total, long totalLatency, long avgLatency, long maxLatency, long readLatency, long writeLatency, long miscLatency, long countRead, long totalRead, BigDecimal avgRead, long countWrite, long totalWritten, BigDecimal avgWritten) {
       this.eventName = eventName;
       this.total = total;
       this.totalLatency = totalLatency;
       this.avgLatency = avgLatency;
       this.maxLatency = maxLatency;
       this.readLatency = readLatency;
       this.writeLatency = writeLatency;
       this.miscLatency = miscLatency;
       this.countRead = countRead;
       this.totalRead = totalRead;
       this.avgRead = avgRead;
       this.countWrite = countWrite;
       this.totalWritten = totalWritten;
       this.avgWritten = avgWritten;
    }
   


    @Column(name="event_name", length=128)
    public String getEventName() {
        return this.eventName;
    }
    
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }


    @Column(name="total", nullable=false)
    public long getTotal() {
        return this.total;
    }
    
    public void setTotal(long total) {
        this.total = total;
    }


    @Column(name="total_latency", nullable=false)
    public long getTotalLatency() {
        return this.totalLatency;
    }
    
    public void setTotalLatency(long totalLatency) {
        this.totalLatency = totalLatency;
    }


    @Column(name="avg_latency", nullable=false)
    public long getAvgLatency() {
        return this.avgLatency;
    }
    
    public void setAvgLatency(long avgLatency) {
        this.avgLatency = avgLatency;
    }


    @Column(name="max_latency", nullable=false)
    public long getMaxLatency() {
        return this.maxLatency;
    }
    
    public void setMaxLatency(long maxLatency) {
        this.maxLatency = maxLatency;
    }


    @Column(name="read_latency", nullable=false)
    public long getReadLatency() {
        return this.readLatency;
    }
    
    public void setReadLatency(long readLatency) {
        this.readLatency = readLatency;
    }


    @Column(name="write_latency", nullable=false)
    public long getWriteLatency() {
        return this.writeLatency;
    }
    
    public void setWriteLatency(long writeLatency) {
        this.writeLatency = writeLatency;
    }


    @Column(name="misc_latency", nullable=false)
    public long getMiscLatency() {
        return this.miscLatency;
    }
    
    public void setMiscLatency(long miscLatency) {
        this.miscLatency = miscLatency;
    }


    @Column(name="count_read", nullable=false)
    public long getCountRead() {
        return this.countRead;
    }
    
    public void setCountRead(long countRead) {
        this.countRead = countRead;
    }


    @Column(name="total_read", nullable=false)
    public long getTotalRead() {
        return this.totalRead;
    }
    
    public void setTotalRead(long totalRead) {
        this.totalRead = totalRead;
    }


    @Column(name="avg_read", nullable=false, precision=23, scale=4)
    public BigDecimal getAvgRead() {
        return this.avgRead;
    }
    
    public void setAvgRead(BigDecimal avgRead) {
        this.avgRead = avgRead;
    }


    @Column(name="count_write", nullable=false)
    public long getCountWrite() {
        return this.countWrite;
    }
    
    public void setCountWrite(long countWrite) {
        this.countWrite = countWrite;
    }


    @Column(name="total_written", nullable=false)
    public long getTotalWritten() {
        return this.totalWritten;
    }
    
    public void setTotalWritten(long totalWritten) {
        this.totalWritten = totalWritten;
    }


    @Column(name="avg_written", nullable=false, precision=23, scale=4)
    public BigDecimal getAvgWritten() {
        return this.avgWritten;
    }
    
    public void setAvgWritten(BigDecimal avgWritten) {
        this.avgWritten = avgWritten;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.ioGlobalByWaitByLatencyId) ) return false;
		 X.ioGlobalByWaitByLatencyId castOther = ( X.ioGlobalByWaitByLatencyId ) other; 
         
		 return ( (this.getEventName()==castOther.getEventName()) || ( this.getEventName()!=null && castOther.getEventName()!=null && this.getEventName().equals(castOther.getEventName()) ) )
 && (this.getTotal()==castOther.getTotal())
 && (this.getTotalLatency()==castOther.getTotalLatency())
 && (this.getAvgLatency()==castOther.getAvgLatency())
 && (this.getMaxLatency()==castOther.getMaxLatency())
 && (this.getReadLatency()==castOther.getReadLatency())
 && (this.getWriteLatency()==castOther.getWriteLatency())
 && (this.getMiscLatency()==castOther.getMiscLatency())
 && (this.getCountRead()==castOther.getCountRead())
 && (this.getTotalRead()==castOther.getTotalRead())
 && ( (this.getAvgRead()==castOther.getAvgRead()) || ( this.getAvgRead()!=null && castOther.getAvgRead()!=null && this.getAvgRead().equals(castOther.getAvgRead()) ) )
 && (this.getCountWrite()==castOther.getCountWrite())
 && (this.getTotalWritten()==castOther.getTotalWritten())
 && ( (this.getAvgWritten()==castOther.getAvgWritten()) || ( this.getAvgWritten()!=null && castOther.getAvgWritten()!=null && this.getAvgWritten().equals(castOther.getAvgWritten()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getEventName() == null ? 0 : this.getEventName().hashCode() );
         result = 37 * result + (int) this.getTotal();
         result = 37 * result + (int) this.getTotalLatency();
         result = 37 * result + (int) this.getAvgLatency();
         result = 37 * result + (int) this.getMaxLatency();
         result = 37 * result + (int) this.getReadLatency();
         result = 37 * result + (int) this.getWriteLatency();
         result = 37 * result + (int) this.getMiscLatency();
         result = 37 * result + (int) this.getCountRead();
         result = 37 * result + (int) this.getTotalRead();
         result = 37 * result + ( getAvgRead() == null ? 0 : this.getAvgRead().hashCode() );
         result = 37 * result + (int) this.getCountWrite();
         result = 37 * result + (int) this.getTotalWritten();
         result = 37 * result + ( getAvgWritten() == null ? 0 : this.getAvgWritten().hashCode() );
         return result;
   }   


}

