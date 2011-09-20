/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adsessionbeans;

import airdynasty.CmpSerialNumber;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author A187252
 */
@Stateless
public class CmpSerialNumberFacade extends AbstractFacade<CmpSerialNumber> {
    @PersistenceContext(unitName = "AirDynastyPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public CmpSerialNumberFacade() {
        super(CmpSerialNumber.class);
    }
    
}
