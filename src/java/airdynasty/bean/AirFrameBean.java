/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airdynasty.bean;

import airdynasty.AirCraft;
import airdynasty.CmpCurAfhrs;
import airdynasty.CompDueoffAfhrsInst;
import airdynasty.CompRemLife;
import airdynasty.Components;
import airdynasty.utils.AirFrameLogic;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.SessionContext;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author A187252
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@LocalBean
public class AirFrameBean {
    
    
    @PersistenceContext(unitName="AirDynastyPU")
    private EntityManager em;
    
    @Resource
    private SessionContext context;
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void setRemAFHrs(AirCraft acObj, Double afHrs) {
        try {
        
        Collection<Components> cmps = acObj.getComponentsCollection();
        
        for(Iterator itr = cmps.iterator(); itr.hasNext();)  {
            Components cmp = (Components)itr.next();
        
            Collection<CompDueoffAfhrsInst> caObj = cmp.getCompDueoffAfhrsInstCollection();
            
            for(Iterator it = caObj.iterator(); it.hasNext();)  {
                
                CompDueoffAfhrsInst ccaTemp = (CompDueoffAfhrsInst) it.next();
                
                // Persisit CompRemLife Object.
                
                // Find Related value from database.
                Double remHrs = ccaTemp.getCdaHrs() - afHrs ;
               
                setRLHrs(acObj, remHrs);
        }
        
    }
        }
        catch(Exception e)
        {
            context.setRollbackOnly();
            
        }
        finally {
            //emTemp.close();
        }
    }
    
    public void setRLHrs(AirCraft acObj, Double Hrs)
    {
        try {
        
        Collection<Components> cmps = acObj.getComponentsCollection();
        
        for(Iterator itr = cmps.iterator(); itr.hasNext();)  {
            Components cmp = (Components)itr.next();
        
            Collection<CompRemLife> caObj = cmp.getCompRemLifeCollection();
            
            for(Iterator it = caObj.iterator(); it.hasNext();)  {
                
                CompRemLife ccaTemp = (CompRemLife) it.next();
                
                ccaTemp.setCrlHrs(AirFrameLogic.roundTwoDec(Hrs));
                
                em.merge(ccaTemp);
                
        }
        
    }    
            
            
        }
        catch(Exception e)
        {
           context.setRollbackOnly(); 
        }
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void setCurrentAFHrs(AirCraft acObj, Double afHrs)
    {
    
       
        try {
            
        //em.getTransaction().begin();
            
        Collection<Components> cmps = acObj.getComponentsCollection();
        
        for(Iterator itr = cmps.iterator(); itr.hasNext();)  {
            Components cmp = (Components)itr.next();
            
            Collection<CmpCurAfhrs> caObj = cmp.getCmpCurAfhrsCollection();
            
            for(Iterator it = caObj.iterator(); it.hasNext();)  {
                
                CmpCurAfhrs ccaTemp = (CmpCurAfhrs) it.next();
                
                // Find a iterated object in database.
                //CmpCurAfhrs ccaTemp = em.find(CmpCurAfhrs.class, cca.getCmpCurAfhrsId());
                
                ccaTemp.setCmpCurAfhrsHrs(afHrs);
                
                em.merge(ccaTemp);
                
                //em.getTransaction().commit();
            }
            
            
        }    
            
            
        }
        catch(Exception e)
        {
            context.setRollbackOnly();
        }
    }

}
