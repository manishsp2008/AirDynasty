/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adsessionbeans;

import airdynasty.OpmRemarks;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author A187252
 */
@Stateless
public class OpmRemarksFacade extends AbstractFacade<OpmRemarks> {
    @PersistenceContext(unitName = "AirDynastyPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OpmRemarksFacade() {
        super(OpmRemarks.class);
    }
    
}
