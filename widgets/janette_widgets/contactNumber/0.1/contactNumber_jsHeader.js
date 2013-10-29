
var ContactNumber = function() {
	return {
		myVariable: null,

		init: function() {
			alert("ContactNumber.init()");

//			// attach an event to an HTML element
//			var self = this;
//			jQuery(".ContactNumber .myElementClass").click(function() {
//				self.myMethod();
//				// do something
//				...
//			});
		},
		
		myMethod: function() {
			alert("ContactNumber.myMethod()");
		}
		// no comma after last method
	};
}();

//jQuery(ContactNumber.init()); // Run after page loads