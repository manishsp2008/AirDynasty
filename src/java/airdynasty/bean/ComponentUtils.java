/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airdynasty.bean;

import adsessionbeans.CmpAfhrsInstFacade;
import adsessionbeans.CmpCurAfhrsFacade;
import adsessionbeans.CmpDateInstFacade;
import adsessionbeans.CmpFinitelifeFacade;
import adsessionbeans.CmpLiferemInstFacade;
import adsessionbeans.CmpRemarksFacade;
import adsessionbeans.CmpSerialNumberFacade;
import adsessionbeans.CompDueoffAfhrsInstFacade;
import adsessionbeans.CompRemLifeFacade;
import adsessionbeans.ComponentsFacade;
import airdynasty.AirCraft;
import airdynasty.CmpAfhrsInst;
import airdynasty.CmpCurAfhrs;
import airdynasty.CmpDateInst;
import airdynasty.CmpFinitelife;
import airdynasty.CmpLiferemInst;
import airdynasty.CmpRemarks;
import airdynasty.CmpSerialNumber;
import airdynasty.CompDueoffAfhrsInst;
import airdynasty.CompRemLife;
import airdynasty.Components;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.SessionContext;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.PersistenceContext;

/**
 *
 * @author A187252
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@LocalBean
public class ComponentUtils {
    @EJB
    private ComponentsFacade cfObj ;
    @EJB
    private CmpSerialNumberFacade cmp_sr_num_Facade;
    @EJB
    private CmpFinitelifeFacade cmp_finite_life_Facade;
    @EJB
    private CmpLiferemInstFacade cmp_life_rem_inst_Facade;
    @EJB
    private CmpAfhrsInstFacade cmp_afhrs_inst_Facade;
    @EJB
    private CmpDateInstFacade cmp_date_inst_Facade;
    @EJB
    private CompDueoffAfhrsInstFacade cmp_dueoff_afhrs_inst_Facade;
    @EJB
    private CmpCurAfhrsFacade cmp_cur_afhrs_Facade;
    @EJB
    private CompRemLifeFacade cmp_rem_life_Facade;
    @EJB
    private CmpRemarksFacade cmp_remarks_Facade;
    
    @PersistenceContext(unitName="AirDynastyPU")
    private javax.persistence.EntityManager em;
    
    @Resource
    private SessionContext context;
    
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public boolean addComponent(AirCraft acObj, String cmpName, String partNum, String srNum,String hrsType, String flHrs,
            String lrInstHrs, String afInstHrs, String InstDueHrs,String InstDate, String crAfHrs,
            String rlHrs, String remText) {
        
        try {
        Components cmpObj = new Components();
        cmpObj.setCompId(cfObj.count()+1);
        cmpObj.setCompPartname(cmpName);
        cmpObj.setCompPartnum(partNum);
        cmpObj.setCompAcId(acObj);
            
        CmpSerialNumber csnObj = new CmpSerialNumber();
        csnObj.setSerialnumId(cmp_sr_num_Facade.count()+1);
        csnObj.setSerialnumValue(srNum);
        csnObj.setSerialnumCompId(cmpObj);
        Set<CmpSerialNumber> csnObjSet = new HashSet<CmpSerialNumber>();
        csnObjSet.add(csnObj);
        cmpObj.setCmpSerialNumberSet(csnObjSet);
        
        CmpFinitelife cflObj = new CmpFinitelife();
        cflObj.setCmpFinitelifeId(cmp_finite_life_Facade.count()+1);
        cflObj.setCmpFinitelifeHrs(flHrs);
        cflObj.setCmpFinitelifeHrsType(hrsType);
        cflObj.setCmpFinitelifeCompId(cmpObj);
        Set<CmpFinitelife> cflObjSet = new HashSet<CmpFinitelife>() ;
        cflObjSet.add(cflObj);
        cmpObj.setCmpFinitelifeSet(cflObjSet);
        
        CompDueoffAfhrsInst cdaObj = new CompDueoffAfhrsInst();
        cdaObj.setCdaId(cmp_dueoff_afhrs_inst_Facade.count()+1);
        cdaObj.setCdaHrs(InstDueHrs);
        cdaObj.setCdaCompId(cmpObj);
        cdaObj.setCdaHrsType(hrsType);
        Set<CompDueoffAfhrsInst> cdaObjSet = new HashSet<CompDueoffAfhrsInst>() ;
        cdaObjSet.add(cdaObj);
        cmpObj.setCompDueoffAfhrsInstSet(cdaObjSet);
                
        CmpAfhrsInst iafObj = new CmpAfhrsInst();
        iafObj.setCmpAfhrsInstId(cmp_afhrs_inst_Facade.count()+1);
        iafObj.setCmpAfhrsInstHrs(afInstHrs);
        iafObj.setCmpAfhrsInstCompId(cmpObj);
        iafObj.setCmpAfhrsInstHrsType(hrsType);
        Set<CmpAfhrsInst> caiObjSet  = new HashSet<CmpAfhrsInst>();
        caiObjSet.add(iafObj);
        cmpObj.setCmpAfhrsInstSet(caiObjSet);
        
        int y = Integer.parseInt(InstDate.split("-")[2]);
        int m = Integer.parseInt(InstDate.split("-")[1]);
        int dt = Integer.parseInt(InstDate.split("-")[0]);
        CmpDateInst iddObj = new CmpDateInst();
        iddObj.setCmpDateInstId(cmp_date_inst_Facade.count()+1);
        iddObj.setCmpDateInstDate(new Date(y,m,dt));
        iddObj.setCmpDateInstCompId(cmpObj);
        Set<CmpDateInst> cdiObjSet  = new HashSet<CmpDateInst>();
        cdiObjSet.add(iddObj);
        cmpObj.setCmpDateInstSet(cdiObjSet);
        
        CmpLiferemInst cliObj = new CmpLiferemInst();
        cliObj.setCmplifeRemId(cmp_life_rem_inst_Facade.count()+1);
        cliObj.setCmplifeRemHrs(lrInstHrs);
        cliObj.setCmplifeRemHrsType(hrsType);
        cliObj.setCmplifesCompId(cmpObj);
        Set<CmpLiferemInst> cliObjSet = new HashSet<CmpLiferemInst>() ;
        cliObjSet.add(cliObj);
        cmpObj.setCmpLiferemInstSet(cliObjSet);
        
        CmpCurAfhrs ccaObj = new CmpCurAfhrs();
        ccaObj.setCmpCurAfhrsId(cmp_cur_afhrs_Facade.count()+1);
        ccaObj.setCmpCurAfhrsHrs(crAfHrs);
        ccaObj.setCmpCurAfhrsHrsType(hrsType);
        ccaObj.setCmpCurAfhrsCompId(cmpObj);
        Set<CmpCurAfhrs> ccaObjSet  = new HashSet<CmpCurAfhrs>();
        ccaObjSet.add(ccaObj);
        cmpObj.setCmpCurAfhrsSet(ccaObjSet);
        
        CompRemLife clrObj = new CompRemLife();
        clrObj.setCrlId(cmp_rem_life_Facade.count()+1);
        clrObj.setCrlHrs(rlHrs);
        clrObj.setCrlHrsType(hrsType);
        clrObj.setCrlCompId(cmpObj);
        Set<CompRemLife> crlObjSet = new HashSet<CompRemLife>() ;
        crlObjSet.add(clrObj);
        cmpObj.setCompRemLifeSet(crlObjSet);
        
        CmpRemarks crObj = new CmpRemarks();
        crObj.setCmpRemarksId(cmp_remarks_Facade.count()+1);
        crObj.setCmpRemarksText(remText);
        crObj.setCmpRemarksCompId(cmpObj);
        Set<CmpRemarks> crObjSet  = new HashSet<CmpRemarks>();
        crObjSet.add(crObj);
        cmpObj.setCmpRemarksSet(crObjSet);
        
        em.persist(cmpObj);
        
        return true;
        }
        catch(Exception e)
        {
        System.out.println("Error Message : " + e.getMessage());  
        context.setRollbackOnly();
        return false;
        }
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
    
    
    
}
