/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airdynasty.bean;

import adsessionbeans.OafChangeIntFacade;
import adsessionbeans.OafciDueAtHrsFacade;
import adsessionbeans.OafciDueHrsFacade;
import adsessionbeans.OafciIntervalFacade;
import adsessionbeans.OafciRemarksFacade;
import airdynasty.AirCraft;
import airdynasty.OafChangeInt;
import airdynasty.OafciDueAtHrs;
import airdynasty.OafciDueHrs;
import airdynasty.OafciInterval;
import airdynasty.OafciRemarks;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.SessionContext;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author A187252
 */
@TransactionManagement(TransactionManagementType.CONTAINER)
@Stateless
@LocalBean
public class OAFCIUtils {
    
    @EJB
    private OafChangeIntFacade ociFacade;
    @EJB
    private OafciIntervalFacade oiFacade;
    @EJB
    private OafciDueAtHrsFacade odahFacade;
    @EJB
    private OafciDueHrsFacade odhFacade;
    @EJB
    private OafciRemarksFacade orFacade;
    
    
    @Resource
    private SessionContext context;
    
    @PersistenceContext(unitName="AirDynastyPU")
    private EntityManager em;

public boolean addNewRecord(AirCraft acObj, String hrsType, String nmText, String specText,String intHRS,String dueHRS,String remTime,String remText)   {
    
    try {
    OafChangeInt ociObj = new OafChangeInt();
    ociObj.setOafciId(ociFacade.count() + 1);
    ociObj.setOafciAcId(acObj);
    ociObj.setOafciNomenclature(nmText);
    ociObj.setOafciSpecs(specText);
    
    
    OafciInterval ocIntvl = new OafciInterval();
    ocIntvl.setOafcinvlId(oiFacade.count() + 1);
    ocIntvl.setOafcinvlHrs(intHRS);
    ocIntvl.setOafcinvlHrsType(hrsType);
    ocIntvl.setOafcinvlOafciId(ociObj);
    Set<OafciInterval> ocIntvlSet = new HashSet<OafciInterval>(); 
    ocIntvlSet.add(ocIntvl);
    ociObj.setOafciIntervalSet(ocIntvlSet);
    
    
    OafciDueAtHrs odahObj = new OafciDueAtHrs();
    odahObj.setOanfDahId(odahFacade.count() + 1);
    odahObj.setOanfDahHrs(dueHRS);
    odahObj.setOanfdahHrsType(hrsType);
    odahObj.setOanfdahOafciId(ociObj);
    Set<OafciDueAtHrs> odahObjSet = new HashSet<OafciDueAtHrs>();
    odahObjSet.add(odahObj);
    ociObj.setOafciDueAtHrsSet(odahObjSet);
    
    
    OafciDueHrs odhObj = new OafciDueHrs();
    odhObj.setOafdhId(odhFacade.count() + 1);
    odhObj.setOafdhHrs(remTime);
    odhObj.setOafdhHrsType(hrsType);
    odhObj.setOafdhOafciId(ociObj);
    Set<OafciDueHrs> odhObjSet = new HashSet<OafciDueHrs>();
    odhObjSet.add(odhObj);
    ociObj.setOafciDueHrsSet(odhObjSet);
    
    
    OafciRemarks orObj = new OafciRemarks();
    orObj.setOafremId(orFacade.count() + 1);
    orObj.setOafremText(remText);
    orObj.setOafremOafciId(ociObj);
    Set<OafciRemarks> orObjSet = new HashSet<OafciRemarks>();
    orObjSet.add(orObj);
    ociObj.setOafciRemarksSet(orObjSet);
    
    
    em.persist(ociObj);
    
    return true;
    }
    catch(Exception e)  {
        context.setRollbackOnly();
        return false;
    }
}    
    
}
