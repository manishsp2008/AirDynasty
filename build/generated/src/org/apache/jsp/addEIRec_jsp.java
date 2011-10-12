package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addEIRec_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/includeS.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Air Dynasty - Add New Engine Inspection Record </title>\r\n");
      out.write("        ");
      out.write("        <style type=\"text/css\" title=\"currentStyle\">\r\n");
      out.write("            @import \"media/css/demo_page.css\";\r\n");
      out.write("            @import \"media/css/demo_table.css\";\r\n");
      out.write("            @import \"css/custom-theme/jquery-ui-1.8.16.custom.css\";\r\n");
      out.write("            @import \"design/airdyna.css\";\r\n");
      out.write("        </style>\r\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\" src=\"media/js/jquery.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\" src=\"media/js/jquery.dataTables.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-ui-1.8.16.custom.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"design/airdyna.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("   <body id=\"dt_example\">\r\n");
      out.write("        <h1>New Engine Inspection Record</h1>\r\n");
      out.write("        <form name=\"myForm\" action=\"/AirDynasty/addEngInspec\" method=\"get\">\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Nomenclature</td><td><input type=\"text\" name=\"ncText\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Due A/F Hours</td><td><input type=\"text\" name=\"dueAFhrs\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Due Engine Hours</td><td><input type=\"text\" name=\"dueENGhrs\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Calender Due Date</td><td><input type=\"text\" name=\"calDate\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Remaining Time</td><td><input type=\"text\" name=\"remTime\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Remarks</td><td><input type=\"text\" name=\"remText\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        \r\n");
      out.write("        <input type=\"submit\" value=\"Submit\"/>\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
