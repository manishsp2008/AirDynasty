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
@Table(name = "air_craft")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AirCraft.findAll", query = "SELECT a FROM AirCraft a"),
    @NamedQuery(name = "AirCraft.findByAcId", query = "SELECT a FROM AirCraft a WHERE a.acId = :acId"),
    @NamedQuery(name = "AirCraft.findByAcName", query = "SELECT a FROM AirCraft a WHERE a.acName = :acName"),
    @NamedQuery(name = "AirCraft.findByAcSerialnum", query = "SELECT a FROM AirCraft a WHERE a.acSerialnum = :acSerialnum"),
    @NamedQuery(name = "AirCraft.findByAcAfhrs", query = "SELECT a FROM AirCraft a WHERE a.acAfhrs = :acAfhrs"),
    @NamedQuery(name = "AirCraft.findByAcEnghrs", query = "SELECT a FROM AirCraft a WHERE a.acEnghrs = :acEnghrs"),
    @NamedQuery(name = "AirCraft.findByAcLandingcount", query = "SELECT a FROM AirCraft a WHERE a.acLandingcount = :acLandingcount"),
    @NamedQuery(name = "AirCraft.findByAcStartcount", query = "SELECT a FROM AirCraft a WHERE a.acStartcount = :acStartcount"),
    @NamedQuery(name = "AirCraft.findByAcEngngcycs", query = "SELECT a FROM AirCraft a WHERE a.acEngngcycs = :acEngngcycs"),
    @NamedQuery(name = "AirCraft.findByAcNpcycs", query = "SELECT a FROM AirCraft a WHERE a.acNpcycs = :acNpcycs"),
    @NamedQuery(name = "AirCraft.findByAcFormnum", query = "SELECT a FROM AirCraft a WHERE a.acFormnum = :acFormnum")})
public class AirCraft implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "AC_ID")
    private Integer acId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "AC_NAME")
    private String acName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "AC_SERIALNUM")
    private String acSerialnum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "AC_AFHRS")
    private String acAfhrs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "AC_ENGHRS")
    private String acEnghrs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "AC_LANDINGCOUNT")
    private String acLandingcount;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "AC_STARTCOUNT")
    private String acStartcount;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "AC_ENGNGCYCS")
    private String acEngngcycs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "AC_NPCYCS")
    private String acNpcycs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "AC_FORMNUM")
    private String acFormnum;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aesAcId")
    private Set<AfEngInsp> afEngInspSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "opmAcId")
    private Set<OutPhaseMnt> outPhaseMntSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "oafciAcId")
    private Set<OafChangeInt> oafChangeIntSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compAcId")
    private Set<Components> componentsSet;

    public AirCraft() {
    }

    public AirCraft(Integer acId) {
        this.acId = acId;
    }

    public AirCraft(Integer acId, String acName, String acSerialnum, String acAfhrs, String acEnghrs, String acLandingcount, String acStartcount, String acEngngcycs, String acNpcycs, String acFormnum) {
        this.acId = acId;
        this.acName = acName;
        this.acSerialnum = acSerialnum;
        this.acAfhrs = acAfhrs;
        this.acEnghrs = acEnghrs;
        this.acLandingcount = acLandingcount;
        this.acStartcount = acStartcount;
        this.acEngngcycs = acEngngcycs;
        this.acNpcycs = acNpcycs;
        this.acFormnum = acFormnum;
    }

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public String getAcName() {
        return acName;
    }

    public void setAcName(String acName) {
        this.acName = acName;
    }

    public String getAcSerialnum() {
        return acSerialnum;
    }

    public void setAcSerialnum(String acSerialnum) {
        this.acSerialnum = acSerialnum;
    }

    public String getAcAfhrs() {
        return acAfhrs;
    }

    public void setAcAfhrs(String acAfhrs) {
        this.acAfhrs = acAfhrs;
    }

    public String getAcEnghrs() {
        return acEnghrs;
    }

    public void setAcEnghrs(String acEnghrs) {
        this.acEnghrs = acEnghrs;
    }

    public String getAcLandingcount() {
        return acLandingcount;
    }

    public void setAcLandingcount(String acLandingcount) {
        this.acLandingcount = acLandingcount;
    }

    public String getAcStartcount() {
        return acStartcount;
    }

    public void setAcStartcount(String acStartcount) {
        this.acStartcount = acStartcount;
    }

    public String getAcEngngcycs() {
        return acEngngcycs;
    }

    public void setAcEngngcycs(String acEngngcycs) {
        this.acEngngcycs = acEngngcycs;
    }

    public String getAcNpcycs() {
        return acNpcycs;
    }

    public void setAcNpcycs(String acNpcycs) {
        this.acNpcycs = acNpcycs;
    }

    public String getAcFormnum() {
        return acFormnum;
    }

    public void setAcFormnum(String acFormnum) {
        this.acFormnum = acFormnum;
    }

    @XmlTransient
    public Set<AfEngInsp> getAfEngInspSet() {
        return afEngInspSet;
    }

    public void setAfEngInspSet(Set<AfEngInsp> afEngInspSet) {
        this.afEngInspSet = afEngInspSet;
    }

    @XmlTransient
    public Set<OutPhaseMnt> getOutPhaseMntSet() {
        return outPhaseMntSet;
    }

    public void setOutPhaseMntSet(Set<OutPhaseMnt> outPhaseMntSet) {
        this.outPhaseMntSet = outPhaseMntSet;
    }

    @XmlTransient
    public Set<OafChangeInt> getOafChangeIntSet() {
        return oafChangeIntSet;
    }

    public void setOafChangeIntSet(Set<OafChangeInt> oafChangeIntSet) {
        this.oafChangeIntSet = oafChangeIntSet;
    }

    @XmlTransient
    public Set<Components> getComponentsSet() {
        return componentsSet;
    }

    public void setComponentsSet(Set<Components> componentsSet) {
        this.componentsSet = componentsSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acId != null ? acId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AirCraft)) {
            return false;
        }
        AirCraft other = (AirCraft) object;
        if ((this.acId == null && other.acId != null) || (this.acId != null && !this.acId.equals(other.acId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airdynasty.AirCraft[ acId=" + acId + " ]";
    }
    
}
