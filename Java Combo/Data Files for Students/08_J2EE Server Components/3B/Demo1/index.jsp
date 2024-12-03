<%@ page import="java.util.*,javax.ejb.CreateException,javax.ejb.DuplicateKeyException,javax.ejb.FinderException,javax.ejb.ObjectNotFoundException,javax.ejb.RemoveException,javax.naming.Context,javax.naming.InitialContext,javax.naming.NamingException,javax.rmi.PortableRemoteObject,cmrbank.LocalCustomer, cmrbank.LocalCustomerHome, cmrbank.LocalAccount, cmrbank.LocalAccountHome" %>

<%!
    private LocalAccount acnt = null;
    private LocalCustomer cust = null;
    public void jspInit()  
     {
       try {
        InitialContext ctx = new InitialContext();
        Object home = (LocalAccountHome) ctx.lookup("java:comp/env/ejb/cmraccount");
         LocalAccountHome ahome =  (LocalAccountHome) PortableRemoteObject.narrow(home, LocalAccountHome.class);
        acnt = (LocalAccount)ahome.create("Savings");
        Object home1 = (LocalCustomerHome) ctx.lookup("java:comp/env/ejb/cmrcustomer");
        LocalCustomerHome chome =  (LocalCustomerHome) PortableRemoteObject.narrow(home1, LocalCustomerHome.class);
        cust = chome.create("Robin Smith");
	  
        cust.addAccount(acnt);

        acnt = (LocalAccount)ahome.create("Current");
        cust.addAccount(acnt); 

    } catch (Exception ne) {
		ne.printStackTrace();
  }
}
%>
<html>
<body>
<h3>Container-managed one to many unidirectional relationship established between the Customer and Account CMP entity beans.</h3>  
</body>
</html>
