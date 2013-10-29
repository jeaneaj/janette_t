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
 * Request handler "employeeAddressMaintenance" - Employee Address Maintenance
 * 
 * This handler can be called from a client browser before control is passed to a normal
 * navpoint. To call it, add this parameter to a normal ToolTwist URL:
 * 
 *         op=janette_widgets.employeeAddressMaintenance.employeeAddressMaintenance
 * 
 * After this method is called, the requested navpoint will be displayed in the usual
 * manner. To pass control to a different navpoint, use RoutingUIM.gotoNavpoint(), and
 * then return true.
 *
 * @author ?
 */
public class EmployeeAddressMaintenanceRequestHandler extends WbdRequestHandler
{

	@Override
	public boolean handler(UimHelper uh, String widgetId, String method) throws ServletException, IOException, DinaaException
	{


String subop = uh.getRequestValue("subop");
		
		if(subop != null && subop.equalsIgnoreCase("update")) {
		
			String id = uh.getRequestValue("id");
			String street = uh.getRequestValue("street");
			String town = uh.getRequestValue("town");
			String city = uh.getRequestValue("city");
			String country = uh.getRequestValue("country");
			
			if (id != null && !id.equals("")) {
				//update employee data
				Xpc xpc = uh.getXpc();
				xpc.start("phinza.D.employeeAddress", "update");
				xpc.attrib("id", id);
				xpc.attrib("street", street);
				xpc.attrib("town", town);
				xpc.attrib("city", city);
				xpc.attrib("country", country);
				xpc.run();
				uh.reply("Employee  address record successfully updated");
			}
			
			
			else {
				//insert employee data
				Xpc xpc = uh.getXpc();
				xpc.start("phinza.D.employeeAddress", "insert");
				xpc.attrib("id", id);
				xpc.attrib("street", street);
				xpc.attrib("town", town);
				xpc.attrib("city", city);
				xpc.attrib("country", country);
				xpc.run();
				uh.reply("Employee record successfully inserted");
			}
			
			
			
		}
		else if(subop != null && subop.equalsIgnoreCase("delete")) {
			String id = uh.getRequestValue("id");
			
			//delete employee data
			Xpc xpc = uh.getXpc();
			xpc.start("phinza.D.employeeAddress	", "delete");
			xpc.attrib("id", id);
			xpc.run();
			uh.reply("Employee record successfully deleted");
		}
		
		
 
		return true;
	}

}
