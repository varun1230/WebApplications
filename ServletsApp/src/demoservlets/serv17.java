/**
 * @author  Madhavi
 */
package  demoservlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class serv17 extends HttpServlet
{            

    public void doGet(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException
    {
	   res.setContentType("text/html");
	   PrintWriter  pw=res.getWriter();
	
	  String v1=req.getParameter("t1");
	   ServletContext  ctx=getServletContext();
	   ctx.setAttribute("msg",v1);
	   
	   RequestDispatcher rd=req.getRequestDispatcher("sdoc17.html");
	   rd.forward(req,res);
    }
    public void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException
    {
	   res.setContentType("text/html");
	   PrintWriter  pw=res.getWriter();

	   ServletContext ctx=getServletContext();
	    pw.println("msg value :"+ ctx.getAttribute("msg"));
    }
}
