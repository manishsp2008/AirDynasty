/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airdynasty.bean;

import adsessionbeans.AirCraftFacade;
import airdynasty.AirCraft;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author A187252
 */
@Stateless
@LocalBean
public class CraftUtils {
    
    @EJB 
    private AirCraftFacade acfObj;
    
    @PersistenceContext(unitName="AirDynastyPU")
    private EntityManager em;
    
    public AirCraft getCraftbyID(int id)    {
        
        return em.find(AirCraft.class, id);
        
    }
    
}
