/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airdynasty;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author A187252
 */
@Entity
@Table(name = "af_eng_insp")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AfEngInsp.findAll", query = "SELECT a FROM AfEngInsp a"),
    @NamedQuery(name = "AfEngInsp.findByAesId", query = "SELECT a FROM AfEngInsp a WHERE a.aesId = :aesId"),
    @NamedQuery(name = "AfEngInsp.findByAesNomenclature", query = "SELECT a FROM AfEngInsp a WHERE a.aesNomenclature = :aesNomenclature"),
    @NamedQuery(name = "AfEngInsp.findByAesDueAfHrs", query = "SELECT a FROM AfEngInsp a WHERE a.aesDueAfHrs = :aesDueAfHrs"),
    @NamedQuery(name = "AfEngInsp.findByAesDueEngHrs", query = "SELECT a FROM AfEngInsp a WHERE a.aesDueEngHrs = :aesDueEngHrs"),
    @NamedQuery(name = "AfEngInsp.findByAesCalDueDate", query = "SELECT a FROM AfEngInsp a WHERE a.aesCalDueDate = :aesCalDueDate"),
    @NamedQuery(name = "AfEngInsp.findByAesDueTime", query = "SELECT a FROM AfEngInsp a WHERE a.aesDueTime = :aesDueTime"),
    @NamedQuery(name = "AfEngInsp.findByAesRemarks", query = "SELECT a FROM AfEngInsp a WHERE a.aesRemarks = :aesRemarks")})
public class AfEngInsp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "AES_ID")
    private Integer aesId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "AES_NOMENCLATURE")
    private String aesNomenclature;
    @Size(max = 255)
    @Column(name = "AES_DUE_AF_HRS")
    private String aesDueAfHrs;
    @Size(max = 255)
    @Column(name = "AES_DUE_ENG_HRS")
    private String aesDueEngHrs;
    @Column(name = "AES_CAL_DUE_DATE")
    @Temporal(TemporalType.DATE)
    private Date aesCalDueDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "AES_DUE_TIME")
    private String aesDueTime;
    @Size(max = 255)
    @Column(name = "AES_REMARKS")
    private String aesRemarks;
    @JoinColumn(name = "AES_AC_ID", referencedColumnName = "AC_ID")
    @ManyToOne(optional = false)
    private AirCraft aesAcId;

    public AfEngInsp() {
    }

    public AfEngInsp(Integer aesId) {
        this.aesId = aesId;
    }

    public AfEngInsp(Integer aesId, String aesNomenclature, String aesDueTime) {
        this.aesId = aesId;
        this.aesNomenclature = aesNomenclature;
        this.aesDueTime = aesDueTime;
    }

    public Integer getAesId() {
        return aesId;
    }

    public void setAesId(Integer aesId) {
        this.aesId = aesId;
    }

    public String getAesNomenclature() {
        return aesNomenclature;
    }

    public void setAesNomenclature(String aesNomenclature) {
        this.aesNomenclature = aesNomenclature;
    }

    public String getAesDueAfHrs() {
        return aesDueAfHrs;
    }

    public void setAesDueAfHrs(String aesDueAfHrs) {
        this.aesDueAfHrs = aesDueAfHrs;
    }

    public String getAesDueEngHrs() {
        return aesDueEngHrs;
    }

    public void setAesDueEngHrs(String aesDueEngHrs) {
        this.aesDueEngHrs = aesDueEngHrs;
    }

    public Date getAesCalDueDate() {
        return aesCalDueDate;
    }

    public void setAesCalDueDate(Date aesCalDueDate) {
        this.aesCalDueDate = aesCalDueDate;
    }

    public String getAesDueTime() {
        return aesDueTime;
    }

    public void setAesDueTime(String aesDueTime) {
        this.aesDueTime = aesDueTime;
    }

    public String getAesRemarks() {
        return aesRemarks;
    }

    public void setAesRemarks(String aesRemarks) {
        this.aesRemarks = aesRemarks;
    }

    public AirCraft getAesAcId() {
        return aesAcId;
    }

    public void setAesAcId(AirCraft aesAcId) {
        this.aesAcId = aesAcId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aesId != null ? aesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AfEngInsp)) {
            return false;
        }
        AfEngInsp other = (AfEngInsp) object;
        if ((this.aesId == null && other.aesId != null) || (this.aesId != null && !this.aesId.equals(other.aesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airdynasty.AfEngInsp[ aesId=" + aesId + " ]";
    }
    
}
