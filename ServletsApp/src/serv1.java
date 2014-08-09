/**
 * @author  Madhavi
 */
import javax.servlet.*;
import java.io.*;
public class serv1 extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("<center><font color=green size=8>welcome to St.Louis</font></center><br><hr><br>");
		pw.println("this is our first web component in the apache server.");
		pw.close();

	}
}