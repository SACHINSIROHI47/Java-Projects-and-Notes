/* Import servlet packages for Http request and response and for input/output */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ClientInformation implements Filter
{
	private FilterConfig flt_conf = null;
	/* Intialize the servlet instance */
	public void init(FilterConfig config) throws ServletException
	{
		flt_conf = config;
	}
	/* Release the servlet instance */
	public void destroy()
	{
    	flt_conf = null;
	}

	public void doFilter(ServletRequest req, ServletResponse resp,FilterChain chain) throws IOException, ServletException
	{
HttpServletRequest request=(HttpServletRequest)req;
HttpServletResponse response=(HttpServletResponse)resp;

/*Retrieve client informaion*/

String browser=request.getHeader("user-agent");
String accept=request.getHeader("Accept");
String acceptLang=request.getHeader("Accept-Language");
String hostName=request.getHeader("Host");


/*Store information in request object*/
    
request.setAttribute("browser",browser);
request.setAttribute("accept",accept);    
request.setAttribute("acceptLang",acceptLang);    
request.setAttribute("host",hostName);     
    
/*Filter the request and response object*/  
chain.doFilter(request, response);

		
	}
}
