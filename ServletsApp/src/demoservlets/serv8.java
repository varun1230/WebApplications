/**
 * @author  Madhavi
 */
package  demoservlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class serv8  extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter  pw=res.getWriter();

		pw.println("<body  text=magenta>");
		pw.println("<h1>request headers</h1><hr><br><h3>");
		Enumeration enum1=req.getHeaderNames();
		while(enum1.hasMoreElements())
		{
			String hname=(String)enum1.nextElement();
			pw.println(hname+"  =  "+req.getHeader(hname)+"<br>");
		}
		pw.println("<br><br>");
		pw.println(req.getRemoteAddr()+"<br>");
		pw.println(req.getRemotePort()+"<br>");
		pw.println(req.getServerName()+"<br>");
		pw.println(req.getServerPort()+"<br>");
		pw.println(req.getContextPath()+"<br>");
		pw.println(req.getServletPath()+"<br>");
	}
}