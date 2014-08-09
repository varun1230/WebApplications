/**
 * @author  Madhavi
 */
package  demoservlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class serv9  extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter  pw=res.getWriter();
		
		int v1=Integer.parseInt(req.getParameter("t1"));
		String v2=req.getParameter("t2");
		double v3=Double.parseDouble(req.getParameter("t3"));
		int v4=Integer.parseInt(req.getParameter("t4"));
		
		try{
			Class.forName("org.gjt.mm.mysql.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root","root123");
			PreparedStatement ps=cn.prepareStatement("insert into ourproducts values(?,?,?,?) ");
			ps.setInt(1,v1);
			ps.setString(2,v2);
			ps.setDouble(3,v3);
			ps.setInt(4,v4);
			ps.executeUpdate();
			pw.println("record is inserted..");
			ps.close();
			cn.close();
		}catch(Exception e)
		{
			System.out.println(e);
			pw.println(e);
		}	
	}
}
/*
 create table ourproducts 
 (pid int primary key,
  pname varchar(20),
  price double,
  quantity int
 );

 */