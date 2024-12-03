package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bikenews_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>BIKE NEWS</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>BIKE NEWS</h1>\n");
      out.write("        <p style=\" font-size: 25px;\">\n");
      out.write("            <img src=\"image//bike.jpg\"> \n");
      out.write("            Need an expert opinion on your car and bike related queries?\n");
      out.write("        </p> \n");
      out.write("         \n");
      out.write("        <p style=\"font-size: 25px;\">Honda teases Hornet 2.0-based adventure bike,india launc...</p>\n");
      out.write("        <p style=\"font-size: 25px;\"><img src=\"image//ktm.jpg\">\n");
      out.write("          Both bikes look similar to the 2022 RC 390, but get different colour schemes and fewer features.    \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\"><img src=\"image//bike1.jpg\">\n");
      out.write("            The third 660cc Aprilia ticks all the right ADV boxes.       \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\"><img src=\"image//ktm1.jpg\">\n");
      out.write("            Will get adjustable suspension, TFT display and Bluetooth connectivity.          \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\"><img src=\"image//tvs1.jpg\">\n");
      out.write("         Based on current fuel rates, the TVS iQube electric scooter will save you roughly Rs 75,000 after you cover 50,000km.     \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\"><img src=\"image//bajaj.jpg\">\n");
      out.write("   Likely to have three levels of functionality for maximum fuel efficiency, power and torque.          \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\"><img src=\"image//bmw.jpg\">\n");
      out.write(" The R18 Transcontinental has a 10.25inch TFT colour display, a sound system, large windscreen and more.              \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\"><img src=\"image//royal.jpg\">\n");
      out.write("         The model spotted could be a more affordable entry-level variant.              \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\"><img src=\"image//royal1.jpg\">\n");
      out.write("          Royal Enfield is developing a range of premium electric vehicles.       \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\"><img src=\"image//bike3.jpg\">\n");
      out.write("         Gets same 500cc parallel-twin as Leoncino and TRK 502; features LED lighting and fully-digital instrumentation.           \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\"><img src=\"image//bike4.jpg\">\n");
      out.write("         Here's a list of the top ten sub-Rs 2 lakh two-wheelers that left a lasting impression on us.          \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\"><img src=\"image//bikes.jpg\">\n");
      out.write("         Ather Energy says its vehicles reduced 7.5 metric tonnes of CO2 emissions.           \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\"><img src=\"image//bikes2.jpg\">\n");
      out.write("          Motocross legend Ricky Carmichael and five-times Enduro World Champion Iván Cervantes have joined Triumph.          \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\"><img src=\"image//bikes3.jpg\">\n");
      out.write("          The bike has been unveiled in honour of superstar Ducati racer Troy Bayliss and it features mechanical updates.      \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 20px;\"><img src=\"image//bikes4.jpg\">\n");
      out.write("          The Ninja 300, Z H2 and Z H2 SE will not witness a price hike.           \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\"><img src=\"image//bikes5.jpg\">\n");
      out.write("           The new images reveal that the 2021 Royal Enfield Classic 350 will have a variant without Tripper navigation.      \n");
      out.write("        </p>\n");
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
