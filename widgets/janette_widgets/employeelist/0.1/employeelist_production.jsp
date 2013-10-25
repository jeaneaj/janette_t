
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
<%@page import="tooltwist.janette.productionHelpers.EmployeelistProductionHelper"%>
<%@page import="tooltwist.misc.JspHelper"%>
<%@page import="tooltwist.ecommerce.AutomaticUrlParametersMode"%>
<%@page import="tooltwist.ecommerce.RoutingUIM"%>
<%
	// Get the production helper for this widget
	EmployeelistProductionHelper h = (EmployeelistProductionHelper) helper;
	XData data = h.getData(jh);
	XNodes nodes = data.getNodes("/select/employee");		
%>

<!-- ********** INSERT HTML HERE ********** -->
 
<table border="2">
	<tr>
		<th>ID</th>
		<th>Employee Name</th>
		<th>Age</th>
	</tr>	
	
	<% for(nodes.first(); nodes.next();) { %>
	<tr>
		<td><a href="%%employeePage%%?employeeId=<%=nodes.getText("id") %>"><%=nodes.getText("id") %></a></td>
		<td><%=nodes.getText("employeeName") %></td>
		<td><%=nodes.getText("age") %></td>
	</tr> 
	 
	 <% } %>
	
	 
</table>
<!--END-->
</body>
</html>
