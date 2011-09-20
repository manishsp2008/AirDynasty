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
@Table(name = "oafci_due_hrs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OafciDueHrs.findAll", query = "SELECT o FROM OafciDueHrs o"),
    @NamedQuery(name = "OafciDueHrs.findByOafdhId", query = "SELECT o FROM OafciDueHrs o WHERE o.oafdhId = :oafdhId"),
    @NamedQuery(name = "OafciDueHrs.findByOafdhHrs", query = "SELECT o FROM OafciDueHrs o WHERE o.oafdhHrs = :oafdhHrs"),
    @NamedQuery(name = "OafciDueHrs.findByOafdhHrsType", query = "SELECT o FROM OafciDueHrs o WHERE o.oafdhHrsType = :oafdhHrsType")})
public class OafciDueHrs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "OAFDH_ID")
    private Integer oafdhId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "OAFDH_HRS")
    private String oafdhHrs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "OAFDH_HRS_TYPE")
    private String oafdhHrsType;
    @JoinColumn(name = "OAFDH_OAFCI_ID", referencedColumnName = "OAFCI_ID")
    @ManyToOne(optional = false)
    private OafChangeInt oafdhOafciId;

    public OafciDueHrs() {
    }

    public OafciDueHrs(Integer oafdhId) {
        this.oafdhId = oafdhId;
    }

    public OafciDueHrs(Integer oafdhId, String oafdhHrs, String oafdhHrsType) {
        this.oafdhId = oafdhId;
        this.oafdhHrs = oafdhHrs;
        this.oafdhHrsType = oafdhHrsType;
    }

    public Integer getOafdhId() {
        return oafdhId;
    }

    public void setOafdhId(Integer oafdhId) {
        this.oafdhId = oafdhId;
    }

    public String getOafdhHrs() {
        return oafdhHrs;
    }

    public void setOafdhHrs(String oafdhHrs) {
        this.oafdhHrs = oafdhHrs;
    }

    public String getOafdhHrsType() {
        return oafdhHrsType;
    }

    public void setOafdhHrsType(String oafdhHrsType) {
        this.oafdhHrsType = oafdhHrsType;
    }

    public OafChangeInt getOafdhOafciId() {
        return oafdhOafciId;
    }

    public void setOafdhOafciId(OafChangeInt oafdhOafciId) {
        this.oafdhOafciId = oafdhOafciId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oafdhId != null ? oafdhId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OafciDueHrs)) {
            return false;
        }
        OafciDueHrs other = (OafciDueHrs) object;
        if ((this.oafdhId == null && other.oafdhId != null) || (this.oafdhId != null && !this.oafdhId.equals(other.oafdhId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airdynasty.OafciDueHrs[ oafdhId=" + oafdhId + " ]";
    }
    
}
