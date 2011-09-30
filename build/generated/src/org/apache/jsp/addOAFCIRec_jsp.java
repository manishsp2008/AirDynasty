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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Air Dynasty - Add New Oil & Fuel Change Interval Record</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form name=\"myForm\" action=\"/AirDynasty/addOAFCIntvl\" method=\"GET\">\r\n");
      out.write("        <h1>Add New Oil & Fuel Change Interval Record</h1>\r\n");
      out.write("        <strong>Basic Details</strong>\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr><td>Nomenclature </td><td><input type=\"text\" name=\"nmText\"/></td> </tr>\r\n");
      out.write("            <tr><td>Specification </td><td><input type=\"text\" name=\"specText\"/></td> </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <br/>\r\n");
      out.write("        <table><tr><td>Hours Type</td><td><select name=\"hrsType\">\r\n");
      out.write("                <option value=\"A\">Air Craft Hours</option>\r\n");
      out.write("                <option value=\"D\">Days</option>\r\n");
      out.write("                <option value=\"E\">Engine Hours</option>\r\n");
      out.write("            </select></td></tr></table>\r\n");
      out.write("        <br/>\r\n");
      out.write("        <strong>Interval Details</strong>\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr><td>Interval </td><td><input type=\"text\" name=\"intHRS\"/></td> </tr>\r\n");
      out.write("            <tr><td>Due At Hours </td><td><input type=\"text\" name=\"dueHRS\"/></td> </tr>\r\n");
      out.write("            <tr><td>Time Remaining </td><td><input type=\"text\" name=\"remTime\"/></td> </tr>\r\n");
      out.write("            <tr><td>Remarks </td><td><input type=\"text\" name=\"remText\"/></td> </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <input type=\"submit\" value=\"Add Record\"/>\r\n");
      out.write("    </form>\r\n");
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
