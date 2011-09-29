/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airdynasty.bean;

import adsessionbeans.AfEngInspFacade;
import airdynasty.AfEngInsp;
import airdynasty.AirCraft;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.SessionContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Dell
 */
@Stateless
@LocalBean
public class EngInsUtils {
    
    @EJB
    private AfEngInspFacade aeiFacade;
    
    @Resource
    private SessionContext context ;
    
    @PersistenceContext(unitName="AirDynastyPU")
    private EntityManager em;
    
    public boolean addEIRec(AirCraft acObj, String ncText, String dueAFhrs, String dueENGhrs, String calDue, String remTime,
            String remText) throws ParseException   {
        
        AfEngInsp aeiObj = new AfEngInsp();
        
        aeiObj.setAesAcId(acObj);
        aeiObj.setAesId(aeiFacade.count() + 1);
        aeiObj.setAesNomenclature(ncText);
        aeiObj.setAesDueAfHrs(dueAFhrs);
        aeiObj.setAesDueEngHrs(dueENGhrs);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        aeiObj.setAesCalDueDate(sdf.parse(calDue));
        aeiObj.setAesDueTime(remTime);
        aeiObj.setAesRemarks(remText);
        
        try {
            em.persist(aeiObj);
            return true;
        }
        catch(Exception e) {
            context.setRollbackOnly(); 
            return false;
            
        }
        
    }
    
}
