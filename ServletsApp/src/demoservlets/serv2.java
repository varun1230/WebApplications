/**
 * @author  Madhavi
 */
package demoservlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class  serv2 extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();

		Calendar  c1=Calendar.getInstance();
		int h=c1.get(Calendar.HOUR_OF_DAY);
		if(h < 12)
			pw.println("<font color=red size=6> Good Morning...</font>");
		else if ( h < 17)
			pw.println("<font color=blue size=6> Good Afternoon..</font>");
		else
			pw.println("<font color=green size=6> Good Evening...</font>");
	}
}