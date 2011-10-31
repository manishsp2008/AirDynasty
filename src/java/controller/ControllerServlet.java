/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import adsessionbeans.AfEngInspFacade;
import adsessionbeans.AirCraftFacade;
import adsessionbeans.ComponentsFacade;
import adsessionbeans.OafChangeIntFacade;
import adsessionbeans.OutPhaseMntFacade;
import airdynasty.AfEngInsp;
import airdynasty.AirCraft;
import airdynasty.Components;
import airdynasty.OafChangeInt;
import airdynasty.OutPhaseMnt;
import airdynasty.bean.AirFrameBean;
import airdynasty.bean.ComponentUtils;
import airdynasty.bean.CraftUtils;
import airdynasty.bean.OAFCIUtils;
import airdynasty.bean.EngInsUtils;
import airdynasty.bean.OPMUtils;
import airdynasty.utils.AirFrameLogic;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Dell
 */

@WebServlet(name="ControllerServlet",
        loadOnStartup=1,
        urlPatterns={ "/viewCraft","/addCraft","/editCraft","/viewCraftList",
                      "/addCraftHRS","/updateCraftHRS","/addComponent",
                      "/addEngHrs","/updateEngHRS",
                      "/editComponent","/viewComponent","/addCmpRec",
                      "/addUser","/viewUser",
                      "/viewEngInspec","/addEngInspec","/editEngInspec",
                      "/viewOAFCIntvl","/addOAFCIntvl","/editOAFCIntvl",
                      "/viewOPMRec","/addOPMRec","/editOPMRec",
                      "/viewEIR","/viewOFCR","/viewOPMR"
                    }
        )
public class ControllerServlet extends HttpServlet {

    @EJB
    private AirCraftFacade acFacade;
    @EJB
    private ComponentsFacade cmpFacade;
    @EJB
    private AfEngInspFacade aeiFacade;
    @EJB
    private OafChangeIntFacade ociFacade;
    @EJB
    private OutPhaseMntFacade opmFacade;
    @EJB
    private AirFrameBean afbObj;
    @EJB
    private ComponentUtils cmpUtilObj;
    @EJB
    private CraftUtils cuObj;
    @EJB
    private OAFCIUtils oafciObj;
    @EJB
    private EngInsUtils eiuObj;
    @EJB
    private OPMUtils opmuObj; 

    
    @Override
    public void init()
    {
        
     // Load all air craft details in servlet.
     getServletContext().setAttribute("aircrafts", acFacade.findAll());
     
     // Load all component details in servlet context.
     getServletContext().setAttribute("components", cmpFacade.findAll());
     /*
     getServletContext().setAttribute("cmp_srnum", cmp_sr_num_Facade.findAll());
     getServletContext().setAttribute("cmp_finite_life", cmp_finite_life_Facade.findAll());
     getServletContext().setAttribute("cmp_liferem_inst", cmp_life_rem_inst_Facade.findAll());
     getServletContext().setAttribute("cmp_afhrs_inst", cmp_afhrs_inst_Facade.findAll());
     getServletContext().setAttribute("cmp_date_inst", cmp_date_inst_Facade.findAll());
     getServletContext().setAttribute("cmp_dueoff_afhrs_inst", cmp_dueoff_afhrs_inst_Facade.findAll());
     getServletContext().setAttribute("cmp_curr_afhrs", cmp_cur_afhrs_Facade.findAll());
     getServletContext().setAttribute("cmp_remlife", cmp_rem_life_Facade.findAll());
     getServletContext().setAttribute("cmp_remarks", cmp_remarks_Facade.findAll());
     */
    }
    
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
   
        // Retrieve URL path of servlet.
        String userPath = request.getServletPath();
            System.out.println(userPath);    
        AirCraft acObj = null;
        Set<Components> cmpObj = null; 
        
        String afHrs = null;
        String acLndCnt = null;
        String flDate = null;
        
        String engHrs = null;
        String ngCycs = null;
        String npCycs = null;
        String engDate = null;
        
