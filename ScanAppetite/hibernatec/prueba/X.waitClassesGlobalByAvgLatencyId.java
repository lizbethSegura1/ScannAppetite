package prueba;
// Generated 18 dic 2023 23:11:31 by Hibernate Tools 4.3.6.Final


import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * X.waitClassesGlobalByAvgLatencyId generated by hbm2java
 */
@Embeddable
public class X.waitClassesGlobalByAvgLatencyId  implements java.io.Serializable {


     private String eventClass;
     private BigInteger total;
     private BigInteger totalLatency;
     private Long minLatency;
     private BigDecimal avgLatency;
     private Long maxLatency;

    public X.waitClassesGlobalByAvgLatencyId() {
    }

	
    public X.waitClassesGlobalByAvgLatencyId(BigDecimal avgLatency) {
        this.avgLatency = avgLatency;
    }
    public X.waitClassesGlobalByAvgLatencyId(String eventClass, BigInteger total, BigInteger totalLatency, Long minLatency, BigDecimal avgLatency, Long maxLatency) {
       this.eventClass = eventClass;
       this.total = total;
       this.totalLatency = totalLatency;
       this.minLatency = minLatency;
       this.avgLatency = avgLatency;
       this.maxLatency = maxLatency;
    }
   


    @Column(name="event_class", length=128)
    public String getEventClass() {
        return this.eventClass;
    }
    
    public void setEventClass(String eventClass) {
        this.eventClass = eventClass;
    }


    @Column(name="total", precision=42, scale=0)
    public BigInteger getTotal() {
        return this.total;
    }
    
    public void setTotal(BigInteger total) {
        this.total = total;
    }


    @Column(name="total_latency", precision=42, scale=0)
    public BigInteger getTotalLatency() {
        return this.totalLatency;
    }
    
    public void setTotalLatency(BigInteger totalLatency) {
        this.totalLatency = totalLatency;
    }


    @Column(name="min_latency")
    public Long getMinLatency() {
        return this.minLatency;
    }
    
    public void setMinLatency(Long minLatency) {
        this.minLatency = minLatency;
    }


    @Column(name="avg_latency", nullable=false, precision=46, scale=4)
    public BigDecimal getAvgLatency() {
        return this.avgLatency;
    }
    
    public void setAvgLatency(BigDecimal avgLatency) {
        this.avgLatency = avgLatency;
    }


    @Column(name="max_latency")
    public Long getMaxLatency() {
        return this.maxLatency;
    }
    
    public void setMaxLatency(Long maxLatency) {
        this.maxLatency = maxLatency;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.waitClassesGlobalByAvgLatencyId) ) return false;
		 X.waitClassesGlobalByAvgLatencyId castOther = ( X.waitClassesGlobalByAvgLatencyId ) other; 
         
		 return ( (this.getEventClass()==castOther.getEventClass()) || ( this.getEventClass()!=null && castOther.getEventClass()!=null && this.getEventClass().equals(castOther.getEventClass()) ) )
 && ( (this.getTotal()==castOther.getTotal()) || ( this.getTotal()!=null && castOther.getTotal()!=null && this.getTotal().equals(castOther.getTotal()) ) )
 && ( (this.getTotalLatency()==castOther.getTotalLatency()) || ( this.getTotalLatency()!=null && castOther.getTotalLatency()!=null && this.getTotalLatency().equals(castOther.getTotalLatency()) ) )
 && ( (this.getMinLatency()==castOther.getMinLatency()) || ( this.getMinLatency()!=null && castOther.getMinLatency()!=null && this.getMinLatency().equals(castOther.getMinLatency()) ) )
 && ( (this.getAvgLatency()==castOther.getAvgLatency()) || ( this.getAvgLatency()!=null && castOther.getAvgLatency()!=null && this.getAvgLatency().equals(castOther.getAvgLatency()) ) )
 && ( (this.getMaxLatency()==castOther.getMaxLatency()) || ( this.getMaxLatency()!=null && castOther.getMaxLatency()!=null && this.getMaxLatency().equals(castOther.getMaxLatency()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getEventClass() == null ? 0 : this.getEventClass().hashCode() );
         result = 37 * result + ( getTotal() == null ? 0 : this.getTotal().hashCode() );
         result = 37 * result + ( getTotalLatency() == null ? 0 : this.getTotalLatency().hashCode() );
         result = 37 * result + ( getMinLatency() == null ? 0 : this.getMinLatency().hashCode() );
         result = 37 * result + ( getAvgLatency() == null ? 0 : this.getAvgLatency().hashCode() );
         result = 37 * result + ( getMaxLatency() == null ? 0 : this.getMaxLatency().hashCode() );
         return result;
   }   


}


