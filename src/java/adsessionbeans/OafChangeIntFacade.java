/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adsessionbeans;

import airdynasty.OafChangeInt;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author A187252
 */
@Stateless
public class OafChangeIntFacade extends AbstractFacade<OafChangeInt> {
    @PersistenceContext(unitName = "AirDynastyPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public OafChangeIntFacade() {
        super(OafChangeInt.class);
    }
    
}
