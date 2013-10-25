
var Employeelist = function() {
	return {
		myVariable: null,

		init: function() {
			alert("Employeelist.init()");

//			// attach an event to an HTML element
//			var self = this;
//			jQuery(".Employeelist .myElementClass").click(function() {
//				self.myMethod();
//				// do something
//				...
//			});
		},
		
		myMethod: function() {
			alert("Employeelist.myMethod()");
		}
		// no comma after last method
	};
}();

//jQuery(Employeelist.init()); // Run after page loads