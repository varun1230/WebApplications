/**
 * @author  Madhavi
 */
package  demolisteners;
import javax.servlet.*;
public class ourcontextlistener  implements ServletContextListener,ServletContextAttributeListener
{	
	ServletContext ctx;
	public void contextInitialized(ServletContextEvent e)
	{
		ctx=e.getServletContext();
		ctx.log("sminfo :   context initialized...");
	}
	public void contextDestroyed(ServletContextEvent e)
	{
		ctx.log("sminfo :  context destroyed...");
		ctx=null;
	}

	public void attributeAdded(ServletContextAttributeEvent e)  
	{
		ctx.log("sminfo :   context   :   attribute   added :"+   e.getName()+" = "+e.getValue());
	}
	public void attributeRemoved(ServletContextAttributeEvent e)
	{
		ctx.log("sminfo :   context   :   attribute  removed  :"+   e.getName()+" = "+e.getValue());
	}
	public void attributeReplaced(ServletContextAttributeEvent e)  
	{
		ctx.log("sminfo :   context   :   attribute  replaced   :"+   e.getName()+" = "+e.getValue());
	}
}