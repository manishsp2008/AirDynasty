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
    public boolean addComponent(AirCraft acObj, String cmpName, String partNum, String srNum, String flHrs,String flHrsType,
            String lrInstHrs,String lrInstHrsType, String afInstHrs,String afInstHrsType, String InstDueHrs,String InstDueHrsType,
            String InstDate, String crAfHrs, String crAfHrsType, String rlHrs,String rlHrsType, String remText) {
        
        try {
        /*
        Set<CmpSerialNumber> csnObjSet = new HashSet<CmpSerialNumber>();
        Set<CmpFinitelife> cflObjSet = new HashSet<CmpFinitelife>() ;
        Set<CompDueoffAfhrsInst> cdaObjSet = new HashSet<CompDueoffAfhrsInst>() ;
        Set<CmpAfhrsInst> caiObjSet  = new HashSet<CmpAfhrsInst>();
        Set<CmpDateInst> cdiObjSet  = new HashSet<CmpDateInst>();
        Set<CmpLiferemInst> cliObjSet = new HashSet<CmpLiferemInst>() ;
        Set<CmpCurAfhrs> ccaObjSet  = new HashSet<CmpCurAfhrs>();
        Set<CompRemLife> crlObjSet = new HashSet<CompRemLife>() ;
        Set<CmpRemarks> crObjSet  = new HashSet<CmpRemarks>();
        
        // Create Component Object
        //int newId = cfObj.findAll().size() + 1 ; 
        Components  cmpObj = new Components();
        cmpObj.setCompPartname(cmpName);
        cmpObj.setCompPartnum(partNum);
        cmpObj.setCompAcId(acObj);
        em.persist(cmpObj);
        System.out.println("Component added successfully to DB");
        //em.persist(cmpObj);
        // Create serial number Object
        //em.flush();
        */
        int csnId = cmp_sr_num_Facade.findAll().size() + 1;
        CmpSerialNumber csnObj = new CmpSerialNumber(csnId, srNum);
        em.persist(csnObj);
        //csnObjSet.add(csnObj);
        
        /*
        //csnObj.setSerialnumCompId(cmpObj);
        //em.persist(csnObj);
        // Create finitelife hours object
        //em.flush();
        int flhId = cmp_finite_life_Facade.findAll().size() + 1;
        CmpFinitelife cflObj = new CmpFinitelife(flhId, InstDueHrs, InstDueHrsType);
        //cflObj.setCmpFinitelifeCompId(cmpObj);
        cflObjSet.add(cflObj);
        //em.persist(cflObj);
        // create inst life remain hours object
       
        int doaiId = cmp_dueoff_afhrs_inst_Facade.findAll().size() + 1;
        CompDueoffAfhrsInst cdaObj = new CompDueoffAfhrsInst(doaiId, lrInstHrs, lrInstHrsType);
        cdaObjSet.add(cdaObj);
        //doaiObj.setCdaCompId(cmpObj);
        //em.persist(doaiObj);
        // create inst hrs object
       
        int iafId = cmp_afhrs_inst_Facade.findAll().size() + 1;
        CmpAfhrsInst iafObj = new CmpAfhrsInst(iafId, afInstHrs, afInstHrsType);
        caiObjSet.add(iafObj);
        //iafObj.setCmpAfhrsInstCompId(cmpObj);
        //em.persist(iafObj);
        // create inst due Date  object
       
        int instddId = cmp_date_inst_Facade.findAll().size() + 1;
        int y = Integer.parseInt(InstDate.split("-")[2]);
        int m = Integer.parseInt(InstDate.split("-")[1]);
        int dt = Integer.parseInt(InstDate.split("-")[0]);
        
        CmpDateInst iddObj = new CmpDateInst(instddId,new Date(y,m,dt));
        cdiObjSet.add(iddObj);
        
        //iddObj.setCmpDateInstCompId(cmpObj);
        //em.persist(iddObj);
        // create inst due hrs set
       
        int idhId = cmp_life_rem_inst_Facade.findAll().size() + 1;
        CmpLiferemInst cliObj = new CmpLiferemInst(idhId, InstDueHrs, InstDueHrsType);
        cliObjSet.add(cliObj);
        //cliObj.setCmplifesCompId(cmpObj);
        //em.persist(cliObj);
        // cerate current af hrs details object
       
        int crafId = cmp_cur_afhrs_Facade.findAll().size() + 1;
        CmpCurAfhrs ccaObj = new CmpCurAfhrs(crafId, crAfHrs, crAfHrsType);
        ccaObjSet.add(ccaObj);
        //ccaObj.setCmpCurAfhrsCompId(cmpObj);
        //em.persist(ccaObj);
        // create remaining life hrs object
       
        int rlhId = cmp_rem_life_Facade.findAll().size() + 1;
        CompRemLife clrObj = new CompRemLife(rlhId, rlHrs, rlHrsType);
        crlObjSet.add(clrObj);
        //clrObj.setCrlCompId(cmpObj);
        //em.persist(clrObj);
        // create remarks object
       
        int rtId = cmp_remarks_Facade.findAll().size();
        CmpRemarks crObj = new CmpRemarks(rtId);
        crObj.setCmpRemarksText(remText);
        crObjSet.add(crObj);
        //crObj.setCmpRemarksCompId(cmpObj);
        //em.persist(crObj);
        // merge a Component.
       
        cmpObj.setCmpAfhrsInstSet((Set<CmpAfhrsInst>)caiObjSet);
        cmpObj.setCmpCurAfhrsSet((Set<CmpCurAfhrs>)ccaObjSet);
        cmpObj.setCmpDateInstSet((Set<CmpDateInst>)cdiObjSet);
        cmpObj.setCmpFinitelifeSet((Set<CmpFinitelife>)cflObjSet);
        cmpObj.setCmpLiferemInstSet((Set<CmpLiferemInst>)cliObjSet);
        cmpObj.setCmpRemarksSet((Set<CmpRemarks>)crObjSet);        
        cmpObj.setCmpSerialNumberSet((Set<CmpSerialNumber>)csnObjSet);        
        cmpObj.setCompDueoffAfhrsInstSet((Set<CompDueoffAfhrsInst>)cdaObjSet);        
        cmpObj.setCompRemLifeSet(( Set<CompRemLife>)crlObjSet);        
        
        cfObj.create(cmpObj);
                
         */       
        context.setRollbackOnly();
        return true;
        
        
         }
        catch(Exception e)
        {
            System.out.println(e.getMessage() + "-----------" + e.toString());
            
            
            return false;
        }
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
    
    
    
}
