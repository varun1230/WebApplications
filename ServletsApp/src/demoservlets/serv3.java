/**
 * @author  Madhavi
 */
package demoservlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class  serv3 extends HttpServlet
{
   /*  public void service(HttpServletRequest req,HttpServletResponse res)
      throws ServletException,IOException
     {
	   res.setContentType("text/html");
	   PrintWriter pw=res.getWriter();
	   pw.println("<font color=green size=6>execution of  service method.</font>");
       } */
     public void doGet(HttpServletRequest req,HttpServletResponse res)
      throws ServletException,IOException
     {
	   res.setContentType("text/html");
	   PrintWriter pw=res.getWriter();
	   pw.println("<font color=red size=6>execution of  doGet method.</font>");
       }
     public void doPost(HttpServletRequest req,HttpServletResponse res)
      throws ServletException,IOException
     {
	   res.setContentType("text/html");
	   PrintWriter pw=res.getWriter();
	   pw.println("<font color=magenta size=6>execution of  doPost method.</font>");
       }

}