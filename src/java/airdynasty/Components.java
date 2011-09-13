/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airdynasty;

import java.io.Serializable;
import java.util.Collection;
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
 * @author Dell
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
    private Collection<CmpAfhrsInst> cmpAfhrsInstCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "crlCompId")
    private Collection<CompRemLife> compRemLifeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cmpFinitelifeCompId")
    private Collection<CmpFinitelife> cmpFinitelifeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cmplifesCompId")
    private Collection<CmpLiferemInst> cmpLiferemInstCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cmpCurAfhrsCompId")
    private Collection<CmpCurAfhrs> cmpCurAfhrsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cmpDateInstCompId")
    private Collection<CmpDateInst> cmpDateInstCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cmpRemarksCompId")
    private Collection<CmpRemarks> cmpRemarksCollection;
    @JoinColumn(name = "COMP_AC_ID", referencedColumnName = "AC_ID")
    @ManyToOne(optional = false)
    private AirCraft compAcId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cdaCompId")
    private Collection<CompDueoffAfhrsInst> compDueoffAfhrsInstCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "serialnumCompId")
    private Collection<CmpSerialNumber> cmpSerialNumberCollection;

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
    public Collection<CmpAfhrsInst> getCmpAfhrsInstCollection() {
        return cmpAfhrsInstCollection;
    }

    public void setCmpAfhrsInstCollection(Collection<CmpAfhrsInst> cmpAfhrsInstCollection) {
        this.cmpAfhrsInstCollection = cmpAfhrsInstCollection;
    }

    @XmlTransient
    public Collection<CompRemLife> getCompRemLifeCollection() {
        return compRemLifeCollection;
    }

    public void setCompRemLifeCollection(Collection<CompRemLife> compRemLifeCollection) {
        this.compRemLifeCollection = compRemLifeCollection;
    }

    @XmlTransient
    public Collection<CmpFinitelife> getCmpFinitelifeCollection() {
        return cmpFinitelifeCollection;
    }

    public void setCmpFinitelifeCollection(Collection<CmpFinitelife> cmpFinitelifeCollection) {
        this.cmpFinitelifeCollection = cmpFinitelifeCollection;
    }

    @XmlTransient
    public Collection<CmpLiferemInst> getCmpLiferemInstCollection() {
        return cmpLiferemInstCollection;
    }

    public void setCmpLiferemInstCollection(Collection<CmpLiferemInst> cmpLiferemInstCollection) {
        this.cmpLiferemInstCollection = cmpLiferemInstCollection;
    }

    @XmlTransient
    public Collection<CmpCurAfhrs> getCmpCurAfhrsCollection() {
        return cmpCurAfhrsCollection;
    }

    public void setCmpCurAfhrsCollection(Collection<CmpCurAfhrs> cmpCurAfhrsCollection) {
        this.cmpCurAfhrsCollection = cmpCurAfhrsCollection;
    }

    @XmlTransient
    public Collection<CmpDateInst> getCmpDateInstCollection() {
        return cmpDateInstCollection;
    }

    public void setCmpDateInstCollection(Collection<CmpDateInst> cmpDateInstCollection) {
        this.cmpDateInstCollection = cmpDateInstCollection;
    }

    @XmlTransient
    public Collection<CmpRemarks> getCmpRemarksCollection() {
        return cmpRemarksCollection;
    }

    public void setCmpRemarksCollection(Collection<CmpRemarks> cmpRemarksCollection) {
        this.cmpRemarksCollection = cmpRemarksCollection;
    }

    public AirCraft getCompAcId() {
        return compAcId;
    }

    public void setCompAcId(AirCraft compAcId) {
        this.compAcId = compAcId;
    }

    @XmlTransient
    public Collection<CompDueoffAfhrsInst> getCompDueoffAfhrsInstCollection() {
        return compDueoffAfhrsInstCollection;
    }

    public void setCompDueoffAfhrsInstCollection(Collection<CompDueoffAfhrsInst> compDueoffAfhrsInstCollection) {
        this.compDueoffAfhrsInstCollection = compDueoffAfhrsInstCollection;
    }

    @XmlTransient
    public Collection<CmpSerialNumber> getCmpSerialNumberCollection() {
        return cmpSerialNumberCollection;
    }

    public void setCmpSerialNumberCollection(Collection<CmpSerialNumber> cmpSerialNumberCollection) {
        this.cmpSerialNumberCollection = cmpSerialNumberCollection;
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
