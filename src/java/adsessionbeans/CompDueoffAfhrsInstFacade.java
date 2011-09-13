/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adsessionbeans;

import airdynasty.CompDueoffAfhrsInst;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Dell
 */
@Stateless
public class CompDueoffAfhrsInstFacade extends AbstractFacade<CompDueoffAfhrsInst> {
    @PersistenceContext(unitName = "AirDynastyPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public CompDueoffAfhrsInstFacade() {
        super(CompDueoffAfhrsInst.class);
    }
    
}
