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
@Table(name = "comp_dueoff_afhrs_inst")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompDueoffAfhrsInst.findAll", query = "SELECT c FROM CompDueoffAfhrsInst c"),
    @NamedQuery(name = "CompDueoffAfhrsInst.findByCdaId", query = "SELECT c FROM CompDueoffAfhrsInst c WHERE c.cdaId = :cdaId"),
    @NamedQuery(name = "CompDueoffAfhrsInst.findByCdaHrs", query = "SELECT c FROM CompDueoffAfhrsInst c WHERE c.cdaHrs = :cdaHrs")})
public class CompDueoffAfhrsInst implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "CDA_ID")
    private Integer cdaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CDA_HRS")
    private double cdaHrs;
    @JoinColumn(name = "CDA_COMP_ID", referencedColumnName = "COMP_ID")
    @ManyToOne(optional = false)
    private Components cdaCompId;

    public CompDueoffAfhrsInst() {
    }

    public CompDueoffAfhrsInst(Integer cdaId) {
        this.cdaId = cdaId;
    }

    public CompDueoffAfhrsInst(Integer cdaId, double cdaHrs) {
        this.cdaId = cdaId;
        this.cdaHrs = cdaHrs;
    }

    public Integer getCdaId() {
        return cdaId;
    }

    public void setCdaId(Integer cdaId) {
        this.cdaId = cdaId;
    }

    public double getCdaHrs() {
        return cdaHrs;
    }

    public void setCdaHrs(double cdaHrs) {
        this.cdaHrs = cdaHrs;
    }

    public Components getCdaCompId() {
        return cdaCompId;
    }

    public void setCdaCompId(Components cdaCompId) {
        this.cdaCompId = cdaCompId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdaId != null ? cdaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompDueoffAfhrsInst)) {
            return false;
        }
        CompDueoffAfhrsInst other = (CompDueoffAfhrsInst) object;
        if ((this.cdaId == null && other.cdaId != null) || (this.cdaId != null && !this.cdaId.equals(other.cdaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airdynasty.CompDueoffAfhrsInst[ cdaId=" + cdaId + " ]";
    }
    
}
