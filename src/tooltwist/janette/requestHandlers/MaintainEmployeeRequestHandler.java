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
// Uncomment this to get variables from the request
//		// Take values from the request sent from the browser, and save them
//		// away for production helpers and code inserters to use.
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
			uh.reply("Update");
		}
		
		else {
			//insert employee data
			Xpc xpc = uh.getXpc();
			xpc.start("phinza.D.employee", "insert");
			xpc.attrib("employeeName", employeeName);
			xpc.attrib("age", employeeAge);
			xpc.run();
			uh.reply("Insert");
		}
		
		
// 	if (firstname != null)
//			WbdSession.setTemporaryValue(uh.getCredentials(), "firstname", firstname);
//
//		String surname = uh.getRequestValue("surname");
//		if (surname != null)
//			WbdSession.setTemporaryValue(uh.getCredentials(), "surname", surname);
		

// Uncomment this to redirect to a different navpoint
//				// Perhaps redirect to a different page
//				if (CHECK SOMETHING HERE)
//				{
//					String alternateNavpoint = "[[string-projectShortName]]-home";
//					RoutingUIM.gotoNavpoint(uh, alternateNavpoint);
//					return true; // redirected already
//				}
		return true;
	}

}
