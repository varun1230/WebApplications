package  demoservlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class demoserv  extends HttpServlet
{             
    public void service(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException
    {	
	   res.setContentType("text/html");
	   PrintWriter  pw=res.getWriter();
	    
	   pw.println("<font color=blue>");
	   pw.println("execution of demo servlet..<br>");
	   pw.println("current date & time :"+new Date()+"<br>");
	   pw.println("</font>");	
	  // pw.println("a value :" + req.getAttribute("a"));
	
    }
}
