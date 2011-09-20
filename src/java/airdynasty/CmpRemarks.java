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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author A187252
 */
@Entity
@Table(name = "cmp_remarks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CmpRemarks.findAll", query = "SELECT c FROM CmpRemarks c"),
    @NamedQuery(name = "CmpRemarks.findByCmpRemarksId", query = "SELECT c FROM CmpRemarks c WHERE c.cmpRemarksId = :cmpRemarksId")})
public class CmpRemarks implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "CMP_REMARKS_ID")
    private Integer cmpRemarksId;
    @Lob
    @Column(name = "CMP_REMARKS_TEXT")
    private String cmpRemarksText;
    @JoinColumn(name = "CMP_REMARKS_COMP_ID", referencedColumnName = "COMP_ID")
    @ManyToOne(optional = false)
    private Components cmpRemarksCompId;

    public CmpRemarks() {
    }

    public CmpRemarks(Integer cmpRemarksId) {
        this.cmpRemarksId = cmpRemarksId;
    }

    public Integer getCmpRemarksId() {
        return cmpRemarksId;
    }

    public void setCmpRemarksId(Integer cmpRemarksId) {
        this.cmpRemarksId = cmpRemarksId;
    }

    public String getCmpRemarksText() {
        return cmpRemarksText;
    }

    public void setCmpRemarksText(String cmpRemarksText) {
        this.cmpRemarksText = cmpRemarksText;
    }

    public Components getCmpRemarksCompId() {
        return cmpRemarksCompId;
    }

    public void setCmpRemarksCompId(Components cmpRemarksCompId) {
        this.cmpRemarksCompId = cmpRemarksCompId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cmpRemarksId != null ? cmpRemarksId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CmpRemarks)) {
            return false;
        }
        CmpRemarks other = (CmpRemarks) object;
        if ((this.cmpRemarksId == null && other.cmpRemarksId != null) || (this.cmpRemarksId != null && !this.cmpRemarksId.equals(other.cmpRemarksId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airdynasty.CmpRemarks[ cmpRemarksId=" + cmpRemarksId + " ]";
    }
    
}
