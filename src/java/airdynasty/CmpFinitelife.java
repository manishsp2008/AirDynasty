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
@Table(name = "cmp_finitelife")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CmpFinitelife.findAll", query = "SELECT c FROM CmpFinitelife c"),
    @NamedQuery(name = "CmpFinitelife.findByCmpFinitelifeId", query = "SELECT c FROM CmpFinitelife c WHERE c.cmpFinitelifeId = :cmpFinitelifeId"),
    @NamedQuery(name = "CmpFinitelife.findByCmpFinitelifeHrs", query = "SELECT c FROM CmpFinitelife c WHERE c.cmpFinitelifeHrs = :cmpFinitelifeHrs"),
    @NamedQuery(name = "CmpFinitelife.findByCmpFinitelifeHrsType", query = "SELECT c FROM CmpFinitelife c WHERE c.cmpFinitelifeHrsType = :cmpFinitelifeHrsType")})
public class CmpFinitelife implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "CMP_FINITELIFE_ID")
    private Integer cmpFinitelifeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "CMP_FINITELIFE_HRS")
    private String cmpFinitelifeHrs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "CMP_FINITELIFE_HRS_TYPE")
    private String cmpFinitelifeHrsType;
    @JoinColumn(name = "CMP_FINITELIFE_COMP_ID", referencedColumnName = "COMP_ID")
    @ManyToOne(optional = false)
    private Components cmpFinitelifeCompId;

    public CmpFinitelife() {
    }

    public CmpFinitelife(Integer cmpFinitelifeId) {
        this.cmpFinitelifeId = cmpFinitelifeId;
    }

    public CmpFinitelife(Integer cmpFinitelifeId, String cmpFinitelifeHrs, String cmpFinitelifeHrsType) {
        this.cmpFinitelifeId = cmpFinitelifeId;
        this.cmpFinitelifeHrs = cmpFinitelifeHrs;
        this.cmpFinitelifeHrsType = cmpFinitelifeHrsType;
    }

    public Integer getCmpFinitelifeId() {
        return cmpFinitelifeId;
    }

    public void setCmpFinitelifeId(Integer cmpFinitelifeId) {
        this.cmpFinitelifeId = cmpFinitelifeId;
    }

    public String getCmpFinitelifeHrs() {
        return cmpFinitelifeHrs;
    }

    public void setCmpFinitelifeHrs(String cmpFinitelifeHrs) {
        this.cmpFinitelifeHrs = cmpFinitelifeHrs;
    }

    public String getCmpFinitelifeHrsType() {
        return cmpFinitelifeHrsType;
    }

    public void setCmpFinitelifeHrsType(String cmpFinitelifeHrsType) {
        this.cmpFinitelifeHrsType = cmpFinitelifeHrsType;
    }

    public Components getCmpFinitelifeCompId() {
        return cmpFinitelifeCompId;
    }

    public void setCmpFinitelifeCompId(Components cmpFinitelifeCompId) {
        this.cmpFinitelifeCompId = cmpFinitelifeCompId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cmpFinitelifeId != null ? cmpFinitelifeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CmpFinitelife)) {
            return false;
        }
        CmpFinitelife other = (CmpFinitelife) object;
        if ((this.cmpFinitelifeId == null && other.cmpFinitelifeId != null) || (this.cmpFinitelifeId != null && !this.cmpFinitelifeId.equals(other.cmpFinitelifeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airdynasty.CmpFinitelife[ cmpFinitelifeId=" + cmpFinitelifeId + " ]";
    }
    
}
