package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class wordprees_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            * {\n");
      out.write("  padding: 0;\n");
      out.write("  margin: 0;\n");
      out.write("  list-style: none;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  outline: none;\n");
      out.write("  font-weight: normal;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".tabs {\n");
      out.write("  background: #fff;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".tabs > input,\n");
      out.write(".tabs > span {\n");
      out.write("  width: 20%;\n");
      out.write("  height: 60px;\n");
      out.write("  line-height: 60px;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".tabs > input {\n");
      out.write("  cursor: pointer;\n");
      out.write("  filter: alpha(opacity=0);\n");
      out.write("  opacity: 0;\n");
      out.write("  position: absolute;\n");
      out.write("  z-index: 99;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".tabs > span {\n");
      out.write("  background: #f0f0f0;\n");
      out.write("  text-align: center;\n");
      out.write("  overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".tabs > span i,\n");
      out.write(".tabs > span {\n");
      out.write("  -webkit-transition: all .5s;\n");
      out.write("     -moz-transition: all .5s;\n");
      out.write("     -o-transition: all .5s;\n");
      out.write("      transition: all .5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".tabs > input:hover + span {\n");
      out.write("  background: rgba(255,255,255,.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".tabs > input:checked + span {\n");
      out.write("  background: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".tabs > input:checked + span,\n");
      out.write(".tabs > input:hover + span {\n");
      out.write("  color: #3498DB;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#tab-1, #tab-1 + span {\n");
      out.write("  left: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#tab-2, #tab-2 + span {\n");
      out.write("  left: 20%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#tab-3, #tab-3 + span {\n");
      out.write("  left: 40%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#tab-4, #tab-4 + span {\n");
      out.write("  left: 60%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#tab-5, #tab-5 + span {\n");
      out.write("  left: 80%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".tab-content {\n");
      out.write("  padding: 80px 20px 20px;\n");
      out.write("  width: 100%;\n");
      out.write("  min-height: 340px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".tab-content section {\n");
      out.write("  width: 100%;\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".tab-content section h1 {\n");
      out.write("  margin-top: 15px;\n");
      out.write("  font-size: 100px;\n");
      out.write("  font-weight: 100;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#tab-1:checked ~ .tab-content #tab-item-1  {\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#tab-2:checked ~ .tab-content #tab-item-2  {\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#tab-3:checked ~ .tab-content #tab-item-3  {\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#tab-4:checked ~ .tab-content #tab-item-4  {\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#tab-5:checked ~ .tab-content #tab-item-5  {\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("     </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>wordprees</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("     <div class=\"tabs effect-1\">\n");
      out.write("  <!-- tab-title -->\n");
      out.write("  <input type=\"radio\" id=\"tab-1\" name=\"tab\" checked=\"checked\">\n");
      out.write("  <span href=\"#tab-item-1\">Home</span>\n");
      out.write("\n");
      out.write("  <input type=\"radio\" id=\"tab-2\" name=\"tab\">\n");
      out.write("  <span href=\"#tab-item-2\">Products</span>\n");
      out.write("\n");
      out.write("  <input type=\"radio\" id=\"tab-3\" name=\"tab\">\n");
      out.write("  <span href=\"#tab-item-3\">Features</span>\n");
      out.write("\n");
      out.write("  <input type=\"radio\" id=\"tab-4\" name=\"tab\">\n");
      out.write("  <span href=\"#tab-item-4\">Resources</span>\n");
      out.write("  \n");
      out.write("  <input type=\"radio\" id=\"tab-5\" name=\"tab\">\n");
      out.write("  <span href=\"#tab-item-5\">Plans&Pricing</span>\n");
      out.write("     </div><br/><br/><br/><br/>\n");
      out.write("     <img src=\"image//design.jpg\">\n");
      out.write("       \n");
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
