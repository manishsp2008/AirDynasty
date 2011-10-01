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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Air Dynasty - Add New Air Frame Component Record </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Add New Air Frame Component Record</h1>\n");
      out.write("        <br/>\n");
      out.write("        Hours Type(H/D/L) - <select name=\"HrsType\"><option value=\"H\">Hours</option><option value=\"D\" >Date</option><option value=\"L\">Landings</option></select>\n");
      out.write("        <br/>\n");
      out.write("        <form name=\"myForm\" action=\"/AirDynasty/addCmpRec\" method=\"get\">\n");
      out.write("            <h4>Basic Details</h4>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Component Name</td><td><input name=\"cmpName\" type=\"text\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Part Number</td><td><input name=\"partNum\" type=\"text\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Serial Number</td><td><input name=\"srNum\" type=\"text\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td>Finite Life Hrs</td><td><input name=\"flHrs\" type=\"text\"/>&nbsp;&nbsp;<select name=\"flHrsType\">\n");
      out.write("                            <option value=\"H\">Hours</option>\n");
      out.write("                            <option value=\"Y\">Years</option>\n");
      out.write("                            <option value=\"L\">Landing Count</option>\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <h4>Installation Details</h4>\n");
      out.write("            <table>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Life Remaining Hrs</td><td><input name=\"lrInstHrs\" type=\"text\"/>&nbsp;&nbsp;<select name=\"lrInstHrsType\"><option value=\"H\">Hours</option><option value=\"Y\" >Years</option><option value=\"L\">Landing Count</option></select></td>\n");
      out.write("                 </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Installation A/F Hrs</td><td><input name=\"afInstHrs\" type=\"text\"/>&nbsp;&nbsp;<select name=\"afInstHrsType\"><option value=\"H\">Hours</option><option value=\"D\" >Date</option><option value=\"L\">Landing Count</option></select></td>\n");
      out.write("                 </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Installation Date</td><td><input name=\"InstDate\" type=\"text\"/>&nbsp;&nbsp;(DD-MM-YYYY)</td>\n");
      out.write("                 </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Installation Due Hrs</td><td><input name=\"InstDueHrs\" type=\"text\"/>&nbsp;&nbsp;<select name=\"InstDueHrsType\"><option value=\"H\">Hours</option><option value=\"D\" >Date</option><option value=\"L\">Landing Count</option></select></td>\n");
      out.write("                 </tr>\n");
      out.write("            </table>\n");
      out.write("            <h4>Current Component Details</h4>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Current A/F Hrs</td><td><input name=\"crAFHrs\" type=\"text\"/>&nbsp;&nbsp;<select name=\"crAFHrsType\"><option value=\"H\">Hours</option><option value=\"D\" >Date</option><option value=\"L\" >Landings</option></select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Remaining Life Hrs</td><td><input name=\"rLifeHrs\" type=\"text\"/>&nbsp;&nbsp;<select name=\"rLifeHrsType\"><option value=\"H\">Hours</option><option value=\"D\" >Date</option><option value=\"L\" >Landings</option></select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Remarks</td><td><input name=\"remText\" type=\"text\"/></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <br/>\n");
      out.write("            <input type=\"submit\" value=\"Add Component\" style=\"margin-left: 90px\" />\n");
      out.write("        </form>\n");
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
