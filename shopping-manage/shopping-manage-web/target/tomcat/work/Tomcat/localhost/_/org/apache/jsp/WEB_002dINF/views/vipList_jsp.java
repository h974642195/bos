/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-12-08 07:08:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vipList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("\t\t<title>会员列表</title>\r\n");
      out.write("\t\t<!--tab图标引入-->\r\n");
      out.write("\t\t<!--bootstrap样式表引入-->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/bootstrapbread.min.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../../css/bootstrap-datetimepicker.min.css\">\r\n");
      out.write("\t\t<!--自定义样式引入-->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/menu.css\" />\r\n");
      out.write("\t\t<!--jquery引入-->\r\n");
      out.write("\t\t<script src=\"../../js/jquery-1.10.1.min.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\t\t<!--bootstrapjs引入-->\r\n");
      out.write("\t\t<script src=\"../../js/bootstrapbread.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../../js/bootstrap-datetimepicker.min.js\"></script>\r\n");
      out.write("\t\t<!--自定义js引入-->\r\n");
      out.write("\t\t<script src=\"../../js/index.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<!---------------------------------------------内容部分---------------------->\r\n");
      out.write("\t\t<div id=\"main\" >\r\n");
      out.write("\t\t\t<!----------------头部---------------------------->\r\n");
      out.write("\t\t\t<div id=\"content-top\" >\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"content-top-list\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<ul class=\"breadcrumb\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">会员管理</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\">会员列表</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!----------------会员列表----------------------------->\r\n");
      out.write("\t\t\t<div class=\"vip-list\">\r\n");
      out.write("\t\t\t\t<table class=\"bgc\" width=\"100%\" cellspacing=\"10%\" cellpadding=\"10\" id=\"vip-list-condition\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t注册来源：\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"phone\">手机号注册</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"phone\">手机号注册</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"phone\">手机号注册</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"phone\">手机号注册</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t会员编号：\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t真实姓名：\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t会员手机：\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t会员邮箱：\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t会员积分：\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t会员等级：\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"5\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clear\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-append date form_datetime fl\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t会员生日：<input style=\"border: none; background: none;\" size=\"16\" type=\"text\" value=\"\" readonly>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"add-on\"><i class=\"icon-calendar\"><img src=\"../../img/u1029.png\" alt=\"\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"margin-left: 5px\" class=\"input-append date form_datetime1 fl\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t至<input style=\"border: none; background: none;\" size=\"16\" type=\"text\" value=\"\" readonly>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"add-on\"><i class=\"icon-calendar\"><img src=\"../../img/u1029.png\" alt=\"\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-append date form_datetime fl\" style=\"margin-left: 50px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t注册时间：<input style=\"border: none; background: none;\" size=\"16\" type=\"text\" value=\"\" readonly>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"add-on\"><i class=\"icon-calendar\"><img src=\"../../img/u1029.png\" alt=\"\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"margin-left: 5px\" class=\"input-append date form_datetime1 fl\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t至<input style=\"border: none; background: none;\" size=\"16\" type=\"text\" value=\"\" readonly>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"add-on\"><i class=\"icon-calendar\"><img src=\"../../img/u1029.png\" alt=\"\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"vip-list-serch fl\" style=\"margin-left:50px ;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn btn-primary magl10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t搜索\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn btn-default magl10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t导出Excel表\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<p> </p>\r\n");
      out.write("\t\t\t\t<table border=\"1\" cellspacing=\"10%\" cellpadding=\"10\" width=\"100%\" style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t<tr class=\"tableholor\">\r\n");
      out.write("\t\t\t\t\t\t<th><input type=\"checkbox\" /></th>\r\n");
      out.write("\t\t\t\t\t\t<th>序号</th>\r\n");
      out.write("\t\t\t\t\t\t<th>注册来源</th>\r\n");
      out.write("\t\t\t\t\t\t<th>会员编号</th>\r\n");
      out.write("\t\t\t\t\t\t<th>手机号</th>\r\n");
      out.write("\t\t\t\t\t\t<th>邮箱</th>\r\n");
      out.write("\t\t\t\t\t\t<th>真实姓名</th>\r\n");
      out.write("\t\t\t\t\t\t<th>会员积分</th>\r\n");
      out.write("\t\t\t\t\t\t<th>会员等级</th>\r\n");
      out.write("\t\t\t\t\t\t<th>注册时间</th>\r\n");
      out.write("\t\t\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"checkbox\" /></td>\r\n");
      out.write("\t\t\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t\t\t<td>手机号注册</td>\r\n");
      out.write("\t\t\t\t\t\t<td>20170001</td>\r\n");
      out.write("\t\t\t\t\t\t<td>18301888685</td>\r\n");
      out.write("\t\t\t\t\t\t<td>achette@google.com</td>\r\n");
      out.write("\t\t\t\t\t\t<td>amy</td>\r\n");
      out.write("\t\t\t\t\t\t<td>1306</td>\r\n");
      out.write("\t\t\t\t\t\t<td>LV1</td>\r\n");
      out.write("\t\t\t\t\t\t<td>2017-09-10<br />12:00:00</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"membershipDetails.html\">查看</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<div class=\"list-page\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">上一页</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">1</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">2</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">3</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">4</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">5</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">下一页</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- vip-list-->\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
