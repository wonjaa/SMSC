package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<header id=\"header\" class=\"alt reveal\">\r\n");
      out.write("\t\t\t\t<h1><a href=\"#\">Alpha</a></h1>\r\n");
      out.write("\t\t\t\t<nav id=\"nav\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li style=\"white-space: nowrap;\"><a href=\"index.html\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"opener\" style=\"-webkit-user-select: none; cursor: pointer; white-space: nowrap;\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"\" class=\"icon fa-angle-down\">Layouts</a>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"\" style=\"-webkit-user-select: none; display: none; position: absolute;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"white-space: nowrap;\"><a href=\"#\" style=\"display: block;\">Generic</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"white-space: nowrap;\"><a href=\"#\" style=\"display: block;\">Contact</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"white-space: nowrap;\"><a href=\"#l\" style=\"display: block;\">Elements</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"opener\" style=\"-webkit-user-select: none; cursor: pointer; white-space: nowrap;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"\" style=\"display: block;\">Submenu</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropotron\" style=\"-webkit-user-select: none; display: none; position: absolute;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li style=\"white-space: nowrap;\"><a href=\"#\" style=\"display: block;\">Option One</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li style=\"white-space: nowrap;\"><a href=\"#\" style=\"display: block;\">Option Two</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li style=\"white-space: nowrap;\"><a href=\"#\" style=\"display: block;\">Option Three</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li style=\"white-space: nowrap;\"><a href=\"#\" style=\"display: block;\">Option Four</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t<li style=\"white-space: nowrap;\"><a href=\"#\" class=\"button\" style=\"color:#000;\">Sign Up</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t</header>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
