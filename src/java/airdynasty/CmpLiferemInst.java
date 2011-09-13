/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airdynasty;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "cmp_liferem_inst")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CmpLiferemInst.findAll", query = "SELECT c FROM CmpLiferemInst c"),
    @NamedQuery(name = "CmpLiferemInst.findByCmplifeRemId", query = "SELECT c FROM CmpLiferemInst c WHERE c.cmplifeRemId = :cmplifeRemId"),
    @NamedQuery(name = "CmpLiferemInst.findByCmplifeRemHrs", query = "SELECT c FROM CmpLiferemInst c WHERE c.cmplifeRemHrs = :cmplifeRemHrs")})
public class CmpLiferemInst implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "CMPLIFE_REM_ID")
    private Integer cmplifeRemId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CMPLIFE_REM_HRS")
    private double cmplifeRemHrs;
    @JoinColumn(name = "CMPLIFES_COMP_ID", referencedColumnName = "COMP_ID")
    @ManyToOne(optional = false)
    private Components cmplifesCompId;

    public CmpLiferemInst() {
    }

    public CmpLiferemInst(Integer cmplifeRemId) {
        this.cmplifeRemId = cmplifeRemId;
    }

    public CmpLiferemInst(Integer cmplifeRemId, double cmplifeRemHrs) {
        this.cmplifeRemId = cmplifeRemId;
        this.cmplifeRemHrs = cmplifeRemHrs;
    }

    public Integer getCmplifeRemId() {
        return cmplifeRemId;
    }

    public void setCmplifeRemId(Integer cmplifeRemId) {
        this.cmplifeRemId = cmplifeRemId;
    }

    public double getCmplifeRemHrs() {
        return cmplifeRemHrs;
    }

    public void setCmplifeRemHrs(double cmplifeRemHrs) {
        this.cmplifeRemHrs = cmplifeRemHrs;
    }

    public Components getCmplifesCompId() {
        return cmplifesCompId;
    }

    public void setCmplifesCompId(Components cmplifesCompId) {
        this.cmplifesCompId = cmplifesCompId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cmplifeRemId != null ? cmplifeRemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CmpLiferemInst)) {
            return false;
        }
        CmpLiferemInst other = (CmpLiferemInst) object;
        if ((this.cmplifeRemId == null && other.cmplifeRemId != null) || (this.cmplifeRemId != null && !this.cmplifeRemId.equals(other.cmplifeRemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airdynasty.CmpLiferemInst[ cmplifeRemId=" + cmplifeRemId + " ]";
    }
    
}
