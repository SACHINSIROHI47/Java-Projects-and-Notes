<%@ page import="java.util.*,javax.ejb.CreateException,javax.ejb.DuplicateKeyException,javax.ejb.FinderException,javax.ejb.ObjectNotFoundException,javax.ejb.RemoveException,javax.naming.Context,javax.naming.InitialContext,javax.naming.NamingException,javax.rmi.PortableRemoteObject,cmrstudent.LocalStudent, cmrstudent.LocalStudentHome, cmrstudent.LocalCourse, cmrstudent.LocalCourseHome" %>


<%!
    private LocalCourse crs = null;
    private LocalStudent std = null;
    public void jspInit()  
     {
       try {
        InitialContext ctx = new InitialContext();
        Object home = (LocalCourseHome) ctx.lookup("java:comp/env/ejb/cmrcourse");
 
        LocalCourseHome chome =  (LocalCourseHome) PortableRemoteObject.narrow(home, LocalCourseHome.class);
        crs = (LocalCourse)chome.create("Science");
	
        Object home1 = (LocalStudentHome) ctx.lookup("java:comp/env/ejb/cmrstudent");
        LocalStudentHome shome =  (LocalStudentHome) PortableRemoteObject.narrow(home1, LocalStudentHome.class);
        std = shome.create("David");
	  
        std.addCourse(crs);
	crs = (LocalCourse)chome.create("Arts");
        
        std.addCourse(crs); 

    } catch (Exception ne) {
		ne.printStackTrace();
  }
}
%>
<html>
<body bgcolor="lightyellow">
<h4>One to many unidirectional relationship established between the Student and Course CMP entity beans.</h4>  
</body>
</html>
