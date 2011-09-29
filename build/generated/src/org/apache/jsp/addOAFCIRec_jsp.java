package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addOAFCIRec_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Air Dynasty - Add New Oil & Fuel Change Interval Record</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"myForm\" action=\"/AirDynasty/addOAFCIntvl\" method=\"GET\">\n");
      out.write("        <h1>Add New Oil & Fuel Change Interval Record</h1>\n");
      out.write("        <strong>Basic Details</strong>\n");
      out.write("        <table>\n");
      out.write("            <tr><td>Nomenclature </td><td><input type=\"text\" name=\"nmText\"/></td> </tr>\n");
      out.write("            <tr><td>Specification </td><td><input type=\"text\" name=\"specText\"/></td> </tr>\n");
      out.write("        </table>\n");
      out.write("        <br/>\n");
      out.write("        <table><tr><td>Hours Type</td><td><select name=\"hrsType\">\n");
      out.write("                <option value=\"A\">Air Craft Hours</option>\n");
      out.write("                <option value=\"D\">Days</option>\n");
      out.write("                <option value=\"E\">Engine Hours</option>\n");
      out.write("            </select></td></tr></table>\n");
      out.write("        <br/>\n");
      out.write("        <strong>Interval Details</strong>\n");
      out.write("        <table>\n");
      out.write("            <tr><td>Interval </td><td><input type=\"text\" name=\"intHRS\"/></td> </tr>\n");
      out.write("            <tr><td>Due At Hours </td><td><input type=\"text\" name=\"dueHRS\"/></td> </tr>\n");
      out.write("            <tr><td>Time Remaining </td><td><input type=\"text\" name=\"remTime\"/></td> </tr>\n");
      out.write("            <tr><td>Remarks </td><td><input type=\"text\" name=\"remText\"/></td> </tr>\n");
      out.write("        </table>\n");
      out.write("        <input type=\"submit\" value=\"Add Record\"/>\n");
      out.write("    </form>\n");
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
