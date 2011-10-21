package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<div id=\"header\" class=\"ui-corner-bottom\">\r\n");
      out.write("     <div id=\"headerTopBar\" class=\"ui-corner-top\">\r\n");
      out.write("        <div id=\"headerLinks\">\r\n");
      out.write("            <a href=\"/AirDynasty/\" >Home</a> &emsp; <a href=\"/AirDynasty/viewCraftList\">Aircraft List</a> &emsp; <a href=\"/AirDynasty/Help.jsp\">Help</a> &emsp;\r\n");
      out.write("            <a href=\"about.jsp\">About</a>\r\n");
      out.write("        </div>\r\n");
      out.write("         <div id=\"headerLoginBar\">\r\n");
      out.write("            Hello,&nbsp;<shiro:guest>Guest</shiro:guest><shiro:user><shiro:principal/></shiro:user>\r\n");
      out.write("            &nbsp;|&nbsp;\r\n");
      out.write("            ( <shiro:user><a href=\"/AirDynasty/logout.jsp\">Log out</a></shiro:user>\r\n");
      out.write("            <shiro:guest><a href=\"/AirDynasty/login.jsp\">Log in</a></shiro:guest> )\r\n");
      out.write("        </div>\r\n");
      out.write("     </div>\r\n");
      out.write("    \r\n");
      out.write("     <div id=\"headerMainBar\" class=\"ui-corner-bottom\" >\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"headerImage\" class=\"ui-corner-all\">\r\n");
      out.write("            <div id=\"headerImageBox\" ></div>\r\n");
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
      out.write("     </div>\r\n");
      out.write("</div>");
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
