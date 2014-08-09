/**
 * @author  Madhavi
 */
package  demoservlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class serv18 extends HttpServlet
{            

    public void doGet(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException
    {
	   res.setContentType("text/html");
	   PrintWriter  pw=res.getWriter();
	
	  String v1=req.getParameter("t1");
	  HttpSession ses=req.getSession();
	  ses.setAttribute("msg",v1);
	   
	   RequestDispatcher rd=req.getRequestDispatcher("sdoc18.html");
	   rd.forward(req,res);
    }
    public void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException
    {
	   res.setContentType("text/html");
	   PrintWriter  pw=res.getWriter();

	   HttpSession  ses=req.getSession();
	    pw.println("msg value :"+ ses.getAttribute("msg"));
    }
}
