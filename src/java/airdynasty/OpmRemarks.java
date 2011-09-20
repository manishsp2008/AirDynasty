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
@Table(name = "opm_remarks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpmRemarks.findAll", query = "SELECT o FROM OpmRemarks o"),
    @NamedQuery(name = "OpmRemarks.findByOpmremId", query = "SELECT o FROM OpmRemarks o WHERE o.opmremId = :opmremId"),
    @NamedQuery(name = "OpmRemarks.findByOpmremText", query = "SELECT o FROM OpmRemarks o WHERE o.opmremText = :opmremText")})
public class OpmRemarks implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "OPMREM_ID")
    private Integer opmremId;
    @Size(max = 255)
    @Column(name = "OPMREM_TEXT")
    private String opmremText;
    @JoinColumn(name = "OPMREM_OPM_ID", referencedColumnName = "OPM_ID")
    @ManyToOne(optional = false)
    private OutPhaseMnt opmremOpmId;

    public OpmRemarks() {
    }

    public OpmRemarks(Integer opmremId) {
        this.opmremId = opmremId;
    }

    public Integer getOpmremId() {
        return opmremId;
    }

    public void setOpmremId(Integer opmremId) {
        this.opmremId = opmremId;
    }

    public String getOpmremText() {
        return opmremText;
    }

    public void setOpmremText(String opmremText) {
        this.opmremText = opmremText;
    }

    public OutPhaseMnt getOpmremOpmId() {
        return opmremOpmId;
    }

    public void setOpmremOpmId(OutPhaseMnt opmremOpmId) {
        this.opmremOpmId = opmremOpmId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (opmremId != null ? opmremId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpmRemarks)) {
            return false;
        }
        OpmRemarks other = (OpmRemarks) object;
        if ((this.opmremId == null && other.opmremId != null) || (this.opmremId != null && !this.opmremId.equals(other.opmremId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airdynasty.OpmRemarks[ opmremId=" + opmremId + " ]";
    }
    
}
