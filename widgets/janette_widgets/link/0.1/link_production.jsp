<html>
<head>
<title></title>
</head>
<body>
<%
	WbdProductionHelper helper = null;
	JspHelper jh = null;
	String snippetVar_label = "";
	String snippetVar_link = "";
	String snippetVar_target = "";
%>
<!--START-->
<%@page import="tooltwist.wbd.WbdProductionHelper"%>
<%@page import="com.dinaa.data.XData"%>
<%--
<%@page import="tooltwist.janette.productionHelpers.LinkProductionHelper"%>
--%>
<%@page import="tooltwist.misc.JspHelper"%>
<%@page import="tooltwist.ecommerce.AutomaticUrlParametersMode"%>
<%@page import="tooltwist.ecommerce.RoutingUIM"%>
<%
	// Get the production helper for this widget
//	LinkProductionHelper h = (LinkProductionHelper) helper;
//	XData data = h.getData(jh);
%>

<!-- ********** INSERT HTML HERE ********** -->
<div %%idDefinition%% class="Link" style="width:200px; border-style:solid; border-width:1px; text-align: center;">
 
	
	<% if (snippetVar_target.equals("Yes")) {  %>
	
		<a href="%%link%%" target="_blank" ><%=snippetVar_label  %></a>
  <% }  else { %>
  <a href="%%link%%" ><%=snippetVar_label  %></a>
  	
  <% } %>
	

	


</div>

<!--END-->
</body>
</html>
