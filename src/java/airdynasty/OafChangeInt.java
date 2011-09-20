/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airdynasty;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author A187252
 */
@Entity
@Table(name = "oaf_change_int")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OafChangeInt.findAll", query = "SELECT o FROM OafChangeInt o"),
    @NamedQuery(name = "OafChangeInt.findByOafciId", query = "SELECT o FROM OafChangeInt o WHERE o.oafciId = :oafciId"),
    @NamedQuery(name = "OafChangeInt.findByOafciNomenclature", query = "SELECT o FROM OafChangeInt o WHERE o.oafciNomenclature = :oafciNomenclature"),
    @NamedQuery(name = "OafChangeInt.findByOafciSpecs", query = "SELECT o FROM OafChangeInt o WHERE o.oafciSpecs = :oafciSpecs")})
public class OafChangeInt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "OAFCI_ID")
    private Integer oafciId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "OAFCI_NOMENCLATURE")
    private String oafciNomenclature;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "OAFCI_SPECS")
    private String oafciSpecs;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "oanfdahOafciId")
    private Set<OafciDueAtHrs> oafciDueAtHrsSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "oafcinvlOafciId")
    private Set<OafciInterval> oafciIntervalSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "oafdhOafciId")
    private Set<OafciDueHrs> oafciDueHrsSet;
    @JoinColumn(name = "OAFCI_AC_ID", referencedColumnName = "AC_ID")
    @ManyToOne(optional = false)
    private AirCraft oafciAcId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "oafremOafciId")
    private Set<OafciRemarks> oafciRemarksSet;

    public OafChangeInt() {
    }

    public OafChangeInt(Integer oafciId) {
        this.oafciId = oafciId;
    }

    public OafChangeInt(Integer oafciId, String oafciNomenclature, String oafciSpecs) {
        this.oafciId = oafciId;
        this.oafciNomenclature = oafciNomenclature;
        this.oafciSpecs = oafciSpecs;
    }

    public Integer getOafciId() {
        return oafciId;
    }

    public void setOafciId(Integer oafciId) {
        this.oafciId = oafciId;
    }

    public String getOafciNomenclature() {
        return oafciNomenclature;
    }

    public void setOafciNomenclature(String oafciNomenclature) {
        this.oafciNomenclature = oafciNomenclature;
    }

    public String getOafciSpecs() {
        return oafciSpecs;
    }

    public void setOafciSpecs(String oafciSpecs) {
        this.oafciSpecs = oafciSpecs;
    }

    @XmlTransient
    public Set<OafciDueAtHrs> getOafciDueAtHrsSet() {
        return oafciDueAtHrsSet;
    }

    public void setOafciDueAtHrsSet(Set<OafciDueAtHrs> oafciDueAtHrsSet) {
        this.oafciDueAtHrsSet = oafciDueAtHrsSet;
    }

    @XmlTransient
    public Set<OafciInterval> getOafciIntervalSet() {
        return oafciIntervalSet;
    }

    public void setOafciIntervalSet(Set<OafciInterval> oafciIntervalSet) {
        this.oafciIntervalSet = oafciIntervalSet;
    }

    @XmlTransient
    public Set<OafciDueHrs> getOafciDueHrsSet() {
        return oafciDueHrsSet;
    }

    public void setOafciDueHrsSet(Set<OafciDueHrs> oafciDueHrsSet) {
        this.oafciDueHrsSet = oafciDueHrsSet;
    }

    public AirCraft getOafciAcId() {
        return oafciAcId;
    }

    public void setOafciAcId(AirCraft oafciAcId) {
        this.oafciAcId = oafciAcId;
    }

    @XmlTransient
    public Set<OafciRemarks> getOafciRemarksSet() {
        return oafciRemarksSet;
    }

    public void setOafciRemarksSet(Set<OafciRemarks> oafciRemarksSet) {
        this.oafciRemarksSet = oafciRemarksSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oafciId != null ? oafciId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OafChangeInt)) {
            return false;
        }
        OafChangeInt other = (OafChangeInt) object;
        if ((this.oafciId == null && other.oafciId != null) || (this.oafciId != null && !this.oafciId.equals(other.oafciId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airdynasty.OafChangeInt[ oafciId=" + oafciId + " ]";
    }
    
}
