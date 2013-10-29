
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
<%@page import="tooltwist.janette.productionHelpers.ContactNumberListProductionHelper"%>
<%@page import="tooltwist.misc.JspHelper"%>
<%@page import="tooltwist.ecommerce.AutomaticUrlParametersMode"%>
<%@page import="tooltwist.ecommerce.RoutingUIM"%>
<%
	// Get the production helper for this widget
	ContactNumberListProductionHelper h = (ContactNumberListProductionHelper) helper;
	XData data = h.getData(jh);
	XNodes nodes = data.getNodes("/select/employeeContactNumber");
%>

<!-- ********** INSERT HTML HERE ********** -->
 
<table border="2" style="width:700px;" >
<tr>
	<th>ID</th>
	<th>Employee Id</th>
	<th>Type</th>
	<th>Number</th>
	 

</tr>

<% for(nodes.first(); nodes.next();) { %>

<tr>

<td><a href="%%janette%%?id=<%=nodes.getText("id") %>"><%=nodes.getText("id") %></a></td>
	<td><%=nodes.getText("employeeId") %></td>
	<td><%=nodes.getText("type") %></td>
	<td><%=nodes.getText("number") %></td>

</tr>

 <% } %>
	 
</table>
 

<!--END-->
</body>
</html>
