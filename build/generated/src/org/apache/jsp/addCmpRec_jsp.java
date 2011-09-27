package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addCmpRec_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Air Dynasty - Add New Air Frame Component Record </title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Add New Air Frame Component Record</h1>\r\n");
      out.write("        <br/>\r\n");
      out.write("        Hours Type(H/D/L) - <select name=\"HrsType\"><option value=\"H\">Hours</option><option value=\"D\" >Date</option><option value=\"L\">Landings</option></select>\r\n");
      out.write("        <br/>\r\n");
      out.write("        <form name=\"myForm\" action=\"/AirDynasty/addCmpRec\" method=\"get\">\r\n");
      out.write("            <h4>Basic Details</h4>\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Component Name</td><td><input name=\"cmpName\" type=\"text\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Part Number</td><td><input name=\"partNum\" type=\"text\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Serial Number</td><td><input name=\"srNum\" type=\"text\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Finite Life Hrs</td><td><input name=\"flHrs\" type=\"text\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <h4>Installation Details</h4>\r\n");
      out.write("            <table>\r\n");
      out.write("                 <tr>\r\n");
      out.write("                    <td>Life Remaining Hrs</td><td><input name=\"lrInstHrs\" type=\"text\"/></td>\r\n");
      out.write("                 </tr>\r\n");
      out.write("                 <tr>\r\n");
      out.write("                    <td>Installation A/F Hrs</td><td><input name=\"afInstHrs\" type=\"text\"/></td>\r\n");
      out.write("                 </tr>\r\n");
      out.write("                 <tr>\r\n");
      out.write("                    <td>Installation Date</td><td><input name=\"InstDate\" type=\"text\"/>(dd-mm-yyyy)</td>\r\n");
      out.write("                 </tr>\r\n");
      out.write("                 <tr>\r\n");
      out.write("                    <td>Installation Due Hrs</td><td><input name=\"InstDueHrs\" type=\"text\"/></td>\r\n");
      out.write("                 </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <h4>Current Component Details</h4>\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Current A/F Hrs</td><td><input name=\"crAFHrs\" type=\"text\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Remaining Life Hrs</td><td><input name=\"rLifeHrs\" type=\"text\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Remarks</td><td><input name=\"remText\" type=\"text\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("            </table>\r\n");
      out.write("            <br/>\r\n");
      out.write("            <input type=\"submit\" value=\"Add Component\" style=\"margin-left: 90px\" />\r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
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
