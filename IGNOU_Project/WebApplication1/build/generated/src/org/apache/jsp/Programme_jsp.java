package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Programme_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("<title>Online Admission Form of IGNOU </title>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bgcolor=\"#fff5ee\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("  <tbody><tr bgcolor=\"black\"> \n");
      out.write("    <td align=\"middle\" valign=\"centre\" width=\"10%\"> \n");
      out.write("        <img height=\"50\" src=\"images/ignou-new.png\" width=\"50\"> \n");
      out.write("    </td>\n");
      out.write("    <td align=\"middle\"><font color=\"white\" size=\"+3\" name=\"verdana\">INDIRA GANDHI NATIONAL OPEN UNIVERSITY</font>\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr><td colspan=\"2\">&nbsp; </td></tr>\n");
      out.write("  <tr class=\"tdheader\" bgcolor=\"#00bfff\" height=\"10%\">\n");
      out.write("\n");
      out.write("<td colspan=\"2\" height=\"10%><p align=\"center\"><font size=\"+2\"><marquee behaviour=\"alteration\">Welcome To Search Programme Stream</marquee> </font></p>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("<form action=\"SOCIS.jsp\" name=\"f10\" method=\"post\">\n");
      out.write("\n");
      out.write("<table align=\"center\"><tr><td>   \n");
      out.write("  <div class=\"textfild\">\n");
      out.write("      <br><br><br><br>\n");
      out.write("      <font size=\"+3\" color=\"#00bff\"> <b>Search Programmes</b></font>\n");
      out.write("      <br><br>\n");
      out.write("<b>\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\n");
      out.write("Delivery Type :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b>\n");
      out.write(" <select name=\"st1\">\n");
      out.write("     <option value=\"none\">Select</option>\n");
      out.write("     <option value=\"2\">Distance</option>\n");
      out.write("     <option value=\"3\">Online</option>\n");
      out.write("     <option value=\"1\">Regular</option>\n");
      out.write(" </select>\n");
      out.write("</div>\n");
      out.write("<td></tr>\n");
      out.write("\n");
      out.write("<tr><td>  \n");
      out.write("\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<b>Programme Stream :&nbsp;</b>\n");
      out.write("<select name=\"st2\">\n");
      out.write("    <option value=\"none\">Select</option>\n");
      out.write("    <option value=\"93\">Acturial Science</option><option value=\"204\">Adult Education</option><option value=\"252\">Adult Education</option>\n");
      out.write("    <option value=\"253\">Adult Education</option><option value=\"235\">Advanced Centre for Informatics and Innovative Learning</option>\n");
      out.write("    <option value=\"240\">Advanced Centre for Informatics and Innovative Learning</option>\n");
      out.write("    <option value=\"241\">Advanced Centre for Informatics and Innovative Learning</option>\n");
      out.write("    <option value=\"242\">Advanced Centre for Informatics and Innovative Learning</option><option value=\"206\">Aerospace Engineering</option>\n");
      out.write("    <option value=\"38\">Agricultural Law</option><option value=\"218\">Agriculture</option><option value=\"27\">Agriculture Extension</option>\n");
      out.write("    <option value=\"228\">Agriculture Law</option><option value=\"100\">Agriculture Policy</option>\n");
      out.write("    <option value=\"189\">Air Craft Manufacturing and Maintenance Engineering</option><option value=\"150\">Air Ticketing</option>\n");
      out.write("    <option value=\"151\">Airline IN-Flight Services</option><option value=\"116\">Analytical Chemistry</option>\n");
      out.write("    <option value=\"224\">Application Oriented Courses for BDP</option><option value=\"118\">Aquaculture</option>\n");
      out.write("    <option value=\"124\">Architecture</option><option value=\"106\">Arts</option><option value=\"16\">Arts (Distance Education)</option>\n");
      out.write("    <option value=\"15\">Arts (Education)</option><option value=\"143\">Audio Programme Production</option>\n");
      out.write("    <option value=\"216\">Awareness Course on Intellectual Propert Rights</option><option value=\"185\">Bangala-Hindi Translation</option>\n");
      out.write("    <option value=\"22\">Bee Keeping</option><option value=\"202\">Bhagawat Gita in the light of Sri Aurobindo</option>\n");
      out.write("    <option value=\"3\">BIO</option><option value=\"10\">Biology</option><option value=\"232\">Biology</option>\n");
      out.write("    <option value=\"103\">Book Publishing</option><option value=\"86\">Business Administration</option>\n");
      out.write("    <option value=\"91\">Business Policy and Corporate Governance</option><option value=\"236\">Centre for Extension Education</option>\n");
      out.write("    <option value=\"243\">Centre for Extension Education</option><option value=\"244\">Centre for Extension Education</option>\n");
      out.write("    <option value=\"245\">Centre for Extension Education</option><option value=\"246\">Centre for Extension Education</option>\n");
      out.write("    <option value=\"262\">Centre for Paramedical Sciences</option><option value=\"80\">Chemistry</option>\n");
      out.write("    <option value=\"62\">Child Development</option><option value=\"82\">Civil Engineering</option><option value=\"74\">Commerce</option>\n");
      out.write("    <option value=\"162\">Community Radio</option><option value=\"138\">Competency Enhancement for Auxiliary Nurse Midwife/Female Health Worker</option>\n");
      out.write("    <option value=\"79\">Computer &amp; Information Science</option><option value=\"122\">Computer Applications</option>\n");
      out.write("    <option value=\"192\">Computer Integrated Manufacturing</option><option value=\"9\">Computer Science</option>\n");
      out.write("    <option value=\"164\">Computing</option><option value=\"190\">Construction Management</option><option value=\"34\">Consumer Protection</option>\n");
      out.write("    <option value=\"257\">Continuing Education</option><option value=\"263\">Corporate Education Training &amp; Consultancy</option>\n");
      out.write("    <option value=\"172\">Craft and Design</option><option value=\"183\">Creative Media Art</option><option value=\"36\">Criminal Justice</option>\n");
      out.write("    <option value=\"114\">Cunsumer Protection (soss)</option><option value=\"31\">Cyber Law</option><option value=\"23\">Dairy Technology</option>\n");
      out.write("    <option value=\"135\">Diabetes Care for Community Worker</option><option value=\"123\">Dietetics and Food Services Management</option>\n");
      out.write("    <option value=\"174\">Digital Film Making</option><option value=\"187\">Disability for parents and family members</option>\n");
      out.write("    <option value=\"109\">Disaster Management</option><option value=\"7\">dot net</option><option value=\"140\">Early Childhood Care and Education</option\n");
      out.write("    <option value=\"65\">Economics</option><option value=\"225\">Education</option><option value=\"271\">Education</option>\n");
      out.write("    <option value=\"5\">Education</option><option value=\"267\">Education</option><option value=\"268\">Education</option>\n");
      out.write("    <option value=\"269\">Education</option><option value=\"270\">Education</option><option value=\"226\">Education</option>\n");
      out.write("    option value=\"251\">Education</option><option value=\"227\">Education Technology</option><option value=\"57\">Education Techonology</option>\n");
      out.write("    <option value=\"234\">Education Techonology</option><option value=\"95\">Electronic Media Production &amp; Management</option>\n");
      out.write("    <option value=\"60\">Elementary Teacher Education</option><option value=\"41\">Empowerment &amp; Development</option>\n");
      out.write("    <option value=\"139\">Endodontics</option><option value=\"258\">Engineering &amp; Technology</option>\n");
      out.write("    <option value=\"265\">Engineering &amp; Technology</option><option value=\"73\">English</option>\n");
      out.write("    <option value=\"149\">Enterpreneurship and Skill Development</option><option value=\"180\">Entrepreneurship</option>\n");
      out.write("    <option value=\"112\">Enviromental Studies</option><option value=\"117\">Environment And Sustainable Development</option>\n");
      out.write("    <option value=\"198\">Explorations towards a New Creation of the Self</option><option value=\"94\">Extension &amp; Development Studies</option>\n");
      out.write("    <option value=\"260\">Extension and Development Studies</option><option value=\"50\">Extension Education</option><option value=\"4\">Farming</option>\n");
      out.write("    <option value=\"90\">Finance &amp; Taxation</option><option value=\"178\">Financial Markets Practice</option><option value=\"148\">Fire Safety</option>\n");
      out.write("    <option value=\"24\">Fish Products Technology</option><option value=\"195\">Folklore and Culture Studies</option>\n");
      out.write("    <option value=\"211\">Food &amp; Beverage Service Operation</option><option value=\"77\">Food &amp; Nutrition</option>\n");
      out.write("    <option value=\"142\">Food and Safety</option><option value=\"25\">Food Safety (SOA)</option><option value=\"63\">Foods and Nutrition</option>\n");
      out.write("    <option value=\"209\">Front Office Operation</option><option value=\"199\">Future Studies Explorations towards a New Creation</option>\n");
      out.write("    <option value=\"98\">Gandhi and Peace Studies</option><option value=\"259\">Gandhi and Peace Studies</option>\n");
      out.write("    <option value=\"76\">Gender &amp; Development Studies</option><option value=\"130\">Geriatric Medicine</option>\n");
      out.write("    <option value=\"219\">Graduate Diploma in Marathi-Hindi Translation</option><option value=\"18\">Guidance</option>\n");
      out.write("    <option value=\"230\">Health and Environment</option><option value=\"134\">Health and Environment (SOHS)</option>\n");
      out.write("    <option value=\"231\">Health Care Waste Management</option><option value=\"136\">Health Care Waste Management (SOHS)</option>\n");
      out.write("    <option value=\"229\">Health Management</option><option value=\"128\">Health Management (SOHS)</option><option value=\"44\">health Sciences</option>\n");
      out.write("    <option value=\"247\">Health Sciences</option><option value=\"55\">Higher Education</option><option value=\"54\">Hindi</option>\n");
      out.write("    <option value=\"66\">History</option><option value=\"155\">HIV and Family Education</option><option value=\"133\">Home Based Care Provider</option>\n");
      out.write("    <option value=\"154\">Hospital Administrative Assistanceship</option><option value=\"88\">Hospitality Administration</option>\n");
      out.write("    <option value=\"210\">House Keeping Operation</option><option value=\"35\">Human Rights</option><option value=\"113\">Human Rights (SOSS)</option>\n");
      out.write("    <option value=\"53\">Humanities</option><option value=\"256\">IGNOU Institute for Vocational Education and Training</option>\n");
      out.write("    <option value=\"205\">Industrial Safety, Health and Environment Management</option><option value=\"165\">Information Technology</option>\n");
      out.write("    <option value=\"28\">Intellectual Property Law</option><option value=\"30\">Intellectual Property Rights (SOL)</option>\n");
      out.write("    <option value=\"121\">Intellectual Property Rights (SOS)</option><option value=\"248\">Inter-Disciplinary and Trans-Disciplinary Studies</option>\n");
      out.write("    <option value=\"249\">Inter-Disciplinary and Trans-Disciplinary Studies</option>\n");
      out.write("    <option value=\"250\">Inter-Disciplinary and Trans-Disciplinary Studies</option>\n");
      out.write("    <option value=\"261\">Inter-Disciplinary and Trans-Disciplinary Studies</option><option value=\"196\">Introduction to the Vedas</option>\n");
      out.write("    <option value=\"105\">Japanese</option><option value=\"84\">Journalism &amp; Mass Communication</option\n");
      out.write("    <option value=\"119\">Laboratory Techniques</option><option value=\"96\">Labour and Development</option><option value=\"1\">Law</option>\n");
      out.write("    <option value=\"266\">Law</option><option value=\"168\">Leather Goods Making</option><option value=\"8\">Legal Issues</option>\n");
      out.write("    <option value=\"29\">Legal Process Outsourcing</option><option value=\"67\">Library And Information Science</option>\n");
      out.write("    <option value=\"108\">Library Automation and Networking</option><option value=\"233\">Literacy</option>\n");
      out.write("    <option value=\"175\">M.Sc-Ph.D in Physics and Astrophysics</option><option value=\"223\">MA in Translation Studies</option>\n");
      out.write("    <option value=\"186\">Malayalam-Hindi Translation</option><option value=\"47\">Management</option>\n");
      out.write("    <option value=\"92\">Management Accounting &amp; Financial Strategies</option><option value=\"127\">Maternal &amp; Child Health</option>\n");
      out.write("    <option value=\"72\">Mathematics</option><option value=\"20\">Meat Technology</option><option value=\"83\">Mechanical Engineering</option>\n");
      out.write("    <option value=\"37\">Mediation</option><option value=\"167\">Motor Cycle Service Repair</option>\n");
      out.write("    <option value=\"237\">National Centre for Disability Studies</option>\n");
      out.write("    <option value=\"239\">National Centre for Innovations in Distance Education</option><option value=\"207\">Nautical Science</option>\n");
      out.write("    <option value=\"273\">New Programme Stream</option><option value=\"137\">Newborn and Infant Care</option><option value=\"71\">Nursing</option>\n");
      out.write("    <option value=\"131\">Nursing Administration</option><option value=\"141\">Nutrition and Childcare</option>\n");
      out.write("    <option value=\"132\">Oral Implantology</option><option value=\"6\">Organic Farming</option><option value=\"212\">Others</option>\n");
      out.write("    <option value=\"197\">Paradigms of Psychological Knowledge</option><option value=\"33\">Paralegal Practice</option>\n");
      out.write("    <option value=\"110\">Participatory Management of Displacement, Resettlement and Rehabiliation</option><option value=\"32\">Patent Practice</option>\n");
      out.write("    <option value=\"52\">Performing and Visual Arts</option><option value=\"159\">Performing Arts</option><option value=\"160\">PERSIAN LANGUAGE</option>\n");
      out.write("    <option value=\"255\">Personality Development</option><option value=\"144\">Pharmaceutical Sales Management</option>\n");
      out.write("    <option value=\"85\">Philosophy in Law</option><option value=\"81\">Philosophy in Life Sciences</option><option value=\"12\">Physics</option>\n");
      out.write("    <option value=\"46\">Physics</option><option value=\"126\">Physics</option><option value=\"2\">Physics (SOS)</option>\n");
      out.write("    <option value=\"176\">Physics and Astrophysics</option><option value=\"26\">Plantation Management</option>\n");
      out.write("    <option value=\"68\">Political Science</option><option value=\"222\">Post Graduate Diploma in Assamiya-Hindi Translation</option>\n");
      out.write("    <option value=\"220\">Post Graduate Diploma in Bangla-Hindi Translation</option>\n");
      out.write("    <option value=\"215\">Post Graduate Diploma in Intellectual Property Rights</option>\n");
      out.write("    <option value=\"214\">Post Graduate Diploma in Intellectual Property Rights (PGDIPR)</option>\n");
      out.write("    <option value=\"221\">Post Graduate Diploma in Malayalam-Hindi Translation</option>\n");
      out.write("    <option value=\"64\">Postgraduate Diploma in Radio Prasaran</option><option value=\"21\">Poultry Farming</option>\n");
      out.write("    <option value=\"102\">Poultry Farming</option><option value=\"166\">Power Distribution Management</option><option value=\"107\">Preparatory</option>\n");
      out.write("    <option value=\"179\">Preparatory Programme</option><option value=\"58\">Primary Curriculum and Insturction</option>\n");
      out.write("    <option value=\"13\">Primary Education</option><option value=\"17\">Primary Teaching</option>\n");
      out.write("    <option value=\"181\">Production of value Added Products Fom Cereals,Pulses, and Oil seeds</option>\n");
      out.write("    <option value=\"59\">Professional Devlopment of Teachers</option><option value=\"173\">Project Management</option>\n");
      out.write("    <option value=\"264\">PSYCHOLOGY</option><option value=\"200\">Psychology: A Science of Consciousness</option>\n");
      out.write("    <option value=\"69\">PUBLIC ADMINISTRATION</option><option value=\"89\">Public Policy</option><option value=\"39\">Radio Prasaran</option>\n");
      out.write("    <option value=\"188\">Radio Programme Production</option><option value=\"177\">Retailing</option><option value=\"61\">Rural Development</option>\n");
      out.write("    <option value=\"129\">Rural Surgery</option><option value=\"157\">Sanskrit</option><option value=\"56\">School Leadership and Mangement</option>\n");
      out.write("    <option value=\"156\">School of Foreign Languages</option><option value=\"11\">School of law</option>\n");
      out.write("    <option value=\"182\">School of Performing &amp; Visual Arts</option><option value=\"161\">School of Translation Studies and Training</option>\n");
      out.write("    <option value=\"115\">Science</option><option value=\"272\">Science</option><option value=\"147\">Security Management</option>\n");
      out.write("    <option value=\"146\">Security Operations</option><option value=\"19\">Sericulture</option><option value=\"169\">Shoe Lasting &amp; Finishing</option>\n");
      out.write("    <option value=\"171\">Shoe Upper Cutting</option><option value=\"170\">Shoe Upper Stitching</option>\n");
      out.write("    <option value=\"97\">Social Anthropology Historical Perspective</option><option value=\"87\">Social Entreprenuership</option>\n");
      out.write("    <option value=\"45\">Social Science</option><option value=\"43\">Social Work</option><option value=\"70\">SOCIOLOGY</option>\n");
      out.write("    <option value=\"213\">South East Asian Countries</option><option value=\"145\">Spoken English and Personality Development</option>\n");
      out.write("    <option value=\"78\">Sri Aurobindo Studies</option><option value=\"238\">Staff Training and Research Institute of Distance Education</option>\n");
      out.write("    <option value=\"184\">Sustainability Science</option><option value=\"14\">Teaching</option\n");
      out.write("    <option value=\"120\">Teaching of Primary School Mathematics</option><option value=\"125\">Test</option><option value=\"194\">TIFR Centre</option>\n");
      out.write("    <option value=\"153\">Tour Guiding Skills</option><option value=\"42\">Tourism Management</option><option value=\"163\">Tourism Studies</option>\n");
      out.write("    <option value=\"254\">Traditional Knowledge Systems</option><option value=\"208\">Training Packages in Disability</option>\n");
      out.write("    <option value=\"48\">Trans-disciplinary Studies</option><option value=\"51\">Translation</option><option value=\"40\">Translation (SOH)</option>\n");
      out.write("    <option value=\"99\">Translation Studies</option><option value=\"152\">Travel Agency Operations</option>\n");
      out.write("    <option value=\"201\">Upasnishads in the light of Sri Aurobindo</option><option value=\"104\">Urdu</option>\n");
      out.write("    <option value=\"158\">Visual Arts</option><option value=\"217\">Visual-Arts</option><option value=\"49\">Vocational Education</option\n");
      out.write("    <option value=\"101\">Water Harvesting and Management</option><option value=\"191\">Water Resources Engineering</option>\n");
      out.write("    <option value=\"203\">Watershed Management</option><option value=\"111\">Women's Empowerment &amp; Development</option>\n");
      out.write("    <option value=\"75\">Women's Studies</option><option value=\"193\">Zoology</option>\n");
      out.write("</select>    \n");
      out.write("    \n");

try
        {
String str1=request.getParameter("st1");
String str2=request.getParameter("st2");
if(str1.equals("2")&& str2.equals("93"))
    {
  
    
      out.write("\n");
      out.write("    ");
      if (true) {
        _jspx_page_context.forward("SOCIS.jsp");
        return;
      }
      out.write("\n");
      out.write("    \n");
      out.write("    ");

    }
    else
        {
        }
        
    }
    catch(Exception e)
    {
        }
    



      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <br><br><br> \n");
      out.write("\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\n");
      out.write(" <input type=\"submit\" value=\"Search\" size=\"30\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("</tr></td></table>  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
