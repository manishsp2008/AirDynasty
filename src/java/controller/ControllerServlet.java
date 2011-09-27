/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import adsessionbeans.AirCraftFacade;
import adsessionbeans.ComponentsFacade;
import airdynasty.AfEngInsp;
import airdynasty.AirCraft;
import airdynasty.Components;
import airdynasty.OafChangeInt;
import airdynasty.OutPhaseMnt;
import airdynasty.bean.AirFrameBean;
import airdynasty.bean.ComponentUtils;
import airdynasty.bean.CraftUtils;
import airdynasty.bean.EngInsUtils;
import airdynasty.bean.OPMUtils;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
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
                      "/editComponent","/viewComponents","/addCmpRec",
                      "/addUser","/viewUser",
                      "/viewEngInspec","/addEngInspec","/editEngInspec",
                      "/viewOAFCIntvl","/addOAFCIntvl","/editOAFCIntvl",
                      "/viewOPMRec","/addOPMRec","/editOPMRec"
                    }
        )
public class ControllerServlet extends HttpServlet {

    @EJB
    private AirCraftFacade acFacade;
    @EJB
    private ComponentsFacade cmpFacade;
    @EJB
    private AirFrameBean afbObj;
    @EJB
    private ComponentUtils cmpUtilObj;
    @EJB
    private CraftUtils cuObj;
    @EJB
    private EngInsUtils eiuObj;
    @EJB
    private OPMUtils opmuObj; 
    
    @Override
    public void init()
    {
        
     // Load all air craft details in servlet.
     ///getServletContext().setAttribute("aircrafts", acFacade.findAll());
     
     // Load all component details in servlet context.
     //getServletContext().setAttribute("components", cmpFacade.findAll());
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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
   
        // Retrieve URL path of servlet.
        String userPath = request.getServletPath();
            System.out.println(userPath);    
        AirCraft acObj = null;
        Set<Components> cmpObj = null; 
        String afHrs = null;
        
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
        else if(userPath.equals("/addCraftHRS"))
        {
            // Retireve parameters from request.
            afHrs = request.getParameter("afHRS");
            
            String engHRS = request.getParameter("engHRS");
                    
            String acStCnt = request.getParameter("acStCnt");        
            
            String acLnCnt = request.getParameter("acLnCnt");
            
            String engNGcyc = request.getParameter("engNGcyc");
                    
            String engNPcyc = request.getParameter("engNPcyc");         
            //Integer stCount = Integer.parseInt(request.getParameter("acStCnt"));
            //Integer lndCount = Integer.parseInt(request.getParameter("acLndCnt"));
            
            //String flightDate = request.getParameter("flDate");
            
            // Set a hours to be substracted in servlet context.
            getServletContext().setAttribute("afHrs",afHrs);
            getServletContext().setAttribute("engHRS", engHRS);
            getServletContext().setAttribute("acStCnt", acStCnt);
            getServletContext().setAttribute("acLnCnt", acLnCnt);
            getServletContext().setAttribute("engNGCyc", engNGcyc);
            getServletContext().setAttribute("engNPcyc", engNPcyc);
            
            
            userPath = "/viewaddHrsRes";
            
            
        }
        else if(userPath.equals("/updateCraftHRS"))
        {
            afHrs = (String) getServletContext().getAttribute("afHrs");
            
            acObj = (AirCraft) getServletContext().getAttribute("craftObj");
            
            if(afHrs != null)   {
                
                // Update Current Air Frame hours in Database. 
                afbObj.setCurrentAFHrs(acObj, afHrs);
                
                // Update remaining Life Hours in Database.
                afbObj.setRemAFHrs(acObj, afHrs);
                
                userPath = "/AddHrsConfirm";
                
            }
            else
            {
                userPath="/aircraft";
            }
                
            
        }
        else if(userPath.equals("/addCmpRec"))
        {
            
            // Steps to implement this logic.
            
            // 1. read all Parameters from request
            String CmpName = request.getParameter("cmpName");
            String partNum = request.getParameter("partNum");
            String srNum = request.getParameter("srNum");
            String flHrs = request.getParameter("flHrs");
            String hrsType = request.getParameter("HrsType");
            
            
            String lrInstHrs = request.getParameter("lrInstHrs");
            //String lrInstHrsType = request.getParameter("lrInstHrsType");
            String afInstHrs = request.getParameter("afInstHrs");
            //String afInstHrsType = request.getParameter("afInstHrsType");
            String InstDate = request.getParameter("InstDate");
            String instDueHrs = request.getParameter("InstDueHrs");
            //String instDueHrsType = request.getParameter("InstDueHrsType");
            
            String crAfHrs = request.getParameter("crAFHrs");
            //String crAfHrsType = request.getParameter("crAFHrsType");
            String rLifeHrs = request.getParameter("rLifeHrs");
            //String rLifeHrsType = request.getParameter("rLifeHrsType");
            
            String remText = request.getParameter("remText");
            
            
            // 2. Insert all into DB using Insert Query.
            acObj = (AirCraft) getServletContext().getAttribute("craftObj");
            boolean flag = false;
            System.out.println("Air Craft ID : " + acObj.getAcId());
            if(acObj != null)   {
            flag = cmpUtilObj.addComponent(acObj, CmpName, partNum, srNum, hrsType, flHrs, lrInstHrs,
                    afInstHrs, instDueHrs, InstDate,crAfHrs, rLifeHrs, remText);
            }
            else    {
                flag = false;
            }
            // 3. Send User a Notification about added hours.
            System.out.println("Value of Flag : " + flag);
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
        else if(userPath.equals("/viewComponents"))
        {
            // TODO : View Component Code needed to be written here.
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
        else if(userPath.equals("/addEngInspec"))   {
            
            // Retrieve all input Parameters.
            String ncText = request.getParameter("ncText");
            String dueAFhrs = request.getParameter("dueAFhrs");
            String dueENGhrs = request.getParameter("dueENGhrs");
            String calDue = request.getParameter("calDue");
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
            String calDue = request.getParameter("calDue");
            String remTime = request.getParameter("remTime");
            String remText = request.getParameter("remText");
            String intvl = request.getParameter("intvl");
            String hrsType = request.getParameter("hrsType");
            acObj = (AirCraft)getServletContext().getAttribute("craftObj");
            boolean flag = false;
            if(acObj != null)   {
            // Insert them into Database.
            //flag = opmuObj.addOPMRec(acObj, ncText, dueAFhrs, dueENGhrs, calDue, hrsType, intvl, remTime, remText);
            }
            // Show user a message
            if(flag){
                userPath = "/trsuccess";
            }
            else    {
                userPath = "/trfail";
            }
            
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
        processRequest(request, response);
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
        processRequest(request, response);
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
