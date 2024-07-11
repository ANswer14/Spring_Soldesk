<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jQuery.js"></script>
<script type="text/javascript">
	$(function() {
		$.ajax({
			url: "weather.get",
			success: function(suc) {
				$(suc).find("data").each(function(i, f) {
					let hour = $(f).find("hour").text();
					let wdKor= $(f).find("wdKor").text();
					let temp = $(f).find("temp").text();
					
					let hourTd = $("<td></td>").append(hour);
					let wdKorTd = $("<td></td>").append(wdKor);
					let tempTd = $("<td></td>").append(temp);
					
					let tr = $("<tr></tr>").append(hourTd, wdKorTd, tempTd);
					
					$("weatherTbl").append(tr);
					
				});
			},
			
		});
	});
</script>
</head>
<body>	
	<table id="weatherTbl" border="1"></table>
</body>
</html>