package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems_005fbegin;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems_005fbegin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems_005fbegin.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

	request.setCharacterEncoding("UTF-8");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if IE 8]> <html lang=\"en\" class=\"ie8\"> <![endif]-->\n");
      out.write("<!--[if IE 9]> <html lang=\"en\" class=\"ie9\"> <![endif]-->\n");
      out.write("<!--[if !IE]><!-->\n");
      out.write("<html lang=\"en\">\n");
      out.write("<!--<![endif]-->\n");
      out.write("<head>\n");
      out.write("<title>SMSC | Spring MVC Source Customizing</title>\n");
      out.write("\n");
      out.write("<!-- Meta -->\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<META HTTP-EQUIV=\"contentType\" CONTENT=\"text/html;charset=UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("<!-- Favicon -->\n");
      out.write("<link rel=\"shortcut icon\" href=\"favicon.ico\">\n");
      out.write("\n");
      out.write("<!-- CSS Global Compulsory -->\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/assets/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<div class=\"container\" style=\"padding-top:70px;\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-md-offset-1 col-md-10 col-md-offset-1\">\n");
      out.write("\t\t\t\t\t<div class=\"pull-right\" style=\"padding: 20px 10px 20px 0;\">\n");
      out.write("\t\t\t\t\t\t로그인 성공! <b>[");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userInfo.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("님]</b> 환영합니다.<br />\n");
      out.write("\t\t\t\t\t\t<div style=\"float: right;\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"logout\">로그아웃</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<table class=\"table table-hover\">\n");
      out.write("\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<th class=\"col-md-1\">상품번호</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th class=\"col-md-3\">상품명</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th class=\"col-md-4\">설명</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th class=\"col-md-1\">재고</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th class=\"col-md-3\">수정/삭제</th> \n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t<div class=\"row\" style=\"float: right;\">\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-warning\"\n");
      out.write("\t\t\t\t\t\t\tonclick=\"javascript:location.href='new_product';\">상품등록</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--/row-->\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- JS Global Compulsory -->\n");
      out.write("\t<script type=\"text/javascript\"\n");
      out.write("\t\tsrc=\"http://code.jquery.com/jquery-1.10.2.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\"\n");
      out.write("\t\tsrc=\"http://code.jquery.com/jquery-migrate-1.2.1.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\"\n");
      out.write("\t\tsrc=\"resources/assets/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\tjQuery(document).ready(function() {\n");
      out.write("\t\t\tApp.init();\n");
      out.write("\t\t\tContactPage.initMap();\n");
      out.write("\t\t\tCirclesMaster.initCirclesMaster1();\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("    <script src=\"./resources/assets/plugins/respond.js\"></script>\n");
      out.write("    <script src=\"./resources/assets/plugins/html5shiv.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems_005fbegin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/productlist.jsp(61,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("productlist");
    // /WEB-INF/views/productlist.jsp(61,7) name = begin type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setBegin(0);
    // /WEB-INF/views/productlist.jsp(61,7) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/productlist.jsp(61,7) '${productList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${productList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/productlist.jsp(61,7) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productlist.product_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productlist.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productlist.desc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productlist.number}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t<td><button class=\"btn btn-primary\"\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tonclick=\"javascript:location.href='productlist/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productlist.product_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("';\">수정</button>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-warning\"\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tonclick=\"javascript:location.href='delete/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productlist.product_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("'\">삭제</button></td>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems_005fbegin.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
