/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import adsessionbeans.AirCraftFacade;
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
import airdynasty.AfEngInsp;
import airdynasty.AirCraft;
import airdynasty.Components;
import airdynasty.OafChangeInt;
import airdynasty.OutPhaseMnt;
import airdynasty.bean.AirFrameBean;
import airdynasty.bean.ComponentUtils;
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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
   
        // Retrieve URL path of servlet.
        String userPath = request.getServletPath();
            System.out.println(userPath);    
        AirCraft acObj = null;
        Set<Components> cmpObj = null; 
        Double afHrs = null;
        
        if(userPath.equals("/viewCraftList"))
        {
           userPath = "/aircraft";
        }
        else if(userPath.equals("/viewCraft"))
        {
           // Retirieve craft id from rquest. 
            String id = request.getQueryString();
            
            if(id != null) {
            
            // Retrieve Aircraft Object for request id.
            acObj = acFacade.find(Integer.parseInt(id));
            
            // Set object in servlet context
            getServletContext().setAttribute("craftObj", acObj);
            
            // Retrieve the Components of air craft.
            cmpObj = acObj.getComponentsSet();
            
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
            afHrs = Double.parseDouble(request.getParameter("afHRS"));
            
            //Integer stCount = Integer.parseInt(request.getParameter("acStCnt"));
            //Integer lndCount = Integer.parseInt(request.getParameter("acLndCnt"));
            
            //String flightDate = request.getParameter("flDate");
            
            // Set a hours to be substracted in servlet context.
            getServletContext().setAttribute("afHrs",afHrs);
            
            userPath = "/viewaddHrsRes";
            
            
        }
        else if(userPath.equals("/updateCraftHRS"))
        {
            afHrs = (Double) getServletContext().getAttribute("afHrs");
            
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
            String flHrsType = request.getParameter("flHrs");
            
            
            String lrInstHrs = request.getParameter("lrInstHrs");
            String lrInstHrsType = request.getParameter("lrInstHrsType");
            String afInstHrs = request.getParameter("afInstHrs");
            String afInstHrsType = request.getParameter("afInstHrsType");
            String InstDate = request.getParameter("InstDate");
            String instDueHrs = request.getParameter("instDueHrs");
            String instDueHrsType = request.getParameter("instDueHrsType");
            
            String crAfHrs = request.getParameter("crAfHrs");
            String crAfHrsType = request.getParameter("crAfHrsType");
            String rLifeHrs = request.getParameter("rLifeHrs");
            String rLifeHrsType = request.getParameter("rLifeHrsType");
            
            String remText = request.getParameter("remText");
            
            
            // 2. Insert all into DB using Insert Query.
            acObj = (AirCraft) getServletContext().getAttribute("craftObj");
            boolean flag = false;
            if(acObj != null)   {
            flag = cmpUtilObj.addComponent(acObj, CmpName, partNum, srNum, flHrs, flHrsType, lrInstHrs, lrInstHrsType,
                    afInstHrs, afInstHrsType, instDueHrs, instDueHrsType, InstDate,crAfHrs, crAfHrsType,
                    rLifeHrs, rLifeHrsType, remText);
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
