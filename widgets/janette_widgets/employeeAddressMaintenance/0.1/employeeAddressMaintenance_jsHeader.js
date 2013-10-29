
var EmployeeAddressMaintenance = function() {
	return {
		myVariable: null,

		init: function() {
			alert("EmployeeAddressMssssaintenance.init()");

			
			
			
			$("#button-save2").click(function() {
			  
				 var id = $("#id").val();
				var employeeId=		$("#employeeId").val();
				var street=		$("#street").val();
				var town=		$("#town").val();
				var city=		$("#city").val();
				var country=		$("#country").val();
			 
				

				 
				$.ajax({
					data: {
						id: id,
						employeeId:employeeId,
						street: street,
						town: town,
						city:city,
						country:country,
						
						subop: "update",
						op: "janette_widgets.employeeAddressMaintenance.employeeAddressMaintenance"
					},
					success: function(data) {
						alert(data);
						//   window.location.href = $("#link-employeeList").attr("href");
							
					}
				});
			 
				
			});
			
			//delete employee
			$("#button-delete2").click(function() {
				var id=		$("#id").val();
			   
				$.ajax({
					data: {
						id: id,
						subop: "delete",	
						op: "janette_widgets.employeeAddressMaintenance.employeeAddressMaintenance"
					},
					success: function(data) {
						alert(data);
					   //window.location.href = $("#link-employeeList").attr("href");
					}
				});
			   
			});
				
  
		},
		
		myMethod: function() {
			alert("EmployeeAddressMaintenance.myMethod()");
		}
		// no comma after last method
	};
}();

jQuery(EmployeeAddressMaintenance.init()); // Run after page loads