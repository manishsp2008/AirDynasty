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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author A187252
 */
@Entity
@Table(name = "opm_time_rem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpmTimeRem.findAll", query = "SELECT o FROM OpmTimeRem o"),
    @NamedQuery(name = "OpmTimeRem.findByOpmtrId", query = "SELECT o FROM OpmTimeRem o WHERE o.opmtrId = :opmtrId"),
    @NamedQuery(name = "OpmTimeRem.findByOpmtrHrs", query = "SELECT o FROM OpmTimeRem o WHERE o.opmtrHrs = :opmtrHrs"),
    @NamedQuery(name = "OpmTimeRem.findByOpmtrHrsType", query = "SELECT o FROM OpmTimeRem o WHERE o.opmtrHrsType = :opmtrHrsType")})
public class OpmTimeRem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "OPMTR_ID")
    private Integer opmtrId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "OPMTR_HRS")
    private String opmtrHrs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "OPMTR_HRS_TYPE")
    private String opmtrHrsType;
    @JoinColumn(name = "OPMTR_OPM_ID", referencedColumnName = "OPM_ID")
    @ManyToOne(optional = false)
    private OutPhaseMnt opmtrOpmId;

    public OpmTimeRem() {
    }

    public OpmTimeRem(Integer opmtrId) {
        this.opmtrId = opmtrId;
    }

    public OpmTimeRem(Integer opmtrId, String opmtrHrs, String opmtrHrsType) {
        this.opmtrId = opmtrId;
        this.opmtrHrs = opmtrHrs;
        this.opmtrHrsType = opmtrHrsType;
    }

    public Integer getOpmtrId() {
        return opmtrId;
    }

    public void setOpmtrId(Integer opmtrId) {
        this.opmtrId = opmtrId;
    }

    public String getOpmtrHrs() {
        return opmtrHrs;
    }

    public void setOpmtrHrs(String opmtrHrs) {
        this.opmtrHrs = opmtrHrs;
    }

    public String getOpmtrHrsType() {
        return opmtrHrsType;
    }

    public void setOpmtrHrsType(String opmtrHrsType) {
        this.opmtrHrsType = opmtrHrsType;
    }

    public OutPhaseMnt getOpmtrOpmId() {
        return opmtrOpmId;
    }

    public void setOpmtrOpmId(OutPhaseMnt opmtrOpmId) {
        this.opmtrOpmId = opmtrOpmId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (opmtrId != null ? opmtrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpmTimeRem)) {
            return false;
        }
        OpmTimeRem other = (OpmTimeRem) object;
        if ((this.opmtrId == null && other.opmtrId != null) || (this.opmtrId != null && !this.opmtrId.equals(other.opmtrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airdynasty.OpmTimeRem[ opmtrId=" + opmtrId + " ]";
    }
    
}
