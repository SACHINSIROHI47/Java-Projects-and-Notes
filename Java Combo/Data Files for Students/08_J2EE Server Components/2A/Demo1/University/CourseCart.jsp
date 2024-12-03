<%@ page import="javax.ejb.*,javax.naming.*, javax.rmi.PortableRemoteObject,java.rmi.RemoteException,java.math.*,University.Course,University.CourseHome,java.util.*" 
%>
<%!
  private Course course = null;
  CourseHome home=null;
  public void jspInit()  
  {
/* Locating the stateful session bean.*/
    	try
{
      		InitialContext ic = new InitialContext();
      		Object objRef = ic.lookup("java:comp/env/ejb/Univ");
      		home=(CourseHome)PortableRemoteObject.narrow(objRef,  CourseHome.class);      
    	}
     	catch(Exception ex)
{}
  }
%>
<html>
<head>
   <title>University Registration Application</title>
</head>
<body bgcolor="white">
<form method="get" name="f1">
<%
  String stdname = request.getParameter("stdname");
  String stdrollno = request.getParameter("stdrollno");
  if ( stdname != null && stdname.length() > 0 ) 
  {
	  if ( stdrollno != null && stdrollno.length() > 0 ) 
  {
               /* Creating a bean instance.*/
		 course = home.create(stdname,stdrollno);
   }
}
%>
<H1>University Registration Application</h1>
<p>Welcome <%=stdname%>     
       
<p>
Please a Course Subject
	<select name=ch size=1>
		<option>Geography</option>
       <option>History</option>
  		<option>Zoology</option>
  		<option>Botany</option>
  	</select>
  	<br>
     
  	<%
  		int i=1;
  		String choice=request.getParameter("ch");
  		if(choice!=null)
  		{
	  		if(!choice.equals("--"))
	  		{
  	  		String str=course.addCourse(choice);             %>
  	  		<p><%=str%>

                
	<%
    		}
		}  	  		
  	  	String rmcourse=request.getParameter("c");		
        if(rmcourse!=null)
        {
	    course.removeCourse(rmcourse);
 }   	
  	     Vector courseList = new Vector();
            courseList = course.getSelectedCourse();
            Enumeration enumer = courseList.elements();           %>
            <form method="get" name="f2">
            <p><p>
            <table border=1>
                <th>      
                	Course Name
                </th>
                <th>
                	Select Course to remove  
                </th>                <%
            	   while (enumer.hasMoreElements()) 
   {
                	String title = (String) enumer.nextElement();
                	if (title!=null)
                	{
	             %>          
<tr>
<td>
<%=title%>
</td>
<td>
<input type=radio name=c value=<%=title%>>
</td>
</tr>                
             <%}                
       	   }                   
	%>
	</table>
<input type="hidden" name="stdname" size="25" value=<%=stdname%>>
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</form>
</body>
</html> 
