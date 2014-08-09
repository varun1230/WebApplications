/**
 * @author  Madhavi
 */
package  demoservlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class serv6  extends HttpServlet
{
    public void service(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException
    {
	   res.setContentType("text/html");
	   PrintWriter  pw=res.getWriter();
	   
	   pw.println("<body  text=red>");
	   pw.println("<h1>initial parameters of servlet</h1><hr><br><h3>");
	   //ServletConfig  con=getServletConfig();
	 //  Enumeration enum1=con.getInitParameterNames();
	   Enumeration enum1=getInitParameterNames();
	    while(enum1.hasMoreElements())
	    {
		String ipname=(String)enum1.nextElement();
		pw.println(ipname+"  =  "+getInitParameter(ipname)+"<br>");
	    }
	
    }
}