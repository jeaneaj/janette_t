package tooltwist.janette.productionHelpers;

import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

//import org.apache.commons.httpclient.HttpClient;
//import org.apache.commons.httpclient.HttpStatus;
//import org.apache.commons.httpclient.methods.PostMethod;

import tooltwist.ecommerce.AutomaticUrlParametersMode;
import tooltwist.ecommerce.RoutingUIM;
import tooltwist.misc.JspHelper;
import tooltwist.wbd.WbdProductionHelper;
import tooltwist.wbd.WbdSession;

import com.dinaa.data.XData;
import com.dinaa.ui.UimData;
import com.dinaa.xpc.Xpc;
import com.dinaa.xpc.XpcSecurity;

public class EmployeeAddressMaintenanceProductionHelper extends WbdProductionHelper
{
	private static String AUTO_URL_PARAMETER_NAME = "myParam";
	private XData data = null;
	private String myValue;
	private String myAutoUrlParameter;

	public EmployeeAddressMaintenanceProductionHelper(Properties prop)
	{
		super(prop);
	}

	@Override
	public XData preFetch(UimData ud) throws Exception
	{
		HttpServletRequest request = ((JspHelper)ud).getRequest();
		String id = request.getParameter("id");
		
		Xpc xpc = ud.getXpc();
		xpc.start("phinza.D.employeeAddress", "select");
		xpc.attrib("id", id);
		data = xpc.run();
 
		return data;
	}
  
}
