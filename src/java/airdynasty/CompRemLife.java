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
 * @author Dell
 */
@Entity
@Table(name = "comp_rem_life")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompRemLife.findAll", query = "SELECT c FROM CompRemLife c"),
    @NamedQuery(name = "CompRemLife.findByCrlId", query = "SELECT c FROM CompRemLife c WHERE c.crlId = :crlId"),
    @NamedQuery(name = "CompRemLife.findByCrlHrs", query = "SELECT c FROM CompRemLife c WHERE c.crlHrs = :crlHrs"),
    @NamedQuery(name = "CompRemLife.findByCrlHrsType", query = "SELECT c FROM CompRemLife c WHERE c.crlHrsType = :crlHrsType")})
public class CompRemLife implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "CRL_ID")
    private Integer crlId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "CRL_HRS")
    private String crlHrs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "CRL_HRS_TYPE")
    private String crlHrsType;
    @JoinColumn(name = "CRL_COMP_ID", referencedColumnName = "COMP_ID")
    @ManyToOne(optional = false)
    private Components crlCompId;

    public CompRemLife() {
    }

    public CompRemLife(Integer crlId) {
        this.crlId = crlId;
    }

    public CompRemLife(Integer crlId, String crlHrs, String crlHrsType) {
        this.crlId = crlId;
        this.crlHrs = crlHrs;
        this.crlHrsType = crlHrsType;
    }

    public Integer getCrlId() {
        return crlId;
    }

    public void setCrlId(Integer crlId) {
        this.crlId = crlId;
    }

    public String getCrlHrs() {
        return crlHrs;
    }

    public void setCrlHrs(String crlHrs) {
        this.crlHrs = crlHrs;
    }

    public String getCrlHrsType() {
        return crlHrsType;
    }

    public void setCrlHrsType(String crlHrsType) {
        this.crlHrsType = crlHrsType;
    }

    public Components getCrlCompId() {
        return crlCompId;
    }

    public void setCrlCompId(Components crlCompId) {
        this.crlCompId = crlCompId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crlId != null ? crlId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompRemLife)) {
            return false;
        }
        CompRemLife other = (CompRemLife) object;
        if ((this.crlId == null && other.crlId != null) || (this.crlId != null && !this.crlId.equals(other.crlId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airdynasty.CompRemLife[ crlId=" + crlId + " ]";
    }
    
}
