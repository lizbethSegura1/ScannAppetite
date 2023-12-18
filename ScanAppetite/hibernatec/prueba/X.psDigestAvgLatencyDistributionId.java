package prueba;
// Generated 18 dic 2023 23:11:31 by Hibernate Tools 4.3.6.Final


import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * X.psDigestAvgLatencyDistributionId generated by hbm2java
 */
@Embeddable
public class X.psDigestAvgLatencyDistributionId  implements java.io.Serializable {


     private long cnt;
     private BigInteger avgUs;

    public X.psDigestAvgLatencyDistributionId() {
    }

	
    public X.psDigestAvgLatencyDistributionId(long cnt) {
        this.cnt = cnt;
    }
    public X.psDigestAvgLatencyDistributionId(long cnt, BigInteger avgUs) {
       this.cnt = cnt;
       this.avgUs = avgUs;
    }
   


    @Column(name="cnt", nullable=false)
    public long getCnt() {
        return this.cnt;
    }
    
    public void setCnt(long cnt) {
        this.cnt = cnt;
    }


    @Column(name="avg_us", precision=21, scale=0)
    public BigInteger getAvgUs() {
        return this.avgUs;
    }
    
    public void setAvgUs(BigInteger avgUs) {
        this.avgUs = avgUs;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.psDigestAvgLatencyDistributionId) ) return false;
		 X.psDigestAvgLatencyDistributionId castOther = ( X.psDigestAvgLatencyDistributionId ) other; 
         
		 return (this.getCnt()==castOther.getCnt())
 && ( (this.getAvgUs()==castOther.getAvgUs()) || ( this.getAvgUs()!=null && castOther.getAvgUs()!=null && this.getAvgUs().equals(castOther.getAvgUs()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getCnt();
         result = 37 * result + ( getAvgUs() == null ? 0 : this.getAvgUs().hashCode() );
         return result;
   }   


}


