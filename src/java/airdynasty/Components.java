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
@Table(name = "components")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Components.findAll", query = "SELECT c FROM Components c"),
    @NamedQuery(name = "Components.findByCompId", query = "SELECT c FROM Components c WHERE c.compId = :compId"),
    @NamedQuery(name = "Components.findByCompPartname", query = "SELECT c FROM Components c WHERE c.compPartname = :compPartname"),
    @NamedQuery(name = "Components.findByCompPartnum", query = "SELECT c FROM Components c WHERE c.compPartnum = :compPartnum")})
public class Components implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "COMP_ID")
    private Integer compId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "COMP_PARTNAME")
    private String compPartname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "COMP_PARTNUM")
    private String compPartnum;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cmpAfhrsInstCompId")
    private Set<CmpAfhrsInst> cmpAfhrsInstSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cmpCurAfhrsCompId")
    private Set<CmpCurAfhrs> cmpCurAfhrsSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cmpDateInstCompId")
    private Set<CmpDateInst> cmpDateInstSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "crlCompId")
    private Set<CompRemLife> compRemLifeSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cmpFinitelifeCompId")
    private Set<CmpFinitelife> cmpFinitelifeSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cmplifesCompId")
    private Set<CmpLiferemInst> cmpLiferemInstSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cmpRemarksCompId")
    private Set<CmpRemarks> cmpRemarksSet;
    @JoinColumn(name = "COMP_AC_ID", referencedColumnName = "AC_ID")
    @ManyToOne(optional = false)
    private AirCraft compAcId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cdaCompId")
    private Set<CompDueoffAfhrsInst> compDueoffAfhrsInstSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "serialnumCompId")
    private Set<CmpSerialNumber> cmpSerialNumberSet;

    public Components() {
    }

    public Components(Integer compId) {
        this.compId = compId;
    }

    public Components(Integer compId, String compPartname, String compPartnum) {
        this.compId = compId;
        this.compPartname = compPartname;
        this.compPartnum = compPartnum;
    }

    public Integer getCompId() {
        return compId;
    }

    public void setCompId(Integer compId) {
        this.compId = compId;
    }

    public String getCompPartname() {
        return compPartname;
    }

    public void setCompPartname(String compPartname) {
        this.compPartname = compPartname;
    }

    public String getCompPartnum() {
        return compPartnum;
    }

    public void setCompPartnum(String compPartnum) {
        this.compPartnum = compPartnum;
    }

    @XmlTransient
    public Set<CmpAfhrsInst> getCmpAfhrsInstSet() {
        return cmpAfhrsInstSet;
    }

    public void setCmpAfhrsInstSet(Set<CmpAfhrsInst> cmpAfhrsInstSet) {
        this.cmpAfhrsInstSet = cmpAfhrsInstSet;
    }

    @XmlTransient
    public Set<CmpCurAfhrs> getCmpCurAfhrsSet() {
        return cmpCurAfhrsSet;
    }

    public void setCmpCurAfhrsSet(Set<CmpCurAfhrs> cmpCurAfhrsSet) {
        this.cmpCurAfhrsSet = cmpCurAfhrsSet;
    }

    @XmlTransient
    public Set<CmpDateInst> getCmpDateInstSet() {
        return cmpDateInstSet;
    }

    public void setCmpDateInstSet(Set<CmpDateInst> cmpDateInstSet) {
        this.cmpDateInstSet = cmpDateInstSet;
    }

    @XmlTransient
    public Set<CompRemLife> getCompRemLifeSet() {
        return compRemLifeSet;
    }

    public void setCompRemLifeSet(Set<CompRemLife> compRemLifeSet) {
        this.compRemLifeSet = compRemLifeSet;
    }

    @XmlTransient
    public Set<CmpFinitelife> getCmpFinitelifeSet() {
        return cmpFinitelifeSet;
    }

    public void setCmpFinitelifeSet(Set<CmpFinitelife> cmpFinitelifeSet) {
        this.cmpFinitelifeSet = cmpFinitelifeSet;
    }

    @XmlTransient
    public Set<CmpLiferemInst> getCmpLiferemInstSet() {
        return cmpLiferemInstSet;
    }

    public void setCmpLiferemInstSet(Set<CmpLiferemInst> cmpLiferemInstSet) {
        this.cmpLiferemInstSet = cmpLiferemInstSet;
    }

    @XmlTransient
    public Set<CmpRemarks> getCmpRemarksSet() {
        return cmpRemarksSet;
    }

    public void setCmpRemarksSet(Set<CmpRemarks> cmpRemarksSet) {
        this.cmpRemarksSet = cmpRemarksSet;
    }

    public AirCraft getCompAcId() {
        return compAcId;
    }

    public void setCompAcId(AirCraft compAcId) {
        this.compAcId = compAcId;
    }

    @XmlTransient
    public Set<CompDueoffAfhrsInst> getCompDueoffAfhrsInstSet() {
        return compDueoffAfhrsInstSet;
    }

    public void setCompDueoffAfhrsInstSet(Set<CompDueoffAfhrsInst> compDueoffAfhrsInstSet) {
        this.compDueoffAfhrsInstSet = compDueoffAfhrsInstSet;
    }

    @XmlTransient
    public Set<CmpSerialNumber> getCmpSerialNumberSet() {
        return cmpSerialNumberSet;
    }

    public void setCmpSerialNumberSet(Set<CmpSerialNumber> cmpSerialNumberSet) {
        this.cmpSerialNumberSet = cmpSerialNumberSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compId != null ? compId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Components)) {
            return false;
        }
        Components other = (Components) object;
        if ((this.compId == null && other.compId != null) || (this.compId != null && !this.compId.equals(other.compId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airdynasty.Components[ compId=" + compId + " ]";
    }
    
}
