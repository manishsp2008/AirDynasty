/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airdynasty.bean;

import adsessionbeans.OpmIntervalFacade;
import adsessionbeans.OpmRemarksFacade;
import adsessionbeans.OpmTimeRemFacade;
import airdynasty.AirCraft;
import airdynasty.OpmInterval;
import airdynasty.OpmRemarks;
import airdynasty.OpmTimeRem;
import airdynasty.OutPhaseMnt;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import adsessionbeans.OutPhaseMntFacade;

/**
 *
 * @author Dell
 */

@Stateless
@LocalBean
public class OPMUtils {

    @PersistenceContext(unitName="AirDynastyPU")
    private EntityManager em;
    
    @EJB
    private OutPhaseMntFacade opmFac; 
    @EJB
    private OpmIntervalFacade oivFac;
    @EJB
    private OpmRemarksFacade orFac;
    @EJB
    private OpmTimeRemFacade otrFac;
    
    public boolean addOPMRec(AirCraft acObj, String ncText, String dueAFhrs, String dueENGhrs,
            String calDue,String hrsType, String intvl, String remTime,String remText)  {
        
        OutPhaseMnt opmObj = new OutPhaseMnt();
        opmObj.setOpmId(opmFac.count() + 1);
        opmObj.setOpmNomenclature(ncText);
        opmObj.setOpmAcId(acObj);
        
        if(hrsType.equals("A")){
        opmObj.setOpmDueAt(hrsType);
        opmObj.setOpmDueHrs(dueAFhrs);
        }
        else if(hrsType.equals("E")){
        opmObj.setOpmDueAt(hrsType);
        opmObj.setOpmDueHrs(dueENGhrs);
        }
        else    {
        if(dueAFhrs != null) { opmObj.setOpmDueHrs(dueAFhrs);}else {opmObj.setOpmDueHrs(dueENGhrs);}
        }
        
        opmObj.setOpmDueHrsType(hrsType);
        
        if(calDue != null) {
        int y = Integer.parseInt(calDue.split("-")[0]);
        int m = Integer.parseInt(calDue.split("-")[1]);
        int d = Integer.parseInt(calDue.split("-")[2]);
        opmObj.setOpmCalDueDate(new Date(y,m,d));
        }
        
        OpmInterval oiObj = new OpmInterval();
        
        oiObj.setOpminvlId(oivFac.count() + 1);
        oiObj.setOpminvlHrs(intvl);
        oiObj.setOpminvlHrsType(hrsType);
        oiObj.setOpminvlOpmId(opmObj);
        Set<OpmInterval> oiObjSet = new HashSet<OpmInterval>();
        oiObjSet.add(oiObj);
        opmObj.setOpmIntervalSet(oiObjSet);
        
        OpmTimeRem otrObj = new OpmTimeRem();
        otrObj.setOpmtrId(otrFac.count() + 1);
        otrObj.setOpmtrHrs(remTime);
        otrObj.setOpmtrHrsType(hrsType);
        otrObj.setOpmtrOpmId(opmObj);
        Set<OpmTimeRem> otrObjSet = new HashSet<OpmTimeRem>();
        otrObjSet.add(otrObj);
        opmObj.setOpmTimeRemSet(otrObjSet);
        
        OpmRemarks orObj = new OpmRemarks();
        orObj.setOpmremId(orFac.count() + 1);
        orObj.setOpmremText(remText);
        orObj.setOpmremOpmId(opmObj);
        Set<OpmRemarks> orObjSet = new HashSet<OpmRemarks>();
        orObjSet.add(orObj);
        opmObj.setOpmRemarksSet(orObjSet);
        
        em.persist(opmObj);
        
        return true;
    }
}
