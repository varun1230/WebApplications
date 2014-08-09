/**
 * @author  Madhavi
 */
package  demolisteners;
import javax.servlet.*;
public class ourrequestlistener  implements ServletRequestListener
{	
	ServletContext ctx;
	public void requestInitialized(ServletRequestEvent e)
	{
		ctx=e.getServletContext();
		ctx.log("sminfo :   request  initialized...");
	}
	public void requestDestroyed(ServletRequestEvent e)
	{
		ctx.log("sminfo :   request  destroyed...");
		ctx=null;
	}
}