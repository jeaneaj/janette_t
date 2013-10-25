
var EmployeeMaintenance = function() {
	return {
		myVariable: null,

		init: function() {
			alert("EmployeeMaintenance.init()");

	
	
	$("#button-save").click(function() {
		var id=		$("#employeeId").val();
		var name =		$("#employeeName").val();
		var age =		$("#employeeAge").val();
				
		 
		$.ajax({
			data: {
				employeeId: id,
				employeeName: name,
				employeeAge: age,
				op: "janette_widgets.employeeMaintenance.maintainEmployee"
			},
			success: function(data) {
				alert(data);
				if(data == "Update") {
					alert("Employee data successfully updated");
					
				}
				else {
					alert("Employee data successfully inserted");
				}
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