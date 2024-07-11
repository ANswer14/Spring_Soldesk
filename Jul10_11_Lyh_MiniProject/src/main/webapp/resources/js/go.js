$(function() {
	goRegistController();
	goHome();
	goUpdateController();
	goDeleteController();
	goLogout();
	goWeather();
});


function goRegistController(){
	$("#registBtn").click(function() {
		location.href="member.regist.go";
	});
	
	
};

function goWeather() {
	$("#menuTd2").click(function() {
		location.href="weather.get";
	});
};

function goHome() {
	$("#home").click(function() {
		location.href="home";
	})
};

function goUpdateController() {
	$("#updateBtn").click(function() {
		location.href="member.update.go";
	});
};

function goDeleteController() {
	$("#deleteBtn").click(function() {
		location.href="member.delete";
	});
};

function goLogout() {
	$("#logoutBtn").click(function() {
		location.href="member.logout";
	});
};