/**
 * @author  Madhavi
 */
package  demolisteners;
import javax.servlet.*;
import javax.servlet.http.*;
public class oursessionlistener  implements ServletContextListener,HttpSessionListener,HttpSessionAttributeListener
{	
	ServletContext ctx;
	public void contextInitialized(ServletContextEvent e)
	{
		ctx=e.getServletContext();
	}
	public void contextDestroyed(ServletContextEvent e)
	{
		ctx=null;
	}

	public void sessionCreated(HttpSessionEvent e)
	{
		ctx.log("sminfo :  session  created :"+ e.getSession());
	}
	public void sessionDestroyed(HttpSessionEvent e)
	{
		ctx.log("sminfo :  session  destroyed :"+ e.getSession());
	}

	public void attributeAdded(HttpSessionBindingEvent e)
	{
		ctx.log("sminfo :   session   :   attribute   added :"+   e.getName()+" = "+e.getValue());
	}
	public void attributeRemoved(HttpSessionBindingEvent e)
	{
		ctx.log("sminfo :   session   :   attribute  removed  :"+   e.getName()+" = "+e.getValue());
	}
	public void attributeReplaced(HttpSessionBindingEvent e)
	{
		ctx.log("sminfo :   session   :   attribute  replaced   :"+   e.getName()+" = "+e.getValue());
	}
}