        if(userPath.equals("/viewCraftList"))
        {
            // Load all air craft details in servlet.
            //List<AirCraft> li = acFacade.findAll();
            //getServletContext().setAttribute("aircrafts",li);
     
            // Load all component details in servlet context.
            //List<Components> cmp = cmpFacade.findAll();
            //getServletContext().setAttribute("components", cmp);
           
            userPath = "/aircraft";
        }
        else if(userPath.equals("/viewCraft"))
        {
            // Retirieve craft id from rquest. 
            String id = request.getQueryString();
            // Set id in servlet context
            getServletContext().setAttribute("acID", Integer.valueOf(id));
            
            if(id != null) {
            // Retrieve Aircraft Object for request id.
            //acObj = acFacade.find(Integer.parseInt(id));
            acObj = cuObj.getCraftbyID(Integer.parseInt(id));
                
            // Set object in servlet context
            getServletContext().setAttribute("craftObj", acObj);
            
            // Retrieve the Components of air craft.
            cmpObj = acObj.getComponentsSet();
            System.out.println("Number of Componenets Found are : " +  cmpObj.size());
            // Set Components in servlet context
            getServletContext().setAttribute("craftComps", cmpObj);
            
            }
            
            userPath = "/viewcraft";
            
        }
        else if(userPath.equals("/addCraft"))
        {
            // TODO : Add Craft Logic to be written here.
        }
        else if(userPath.equals("/editCraft"))
        {
            // TODO : Edit Craft Logic needed to be written here.
        }
        else if(userPath.equals("/addCmpRec"))
        {
            
            // Steps to implement this logic.
            
            // 1. read all Parameters from request
            String CmpName = request.getParameter("cmpName");
            String partNum = request.getParameter("partNum");
            String srNum = request.getParameter("srNum");
            
            String flHrs = request.getParameter("flHrs");
            String flHrsType = request.getParameter("flHrsType");
            
            String lrInstHrs = request.getParameter("lrInstHrs");
            String lrInstHrsType = request.getParameter("lrInstHrsType");
            
            String afInstHrs = request.getParameter("afInstHrs");
            String afInstHrsType = request.getParameter("afInstHrsType");
            
            String InstDate = request.getParameter("InstDate");
            
            String instDueHrs = request.getParameter("InstDueHrs");
            String instDueHrsType = request.getParameter("InstDueHrsType");
            
            String crAfHrs = request.getParameter("crAFHrs");
            String crAfHrsType = request.getParameter("crAFHrsType");
            
            String rLifeHrs = request.getParameter("rLifeHrs");
            String rLifeHrsType = request.getParameter("rLifeHrsType");
            
            String remText = request.getParameter("remText");
            
            
            // 2. Insert all into DB using Insert Query.
            acObj = (AirCraft) getServletContext().getAttribute("craftObj");
            boolean flag = false;
            System.out.println("Air Craft ID : " + acObj.getAcId());
            if(acObj != null)   {
            flag = cmpUtilObj.addComponent(acObj, CmpName, partNum, srNum, flHrs, flHrsType, lrInstHrs, lrInstHrsType,
                    afInstHrs, afInstHrsType, instDueHrs, instDueHrsType, InstDate, crAfHrs, crAfHrsType, rLifeHrs,rLifeHrsType, remText);
            }
            else    {
                flag = false;
            }
            // 3. Send User a Notification about added hours.
            if(flag)    {
                userPath = "/trsuccess";
            }
            else
            {
                userPath="/trfail";
            }
            // Function to be written : AddComponent; editComponent; RemoveComponent; 
        }
        else if(userPath.equals("/editComponent"))
        {
            // TODO : Edit component details needed to be written here.
        }
        else if(userPath.equals("/viewComponent"))
        {
            String compID = request.getQueryString();
            
            Components myComp = cmpFacade.find(Integer.parseInt(compID));
            
            request.getSession().setAttribute("myComp", myComp);
            
            userPath = "/viewComponent";
            
        }
        else if(userPath.equals("/viewEngInspec"))   {
            
            AirCraft tempAcObj = (AirCraft) getServletContext().getAttribute("craftObj");    
            
            if(tempAcObj != null)   {
            
            Set<AfEngInsp> aeiObj =  (Set<AfEngInsp>)tempAcObj.getAfEngInspSet();    
            
            getServletContext().setAttribute("EngInspSet", aeiObj);
            
            userPath="/viewEngInspec";
            
            }
            
        }
        else if(userPath.equals("/viewOAFCIntvl"))  {
          
           AirCraft tempAcObj = (AirCraft) getServletContext().getAttribute("craftObj"); 
            
           if(tempAcObj != null)   {
               
           Set<OafChangeInt> ociObj =  (Set<OafChangeInt>)tempAcObj.getOafChangeIntSet();  
            
           getServletContext().setAttribute("OAFCIntvlSet", ociObj);
           
           userPath="/viewOAFCIntvl";

           } 
            
        }
        
