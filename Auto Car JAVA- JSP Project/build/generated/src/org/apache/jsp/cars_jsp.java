package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cars_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            * {box-sizing: border-box;}\n");
      out.write("body {font-family: Verdana, sans-serif;}\n");
      out.write(".mySlides  {display: none;}\n");
      out.write("img {vertical-align: middle;}\n");
      out.write("img{\n");
      out.write("    background-color: blueviolet;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Slideshow container */\n");
      out.write(".slideshow-container {\n");
      out.write("  max-width: 1000px;\n");
      out.write("  position: relative;\n");
      out.write("  margin: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Caption text */\n");
      out.write(".text {\n");
      out.write("  color: #f2f2f2;\n");
      out.write("  font-size: 15px;\n");
      out.write("  padding: 8px 12px;\n");
      out.write("  position: absolute;\n");
      out.write("  bottom: 8px;\n");
      out.write("  width: 100%;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Number text (1/3 etc) */\n");
      out.write(".numbertext {\n");
      out.write("  color: #f2f2f2;\n");
      out.write("  font-size: 12px;\n");
      out.write("  padding: 8px 12px;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The dots/bullets/indicators */\n");
      out.write(".dot {\n");
      out.write("  height: 15px;\n");
      out.write("  width: 15px;\n");
      out.write("  margin: 0 2px;\n");
      out.write("  background-color: #bbb;\n");
      out.write("  border-radius: 50%;\n");
      out.write("  display: inline-block;\n");
      out.write("  transition: background-color 0.6s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".active {\n");
      out.write("  background-color: #717171;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Fading animation */\n");
      out.write(".fade {\n");
      out.write("  -webkit-animation-name: fade;\n");
      out.write("  -webkit-animation-duration: 1.5s;\n");
      out.write("  animation-name: fade;\n");
      out.write("  animation-duration: 1.5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes fade {\n");
      out.write("  from {opacity: .4} \n");
      out.write("  to {opacity: 1}\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes fade {\n");
      out.write("  from {opacity: .4} \n");
      out.write("  to {opacity: 1}\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* On smaller screens, decrease text size */\n");
      out.write("@media only screen and (max-width: 300px) {\n");
      out.write("  .text {font-size: 11px}\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>cars</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"slideshow-container\">\n");
      out.write("\n");
      out.write("<div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\">1 / 3</div>\n");
      out.write("  <img src=\"image//cars.jpg\" style=\"width:100%\">\n");
      out.write("  <div class=\"text\">Caption Text</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\">2 / 3</div>\n");
      out.write("  <img src=\"image//cars_1.jpg\" style=\"width:100%\">\n");
      out.write("  <div class=\"text\">Caption Two</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\">3 / 3</div>\n");
      out.write("  <img src=\"image//cars2.jpg\" style=\"width:100%\">\n");
      out.write("  <div class=\"text\">Caption Three</div>\n");
      out.write("</div>\n");
      out.write("  <div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\">4 / 3</div>\n");
      out.write("  <img src=\"image//cars3.jpg\" style=\"width:100%\">\n");
      out.write("  <div class=\"text\">Caption four</div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\">5 / 3</div>\n");
      out.write("  <img src=\"image//cars4.jpg\" style=\"width:100%\">\n");
      out.write("  <div class=\"text\">Caption five</div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\">6 / 3</div>\n");
      out.write("  <img src=\"image//cars5.jpg\" style=\"width:100%\">\n");
      out.write("  <div class=\"text\">Caption six</div>\n");
      out.write("</div>\n");
      out.write("  </div>\n");
      out.write("        <br>\n");
      out.write("<!-- Next and previous buttons -->\n");
      out.write("<div style=\"text-align:center\">\n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("</div><br/> \n");
      out.write("<marquee behavior=\"scroll\" direction=\"left\"onMouseOver=\"this.stop()\" onMouseOut=\"this.start()\"> \n");
      out.write("            <img  src=\"image//car.jpg\" width=\"300\" height=\"200\">       \n");
      out.write("        <img  src=\"image//car1.jpg\" width=\"300\" height=\"200\">       \n");
      out.write("        <img  src=\"image//car3.jpg\" width=\"300\" height=\"200\">      \n");
      out.write("        <img  src=\"image//car4.jpg\" width=\"300\" height=\"200\">\n");
      out.write("        </marquee>\n");
      out.write("    <div>\n");
      out.write("    <p style=\"font-size: 40px;\">\n");
      out.write("        <img src=\"image//mahindra.jpg\" width=\"1200\" height=\"600\">\n");
      out.write("        Rs 11.87 lakh\n");
      out.write("    </p>\n");
      out.write("    <p style=\"font-size: 40px;\">\n");
      out.write("        <img src=\"image//thar.jpg\" width=\"1200\" height=\"600\">\n");
      out.write("    Rs 11.21 lakh\n");
      out.write("    </p>\n");
      out.write("    <p style=\"font-size: 40px;\">\n");
      out.write("        <img src=\"image//hyundai.jpg\" width=\"1200\" height=\"600\">\n");
      out.write("    Rs 11.21 lakh\n");
      out.write("    </p>\n");
      out.write("    <p style=\"font-size: 40px;\">\n");
      out.write("        <img src=\"image//maruti.jpg\" width=\"1200\" height=\"600\">\n");
      out.write("    Rs 6.41 lakh\n");
      out.write("    </p>\n");
      out.write("    <p style=\"font-size: 40px;\">\n");
      out.write("        <img src=\"image//verna.jpg\" width=\"1200\" height=\"600\">\n");
      out.write("    Rs 7.34 lakh\n");
      out.write("    </p>\n");
      out.write("    </div>\n");
      out.write("        <script>\n");
      out.write("var slideIndex = 0;\n");
      out.write("showSlides();\n");
      out.write("\n");
      out.write("function showSlides() {\n");
      out.write("  var i;\n");
      out.write("  var slides = document.getElementsByClassName(\"mySlides\");\n");
      out.write("  var dots = document.getElementsByClassName(\"dot\");\n");
      out.write("  for (i = 0; i < slides.length; i++) {\n");
      out.write("    slides[i].style.display = \"none\";  \n");
      out.write("  }\n");
      out.write("  slideIndex++;\n");
      out.write("  if (slideIndex > slides.length) {slideIndex = 1}    \n");
      out.write("  for (i = 0; i < dots.length; i++) {\n");
      out.write("    dots[i].className = dots[i].className.replace(\" active\", \"\");\n");
      out.write("  }\n");
      out.write("  slides[slideIndex-1].style.display = \"block\";  \n");
      out.write("  dots[slideIndex-1].className += \" active\";\n");
      out.write("  setTimeout(showSlides, 2000); // Change image every 2 seconds\n");
      out.write("}\n");
      out.write("</script>\n");
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
