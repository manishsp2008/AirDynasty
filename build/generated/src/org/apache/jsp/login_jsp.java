package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.shiro.SecurityUtils;
import java.util.Calendar;
import airdynasty.CmpSerialNumber;
import java.util.Set;
import airdynasty.Components;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/include.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_guest;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_shiro_guest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_shiro_guest.release();
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<h2>Please Log in</h2>\r\n");
      out.write("\r\n");
      if (_jspx_meth_shiro_guest_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form name=\"loginform\" action=\"\" method=\"post\">\r\n");
      out.write("    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"3\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>Username:</td>\r\n");
      out.write("            <td><input type=\"text\" name=\"username\" maxlength=\"30\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>Password:</td>\r\n");
      out.write("            <td><input type=\"password\" name=\"password\" maxlength=\"30\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td colspan=\"2\" align=\"left\"><input type=\"checkbox\" name=\"rememberMe\"><font size=\"2\">Remember Me</font></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td colspan=\"2\" align=\"right\"><input type=\"submit\" name=\"submit\" value=\"Login\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("</form>\r\n");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("css/style.css");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_shiro_guest_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:guest
    org.apache.shiro.web.tags.GuestTag _jspx_th_shiro_guest_0 = (org.apache.shiro.web.tags.GuestTag) _jspx_tagPool_shiro_guest.get(org.apache.shiro.web.tags.GuestTag.class);
    _jspx_th_shiro_guest_0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_guest_0.setParent(null);
    int _jspx_eval_shiro_guest_0 = _jspx_th_shiro_guest_0.doStartTag();
    if (_jspx_eval_shiro_guest_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    <p>Here are a few sample accounts to play with in the default text-based Realm (used for this\r\n");
        out.write("        demo and test installs only). Do you remember the movie these names came from? ;)</p>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("    <style type=\"text/css\">\r\n");
        out.write("        table.sample {\r\n");
        out.write("            border-width: 1px;\r\n");
        out.write("            border-style: outset;\r\n");
        out.write("            border-color: blue;\r\n");
        out.write("            border-collapse: separate;\r\n");
        out.write("            background-color: rgb(255, 255, 240);\r\n");
        out.write("        }\r\n");
        out.write("\r\n");
        out.write("        table.sample th {\r\n");
        out.write("            border-width: 1px;\r\n");
        out.write("            padding: 1px;\r\n");
        out.write("            border-style: none;\r\n");
        out.write("            border-color: blue;\r\n");
        out.write("            background-color: rgb(255, 255, 240);\r\n");
        out.write("        }\r\n");
        out.write("\r\n");
        out.write("        table.sample td {\r\n");
        out.write("            border-width: 1px;\r\n");
        out.write("            padding: 1px;\r\n");
        out.write("            border-style: none;\r\n");
        out.write("            border-color: blue;\r\n");
        out.write("            background-color: rgb(255, 255, 240);\r\n");
        out.write("        }\r\n");
        out.write("    </style>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("    <table class=\"sample\">\r\n");
        out.write("        <thead>\r\n");
        out.write("        <tr>\r\n");
        out.write("            <th>Username</th>\r\n");
        out.write("            <th>Password</th>\r\n");
        out.write("        </tr>\r\n");
        out.write("        </thead>\r\n");
        out.write("        <tbody>\r\n");
        out.write("        <tr>\r\n");
        out.write("            <td>root</td>\r\n");
        out.write("            <td>secret</td>\r\n");
        out.write("        </tr>\r\n");
        out.write("        <tr>\r\n");
        out.write("            <td>presidentskroob</td>\r\n");
        out.write("            <td>12345</td>\r\n");
        out.write("        </tr>\r\n");
        out.write("        <tr>\r\n");
        out.write("            <td>darkhelmet</td>\r\n");
        out.write("            <td>ludicrousspeed</td>\r\n");
        out.write("        </tr>\r\n");
        out.write("        <tr>\r\n");
        out.write("            <td>lonestarr</td>\r\n");
        out.write("            <td>vespa</td>\r\n");
        out.write("        </tr>\r\n");
        out.write("        </tbody>\r\n");
        out.write("    </table>\r\n");
        out.write("    <br/><br/>\r\n");
        int evalDoAfterBody = _jspx_th_shiro_guest_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_guest_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_guest.reuse(_jspx_th_shiro_guest_0);
      return true;
    }
    _jspx_tagPool_shiro_guest.reuse(_jspx_th_shiro_guest_0);
    return false;
  }
}
