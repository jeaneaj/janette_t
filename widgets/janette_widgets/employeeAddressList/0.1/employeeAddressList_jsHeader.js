
var EmployeeAddressList = function() {
	return {
		myVariable: null,

		init: function() {
			alert("EmployeeAddressList.init()");

//			// attach an event to an HTML element
//			var self = this;
//			jQuery(".EmployeeAddressList .myElementClass").click(function() {
//				self.myMethod();
//				// do something
//				...
//			});
		},
		
		myMethod: function() {
			alert("EmployeeAddressList.myMethod()");
		}
		// no comma after last method
	};
}();

//jQuery(EmployeeAddressList.init()); // Run after page loads