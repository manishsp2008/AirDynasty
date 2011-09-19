/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adsessionbeans;

import airdynasty.AirCraft;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Dell
 */
@Stateless
public class AirCraftFacade extends AbstractFacade<AirCraft> {
    @PersistenceContext(unitName = "AirDynastyPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AirCraftFacade() {
        super(AirCraft.class);
    }
    
}
