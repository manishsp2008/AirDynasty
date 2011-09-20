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
@Table(name = "opm_interval")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpmInterval.findAll", query = "SELECT o FROM OpmInterval o"),
    @NamedQuery(name = "OpmInterval.findByOpminvlId", query = "SELECT o FROM OpmInterval o WHERE o.opminvlId = :opminvlId"),
    @NamedQuery(name = "OpmInterval.findByOpminvlHrs", query = "SELECT o FROM OpmInterval o WHERE o.opminvlHrs = :opminvlHrs"),
    @NamedQuery(name = "OpmInterval.findByOpminvlHrsType", query = "SELECT o FROM OpmInterval o WHERE o.opminvlHrsType = :opminvlHrsType")})
public class OpmInterval implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "OPMINVL_ID")
    private Integer opminvlId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "OPMINVL_HRS")
    private String opminvlHrs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "OPMINVL_HRS_TYPE")
    private String opminvlHrsType;
    @JoinColumn(name = "OPMINVL_OPM_ID", referencedColumnName = "OPM_ID")
    @ManyToOne(optional = false)
    private OutPhaseMnt opminvlOpmId;

    public OpmInterval() {
    }

    public OpmInterval(Integer opminvlId) {
        this.opminvlId = opminvlId;
    }

    public OpmInterval(Integer opminvlId, String opminvlHrs, String opminvlHrsType) {
        this.opminvlId = opminvlId;
        this.opminvlHrs = opminvlHrs;
        this.opminvlHrsType = opminvlHrsType;
    }

    public Integer getOpminvlId() {
        return opminvlId;
    }

    public void setOpminvlId(Integer opminvlId) {
        this.opminvlId = opminvlId;
    }

    public String getOpminvlHrs() {
        return opminvlHrs;
    }

    public void setOpminvlHrs(String opminvlHrs) {
        this.opminvlHrs = opminvlHrs;
    }

    public String getOpminvlHrsType() {
        return opminvlHrsType;
    }

    public void setOpminvlHrsType(String opminvlHrsType) {
        this.opminvlHrsType = opminvlHrsType;
    }

    public OutPhaseMnt getOpminvlOpmId() {
        return opminvlOpmId;
    }

    public void setOpminvlOpmId(OutPhaseMnt opminvlOpmId) {
        this.opminvlOpmId = opminvlOpmId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (opminvlId != null ? opminvlId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpmInterval)) {
            return false;
        }
        OpmInterval other = (OpmInterval) object;
        if ((this.opminvlId == null && other.opminvlId != null) || (this.opminvlId != null && !this.opminvlId.equals(other.opminvlId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airdynasty.OpmInterval[ opminvlId=" + opminvlId + " ]";
    }
    
}
