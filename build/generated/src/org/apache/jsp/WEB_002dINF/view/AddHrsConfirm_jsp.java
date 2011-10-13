package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddHrsConfirm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/WEB-INF/view/includeS.jsp");
    _jspx_dependants.add("/WEB-INF/view/header.jsp");
    _jspx_dependants.add("/WEB-INF/view/footer.jsp");
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
      out.write("        <title>Air Dynasty - Hours updated successfully</title>\r\n");
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
      out.write("        <script type=\"text/javascript\" src=\"design/jquery.tzineClock/jquery.tzineClock.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"design/jquery.tzineClock/jquery.tzineClock.css\" />\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("     <body>\r\n");
      out.write("<div id=\"wrap\">\r\n");
      out.write("  ");
      out.write("<div id=\"header\">\r\n");
      out.write("     <div id=\"headerTopBar\"  >\r\n");
      out.write("        <div id=\"headerLinks\">\r\n");
      out.write("            Link1 | Link2 | Link3\r\n");
      out.write("        </div>\r\n");
      out.write("         <div id=\"headerLoginBar\">\r\n");
      out.write("            Hi, <shiro:guest>Guest</shiro:guest><shiro:user><shiro:principal/></shiro:user>!\r\n");
      out.write("            &nbsp;( <shiro:user><a href=\"<c:url value=\"/logout.jsp\"/>\">Log out</a></shiro:user>\r\n");
      out.write("            <shiro:guest><a href=\"<c:url value=\"/login.jsp\"/>\">Log in</a></shiro:guest> )\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"headerMainBar\" class=\"ui-corner-bottom\">\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"headerImage\">\r\n");
      out.write("            <div id=\"headerImageBox\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"headerClock\">\r\n");
      out.write("            <div id=\"fancyClock\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"headerTitle\">\r\n");
      out.write("            <div id=\"headerTitleBox\">\r\n");
      out.write("            Aircraft Management System\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("<div id=\"dt_example\" >\r\n");
      out.write("        <strong>\r\n");
      out.write("            Hours are successfully updated in database.\r\n");
      out.write("        </strong>\r\n");
      out.write("        <br/>\r\n");
      out.write("        <a href=\"/AirDynasty/viewCraftList\" >Main Page</a>\r\n");
      out.write("        \r\n");
      out.write("   </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\" class=\"ui-corner-top\">\r\n");
      out.write("    <div id=\"footerLeftBar\">\r\n");
      out.write("        Air-Dynasty Aircraft Management System.  \r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"footerRightBar\">\r\n");
      out.write("        Copyright Notice.\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
