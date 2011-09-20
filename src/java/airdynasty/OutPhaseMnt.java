/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airdynasty;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author A187252
 */
@Entity
@Table(name = "out_phase_mnt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OutPhaseMnt.findAll", query = "SELECT o FROM OutPhaseMnt o"),
    @NamedQuery(name = "OutPhaseMnt.findByOpmId", query = "SELECT o FROM OutPhaseMnt o WHERE o.opmId = :opmId"),
    @NamedQuery(name = "OutPhaseMnt.findByOpmNomenclature", query = "SELECT o FROM OutPhaseMnt o WHERE o.opmNomenclature = :opmNomenclature"),
    @NamedQuery(name = "OutPhaseMnt.findByOpmDueAt", query = "SELECT o FROM OutPhaseMnt o WHERE o.opmDueAt = :opmDueAt"),
    @NamedQuery(name = "OutPhaseMnt.findByOpmDueHrs", query = "SELECT o FROM OutPhaseMnt o WHERE o.opmDueHrs = :opmDueHrs"),
    @NamedQuery(name = "OutPhaseMnt.findByOpmDueHrsType", query = "SELECT o FROM OutPhaseMnt o WHERE o.opmDueHrsType = :opmDueHrsType"),
    @NamedQuery(name = "OutPhaseMnt.findByOpmCalDueDate", query = "SELECT o FROM OutPhaseMnt o WHERE o.opmCalDueDate = :opmCalDueDate")})
public class OutPhaseMnt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "OPM_ID")
    private Integer opmId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "OPM_NOMENCLATURE")
    private String opmNomenclature;
    @Size(max = 1)
    @Column(name = "OPM_DUE_AT")
    private String opmDueAt;
    @Size(max = 255)
    @Column(name = "OPM_DUE_HRS")
    private String opmDueHrs;
    @Size(max = 1)
    @Column(name = "OPM_DUE_HRS_TYPE")
    private String opmDueHrsType;
    @Column(name = "OPM_CAL_DUE_DATE")
    @Temporal(TemporalType.DATE)
    private Date opmCalDueDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "opminvlOpmId")
    private Set<OpmInterval> opmIntervalSet;
    @JoinColumn(name = "OPM_AC_ID", referencedColumnName = "AC_ID")
    @ManyToOne(optional = false)
    private AirCraft opmAcId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "opmremOpmId")
    private Set<OpmRemarks> opmRemarksSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "opmtrOpmId")
    private Set<OpmTimeRem> opmTimeRemSet;

    public OutPhaseMnt() {
    }

    public OutPhaseMnt(Integer opmId) {
        this.opmId = opmId;
    }

    public OutPhaseMnt(Integer opmId, String opmNomenclature) {
        this.opmId = opmId;
        this.opmNomenclature = opmNomenclature;
    }

    public Integer getOpmId() {
        return opmId;
    }

    public void setOpmId(Integer opmId) {
        this.opmId = opmId;
    }

    public String getOpmNomenclature() {
        return opmNomenclature;
    }

    public void setOpmNomenclature(String opmNomenclature) {
        this.opmNomenclature = opmNomenclature;
    }

    public String getOpmDueAt() {
        return opmDueAt;
    }

    public void setOpmDueAt(String opmDueAt) {
        this.opmDueAt = opmDueAt;
    }

    public String getOpmDueHrs() {
        return opmDueHrs;
    }

    public void setOpmDueHrs(String opmDueHrs) {
        this.opmDueHrs = opmDueHrs;
    }

    public String getOpmDueHrsType() {
        return opmDueHrsType;
    }

    public void setOpmDueHrsType(String opmDueHrsType) {
        this.opmDueHrsType = opmDueHrsType;
    }

    public Date getOpmCalDueDate() {
        return opmCalDueDate;
    }

    public void setOpmCalDueDate(Date opmCalDueDate) {
        this.opmCalDueDate = opmCalDueDate;
    }

    @XmlTransient
    public Set<OpmInterval> getOpmIntervalSet() {
        return opmIntervalSet;
    }

    public void setOpmIntervalSet(Set<OpmInterval> opmIntervalSet) {
        this.opmIntervalSet = opmIntervalSet;
    }

    public AirCraft getOpmAcId() {
        return opmAcId;
    }

    public void setOpmAcId(AirCraft opmAcId) {
        this.opmAcId = opmAcId;
    }

    @XmlTransient
    public Set<OpmRemarks> getOpmRemarksSet() {
        return opmRemarksSet;
    }

    public void setOpmRemarksSet(Set<OpmRemarks> opmRemarksSet) {
        this.opmRemarksSet = opmRemarksSet;
    }

    @XmlTransient
    public Set<OpmTimeRem> getOpmTimeRemSet() {
        return opmTimeRemSet;
    }

    public void setOpmTimeRemSet(Set<OpmTimeRem> opmTimeRemSet) {
        this.opmTimeRemSet = opmTimeRemSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (opmId != null ? opmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OutPhaseMnt)) {
            return false;
        }
        OutPhaseMnt other = (OutPhaseMnt) object;
        if ((this.opmId == null && other.opmId != null) || (this.opmId != null && !this.opmId.equals(other.opmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airdynasty.OutPhaseMnt[ opmId=" + opmId + " ]";
    }
    
}
