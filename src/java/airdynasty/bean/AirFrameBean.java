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
import java.util.Set;
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
    public void setRemAFHrs(AirCraft acObj, String afHrs, String acLndCnt, String flDate) {
        try {
        
        Set<Components> cmps = acObj.getComponentsSet();
        
        for(Iterator itr = cmps.iterator(); itr.hasNext();)  {
            Components cmp = (Components)itr.next();
        
            Set<CompDueoffAfhrsInst> caObj = cmp.getCompDueoffAfhrsInstSet();
            
            for(Iterator it = caObj.iterator(); it.hasNext();)  {
                
                CompDueoffAfhrsInst ccaTemp = (CompDueoffAfhrsInst) it.next();
                
                // Persisit CompRemLife Object.
                
                // Find Related value from database.
                //String remHrs = ccaTemp.getCdaHrs() - afHrs ;
                String subRes = AirFrameLogic.doSubtraction(ccaTemp.getCdaHrs(), afHrs, acLndCnt,flDate, ccaTemp.getCdaHrsType());
                if(subRes != null && !subRes.isEmpty()) {
                    
                    setRLHrs(acObj, subRes, ccaTemp.getCdaHrsType());
                    
                }
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
    
    public void setRLHrs(AirCraft acObj, String Hrs, String hrsType)
    {
        try {
        
        Set<Components> cmps = acObj.getComponentsSet();
        
        for(Iterator itr = cmps.iterator(); itr.hasNext();)  {
            Components cmp = (Components)itr.next();
        
            Set<CompRemLife> caObj = cmp.getCompRemLifeSet();
            
            for(Iterator it = caObj.iterator(); it.hasNext();)  {
                
                CompRemLife ccaTemp = (CompRemLife) it.next();
                if(hrsType.equals(ccaTemp.getCrlHrsType())){
                
                ccaTemp.setCrlHrs(Hrs);
                
                em.merge(ccaTemp);
                }
        }
        
    }    
            
            
        }
        catch(Exception e)
        {
           context.setRollbackOnly(); 
        }
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void setCurrentAFHrs(AirCraft acObj, String afHrs, String acLndCnt, String flDate)
    {
    
        try {
            Set<Components> cmps = acObj.getComponentsSet();

            for(Iterator itr = cmps.iterator(); itr.hasNext();)  {
                
                Components cmp = (Components)itr.next();

                Set<CmpCurAfhrs> caObj = cmp.getCmpCurAfhrsSet();

                for(Iterator it = caObj.iterator(); it.hasNext();)  {
                    CmpCurAfhrs ccaTemp = (CmpCurAfhrs) it.next();
                    if(ccaTemp.getCmpCurAfhrsHrsType().equals("H")) {
                    ccaTemp.setCmpCurAfhrsHrs(String.valueOf(afHrs));
                    }
                    else if(ccaTemp.getCmpCurAfhrsHrsType().equals("D")){
                    ccaTemp.setCmpCurAfhrsHrs(String.valueOf(flDate));
                    }
                    else if(ccaTemp.getCmpCurAfhrsHrsType().equals("L"))   {
                    ccaTemp.setCmpCurAfhrsHrs(String.valueOf(acLndCnt));
                    }    
                    em.merge(ccaTemp);
                }
            }
            }
            catch(Exception e)
            {
                context.setRollbackOnly();
            }
    }

}
