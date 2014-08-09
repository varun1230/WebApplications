/**
 * @author  Madhavi
 */
package demoservlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class  serv4 extends HttpServlet
{
       public void doGet(HttpServletRequest req,HttpServletResponse res)
      throws ServletException,IOException
     {
	   res.setContentType("text/html");
	   PrintWriter pw=res.getWriter();
	   
	   int bid=Integer.parseInt(req.getParameter("t1"));
	   String bname=req.getParameter("t2");
	   double bprice=Double.parseDouble(req.getParameter("t3"));

	     pw.println("<body  bgcolor=#ffffcc text=green>");
	     pw.println("<h1>book information</h1><hr><br><h3>");
	     pw.println("book id :"+bid+"<br>");
	     pw.println("book name :"+bname+"<br>");
	     pw.println("book price :"+bprice+"<br>");
       }
   
}


