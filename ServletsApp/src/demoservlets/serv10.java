/**
 * @author  Madhavi
 */
package  demoservlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class serv10  extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter  pw=res.getWriter();

		String tablename=req.getParameter("tname");

		try{
			ServletContext ctx=getServletContext();
			Class.forName(ctx.getInitParameter("driver"));
			Connection cn=DriverManager.getConnection(ctx.getInitParameter("url"),ctx.getInitParameter("username"),ctx.getInitParameter("password"));
			Statement st=cn.createStatement();
			ResultSet rs=st.executeQuery("select * from "+ tablename);
			ResultSetMetaData md=rs.getMetaData();
			int cols=md.getColumnCount();
			pw.println("<body bgcolor=#ffffcc text=magenta>");
			pw.println("<h1><center>"+tablename+" table information </h1><hr><br><h3>");
			pw.println("<table align=center width=80%  border=2 >");
			pw.println("<tr>");
			for(int i=1;i<=cols;i++)
				pw.println("<th>"+md.getColumnLabel(i));
			pw.println("</tr>");		            
			while(rs.next())
			{
				pw.println("<tr>");
				for(int i=1;i<=cols;i++)
					pw.println("<td>"+rs.getString(i));
				pw.println("</tr>");
			}
			pw.println("</table>");
			pw.println("<a  href='sdoc10.html'>back..</a>");
			pw.println("</body>");
			rs.close();
			cn.close();
		}catch(Exception e)
		{
			System.out.println(e);
			pw.println(e);
		}	
	}
}
