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
import javax.persistence.Lob;
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
@Table(name = "air_craft")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AirCraft.findAll", query = "SELECT a FROM AirCraft a"),
    @NamedQuery(name = "AirCraft.findByAcId", query = "SELECT a FROM AirCraft a WHERE a.acId = :acId"),
    @NamedQuery(name = "AirCraft.findByAcName", query = "SELECT a FROM AirCraft a WHERE a.acName = :acName"),
    @NamedQuery(name = "AirCraft.findByAcSerialnum", query = "SELECT a FROM AirCraft a WHERE a.acSerialnum = :acSerialnum"),
    @NamedQuery(name = "AirCraft.findByAcAfhrs", query = "SELECT a FROM AirCraft a WHERE a.acAfhrs = :acAfhrs"),
    @NamedQuery(name = "AirCraft.findByAcEnghrs", query = "SELECT a FROM AirCraft a WHERE a.acEnghrs = :acEnghrs"),
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
    @Column(name = "AC_AFHRS")
    private double acAfhrs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AC_ENGHRS")
    private double acEnghrs;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "AC_LANDINGCOUNT")
    private String acLandingcount;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "AC_STARTCOUNT")
    private String acStartcount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AC_ENGNGCYCS")
    private double acEngngcycs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AC_NPCYCS")
    private double acNpcycs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "AC_FORMNUM")
    private String acFormnum;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compAcId")
    private Collection<Components> componentsCollection;

    public AirCraft() {
    }

    public AirCraft(Integer acId) {
        this.acId = acId;
    }

    public AirCraft(Integer acId, String acName, String acSerialnum, double acAfhrs, double acEnghrs, String acLandingcount, String acStartcount, double acEngngcycs, double acNpcycs, String acFormnum) {
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

    public double getAcAfhrs() {
        return acAfhrs;
    }

    public void setAcAfhrs(double acAfhrs) {
        this.acAfhrs = acAfhrs;
    }

    public double getAcEnghrs() {
        return acEnghrs;
    }

    public void setAcEnghrs(double acEnghrs) {
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

    public double getAcEngngcycs() {
        return acEngngcycs;
    }

    public void setAcEngngcycs(double acEngngcycs) {
        this.acEngngcycs = acEngngcycs;
    }

    public double getAcNpcycs() {
        return acNpcycs;
    }

    public void setAcNpcycs(double acNpcycs) {
        this.acNpcycs = acNpcycs;
    }

    public String getAcFormnum() {
        return acFormnum;
    }

    public void setAcFormnum(String acFormnum) {
        this.acFormnum = acFormnum;
    }

    @XmlTransient
    public Collection<Components> getComponentsCollection() {
        return componentsCollection;
    }

    public void setComponentsCollection(Collection<Components> componentsCollection) {
        this.componentsCollection = componentsCollection;
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
