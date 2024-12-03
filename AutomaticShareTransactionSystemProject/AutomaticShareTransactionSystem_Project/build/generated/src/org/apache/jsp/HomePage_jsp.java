package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Automatic Share Transaction System</title>\n");
      out.write("         <style language=\"text/css\">\n");
      out.write("            \t\tbody\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tbackground-image:url(image/103.jpg);\n");
      out.write("\t\t\t\tbackground-repeat:repeat-y;\n");
      out.write("\t\t\t\tbackground-attachment:fixed;\n");
      out.write("\t\t\t\tbackground-position:top center\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("<!--\n");
      out.write("var image1=new Image()\n");
      out.write("image1.src=\"image/img/mr5.jpg\"\n");
      out.write("var image2=new Image()\n");
      out.write("image2.src=\"image/img/mr8.jpg\"\n");
      out.write("var image3=new Image()\n");
      out.write("image3.src=\"image/img/mr7.jpg\"\n");
      out.write("\n");
      out.write("-->\n");
      out.write("</script>\n");
      out.write(" \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <form>\n");
      out.write("    <body bgcolor=\"#fff5ee\">\n");
      out.write("   \n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("\n");
      out.write("          \n");
      out.write("               <td align=\"middle\" valign=\"centre\" width=\"10%\" height=\"30\" bgcolor=\"white\">\n");
      out.write("                 <font size=\"+7\" color=\"brown\"><B>AUTOMATIC SHARE TRANSACTION SYSTEM</B></font>\n");
      out.write("                 </td>\n");
      out.write("        </tr>\n");
      out.write("        <TR>\n");
      out.write("         <td align=\"middle\" valign=\"centre\" width=\"10%\"  bgcolor=\"BLACK\">\n");
      out.write("                 <marquee behavior=\"alternate\" scrollamount=\"3\"><font size=\"5\" color=\"white\"><B>Welcome to Share Transaction Zone</B></font></MARQUEE>\n");
      out.write("\n");
      out.write("          </td>\n");
      out.write("        </TR>\n");
      out.write("       \n");
      out.write("        </table>\n");
      out.write("        <table align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <td bgcolor=\"\">\n");
      out.write("                <td bgcolor=\"white\" ><a href=\"About_Us.jsp\"><font  color=\"green\" size=\"5\">About Us</font></a>|</td>\n");
      out.write("                <td bgcolor=\"white\"><a href=\"Contact_Us.jsp\"><font color=\"brown\" size=\"5\" >Contact Us</font></a>|</td>\n");
      out.write("                 <td bgcolor=\"white\"><a href=\"VisionAndMission.jsp\"><font color=\"green\" size=\"5\" >Vision & Mission</font></a>|</td>\n");
      out.write("                <td bgcolor=\"white\"><a href=\"BuyShare.jsp\"><font color=\"brown\" size=\"5\" >Buy Share</font></a>|</td>\n");
      out.write("                <td bgcolor=\"white\"><a href=\"SellShare.jsp\"><font color=\"green\" size=\"5\" >Sale Share</font></a>|</td>\n");
      out.write("                <td bgcolor=\"white\"><a href=\"SiteMap.jsp\"><font color=\"brown\" size=\"5\" >Site Map</font></a>|</td>\n");
      out.write("                <td bgcolor=\"white\"><a href=\"RegistrationInfo.jsp\"><font color=\"green\" size=\"5\">Registration</font></a>|</td>\n");
      out.write("                <td bgcolor=\"white\"><a href=\"LoginInfo.jsp\"><font color=\"brown\" size=\"5\">Login</font></a></td>\n");
      out.write("                <td bgcolor=\"white\"><a href=\"AdminLogin.jsp\"><font color=\"green\" size=\"5\">Admin</font></a></td>\n");
      out.write("                   \n");
      out.write("            </tr>\n");
      out.write("                \n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("    <tr>\n");
      out.write("        <td colspan=\"2\"><img src=\"image/img/.jpg\" name=\"slide\" width=\"310\" height=\"125\" /></td>\n");
      out.write("        \n");
      out.write("\n");
      out.write("<script>\n");
      out.write("<!--\n");
      out.write("//variable that will increment through the images\n");
      out.write("var step=1\n");
      out.write("function slideit(){\n");
      out.write("//if browser does not support the image object, exit.\n");
      out.write("if (!document.images)\n");
      out.write("return\n");
      out.write("document.images.slide.src=eval(\"image\"+step+\".src\")\n");
      out.write("if (step<3)\n");
      out.write("step++\n");
      out.write("else\n");
      out.write("step=1\n");
      out.write("//call function \"slideit()\" every 2.5 seconds\n");
      out.write("setTimeout(\"slideit()\",2500)\n");
      out.write("}\n");
      out.write("slideit()\n");
      out.write("//-->\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <td><img src=\"image/img/m3.jpg\" name=\"slide\" /></td>\n");
      out.write("        <td><img src=\"image/img/m9.jpg\" name=\"slide\" /></td>\n");
      out.write("        <td><img src=\"image/img/m5.jpg\" name=\"slide\" /></td>\n");
      out.write("         <td><img src=\"image/img/m14.jpg\" name=\"slide\" /></td>\n");
      out.write("         \n");
      out.write("         <td><marquee direction=\"scroll\">\n");
      out.write("         <img src=\"image/img/m1.jpg\" name=\"slide\" />\n");
      out.write("         <img src=\"image/img/m2.jpg\" name=\"slide\" />\n");
      out.write("         \n");
      out.write("         <img src=\"image/img/m4.jpg\" name=\"slide\" />\n");
      out.write("         \n");
      out.write("         <img src=\"image/img/m6.jpg\" name=\"slide\" />\n");
      out.write("         <img src=\"image/img/m7.jpg\" name=\"slide\" />\n");
      out.write("         <img src=\"image/img/m8.jpg\" name=\"slide\" />\n");
      out.write("         \n");
      out.write("         <img src=\"image/img/m10.jpg\" name=\"slide\" />\n");
      out.write("         <img src=\"image/img/m11.jpg\" name=\"slide\" />\n");
      out.write("         <img src=\"image/img/m12.jpg\" name=\"slide\" />\n");
      out.write("         <img src=\"image/img/m13.jpg\" name=\"slide\" />\n");
      out.write("         \n");
      out.write("         <img src=\"image/img/m15.jpg\" name=\"slide\" />\n");
      out.write("         <img src=\"image/img/m16.jpg\" name=\"slide\" />\n");
      out.write("         <img src=\"image/img/m1.jpg\" name=\"slide\" />\n");
      out.write("         <img src=\"image/img/m2.jpg\" name=\"slide\" />\n");
      out.write("         \n");
      out.write("         <img src=\"image/img/m4.jpg\" name=\"slide\" />\n");
      out.write("         \n");
      out.write("         <img src=\"image/img/m6.jpg\" name=\"slide\" />\n");
      out.write("         <img src=\"image/img/m7.jpg\" name=\"slide\" />\n");
      out.write("         <img src=\"image/img/m8.jpg\" name=\"slide\" />\n");
      out.write("         \n");
      out.write("         <img src=\"image/img/m10.jpg\" name=\"slide\" />\n");
      out.write("         <img src=\"image/img/m11.jpg\" name=\"slide\" />\n");
      out.write("         <img src=\"image/img/m12.jpg\" name=\"slide\" />\n");
      out.write("         <img src=\"image/img/m13.jpg\" name=\"slide\" />\n");
      out.write("         \n");
      out.write("         <img src=\"image/img/m15.jpg\" name=\"slide\" />\n");
      out.write("         <img src=\"image/img/m16.jpg\" name=\"slide\" />\n");
      out.write("         \n");
      out.write("\n");
      out.write("         <img src=\"image/img/m17.jpg\" name=\"slide\" />\n");
      out.write("         <img src=\"image/img/m18.jpg\" name=\"slide\" />\n");
      out.write("         <img src=\"image/img/m19.jpg\" name=\"slide\" />\n");
      out.write("\n");
      out.write("         <img src=\"image/img/m20.jpg\" name=\"slide\" />\n");
      out.write("         <img src=\"image/img/m21.jpg\" name=\"slide\" />\n");
      out.write("         <img src=\"image/img/m22.jpg\" name=\"slide\" />\n");
      out.write("         <img src=\"image/img/m23.jpg\" name=\"slide\" />\n");
      out.write("\n");
      out.write("         <img src=\"image/img/m24.jpg\" name=\"slide\" />\n");
      out.write("         <img src=\"image/img/m16.jpg\" name=\"slide\" />\n");
      out.write("         </marquee></td>\n");
      out.write("        \n");
      out.write("        </tr>\n");
      out.write("</table>\n");
      out.write("            </br>\n");
      out.write("<table width=\"100%\" border=\"0\">\n");
      out.write("    <tr>\n");
      out.write("         <td width=\"75%\" align=\"justify\">\n");
      out.write("\n");
      out.write("             \n");
      out.write("             <div>&nbsp;&nbsp;&nbsp;<font size=\"+2\" color=\"\"><b>About Share Market</b></font></div>\n");
      out.write("             <p>\n");
      out.write("            <font size=\"4\" color=\"\">\n");
      out.write("        \n");
      out.write("                A stock(share) market or equity market is the aggregation of buyer and seller(a loose network of economic\n");
      out.write("                transaction , not a physical facility or discrete entity) of stock(shares);these are securities\n");
      out.write("                listed on a stock exchange as well as those only traded privately.\n");
      out.write("                Stocks are partitioned in various ways. One common way is by the country where the company is domiciled.\n");
      out.write("                For example, Nestle, Roche, and Novartis are domiciled in Switzerland, so they are part of the Swiss stock market.</p>\n");
      out.write("\n");
      out.write("                <p>People Services Limited is a company dealing with selling and buying of share.\n");
      out.write("                In the process of expansion of their activities, they plan to automate their operation.\n");
      out.write("                 they will be given a unique customer ID(Cid).The customer will have to quote this Cid in all their transaction.\n");
      out.write("                The customer should first register themselves with the company.on registering                \n");
      out.write("                Due to the exception of their operation,they planned to automate their operation.</p>\n");
      out.write("                 <p>\n");
      out.write("                    The size of the world stock market was estimated at about $36.6 trillion at the beginning of October 2008.[1]\n");
      out.write("                    The total world derivatives market has been estimated at about $791 trillion face or nominal value,\n");
      out.write("                    [2] 11 times the size of the entire world economy.[3] The value of the derivatives market, because it is stated in terms\n");
      out.write("                    of notional values, cannot be directly compared to a stock or a fixed income security, which traditionally refers to an actual value.\n");
      out.write("                    Moreover, the vast majority of derivatives 'cancel' each other out (i.e., a derivative 'bet' on an event occurring is offset\n");
      out.write("                    by a comparable derivative 'bet' on the event not occurring). Many such relatively illiquid securities are valued as marked to model,\n");
      out.write("                    rather than an actual market price.</p>\n");
      out.write("       </font>\n");
      out.write("        </p>\n");
      out.write("        </td>\n");
      out.write("\n");
      out.write("                <td width=\"25%\" bgcolor=\"brown\" align=\"left\">\n");
      out.write("                    <img src=\"image/news.jpg\" />\n");
      out.write("      \n");
      out.write("                    <h2>Share Announcements</h2>\n");
      out.write("          \n");
      out.write("\t            <marquee behavior=\"scroll\" direction=\"up\" scrollamount=\"2\" scrolldelay=\"1\" height=\"210\" width=\"100%\" onmouseover=\"this.stop();\" onmouseout=\"this.start();\">\n");
      out.write("\n");
      out.write("                        <p align=\"justify\"><a href=\"AboutShareMarket.jsp\" ><font size=\"4\" color=\"white\" >About Share Market.</font></a></p>\n");
      out.write("                        <p align=\"justify\"><a href=\"AboutBuySellShare.jsp\"><font size=\"4\" color=\"white\" >Buying and Selling share Details</font></a></p>\n");
      out.write("                        <p align=\"justify\"><a href=\"BombayStockExchange.jsp\"><font size=\"4\" color=\"white\" >About Bombay Stock Exchange </font></a></p>\n");
      out.write("                    <p align=\"justify\"><font size=\"4\" color=\"Yellow\" >VISIT OUR WEBSITE REGULARLY.</font></p>\n");
      out.write("\t\t    </marquee>\n");
      out.write("\t\t   \n");
      out.write("                  \n");
      out.write("                </td>\n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("        \n");
      out.write("<br><br>\n");
      out.write("           \n");
      out.write("       <table border=\"1\">\n");
      out.write("    <tr>\n");
      out.write("        <td valign=\"centre\" width=\"10%\" align=\"middle\"><font color=\"\" size=\"4\">\n");
      out.write("          Dear Customer and All People<br><br>\n");
      out.write("          welcomes you to Automatic Share Transaction facility.<br>Enjoy hassle\n");
      out.write("          free, safe and secure Share Transaction. Save your precious time and energy. It\n");
      out.write("          is convenient. You can do it from anywhere. Use it !<br>\n");
      out.write("          We wish you a Happy Transaction and joyful learning.</font><br><br>\n");
      out.write("      </td>\n");
      out.write("     </tr>\n");
      out.write("   </table>\n");
      out.write("    </body>\n");
      out.write("    </form>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
