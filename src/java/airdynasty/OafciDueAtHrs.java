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
@Table(name = "oafci_due_at_hrs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OafciDueAtHrs.findAll", query = "SELECT o FROM OafciDueAtHrs o"),
    @NamedQuery(name = "OafciDueAtHrs.findByOanfDahId", query = "SELECT o FROM OafciDueAtHrs o WHERE o.oanfDahId = :oanfDahId"),
    @NamedQuery(name = "OafciDueAtHrs.findByOanfDahHrs", query = "SELECT o FROM OafciDueAtHrs o WHERE o.oanfDahHrs = :oanfDahHrs"),
    @NamedQuery(name = "OafciDueAtHrs.findByOanfdahHrsType", query = "SELECT o FROM OafciDueAtHrs o WHERE o.oanfdahHrsType = :oanfdahHrsType")})
public class OafciDueAtHrs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "OANF_DAH_ID")
    private Integer oanfDahId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "OANF_DAH_HRS")
    private String oanfDahHrs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "OANFDAH_HRS_TYPE")
    private String oanfdahHrsType;
    @JoinColumn(name = "OANFDAH_OAFCI_ID", referencedColumnName = "OAFCI_ID")
    @ManyToOne(optional = false)
    private OafChangeInt oanfdahOafciId;

    public OafciDueAtHrs() {
    }

    public OafciDueAtHrs(Integer oanfDahId) {
        this.oanfDahId = oanfDahId;
    }

    public OafciDueAtHrs(Integer oanfDahId, String oanfDahHrs, String oanfdahHrsType) {
        this.oanfDahId = oanfDahId;
        this.oanfDahHrs = oanfDahHrs;
        this.oanfdahHrsType = oanfdahHrsType;
    }

    public Integer getOanfDahId() {
        return oanfDahId;
    }

    public void setOanfDahId(Integer oanfDahId) {
        this.oanfDahId = oanfDahId;
    }

    public String getOanfDahHrs() {
        return oanfDahHrs;
    }

    public void setOanfDahHrs(String oanfDahHrs) {
        this.oanfDahHrs = oanfDahHrs;
    }

    public String getOanfdahHrsType() {
        return oanfdahHrsType;
    }

    public void setOanfdahHrsType(String oanfdahHrsType) {
        this.oanfdahHrsType = oanfdahHrsType;
    }

    public OafChangeInt getOanfdahOafciId() {
        return oanfdahOafciId;
    }

    public void setOanfdahOafciId(OafChangeInt oanfdahOafciId) {
        this.oanfdahOafciId = oanfdahOafciId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oanfDahId != null ? oanfDahId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OafciDueAtHrs)) {
            return false;
        }
        OafciDueAtHrs other = (OafciDueAtHrs) object;
        if ((this.oanfDahId == null && other.oanfDahId != null) || (this.oanfDahId != null && !this.oanfDahId.equals(other.oanfDahId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airdynasty.OafciDueAtHrs[ oanfDahId=" + oanfDahId + " ]";
    }
    
}
