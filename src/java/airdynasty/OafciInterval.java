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
@Table(name = "oafci_interval")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OafciInterval.findAll", query = "SELECT o FROM OafciInterval o"),
    @NamedQuery(name = "OafciInterval.findByOafcinvlId", query = "SELECT o FROM OafciInterval o WHERE o.oafcinvlId = :oafcinvlId"),
    @NamedQuery(name = "OafciInterval.findByOafcinvlHrs", query = "SELECT o FROM OafciInterval o WHERE o.oafcinvlHrs = :oafcinvlHrs"),
    @NamedQuery(name = "OafciInterval.findByOafcinvlHrsType", query = "SELECT o FROM OafciInterval o WHERE o.oafcinvlHrsType = :oafcinvlHrsType")})
public class OafciInterval implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "OAFCINVL_ID")
    private Integer oafcinvlId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "OAFCINVL_HRS")
    private String oafcinvlHrs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "OAFCINVL_HRS_TYPE")
    private String oafcinvlHrsType;
    @JoinColumn(name = "OAFCINVL_OAFCI_ID", referencedColumnName = "OAFCI_ID")
    @ManyToOne(optional = false)
    private OafChangeInt oafcinvlOafciId;

    public OafciInterval() {
    }

    public OafciInterval(Integer oafcinvlId) {
        this.oafcinvlId = oafcinvlId;
    }

    public OafciInterval(Integer oafcinvlId, String oafcinvlHrs, String oafcinvlHrsType) {
        this.oafcinvlId = oafcinvlId;
        this.oafcinvlHrs = oafcinvlHrs;
        this.oafcinvlHrsType = oafcinvlHrsType;
    }

    public Integer getOafcinvlId() {
        return oafcinvlId;
    }

    public void setOafcinvlId(Integer oafcinvlId) {
        this.oafcinvlId = oafcinvlId;
    }

    public String getOafcinvlHrs() {
        return oafcinvlHrs;
    }

    public void setOafcinvlHrs(String oafcinvlHrs) {
        this.oafcinvlHrs = oafcinvlHrs;
    }

    public String getOafcinvlHrsType() {
        return oafcinvlHrsType;
    }

    public void setOafcinvlHrsType(String oafcinvlHrsType) {
        this.oafcinvlHrsType = oafcinvlHrsType;
    }

    public OafChangeInt getOafcinvlOafciId() {
        return oafcinvlOafciId;
    }

    public void setOafcinvlOafciId(OafChangeInt oafcinvlOafciId) {
        this.oafcinvlOafciId = oafcinvlOafciId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oafcinvlId != null ? oafcinvlId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OafciInterval)) {
            return false;
        }
        OafciInterval other = (OafciInterval) object;
        if ((this.oafcinvlId == null && other.oafcinvlId != null) || (this.oafcinvlId != null && !this.oafcinvlId.equals(other.oafcinvlId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airdynasty.OafciInterval[ oafcinvlId=" + oafcinvlId + " ]";
    }
    
}
