/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2018-12-31 12:08:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages.system;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/D:/ssms/apache-tomcat-8.5.37/webapps/ScoreManager/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1523600116000L));
    _jspx_dependants.put("jar:file:/D:/ssms/apache-tomcat-8.5.37/webapps/ScoreManager/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt-1_0-rt.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/pages/system/base.jsp", Long.valueOf(1523600116000L));
    _jspx_dependants.put("jar:file:/D:/ssms/apache-tomcat-8.5.37/webapps/ScoreManager/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153356282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plug-in/easyui-1.4.1/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plug-in/easyui-1.4.1/themes/icon.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/jquery/jquery-1.11.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/easyui-1.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/easyui-1.4.1/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/easyui-1.4.1/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/system/validform.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/system/curdtools.js\"></script>\r\n");
      out.write("<!--  \r\n");
      out.write("<script type=\"text/javascript\" src=\"js/system/forbiddenutil.js\"></script>\r\n");
      out.write("-->");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<meta HTTP-EQUIV=\"pragma\" CONTENT=\"no-cache\"> \r\n");
      out.write("\t<meta HTTP-EQUIV=\"Cache-Control\" CONTENT=\"no-cache, must-revalidate\"> \r\n");
      out.write("\t<meta HTTP-EQUIV=\"expires\" CONTENT=\"0\"> \r\n");
      out.write("\t<title>学生信息管理系统</title>\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body  class=\"easyui-layout\">\r\n");
      out.write("\r\n");
      out.write("<!-- 顶部-->\r\n");
      out.write("<div region=\"north\" border=\"false\" title=\"\" style=\"BACKGROUND: #A8D7E9; height: 50px; padding: 1px; overflow: hidden;\">\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"left\" style=\"vertical-align: text-bottom\"><img src=\"image/common/name.png\">\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td align=\"right\" nowrap>\r\n");
      out.write("\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t<tr style=\"height: 25px;\" align=\"right\">\r\n");
      out.write("\t\t\t\t<td style=\"\" colspan=\"2\">\r\n");
      out.write("\t\t\t\t<div style=\"background: url(image/common/top_bg.jpg) no-repeat right center; float: right;\">\r\n");
      out.write("\t\t\t\t<div style=\"float: left; line-height: 25px; margin-left: 70px;\"><span style=\"color: #386780\">当前用户:</span> <span style=\"color: #FFFFFF\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>&nbsp;&nbsp;&nbsp;&nbsp; <span\r\n");
      out.write("\t\t\t\t\tstyle=\"color: #386780\">其他:</span> <span style=\"color: #FFFFFF\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roleName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span></div>\r\n");
      out.write("\t\t\t\t<div style=\"float: left; margin-left: 18px;\">\r\n");
      out.write("\t\t\t\t<div style=\"right: 0px; bottom: 0px;\"><a href=\"javascript:void(0);\" class=\"easyui-menubutton\" menu=\"#layout_north_zxMenu\" iconCls=\"icon-exit\" style=\"color: #FFFFFF\">注销</a></div>\r\n");
      out.write("\t\t\t\t<div id=\"layout_north_zxMenu\" style=\"width: 100px; display: none;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"menu-sep\"></div>\r\n");
      out.write("\t\t\t\t\t<div onclick=\"exit('loginController.do?logout','确定退出该系统吗 ?');\">退出系统</div>\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr style=\"height: 80px;\">\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t<ul class=\"shortcut\">\r\n");
      out.write("\t\t\t\t\t<!-- 动态生成并赋值过来 -->\r\n");
      out.write("\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${primaryMenuList }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div data-options=\"region:'west',split:true,title:'导航菜单'\" style=\"width:150px;padding:10px;\">\r\n");
      out.write("\t\t<ul id=\"subMenus\" class=\"easyui-tree\" \r\n");
      out.write("\t\t\tdata-options=\"url:'loginController.do?getTreeMenu',\r\n");
      out.write("\t\t\t\t\t\tmethod:'get',animate:true,\r\n");
      out.write("\t\t\t\t\t\tonClick: function(node){\r\n");
      out.write("\t\t\t\t\t\t\topenTab(node.text, node.attributes.href);\r\n");
      out.write("\t\t\t\t\t\t}\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t <div data-options=\"region:'east',split:true,collapsed:true,title:'小工具'\" style=\"width:280px;padding:10px;\">\r\n");
      out.write("\t \t<div class=\"easyui-calendar\" style=\"width:250px;height:250px;\"></div>\r\n");
      out.write("\t \t\r\n");
      out.write("\t </div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div data-options=\"region:'center',title:'首页'\">\r\n");
      out.write("\t\t<div id=\"main-tabs\" class=\"easyui-tabs\" data-options=\"fit:true,border:false,plain:true\">\r\n");
      out.write("\t\t\t<div class=\"easyui-tab\" title=\"首页\" href=\"loginController.do?home\" style=\"padding: 2px;overflow: hidden; \"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/admin/logout\"><i class=\"icon-key\"></i> Log Out</a>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 底部 -->\r\n");
      out.write("\t<div region=\"south\" border=\"false\" style=\"height: 25px; overflow: hidden;\">\r\n");
      out.write("\t<div align=\"center\" style=\"color: #CC99FF; padding-top: 2px\">&copy; 版权所有 <span class=\"tip\"><a href=\"http://localhost:8080/ScoreManager\" title=\"liaozhongxiang\">16272124  廖忠祥</a>  </span></div>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"mm\" class=\"easyui-menu\" style=\"width: 150px;\">\r\n");
      out.write("<div id=\"mm-tabupdate\">刷新</div>\r\n");
      out.write("<div id=\"mm-tabclose\">关闭</div>\r\n");
      out.write("<div id=\"mm-tabcloseall\">全部关闭</div>\r\n");
      out.write("<div id=\"mm-tabcloseother\">除此之外全部关闭</div>\r\n");
      out.write("<div class=\"menu-sep\"></div>\r\n");
      out.write("<div id=\"mm-tabcloseright\">当前页右侧全部关闭</div>\r\n");
      out.write("<div id=\"mm-tabcloseleft\">当前页左侧全部关闭</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction openTab(title, url) {\r\n");
      out.write("\t\t\tif(\"/\" != url){\r\n");
      out.write("\t\t\t\tvar mainTabs = $(\"#main-tabs\");\r\n");
      out.write("\t\t\t\tif (mainTabs.tabs('exists', title)) {\r\n");
      out.write("\t\t\t\t\tmainTabs.tabs('select', title);\r\n");
      out.write("\t\t\t\t\tvar iframeContext = mainTabs.tabs('getTab', title).find(\"iframe\");\r\n");
      out.write("\t\t\t\t\tif(iframeContext){\r\n");
      out.write("\t\t\t\t\t\tiframeContext[0].src = url\r\n");
      out.write("\t\t\t\t\t} \r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tmainTabs.tabs('add', {\r\n");
      out.write("\t\t\t\t\t\ttitle : title,\r\n");
      out.write("\t\t\t\t\t\tcontent : createFrame(url),\r\n");
      out.write("\t\t\t\t\t\tclosable : true\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction createFrame(url) {\r\n");
      out.write("\t\t\tvar s = '<iframe name=\"mainFrame\" scrolling=\"auto\" frameborder=\"no\" border=\"0\" marginwidth=\"0\" marginheight=\"0\"  allowtransparency=\"yes\" src=\"'\r\n");
      out.write("\t\t\t\t\t+ url + '\" style=\"width:100%;height:99%;\"></iframe>';\r\n");
      out.write("\t\t\treturn s;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
