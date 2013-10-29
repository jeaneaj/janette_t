
var ContactNumberList = function() {
	return {
		myVariable: null,

		init: function() {
			alert("ContactNumberList.init()");

//			// attach an event to an HTML element
//			var self = this;
//			jQuery(".ContactNumberList .myElementClass").click(function() {
//				self.myMethod();
//				// do something
//				...
//			});
		},
		
		myMethod: function() {
			alert("ContactNumberList.myMethod()");
		}
		// no comma after last method
	};
}();

//jQuery(ContactNumberList.init()); // Run after page loads