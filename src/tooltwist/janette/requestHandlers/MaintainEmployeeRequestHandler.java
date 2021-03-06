package tooltwist.janette.requestHandlers;

import java.io.IOException;
import javax.servlet.ServletException;

import com.dinaa.DinaaException;
import com.dinaa.ui.UiModuleException;
import com.dinaa.ui.UimHelper;
import com.dinaa.xpc.Xpc;
import com.dinaa.xpc.XpcException;

import tooltwist.wbd.WbdRequestHandler;

/**
 * Request handler "maintainEmployee" - Maintain Employee Data
 * 
 * This handler can be called from a client browser before control is passed to a normal
 * navpoint. To call it, add this parameter to a normal ToolTwist URL:
 * 
 *         op=janette_widgets.employeeMaintenance.maintainEmployee
 * 
 * After this method is called, the requested navpoint will be displayed in the usual
 * manner. To pass control to a different navpoint, use RoutingUIM.gotoNavpoint(), and
 * then return true.
 *
 * @author ?
 */
public class MaintainEmployeeRequestHandler extends WbdRequestHandler
{

	@Override
	public boolean handler(UimHelper uh, String widgetId, String method) throws ServletException, IOException, DinaaException
	{
		String subop = uh.getRequestValue("subop");
		
		if(subop != null && subop.equalsIgnoreCase("update")) {
			String employeeId = uh.getRequestValue("employeeId");
			String employeeName = uh.getRequestValue("employeeName");
			String employeeAge = uh.getRequestValue("employeeAge");
			
			if (employeeId != null && !employeeId.equals("")) {
				//update employee data
				Xpc xpc = uh.getXpc();
				xpc.start("phinza.D.employee", "update");
				xpc.attrib("id", employeeId);
				xpc.attrib("employeeName", employeeName);
				xpc.attrib("age", employeeAge);
				xpc.run();
				uh.reply("Employee record successfully updated");
			}
			
			
			else {
				//insert employee data
				Xpc xpc = uh.getXpc();
				xpc.start("phinza.D.employee", "insert");
				xpc.attrib("employeeName", employeeName);
				xpc.attrib("age", employeeAge);
				xpc.run();
				uh.reply("Employee record successfully inserted");
			}
			
			
			
		}
		else if(subop != null && subop.equalsIgnoreCase("delete")) {
			String employeeId = uh.getRequestValue("employeeId");
			
			//delete employee data
			Xpc xpc = uh.getXpc();
			xpc.start("phinza.D.employee", "delete");
			xpc.attrib("id", employeeId);
			xpc.run();
			uh.reply("Employee record successfully deleted");
		}
		
		
 
		return true;
	}

}
