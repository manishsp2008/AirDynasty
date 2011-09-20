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
@Table(name = "oafci_remarks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OafciRemarks.findAll", query = "SELECT o FROM OafciRemarks o"),
    @NamedQuery(name = "OafciRemarks.findByOafremId", query = "SELECT o FROM OafciRemarks o WHERE o.oafremId = :oafremId"),
    @NamedQuery(name = "OafciRemarks.findByOafremText", query = "SELECT o FROM OafciRemarks o WHERE o.oafremText = :oafremText")})
public class OafciRemarks implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "OAFREM_ID")
    private Integer oafremId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "OAFREM_TEXT")
    private String oafremText;
    @JoinColumn(name = "OAFREM_OAFCI_ID", referencedColumnName = "OAFCI_ID")
    @ManyToOne(optional = false)
    private OafChangeInt oafremOafciId;

    public OafciRemarks() {
    }

    public OafciRemarks(Integer oafremId) {
        this.oafremId = oafremId;
    }

    public OafciRemarks(Integer oafremId, String oafremText) {
        this.oafremId = oafremId;
        this.oafremText = oafremText;
    }

    public Integer getOafremId() {
        return oafremId;
    }

    public void setOafremId(Integer oafremId) {
        this.oafremId = oafremId;
    }

    public String getOafremText() {
        return oafremText;
    }

    public void setOafremText(String oafremText) {
        this.oafremText = oafremText;
    }

    public OafChangeInt getOafremOafciId() {
        return oafremOafciId;
    }

    public void setOafremOafciId(OafChangeInt oafremOafciId) {
        this.oafremOafciId = oafremOafciId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oafremId != null ? oafremId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OafciRemarks)) {
            return false;
        }
        OafciRemarks other = (OafciRemarks) object;
        if ((this.oafremId == null && other.oafremId != null) || (this.oafremId != null && !this.oafremId.equals(other.oafremId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airdynasty.OafciRemarks[ oafremId=" + oafremId + " ]";
    }
    
}
