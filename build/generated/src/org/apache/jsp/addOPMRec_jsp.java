package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addOPMRec_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Air Dynasty - Add New OPM Record</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h3>Add New OPM Record</h3>\n");
      out.write("       \n");
      out.write("        <form name=\"myForm\" action=\"/AirDynasty/addOPMHrs\">\n");
      out.write("        <select name=\"hrsType\">\n");
      out.write("            <option value=\"A\">Air Frame Hours</option>\n");
      out.write("            <option value=\"D\">In Days</option>\n");
      out.write("            <option value=\"E\">Engine Hours</option>\n");
      out.write("            <option value=\"N\">Ng Cycles</option>\n");
      out.write("        </select>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>Nomenclature</td><td><input type=\"text\" name=\"ncText\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Due A/F Hours</td><td><input type=\"text\" name=\"dueAFhrs\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Due Engine Hours</td><td><input type=\"text\" name=\"dueENGhrs\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Calender Due Date</td><td><input type=\"text\" name=\"calDate\"/></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("            \n");
      out.write("            <h3>Other Details</h3>\n");
      out.write("        <table>\n");
      out.write("        <tr>\n");
      out.write("            <td>Interval</td><td><input type=\"text\" name=\"intvl\"/></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Time Remain</td><td><input type=\"text\" name=\"remTime\"/></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Remarks</td><td><input type=\"text\" name=\"remText\"/></td>\n");
      out.write("        </tr>\n");
      out.write("        </table>\n");
      out.write("        <br/>\n");
      out.write("            <input type=\"submit\" value=\"Submit\"/>\n");
      out.write("          </form>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
