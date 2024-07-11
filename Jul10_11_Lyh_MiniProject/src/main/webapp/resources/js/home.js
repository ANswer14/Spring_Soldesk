$(function asdf() {
	/*
	let i = 1;
		setInterval(function() {
			$("#img").attr("src", "resources/img/sequence" + i +".jpg");
			i += 1;
			if (i == 5) {
				i = 1;
			}
		}, 1000);
	*/
	var i = 1;
	var intervalId;
	var tag=$("#img");
	
	function startChange(){
		intervalId = setInterval(function(){
			$("#img").attr("src", "resources/img/sequence" + i +".jpg");
			i += 1;
			if (i > 4) {
				i = 1;
			}
		}, 1000);
		
	}
	
	function stopChange(){
		clearInterval(intervalId);
		i=1;
	}
	/*$("#img").mouseenter(function() {
		
		setInterval(function() {
			$("#img").attr("src", "resources/img/sequence" + i +".jpg");
			i += 1;
			if (i > 4) {
				i = 1;
			}
		}, 1000);
	});*/
	
	tag.on('mouseenter', startChange);
	tag.on('mouseleave', stopChange);
	
});