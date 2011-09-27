/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airdynasty.bean;

import adsessionbeans.AfEngInspFacade;
import airdynasty.AfEngInsp;
import airdynasty.AirCraft;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
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
    
    @PersistenceContext(unitName="AirDynastyPU")
    private EntityManager em;
    
    public boolean addEIRec(AirCraft acObj, String ncText, String dueAFhrs, String dueENGhrs, String calDue, String remTime,
            String remText)   {
        
        AfEngInsp aeiObj = new AfEngInsp();
        
        aeiObj.setAesAcId(acObj);
        aeiObj.setAesId(aeiFacade.count() + 1);
        aeiObj.setAesNomenclature(ncText);
        aeiObj.setAesDueAfHrs(dueAFhrs);
        aeiObj.setAesDueEngHrs(dueENGhrs);
        if(calDue != null) {
        int y = Integer.parseInt(calDue.split("-")[0]);
        int m = Integer.parseInt(calDue.split("-")[1]);
        int d = Integer.parseInt(calDue.split("-")[2]);
        aeiObj.setAesCalDueDate(new Date(y,m,d));
        }
        aeiObj.setAesDueTime(remTime);
        aeiObj.setAesRemarks(remText);
        
        try {
            em.persist(aeiObj);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }
    
}
