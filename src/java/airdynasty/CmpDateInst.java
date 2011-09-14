/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airdynasty;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "cmp_date_inst")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CmpDateInst.findAll", query = "SELECT c FROM CmpDateInst c"),
    @NamedQuery(name = "CmpDateInst.findByCmpDateInstId", query = "SELECT c FROM CmpDateInst c WHERE c.cmpDateInstId = :cmpDateInstId"),
    @NamedQuery(name = "CmpDateInst.findByCmpDateInstDate", query = "SELECT c FROM CmpDateInst c WHERE c.cmpDateInstDate = :cmpDateInstDate")})
public class CmpDateInst implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "CMP_DATE_INST_ID")
    private Integer cmpDateInstId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CMP_DATE_INST_DATE")
    @Temporal(TemporalType.DATE)
    private Date cmpDateInstDate;
    @JoinColumn(name = "CMP_DATE_INST_COMP_ID", referencedColumnName = "COMP_ID")
    @ManyToOne(optional = false)
    private Components cmpDateInstCompId;

    public CmpDateInst() {
    }

    public CmpDateInst(Integer cmpDateInstId) {
        this.cmpDateInstId = cmpDateInstId;
    }

    public CmpDateInst(Integer cmpDateInstId, Date cmpDateInstDate) {
        this.cmpDateInstId = cmpDateInstId;
        this.cmpDateInstDate = cmpDateInstDate;
    }

    public Integer getCmpDateInstId() {
        return cmpDateInstId;
    }

    public void setCmpDateInstId(Integer cmpDateInstId) {
        this.cmpDateInstId = cmpDateInstId;
    }

    public String getCmpDateInstDate() {
        
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        return df.format(cmpDateInstDate) ; 
    }

    public void setCmpDateInstDate(Date cmpDateInstDate) {
        this.cmpDateInstDate = cmpDateInstDate;
    }

    public Components getCmpDateInstCompId() {
        return cmpDateInstCompId;
    }

    public void setCmpDateInstCompId(Components cmpDateInstCompId) {
        this.cmpDateInstCompId = cmpDateInstCompId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cmpDateInstId != null ? cmpDateInstId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CmpDateInst)) {
            return false;
        }
        CmpDateInst other = (CmpDateInst) object;
        if ((this.cmpDateInstId == null && other.cmpDateInstId != null) || (this.cmpDateInstId != null && !this.cmpDateInstId.equals(other.cmpDateInstId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airdynasty.CmpDateInst[ cmpDateInstId=" + cmpDateInstId + " ]";
    }
    
}
