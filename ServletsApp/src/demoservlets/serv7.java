/**
 * @author  Madhavi
 */
package  demoservlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class serv7  extends HttpServlet
{
    public void service(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException
    {
	   res.setContentType("text/html");
	   PrintWriter  pw=res.getWriter();
	   
	  pw.println("<body  text=blue>");
	  pw.println("<h1>context parameters of webapplication</h1><hr><br><h3>");
	  ServletContext  ctx=getServletContext();
	   Enumeration enum1=ctx.getInitParameterNames();
	    while(enum1.hasMoreElements())
	    {
		String ipname=(String)enum1.nextElement();
		pw.println(ipname+"  =  "+ctx.getInitParameter(ipname)+"<br>");
	    }
	
    }
}