        else if(userPath.equals("/viewOPMRec"))   {
            
           AirCraft tempAcObj = (AirCraft) getServletContext().getAttribute("craftObj"); 
            
           if(tempAcObj != null)   {
               
           Set<OutPhaseMnt> opmrObj =  (Set<OutPhaseMnt>)tempAcObj.getOutPhaseMntSet();
            
           getServletContext().setAttribute("OPMRecSet", opmrObj);
           
           userPath="/viewOPMRec";
            
            
            }
                
        }
        else if(userPath.equals("/addOAFCIntvl"))   {
            
            // Read Parameters from Request.
            String hrsType = request.getParameter("hrsType");
            
            String nmText = request.getParameter("nmText");
            String specText = request.getParameter("specText");
            String intHRS = request.getParameter("intHRS");
            String dueHRS = request.getParameter("dueHRS");
            String remTime = request.getParameter("remTime");
            String remText = request.getParameter("remText");
            
            // Add Paramaeters in to DB.
            acObj = (AirCraft) getServletContext().getAttribute("craftObj");
            if(acObj != null)   {
            
            // Send response to user.
            if(oafciObj.addNewRecord(acObj, hrsType, nmText, specText, intHRS, dueHRS, remTime, remText))
                userPath = "/trsuccess";
            else
            {
                userPath = "/trfail";
            }
            }
            else
            {
                userPath = "/trfail";
            }
        }
        else if(userPath.equals("/addEngInspec"))   {
            
            // Retrieve all input Parameters.
            String ncText = request.getParameter("ncText");
            String dueAFhrs = request.getParameter("dueAFhrs");
            String dueENGhrs = request.getParameter("dueENGhrs");
            String calDue = request.getParameter("calDate");
            String remTime = request.getParameter("remTime");
            String remText = request.getParameter("remText");
            // Insert them into DB.
            acObj = (AirCraft) getServletContext().getAttribute("craftObj");
            boolean flag = true;
            
            if(acObj != null)   {
                
            flag = eiuObj.addEIRec(acObj, ncText, dueAFhrs, dueENGhrs, calDue, remTime, remText);
            
            // Show user confirmation messsage.
            if(flag)    {
                userPath = "/trsuccess";
            }
            else {
                userPath = "/trfail";
            }
            }
            
        }
        else if(userPath.equals("/addOPMRec"))   {
            
            //Read All input values
            String ncText = request.getParameter("ncText");
            String dueAFhrs = request.getParameter("dueAFhrs");
            String dueENGhrs = request.getParameter("dueENGhrs");
            String calDate = request.getParameter("calDate");
            String remTime = request.getParameter("remTime");
            String remText = request.getParameter("remText");
            String intvl = request.getParameter("intvl");
            
            String hrsType = request.getParameter("hrsType");
            
            acObj = (AirCraft)getServletContext().getAttribute("craftObj");
            boolean flag = false;
            if(acObj != null)   {
            // Insert them into Database.
            flag = opmuObj.addOPMRec(acObj, ncText, dueAFhrs, dueENGhrs, calDate, hrsType, intvl, remTime, remText);
            }
            // Show user a message
            if(flag){
                userPath = "/trsuccess";
            }
            else    {
                userPath = "/trfail";
            }

            
        }
        else if(userPath.equals("/addCraftHRS"))
        {
            // Retireve parameters from request.
            afHrs = request.getParameter("afHRS");
            acLndCnt = request.getParameter("acLndCnt");
            flDate = request.getParameter("flDate");
            
            acObj = (AirCraft) getServletContext().getAttribute("craftObj");
            
            if(acObj != null)   {
               // Get all compoenets for selected Air Craft.
                Set<Components> cmpObjSet = acObj.getComponentsSet();
               // Reflect changes in Set 
               AirFrameLogic.updateCompSet(cmpObjSet, afHrs, acLndCnt, flDate);
               // Pass that set in servlet context
               getServletContext().setAttribute("tempCompSet", cmpObjSet); 
                
            }

            // Set a hours to be substracted in servlet context.
            getServletContext().setAttribute("afHrs",afHrs);
            getServletContext().setAttribute("acLndCnt",acLndCnt);
            getServletContext().setAttribute("flDate",flDate);
            
            userPath = "/viewaddHrsRes";
        }
        else if(userPath.equals("/updateCraftHRS"))
        {
            
            //afHrs =  (String) getServletContext().getAttribute("afHrs");
            //acLndCnt = (String) getServletContext().getAttribute("acLndCnt");
            //flDate = (String) getServletContext().getAttribute("flDate");

            acObj = (AirCraft) getServletContext().getAttribute("craftObj");
            Set<Components> cmpObjSet = (Set<Components>) getServletContext().getAttribute("tempCompSet");
            boolean flag = false;
            if(acObj != null)   {
                
                flag = afbObj.updateTable(acObj, cmpObjSet);
                
                if(flag) {  userPath = "/AddHrsConfirm";    }
                else     {  userPath = "/trfail";           }
            }
            else
            {
                userPath="/aircraft";
            }
                
            
        }
        else if(userPath.equals("/addEngHrs")) {
            
            // Read all parameters from request.
             engHrs = request.getParameter("engHrs");
             ngCycs = request.getParameter("ngCycs");
             npCycs = request.getParameter("npCycs");
             engDate = request.getParameter("engDate");  
            
            // Get AirCraft Object for which hours to be added
            acObj = (AirCraft) getServletContext().getAttribute("craftObj");
            
            // Update them accordingly.
            if(acObj != null) {
                
                // Get all components for selected Air Craft Engine.
                Set<Components> cmpObjSet = acObj.getComponentsSet();
                
                //Reflect Changes in Componenets
                AirFrameLogic.updateEngCompSet(cmpObjSet, engHrs, ngCycs, npCycs, engDate);
                
                // Pass compoenets to servlet Context.
                getServletContext().setAttribute("tempEngCompSet", cmpObjSet);
            }
            
            // Set a hours to be substracted in servlet context.
            getServletContext().setAttribute("engHrs",engHrs);
            getServletContext().setAttribute("ngCycs",ngCycs);
            getServletContext().setAttribute("npCycs",npCycs);
            getServletContext().setAttribute("engDate",engDate);
            
            // Show user preview of changes.
            userPath = "/viewEngAHRes";
        }
        else if(userPath.equals("/updateEngHRS")) {
            
            acObj = (AirCraft) getServletContext().getAttribute("craftObj");
            Set<Components> cmpObjSet = (Set<Components>) getServletContext().getAttribute("tempEngCompSet");
            boolean flag = false;
            if(acObj != null)   {
                
                flag = afbObj.updateTable(acObj, cmpObjSet);
                
                if(flag) {  userPath = "/AddHrsConfirm";    }
                else     {  userPath = "/trfail";           }
            }
            else
            {
                userPath="/aircraft";
            }
        }
        else if(userPath.equals("/viewEIR")) {
            String id = request.getQueryString();
            AfEngInsp aeiObj = aeiFacade.find(Integer.parseInt(id));
            request.getServletContext().setAttribute("myEIR", aeiObj);
            userPath = "/viewEIR";
        }
        else if(userPath.equals("/viewOFCR")) {
            String id = request.getQueryString();
            OafChangeInt ociObj = ociFacade.find(Integer.parseInt(id));
            request.getServletContext().setAttribute("myOFCR", ociObj);
            userPath = "/viewOFCR";
        }
        else if(userPath.equals("/viewOPMR")) {
            String id = request.getQueryString();
            OutPhaseMnt opmObj = opmFacade.find(Integer.parseInt(id));
            request.getServletContext().setAttribute("myOPM", opmObj);
            userPath = "/viewOPMR";
        }
        
        // Creates URL for Servlet redirect.
        String url = "/WEB-INF/view" + userPath + ".jsp";
        
        // Redirects Servlet to relevant URL.
        request.getRequestDispatcher(url).forward(request, response);
            
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(ControllerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(ControllerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
