
var EmployeeMaintenance = function() {
	return {
		myVariable: null,

		init: function() {
		//	alert("EmployeeMaintenance.init()");
			
			
	
	
	$("#button-save").click(function() {
		var id=		$("#employeeId").val();
		var name =		$("#employeeName").val();
		var age =		$("#employeeAge").val();
				
		 
		$.ajax({
			data: {
				employeeId: id,
				employeeName: name,
				employeeAge: age,
				subop: "update",
				op: "janette_widgets.employeeMaintenance.maintainEmployee"
			},
			success: function(data) {
				alert(data);
				

			}
		});
	 
		
	});
	
	//delete employee
	$("#button-delete").click(function() {
		var employeeId=		$("#employeeId").val();
	  
		$.ajax({
			data: {
				empId: employeeId,
				subop: "delete",	
				op: "janette_widgets.employeeMaintenance.maintainEmployee"
			},
			success: function(data) {
				alert(data);
			   window.location.href = $("#link-employeeList").attr("href");
			}
		});
	
	});
		},
		
		myMethod: function() {
			alert("EmployeeMaintenance.myMethod()");
		}
		// no comma after last method
	};
}();

jQuery(EmployeeMaintenance.init()); // Run after page loads