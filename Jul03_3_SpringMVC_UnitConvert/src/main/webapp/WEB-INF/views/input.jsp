<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="HomeController">
	숫자 입력<input type="number" placeholder="123" name="num">
	<select name="op">
		<option name="op" value="height"> cm -> inch </option>
		<option name="op" value="width"> ㎡ -> 평 </option>
		<option name="op" value="temp"> ℃ -> ℉</option>
		<option name="op" value="vel"> mi/h -> km/h </option>
	</select>
	<button>확인</button>	
</form>
</body>
</html>