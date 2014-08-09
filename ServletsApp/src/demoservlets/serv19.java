/**
 * @author  Madhavi
 */
package  demoservlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class serv19 extends HttpServlet
{            
	int n;
	public void service(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter  pw=res.getWriter();
		HttpSession ses=req.getSession();
		pw.println("<font color=red size=4 >");
		pw.println("is new session :"+ses.isNew()+"<br>");
		pw.println("session id :"+ses.getId()+"<br>");
		pw.println("maximum inactive interval :"+ ses.getMaxInactiveInterval()+"<br>");
		if( ses.isNew())
		{
			n=0;
		}
		else
		{
			n=((Integer)ses.getAttribute("hitcount")).intValue();
			pw.println("hit count :"+ n+"<br>");
			pw.println("last hit :"+ ses.getAttribute("lasthit")+"<br>");
		}
		ses.setAttribute("hitcount",new Integer(++n));
		ses.setAttribute("lasthit",new Date());
	}
}
