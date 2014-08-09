/**
 * @author  Madhavi
 */
package  demoservlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class serv5  extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException
    {
	   res.setContentType("text/html");
	   PrintWriter  pw=res.getWriter();
	   
	  pw.println("<body bgcolor=#ccffcc  text=green>");
	  pw.println("<h1><center>student information</h1></center><hr><br><h3>");
	  pw.println("<table align=center  width=80%  border=2>");
	   Iterator iter =req.getParameterMap().keySet().iterator();
	   while(iter.hasNext())
	   {
		String pname=(String)iter.next();
		if(pname.equals("languages") || pname.equals("courses"))
		{
			String data[]=req.getParameterValues(pname);
			String str="";
			for(int i=0;i<data.length;i++)
			{
				str+=data[i]+"  ";
			}
			pw.println("<tr><th>"+pname+"  <th>  "+str+"</tr>");
		}
		else
		        pw.println("<tr><th>"+pname+"  <th>   "+req.getParameter(pname)+"</tr>");
	   }
	  pw.println("</table></body>");
    }
}