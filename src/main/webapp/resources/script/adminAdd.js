$(function() {
	
	var form = $("form");
	
	$("#save").click(function() {
		form.attr("action","/lag/add");
		form.submit();
	});
	
	$("#delete").click(function() {
		form.attr("action","/lag/delete");
		form.submit();
	});
	
});