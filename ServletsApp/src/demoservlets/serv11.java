/**
 * @author  Madhavi
 */
package  demoservlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class serv11  extends HttpServlet
{             int n;
			public void init()
			{
				n=0;	
			}
			public void service(HttpServletRequest req,HttpServletResponse res)
			throws ServletException,IOException
			{	
				n++;
				res.setContentType("text/html");
				PrintWriter  pw=res.getWriter();
				pw.println("this page is requested "+n+" number of times by different clients..");
			
			}
}
