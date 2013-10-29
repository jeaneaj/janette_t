
<html>
<head>
<title></title>
</head>
<body>
<%
	WbdProductionHelper helper = null;
	JspHelper jh = null;
	String snippetVar_myProperty;
	String snippetVar_thisNavpoint;
%>
<!--START-->
<%@page import="com.dinaa.data.XNodes"%>
<%@page import="tooltwist.wbd.WbdProductionHelper"%>
<%@page import="com.dinaa.data.XData"%>
<%@page import="tooltwist.janette.productionHelpers.EmployeeAddressMaintenanceProductionHelper"%>
<%@page import="tooltwist.misc.JspHelper"%>
<%@page import="tooltwist.ecommerce.AutomaticUrlParametersMode"%>
<%@page import="tooltwist.ecommerce.RoutingUIM"%>
<%
	// Get the production helper for this widget
	EmployeeAddressMaintenanceProductionHelper h = (EmployeeAddressMaintenanceProductionHelper) helper;
	XData data = h.getData(jh);
  
	XNodes nodes = data.getNodes("/select/employeeAddress");
	 
	nodes.next();
%>

<!-- ********** INSERT HTML HERE ********** -->
 
 <form method="post" action="">

<input type="hidden"  name="op" value= "janette_widgets.employeeAddressMaintenance.employeeAddressMaintenance"/>
<table width="500px">

	<tr>
		<td width="30%">ID : </td>
		<td><input type="text" id="id" name="id" value = "<%=nodes.getText("id") %>" ></td>
	</tr>
	<tr>
		<td width="30%">Employee ID : </td>
		<td><input type="text" id="employeeId" name="employeeId" value = "<%=nodes.getText("employeeId") %>" ></td>
	</tr>
	
	<tr>
		<td>Street : </td>
		<td><input type="text" id="street" name="street" value = "<%=nodes.getText("street") %>" ></td>
	</tr>
	
	<tr>
		<td>Town : </td>
		<td><input type="text" id="town" name="town" value = "<%=nodes.getText("town") %>" ></td>
	</tr>
 
 <tr>
		<td>City : </td>
		<td><input type="text" id="city" name="city" value = "<%=nodes.getText("city") %>" ></td>
	</tr>
	
	 <tr>
		<td>Country : </td>
		<td><input type="text" id="country" name="country" value = "<%=nodes.getText("country") %>" ></td>
	</tr>
 
 <tr>
 <td>
 <input type="button" id="button-save2" value="Save" />
 <input type="button" id="button-delete2" value="Delete" />
 
 </td>
 </tr>
</table>
</form>
 

<!--END-->
</body>
</html>
