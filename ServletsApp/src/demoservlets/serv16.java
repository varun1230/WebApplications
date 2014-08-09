/**
 * @author  Madhavi
 */
package  demoservlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class serv16 extends HttpServlet
{            

	public void doGet(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter  pw=res.getWriter();

		String cname=req.getParameter("v1");
		String cvalue=req.getParameter("v2");

		Cookie c1=new Cookie(cname,cvalue);
		
		if(cname.equals("msg"))
			c1.setMaxAge(2* 24 * 60 * 60 * 1000);
	
		
		res.addCookie(c1);
		pw.println("cookie is created....");
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter  pw=res.getWriter();

		Cookie c[]=req.getCookies();
		pw.println("<body bgcolor=#ffffcc text=green>");
		pw.println("<h1><center> cookies information..</h1><hr><br><h3>");
		if(c != null) {
				for(int i=0;i<c.length;i++)
					pw.println(c[i].getName()+"  =  "+c[i].getValue()+"<br>");
		}
	}
}
