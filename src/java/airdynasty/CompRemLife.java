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
    @NamedQuery(name = "CompRemLife.findByCrlHrs", query = "SELECT c FROM CompRemLife c WHERE c.crlHrs = :crlHrs")})
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
    @Column(name = "CRL_HRS")
    private double crlHrs;
    @JoinColumn(name = "CRL_COMP_ID", referencedColumnName = "COMP_ID")
    @ManyToOne(optional = false)
    private Components crlCompId;

    public CompRemLife() {
    }

    public CompRemLife(Integer crlId) {
        this.crlId = crlId;
    }

    public CompRemLife(Integer crlId, double crlHrs) {
        this.crlId = crlId;
        this.crlHrs = crlHrs;
    }

    public Integer getCrlId() {
        return crlId;
    }

    public void setCrlId(Integer crlId) {
        this.crlId = crlId;
    }

    public double getCrlHrs() {
        return crlHrs;
    }

    public void setCrlHrs(double crlHrs) {
        this.crlHrs = crlHrs;
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
