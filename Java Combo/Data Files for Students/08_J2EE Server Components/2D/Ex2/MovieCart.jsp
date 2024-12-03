<%@ page import="javax.ejb.*,javax.naming.*, javax.rmi.PortableRemoteObject,java.rmi.RemoteException,java.math.*,movie.Movie,movie.MovieHome,java.util.*" 
%>
<%!
  private Movie mv = null;
  MovieHome home=null;
  public void jspInit()  
  {
    try {
      InitialContext ic = new InitialContext();
      Object objRef = ic.lookup("java:comp/env/ejb/moviecart");
      home=(MovieHome)PortableRemoteObject.narrow(objRef, MovieHome.class);      
      mv = home.create();	
    }
     catch(Exception ex)
{}
  }
%>
<html>
<head>
   <title>Movie Cart Application</title>
</head>

<body bgcolor="white">
<form method="get" name="f1">
<H1>Movie Cart Application</h1>
  <p>
  Please select a movie 
  		 <select name=mv size=1>
  		 <option>--</option>
  		<option>Independance Day</option>
  		<option>Benhoor</option>
  		<option>Jurassic Park</option>
  		<option>Enter the Dragon</option>
  		</select>
  	<br>
  	<%
  		int i=1;
  		String moviechoice=request.getParameter("mv");
  		if(moviechoice!=null)
  		{
	  		if(!moviechoice.equals("--"))
	  		{
  	  		String mstr=mv.addMovieCart(moviechoice);             %>
  	  		<p><%=mstr%>
  	  		<%
    		}
		}  	  		
  	   	
  	  		
  	    Vector movieList = new Vector();
            movieList = mv.getSelectedMovies();
            Enumeration menum = movieList.elements();           %>
            <form method="get" name="f2">
            <p><p>
            <table border=1>
                <th>      
                	Movie Name
                </th>
                                <%
            while (menum.hasMoreElements()) {
                String movietitle = (String) menum.nextElement();
                if (movietitle!=null)
                {
	             %>          
                <tr>
                <td>
                <%=movietitle%>
                </td>
                </tr>                
         
       <%}                
            }                   
	
	%>
	</table>
<br> 
<input type="submit" value="Add to Cart">

</form>
	
</body>
</html>