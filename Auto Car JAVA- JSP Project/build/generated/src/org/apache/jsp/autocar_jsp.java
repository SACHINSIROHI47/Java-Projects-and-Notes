package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class autocar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("           .tab{\n");
      out.write("   background-color: rgb(180, 204, 208);\n");
      out.write("}\n");
      out.write("ul{\n");
      out.write("    padding: 0;\n");
      out.write("    list-style: none;\n");
      out.write("    background: #f2f2f2;\n");
      out.write("}\n");
      out.write("ul li{\n");
      out.write("    display: inline-block;\n");
      out.write("    padding: 4px 20px;\n");
      out.write("    color: #333;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("ul li a:hover{\n");
      out.write("    color: #fff;\n");
      out.write("    background: #939393;\n");
      out.write("}\n");
      out.write("ul li ul.dropdown{\n");
      out.write(" min-width: 100%;\n");
      out.write(" background: #f2f2f2;\n");
      out.write(" display : none;\n");
      out.write(" position: absolute;\n");
      out.write(" z-index: 999;\n");
      out.write(" left: 0;\n");
      out.write("}\n");
      out.write(" ul li:hover ul.dropdown{\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("ul li ul.dropdown li{\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write(".tab ul{\n");
      out.write("    background: transparent;\n");
      out.write("    border-color: #1172c4;\n");
      out.write("    border-style: solid;\n");
      out.write("    border-width: 1px;\n");
      out.write("    padding: 10px 10px;\n");
      out.write("    transition: all 0.2s linear;\n");
      out.write("    line-height: 30px;\n");
      out.write("}\n");
      out.write(".tab ul-highlight:hover{\n");
      out.write("    color: #ffffff;\n");
      out.write("    background: black;\n");
      out.write("    border-color: #1172c4;\n");
      out.write("}\n");
      out.write(".li-highlight:hover{\n");
      out.write("   color: #ffffff;\n");
      out.write("    background: black;\n");
      out.write("    border-color: #1172c4;  \n");
      out.write("}\n");
      out.write("li.menu-highlight:hover a{\n");
      out.write("    color: #ffffff;\n");
      out.write("}\n");
      out.write(".menu-highlight:active{\n");
      out.write("    border-radius: 30px;\n");
      out.write("}\n");
      out.write("* {box-sizing: border-box;}\n");
      out.write("body {font-family: Verdana, sans-serif;}\n");
      out.write(".mySlides  {display: none;}\n");
      out.write("img {vertical-align: middle;}\n");
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
      out.write(" </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Autocar</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"#\">\n");
      out.write("            <img src=\"image//web_1.jpg\" width=\"1450\">\n");
      out.write("        </a>\n");
      out.write("        <div class=\"tab\">\n");
      out.write("            <ul>\n");
      out.write("                <li>\n");
      out.write("                     <a href=\"#\">Home</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                     <a href=\"#\">Find a car<span>&#9662;</span></a>\n");
      out.write("                     <ul class=\"dropdown\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"http://localhost:8080/WebApplication2/cars.jsp\">car</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"http://localhost:8080/WebApplication2/carprice.jsp\">car price</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"http://localhost:8080/WebApplication2/carloan.jsp\">car Loan Calculator</a>\n");
      out.write("                </li>\n");
      out.write("                </ul>\n");
      out.write("                     <li>\n");
      out.write("                    <a href=\"#\">News<span>&#9662;</span></a>\n");
      out.write("                    <ul class=\"dropdown\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"http://localhost:8080/WebApplication2/autocarindia.jsp\">Cars</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"http://localhost:8080/WebApplication2/bikenews.jsp\">bike</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"http://localhost:8080/WebApplication2/motorsport.jsp\">Motorsports</a>\n");
      out.write("                        </li>\n");
      out.write("                </ul>\n");
      out.write("                     </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">Reviews<span>&#9662;</span></a>\n");
      out.write("                     <ul class=\"dropdown\">\n");
      out.write("                         <li>\n");
      out.write("                             <p>Car</p>\n");
      out.write("                <a href=\"http://localhost:8080/WebApplication2/carreviews.jsp\">First driver/reviews</a><br/>\n");
      out.write("                <a href=\"http://localhost:8080/WebApplication2/COMPARISON.jsp\">Comparisons</a>\n");
      out.write("                             \n");
      out.write("                         </li>\n");
      out.write("                         <li>\n");
      out.write("                             <p>Bike</p>\n");
      out.write("                             <a href=\"http://localhost:8080/WebApplication2/ride.jsp\">FIRST RIDE / REVIEWS</a><br/>\n");
      out.write("                <a href=\"http://localhost:8080/WebApplication2/COMPARISONbike.jsp\">Comparisons</a>\n");
      out.write("                             \n");
      out.write("                         </li>\n");
      out.write("                         \n");
      out.write("                     \n");
      out.write("                </ul>\n");
      out.write("                <li>\n");
      out.write("                     <a href=\"#\">Features<span>&#9662;</span></a>\n");
      out.write("                     <ul class=\"dropdown\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"http://localhost:8080/WebApplication2/FEATURES.jsp\">Features</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"http://localhost:8080/WebApplication2/TRAVELOGUES.jsp\">Travelogues</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"http://localhost:8080/WebApplication2/RENAULT.jsp\">Renault</a>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                </ul>\n");
      out.write("                <li>\n");
      out.write("                     <a href=\"#\">Advice</a>\n");
      out.write("                </li>\n");
      out.write("                 <li>\n");
      out.write("                      <a href=\"#\">Forums</a>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("       <div class=\"slideshow-container\">\n");
      out.write("\n");
      out.write("<div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\">1 / 3</div>\n");
      out.write("  <img src=\"image//s.jpg\" style=\"width:100%\">\n");
      out.write("  <div class=\"text\">Caption Text</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\">2 / 3</div>\n");
      out.write("  <img src=\"image//bullet.jpg\" style=\"width:100%\">\n");
      out.write("  <div class=\"text\">2</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\">3 / 3</div>\n");
      out.write("  <img src=\"image//autocar3.jpg\" style=\"width:100%\">\n");
      out.write("  <div class=\"text\">3</div>\n");
      out.write("</div>\n");
      out.write("  <div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\">4 / 3</div>\n");
      out.write("  <img src=\"image//autocar4.jpg\" style=\"width:100%\">\n");
      out.write("  <div class=\"text\">Caption four</div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\">5 / 3</div>\n");
      out.write("  <img src=\"image//autocar5.jpg\" style=\"width:100%\">\n");
      out.write("  <div class=\"text\">Caption five</div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\">6 / 3</div>\n");
      out.write("  <img src=\"image//tvs.jpg\" style=\"width:100%; background-color: orchid;\">\n");
      out.write("  <div class=\"text\">Caption six</div>\n");
      out.write("</div>\n");
      out.write("  </div>\n");
      out.write("<br>\n");
      out.write("<!-- Next and previous buttons -->\n");
      out.write("<div style=\"text-align:center\">\n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("</div><br/> \n");
      out.write(" <div class=\"row\">\n");
      out.write("<a href=\"https://www.amazon.in/Castrol-Edge-5W-40-Synthetic-Engine/dp/B07TV8N65N\"> \n");
      out.write(" <img alt=\"alt text\" style=\"float: right\" src=\"image//castrol.jpg\" width=\"600\" height=\"200\"><br/>\n");
      out.write(" <p style=\"color:black;\">DiD you know modern car engines come with modern challenges-smaller and yet pushed harder for</p><br/>  \n");
      out.write(" <p style=\"color:black;\">Performance.this leads to increased pressures that pose challenges for engine oils,causing friction and</p><br/>\n");
      out.write(" <p style=\"color:black;\">loss of engine power.advanced full synthetic engine oils help unlock the true performance of your engine</p>\n");
      out.write("</a><br/><br/><br/>\n");
      out.write("     </div>\n");
      out.write("<ul>\n");
      out.write("    <li>\n");
      out.write("        <h1>Top News</h1>\n");
      out.write("    </li>\n");
      out.write("<a style=\"font-size: 30px;\" href=\"http://localhost:8080/WebApplication2/carbikenews.jsp\">view all</a>\n");
      out.write("</ul>\n");
      out.write("<a href=\"#\">\n");
      out.write("<img src=\"image//topnews.jpg\" width=\"1400\" height=\"700\">\n");
      out.write("</a>\n");
      out.write("<ul>\n");
      out.write("    <li>\n");
      out.write("    <p>Bike Reviews</p>\n");
      out.write("    </li>\n");
      out.write("    <a href=\"#\">Car Reviews</a>\n");
      out.write("</ul>\n");
      out.write("<ul>\n");
      out.write("    <li>\n");
      out.write("        <p>Latest Reviews</p>\n");
      out.write("    </li>\n");
      out.write("    <a href=\"#\">First Driver/Road</a>&nbsp; &nbsp;\n");
      out.write("    <a href=\"#\">Comparisons</a>&nbsp; &nbsp;\n");
      out.write("    <a href=\"#\">Long-team Reviews</a>&nbsp; &nbsp;\n");
      out.write("    <a href=\"#\">Vido Reviews</a>&nbsp; &nbsp;\n");
      out.write("</ul>\n");
      out.write("<a href=\"https://www.autocarindia.com/car-reviews/2021-ford-figo-12-at-review-test-drive-421473\">\n");
      out.write("    <img src=\"image//figo.jpg\" width=\"350\" height=\"350\">\n");
      out.write("</a>\n");
      out.write("<a href=\"https://www.autocarindia.com/car-reviews/2021-jaguar-f-pace-facelift-review-test-drive-421508\">\n");
      out.write("    <img src=\"image//JAGUAR1.jpg\" width=\"350\" height=\"350\">\n");
      out.write("</a>\n");
      out.write("<a href=\"https://www.autocarindia.com/car-reviews/aston-martin-dbx-india-review-test-drive-421407\">\n");
      out.write("    <img src=\"image//am.jpg\" width=\"350\" height=\"350\">\n");
      out.write("</a>\n");
      out.write("<a href=\"https://www.autocarindia.com/car-reviews/skoda-kushaq-review-test-drive-421182\">\n");
      out.write("    <img src=\"image//skoda.jpg\" width=\"350\" height=\"350\">\n");
      out.write("</a><br/><br/>\n");
      out.write("<p style=\"font-size: 19px; background-color: blueviolet;\">\n");
      out.write("    <img src=\"image//india.jpg\" width=\"800\" height=\"400\">\n");
      out.write("Will it be the small\n");
      out.write("mid-sizer or the big\n");
      out.write("small car?\n");
      out.write("<a href=\"http://localhost:8080/WebApplication2/Registration.jsp\">\n");
      out.write("<input style=\"font-size: 28px;text-align: center;\" type=\"submit\" value=\"ask now\">\n");
      out.write("</a>\n");
      out.write("</p> \n");
      out.write("<div style=\"background-color: black;\">\n");
      out.write("<ul>\n");
      out.write("    <li>\n");
      out.write("        <a href=\"https://www.facebook.com/autocarindiamag\" target=\"blank\">\n");
      out.write("            <img src=\"image//fb.jpg\" width=\"50\">   \n");
      out.write("        </a>\n");
      out.write("        <a href=\"https://twitter.com/autocarindiamag\" target=\"blank\">\n");
      out.write("            <img src=\"image//tw.jpg\" width=\"50\">   \n");
      out.write("        </a>\n");
      out.write("        <a href=\"https://www.instagram.com/autocar_india/\" target=\"blank\">\n");
      out.write("            <img src=\"image//in.jpg\" width=\"50\">   \n");
      out.write("        </a>\n");
      out.write("         <a href=\"https://www.youtube.com/user/autocarindia1\" target=\"blank\">\n");
      out.write("            <img src=\"image//yu.jpg\" width=\"50\"> \n");
      out.write("         </a>&nbsp; &nbsp; &nbsp;\n");
      out.write("        Copyright@ashish tyagi\n");
      out.write("    </li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("<script>\n");
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
      out.write("</body>\n");
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
