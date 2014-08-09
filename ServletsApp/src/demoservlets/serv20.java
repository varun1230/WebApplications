/**
 * @author  Madhavi
 */
package  demoservlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class serv20 extends HttpServlet
{            

	public void service(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter  pw=res.getWriter();
		ResourceBundle rb=ResourceBundle.getBundle("ourmessages");
		pw.println(rb.getString("header1"));
		pw.println(rb.getString("msg.wish"));
		pw.println(rb.getString("msg.welcome"));
	}
}
