package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewEngInspec_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(4);
    _jspx_dependants.add("/WEB-INF/jspf/header.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/../view/includeS.jsp");
    _jspx_dependants.add("/WEB-INF/view/includeS.jsp");
    _jspx_dependants.add("/WEB-INF/jspf/footer.jspf");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("        <style type=\"text/css\" title=\"currentStyle\">\r\n");
      out.write("            @import \"media/css/demo_page.css\";\r\n");
      out.write("            @import \"media/css/demo_table.css\";\r\n");
      out.write("            @import \"css/smoothness/jquery-ui-1.8.16.custom.css\";\r\n");
      out.write("            @import \"design/airdyna.css\";\r\n");
      out.write("        </style>\r\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\" src=\"media/js/jquery.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\" src=\"media/js/jquery.dataTables.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-ui-1.8.16.custom.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"design/airdyna.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<div id=\"header\" >\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"headerTopBar\" class=\"ui-corner-top\">\r\n");
      out.write("        <div id=\"headerLinks\">\r\n");
      out.write("            Header links\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"headerLoginBar\">\r\n");
      out.write("            Header User Info    \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"headerMainBar\" class=\"ui-corner-bottom\">\r\n");
      out.write("        <img src=\"images/logo.jpg\" id=\"headerImage\" />\r\n");
      out.write("        <div id=\"headerTitle\">\r\n");
      out.write("            Aircraft Management System\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Air Dynasty - Air Frame and Engine Inspection Records </title>\r\n");
      out.write("        ");
      out.write("        <style type=\"text/css\" title=\"currentStyle\">\r\n");
      out.write("            @import \"media/css/demo_page.css\";\r\n");
      out.write("            @import \"media/css/demo_table.css\";\r\n");
      out.write("            @import \"css/smoothness/jquery-ui-1.8.16.custom.css\";\r\n");
      out.write("            @import \"design/airdyna.css\";\r\n");
      out.write("        </style>\r\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\" src=\"media/js/jquery.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\" src=\"media/js/jquery.dataTables.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-ui-1.8.16.custom.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"design/airdyna.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("      <body id=\"dt_example\">\r\n");
      out.write("        <h1>Air Frame and Engine Inspection records</h1>\r\n");
      out.write("        ");
int i=1;
      out.write("\r\n");
      out.write("    <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"display\" id=\"example\"> \r\n");
      out.write("        <thead> \r\n");
      out.write("        <tr class=\"gradeA\">\r\n");
      out.write("             <th>Sr. No.</th><th>Nomenclature</th><th>Due Air Frame Hrs.</th><th>Due Engine Hrs.</th>\r\n");
      out.write("             <th>Calender Due Date</th><th>Time Remained(Hrs or Date)</th>   \r\n");
      out.write("        </tr> </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("        ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setVar("eiSet");
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EngInspSet}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("        <tr class=\"gradeA\">\r\n");
            out.write("            <td class=\"center\">");
            out.print(i++);
            out.write("</td><td class=\"center\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eiSet.aesNomenclature}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td><td class=\"center\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eiSet.aesDueAfHrs}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("            <td class=\"center\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eiSet.aesDueEngHrs}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td><td class=\"center\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eiSet.aesCalDueDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td><td class=\"center\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eiSet.aesDueTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("        </tr>\r\n");
            out.write("        ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li><a href=\"/AirDynasty/addEIRec.jsp\">Add New Record</a></li>\r\n");
      out.write("        <li><a href=\"/AirDynasty/viewCraftList\">Back to AirCraft List</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <style type=\"text/css\" title=\"currentStyle\">\r\n");
      out.write("            @import \"media/css/demo_page.css\";\r\n");
      out.write("            @import \"media/css/demo_table.css\";\r\n");
      out.write("            @import \"css/smoothness/jquery-ui-1.8.16.custom.css\";\r\n");
      out.write("            @import \"design/airdyna.css\";\r\n");
      out.write("        </style>\r\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\" src=\"media/js/jquery.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\" src=\"media/js/jquery.dataTables.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-ui-1.8.16.custom.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"design/airdyna.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"footerBar\">\r\n");
      out.write("    Footer Bar\r\n");
      out.write("</div>\r\n");
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
