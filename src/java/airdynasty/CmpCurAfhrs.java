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
@Table(name = "cmp_cur_afhrs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CmpCurAfhrs.findAll", query = "SELECT c FROM CmpCurAfhrs c"),
    @NamedQuery(name = "CmpCurAfhrs.findByCmpCurAfhrsId", query = "SELECT c FROM CmpCurAfhrs c WHERE c.cmpCurAfhrsId = :cmpCurAfhrsId"),
    @NamedQuery(name = "CmpCurAfhrs.findByCmpCurAfhrsHrs", query = "SELECT c FROM CmpCurAfhrs c WHERE c.cmpCurAfhrsHrs = :cmpCurAfhrsHrs")})
public class CmpCurAfhrs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "CMP_CUR_AFHRS_ID")
    private Integer cmpCurAfhrsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CMP_CUR_AFHRS_HRS")
    private double cmpCurAfhrsHrs;
    @JoinColumn(name = "CMP_CUR_AFHRS_COMP_ID", referencedColumnName = "COMP_ID")
    @ManyToOne(optional = false)
    private Components cmpCurAfhrsCompId;

    public CmpCurAfhrs() {
    }

    public CmpCurAfhrs(Integer cmpCurAfhrsId) {
        this.cmpCurAfhrsId = cmpCurAfhrsId;
    }

    public CmpCurAfhrs(Integer cmpCurAfhrsId, double cmpCurAfhrsHrs) {
        this.cmpCurAfhrsId = cmpCurAfhrsId;
        this.cmpCurAfhrsHrs = cmpCurAfhrsHrs;
    }

    public Integer getCmpCurAfhrsId() {
        return cmpCurAfhrsId;
    }

    public void setCmpCurAfhrsId(Integer cmpCurAfhrsId) {
        this.cmpCurAfhrsId = cmpCurAfhrsId;
    }

    public double getCmpCurAfhrsHrs() {
        return cmpCurAfhrsHrs;
    }

    public void setCmpCurAfhrsHrs(double cmpCurAfhrsHrs) {
        this.cmpCurAfhrsHrs = cmpCurAfhrsHrs;
    }

    public Components getCmpCurAfhrsCompId() {
        return cmpCurAfhrsCompId;
    }

    public void setCmpCurAfhrsCompId(Components cmpCurAfhrsCompId) {
        this.cmpCurAfhrsCompId = cmpCurAfhrsCompId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cmpCurAfhrsId != null ? cmpCurAfhrsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CmpCurAfhrs)) {
            return false;
        }
        CmpCurAfhrs other = (CmpCurAfhrs) object;
        if ((this.cmpCurAfhrsId == null && other.cmpCurAfhrsId != null) || (this.cmpCurAfhrsId != null && !this.cmpCurAfhrsId.equals(other.cmpCurAfhrsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airdynasty.CmpCurAfhrs[ cmpCurAfhrsId=" + cmpCurAfhrsId + " ]";
    }
    
}
