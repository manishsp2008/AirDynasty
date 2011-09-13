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
@Table(name = "cmp_afhrs_inst")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CmpAfhrsInst.findAll", query = "SELECT c FROM CmpAfhrsInst c"),
    @NamedQuery(name = "CmpAfhrsInst.findByCmpAfhrsInstId", query = "SELECT c FROM CmpAfhrsInst c WHERE c.cmpAfhrsInstId = :cmpAfhrsInstId"),
    @NamedQuery(name = "CmpAfhrsInst.findByCmpAfhrsInstHrs", query = "SELECT c FROM CmpAfhrsInst c WHERE c.cmpAfhrsInstHrs = :cmpAfhrsInstHrs")})
public class CmpAfhrsInst implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "CMP_AFHRS_INST_ID")
    private Integer cmpAfhrsInstId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CMP_AFHRS_INST_HRS")
    private double cmpAfhrsInstHrs;
    @JoinColumn(name = "CMP_AFHRS_INST_COMP_ID", referencedColumnName = "COMP_ID")
    @ManyToOne(optional = false)
    private Components cmpAfhrsInstCompId;

    public CmpAfhrsInst() {
    }

    public CmpAfhrsInst(Integer cmpAfhrsInstId) {
        this.cmpAfhrsInstId = cmpAfhrsInstId;
    }

    public CmpAfhrsInst(Integer cmpAfhrsInstId, double cmpAfhrsInstHrs) {
        this.cmpAfhrsInstId = cmpAfhrsInstId;
        this.cmpAfhrsInstHrs = cmpAfhrsInstHrs;
    }

    public Integer getCmpAfhrsInstId() {
        return cmpAfhrsInstId;
    }

    public void setCmpAfhrsInstId(Integer cmpAfhrsInstId) {
        this.cmpAfhrsInstId = cmpAfhrsInstId;
    }

    public double getCmpAfhrsInstHrs() {
        return cmpAfhrsInstHrs;
    }

    public void setCmpAfhrsInstHrs(double cmpAfhrsInstHrs) {
        this.cmpAfhrsInstHrs = cmpAfhrsInstHrs;
    }

    public Components getCmpAfhrsInstCompId() {
        return cmpAfhrsInstCompId;
    }

    public void setCmpAfhrsInstCompId(Components cmpAfhrsInstCompId) {
        this.cmpAfhrsInstCompId = cmpAfhrsInstCompId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cmpAfhrsInstId != null ? cmpAfhrsInstId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CmpAfhrsInst)) {
            return false;
        }
        CmpAfhrsInst other = (CmpAfhrsInst) object;
        if ((this.cmpAfhrsInstId == null && other.cmpAfhrsInstId != null) || (this.cmpAfhrsInstId != null && !this.cmpAfhrsInstId.equals(other.cmpAfhrsInstId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airdynasty.CmpAfhrsInst[ cmpAfhrsInstId=" + cmpAfhrsInstId + " ]";
    }
    
}
