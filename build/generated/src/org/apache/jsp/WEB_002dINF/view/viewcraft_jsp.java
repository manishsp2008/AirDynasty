package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.shiro.SecurityUtils;
import java.util.Calendar;
import airdynasty.CmpSerialNumber;
import java.util.Set;
import airdynasty.Components;

public final class viewcraft_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(4);
    _jspx_dependants.add("/WEB-INF/view/include.jsp");
    _jspx_dependants.add("/WEB-INF/view/includeS.jsp");
    _jspx_dependants.add("/WEB-INF/view/header.jsp");
    _jspx_dependants.add("/WEB-INF/view/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_guest;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_user;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_principal_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_var_value_pattern_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_shiro_guest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_shiro_user = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_shiro_principal_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_var_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_shiro_guest.release();
    _jspx_tagPool_shiro_user.release();
    _jspx_tagPool_shiro_principal_nobody.release();
    _jspx_tagPool_fmt_formatDate_var_value_pattern_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_otherwise.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Air Dynasty - Air Craft Details</title>\r\n");
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
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"wrap\">\r\n");
      out.write("        ");
      out.write("<div id=\"header\" class=\"ui-corner-bottom\">\r\n");
      out.write("     <div id=\"headerTopBar\" class=\"ui-corner-top\">\r\n");
      out.write("        <div id=\"headerLinks\">\r\n");
      out.write("            <a href=\"/AirDynasty/\" >Home</a> &emsp; <a href=\"/AirDynasty/viewCraftList\">Aircraft List</a> &emsp; <a href=\"/AirDynasty/Help.jsp\">Help</a> &emsp;\r\n");
      out.write("            <a href=\"about.jsp\">About</a>\r\n");
      out.write("        </div>\r\n");
      out.write("         <div id=\"headerLoginBar\">\r\n");
      out.write("            Hello,&nbsp;");
      if (_jspx_meth_shiro_guest_0(_jspx_page_context))
        return;
      if (_jspx_meth_shiro_user_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            &nbsp;|&nbsp;\r\n");
      out.write("            ( ");
      if (_jspx_meth_shiro_user_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_shiro_guest_1(_jspx_page_context))
        return;
      out.write(" )\r\n");
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
      out.write("\r\n");
      out.write("        <div id=\"dt_example\" >\r\n");
      out.write("     \r\n");
      out.write("        <h1>Aircraft Details Page</h1>\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"CraftTitle\">\r\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${craftObj.acName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        ");
      //  fmt:formatDate
      org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_var_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
      _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_formatDate_0.setParent(null);
      _jspx_th_fmt_formatDate_0.setPattern("dd-MM-yyyy");
      _jspx_th_fmt_formatDate_0.setValue( Calendar.getInstance().getTime() );
      _jspx_th_fmt_formatDate_0.setVar("sysDate");
      int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
      if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_formatDate_var_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
        return;
      }
      _jspx_tagPool_fmt_formatDate_var_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
      out.write("\r\n");
      out.write(" <div class=\"ui-widget\" >\r\n");
      out.write("\t\r\n");
      out.write("     <div style=\"margin-top: 20px; padding: 0pt 0.7em;\" class=\"ui-state-highlight ui-corner-all\"> \r\n");
      out.write("\t\t\t\r\n");
      out.write("        <div id=\"myContainer\">\r\n");
      out.write("            <div id=\"row\">\r\n");
      out.write("\r\n");
      out.write("                <div id=\"left1\">\r\n");
      out.write("                <p>Form Number : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${craftObj.acFormnum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                <p>&nbsp;</p>\r\n");
      out.write("                <p>AirFrame Hours : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${craftObj.acAfhrs}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"left2\">\r\n");
      out.write("                <p>Landing Count : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${craftObj.acLandingcount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                <p>&nbsp;</p>\r\n");
      out.write("                <p>Engine N/G Cycles : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${craftObj.acEngngcycs}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div id=\"middle\">\r\n");
      out.write("                <p>Date : ");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("</p>\r\n");
      out.write("                <p>&nbsp;</p>\r\n");
      out.write("                <p>Engine Hours : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${craftObj.acEnghrs}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"right\">\r\n");
      out.write("                <p>Start Count : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${craftObj.acStartcount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                <p>&nbsp;</p>\r\n");
      out.write("                <p>Engine N/P Cycles : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${craftObj.acNpcycs}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("        \r\n");
      out.write("        <h2>Components</h2>\r\n");
      out.write("        ");
int i=1;
      out.write("\r\n");
      out.write("        <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"display\" id=\"example\">\r\n");
      out.write("        <thead>\r\n");
      out.write("        <tr class=\"gradeA\"><th>Sr. No.</th><th>Component Name</th><th>Part No.</th>\r\n");
      out.write("        <th>Installation Due Off Hours</th><th>Current Air Frame Hours</th><th>Remaining Life Hours</th>\r\n");
      out.write("        <th>Remarks</th></tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("        ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setVar("comp");
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${craftComps}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("        \r\n");
            out.write("        ");
            if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\r\n");
            out.write("        ");
            if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\r\n");
            out.write("        ");
            if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\r\n");
            out.write("        ");
            if (_jspx_meth_c_set_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\r\n");
            out.write("        \r\n");
            out.write("        ");
            //  c:forEach
            org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
            _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
            _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
            _jspx_th_c_forEach_1.setVarStatus("loop");
            _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${idoList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
            int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
            try {
              int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
              if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("            \r\n");
                  out.write("        <tr class=\"gradeA\"><td class=\"center\">");
                  out.print(i++);
                  out.write("</td><td class=\"center\">");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${comp.compPartname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("</td><td class=\"center\">");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${comp.compPartnum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("</td>\r\n");
                  out.write("            \r\n");
                  out.write("            <td class=\"center\">\r\n");
                  out.write("                    ");
                  if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
                    return;
                  out.write("<br/>\r\n");
                  out.write("            </td>\r\n");
                  out.write("            <td class=\"center\">\r\n");
                  out.write("                    ");
                  if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
                    return;
                  out.write("<br/>\r\n");
                  out.write("            </td>\r\n");
                  out.write("            <td class=\"center\">\r\n");
                  out.write("                    ");
                  if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
                    return;
                  out.write("<br/>\r\n");
                  out.write("            </td>\r\n");
                  out.write("            <td class=\"center\">\r\n");
                  out.write("                    ");
                  if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
                    return;
                  out.write("<br/>\r\n");
                  out.write("            </td>\r\n");
                  out.write("            \r\n");
                  out.write("        </tr>\r\n");
                  out.write("        \r\n");
                  out.write("        ");
                  int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_c_forEach_1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_c_forEach_1.doFinally();
              _jspx_tagPool_c_forEach_varStatus_items.reuse(_jspx_th_c_forEach_1);
            }
            out.write("\r\n");
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
      out.write("        </table>\r\n");
      out.write("        <br/>\r\n");
      out.write("        <h3>Related Operations</h3>\r\n");
      out.write("        \r\n");
      out.write("        <table style=\"margin : 0 auto;\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td style=\"width: 25%;text-align: center\">\r\n");
      out.write("                    <button id=\"viewEIR\" class=\"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only\" onclick=\"window.location='/AirDynasty/viewEngInspec' \">\r\n");
      out.write("                        <span class=\"ui-button-text\">A/F & Engine IR</span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </td>   \r\n");
      out.write("                <td style=\"width: 25%; text-align: center\">\r\n");
      out.write("                    <button id=\"viewEIR\" class=\"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only\" onclick=\"window.location='/AirDynasty/viewOAFCIntvl' \">\r\n");
      out.write("                        <span class=\"ui-button-text\">Oil & Fuel CR</span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td style=\"width: 25%; text-align: center\">\r\n");
      out.write("                    <button id=\"viewEIR\" class=\"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only\" onclick=\"window.location='/AirDynasty/viewOPMRec' \">\r\n");
      out.write("                        <span class=\"ui-button-text\">Out of Phase MR</span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("       \r\n");
      out.write("        <h3>Manipulate Component Records</h3>\r\n");
      out.write("\r\n");
      out.write("       <table style=\"margin : 0 auto;\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td style=\"width: 25%; text-align: left\">            \r\n");
      out.write("                ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("                <td style=\"width: 25%;text-align: center\">\r\n");
      out.write("                    <button id=\"viewEIR\" class=\"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only\" onclick=\"window.location='/AirDynasty/addCmpRec.jsp' \">\r\n");
      out.write("                            <span class=\"ui-button-text\">Add Component Record</span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\" class=\"ui-corner-top\">\r\n");
      out.write("    <div id=\"footerLeftBar\">\r\n");
      out.write("        Air Dynasty Aircraft Management System.  \r\n");
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
        out.write("Guest");
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

  private boolean _jspx_meth_shiro_user_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:user
    org.apache.shiro.web.tags.UserTag _jspx_th_shiro_user_0 = (org.apache.shiro.web.tags.UserTag) _jspx_tagPool_shiro_user.get(org.apache.shiro.web.tags.UserTag.class);
    _jspx_th_shiro_user_0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_user_0.setParent(null);
    int _jspx_eval_shiro_user_0 = _jspx_th_shiro_user_0.doStartTag();
    if (_jspx_eval_shiro_user_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_shiro_principal_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_shiro_user_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_shiro_user_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_user_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_user.reuse(_jspx_th_shiro_user_0);
      return true;
    }
    _jspx_tagPool_shiro_user.reuse(_jspx_th_shiro_user_0);
    return false;
  }

  private boolean _jspx_meth_shiro_principal_0(javax.servlet.jsp.tagext.JspTag _jspx_th_shiro_user_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:principal
    org.apache.shiro.web.tags.PrincipalTag _jspx_th_shiro_principal_0 = (org.apache.shiro.web.tags.PrincipalTag) _jspx_tagPool_shiro_principal_nobody.get(org.apache.shiro.web.tags.PrincipalTag.class);
    _jspx_th_shiro_principal_0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_principal_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_shiro_user_0);
    int _jspx_eval_shiro_principal_0 = _jspx_th_shiro_principal_0.doStartTag();
    if (_jspx_th_shiro_principal_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_principal_nobody.reuse(_jspx_th_shiro_principal_0);
      return true;
    }
    _jspx_tagPool_shiro_principal_nobody.reuse(_jspx_th_shiro_principal_0);
    return false;
  }

  private boolean _jspx_meth_shiro_user_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:user
    org.apache.shiro.web.tags.UserTag _jspx_th_shiro_user_1 = (org.apache.shiro.web.tags.UserTag) _jspx_tagPool_shiro_user.get(org.apache.shiro.web.tags.UserTag.class);
    _jspx_th_shiro_user_1.setPageContext(_jspx_page_context);
    _jspx_th_shiro_user_1.setParent(null);
    int _jspx_eval_shiro_user_1 = _jspx_th_shiro_user_1.doStartTag();
    if (_jspx_eval_shiro_user_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<a href=\"/AirDynasty/logout.jsp\">Log out</a>");
        int evalDoAfterBody = _jspx_th_shiro_user_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_user_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_user.reuse(_jspx_th_shiro_user_1);
      return true;
    }
    _jspx_tagPool_shiro_user.reuse(_jspx_th_shiro_user_1);
    return false;
  }

  private boolean _jspx_meth_shiro_guest_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:guest
    org.apache.shiro.web.tags.GuestTag _jspx_th_shiro_guest_1 = (org.apache.shiro.web.tags.GuestTag) _jspx_tagPool_shiro_guest.get(org.apache.shiro.web.tags.GuestTag.class);
    _jspx_th_shiro_guest_1.setPageContext(_jspx_page_context);
    _jspx_th_shiro_guest_1.setParent(null);
    int _jspx_eval_shiro_guest_1 = _jspx_th_shiro_guest_1.doStartTag();
    if (_jspx_eval_shiro_guest_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<a href=\"/AirDynasty/login.jsp\">Log in</a>");
        int evalDoAfterBody = _jspx_th_shiro_guest_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_guest_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_guest.reuse(_jspx_th_shiro_guest_1);
      return true;
    }
    _jspx_tagPool_shiro_guest.reuse(_jspx_th_shiro_guest_1);
    return false;
  }

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sysDate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_0.setVar("idoList");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${comp.compDueoffAfhrsInstArray}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_1.setVar("cahList");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${comp.cmpCurAfhrsArray}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_2.setVar("rlList");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${comp.compRemLifeArray}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_set_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_3.setVar("remList");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${comp.cmpRemarksArray}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${idoList[loop.index]}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cahList[loop.index]}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rlList[loop.index]}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${remList[loop.index]}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("                    ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acID % 2 == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <button id=\"viewEIR\" class=\"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only\" onclick=\"window.location='/AirDynasty/addEngHrs.jsp' \">\r\n");
        out.write("                            <span class=\"ui-button-text\">Add Engine Hours</span>\r\n");
        out.write("                        </button>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <button id=\"viewEIR\" class=\"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only\" onclick=\"window.location='/AirDynasty/addHours.jsp' \">\r\n");
        out.write("                            <span class=\"ui-button-text\">Add Aircraft Hours</span>\r\n");
        out.write("                        </button>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
