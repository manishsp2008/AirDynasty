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
@Table(name = "cmp_serial_number")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CmpSerialNumber.findAll", query = "SELECT c FROM CmpSerialNumber c"),
    @NamedQuery(name = "CmpSerialNumber.findBySerialnumId", query = "SELECT c FROM CmpSerialNumber c WHERE c.serialnumId = :serialnumId"),
    @NamedQuery(name = "CmpSerialNumber.findBySerialnumValue", query = "SELECT c FROM CmpSerialNumber c WHERE c.serialnumValue = :serialnumValue")})
public class CmpSerialNumber implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "SERIALNUM_ID")
    private Integer serialnumId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "SERIALNUM_VALUE")
    private String serialnumValue;
    @JoinColumn(name = "SERIALNUM_COMP_ID", referencedColumnName = "COMP_ID")
    @ManyToOne(optional = false)
    private Components serialnumCompId;

    public CmpSerialNumber() {
    }

    public CmpSerialNumber(Integer serialnumId) {
        this.serialnumId = serialnumId;
    }

    public CmpSerialNumber(Integer serialnumId, String serialnumValue) {
        this.serialnumId = serialnumId;
        this.serialnumValue = serialnumValue;
    }

    public Integer getSerialnumId() {
        return serialnumId;
    }

    public void setSerialnumId(Integer serialnumId) {
        this.serialnumId = serialnumId;
    }

    public String getSerialnumValue() {
        return serialnumValue;
    }

    public void setSerialnumValue(String serialnumValue) {
        this.serialnumValue = serialnumValue;
    }

    public Components getSerialnumCompId() {
        return serialnumCompId;
    }

    public void setSerialnumCompId(Components serialnumCompId) {
        this.serialnumCompId = serialnumCompId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serialnumId != null ? serialnumId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CmpSerialNumber)) {
            return false;
        }
        CmpSerialNumber other = (CmpSerialNumber) object;
        if ((this.serialnumId == null && other.serialnumId != null) || (this.serialnumId != null && !this.serialnumId.equals(other.serialnumId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airdynasty.CmpSerialNumber[ serialnumId=" + serialnumId + " ]";
    }
    
}
