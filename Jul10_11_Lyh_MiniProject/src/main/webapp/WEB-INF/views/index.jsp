<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>remind</title>
<link rel="stylesheet" href="resources/css/index.css">
<link rel="stylesheet" href="resources/css/home.css">
<link rel="stylesheet" href="resources/css/regist.css">
<link rel="stylesheet" href="resources/css/miniInfo.css">
<script type="text/javascript" src="resources/js/jQuery.js"></script>
<script type="text/javascript" src="resources/js/home.js"></script>
<script type="text/javascript" src="resources/js/LyhValidChecker.js"></script>
<script type="text/javascript" src="resources/js/registValidChecker.js"></script>
<script type="text/javascript" src="resources/js/go.js"></script>
</head>
<body>
	<table id="homeTbl">
		<tr>
			<td id="home">
				Home
			</td>
		</tr>
	</table>
	<table id="menuTbl">
		<tr>
			<td id="menuTd1">
				Board
			</td>
			<td id="menuTd2">
				Weather
			</td>
		</tr>
	</table>
	<table id="cpTbl">
		<tr>
			<td>
				<jsp:include page="${cp }"></jsp:include>
			</td>
		</tr>
	</table>
	<table id="lpTbl">
		<tr>
			<td>
				<jsp:include page="${lp }"></jsp:include>
			</td>
		</tr>
	</table>
	<h3>${r }</h3>
</body>
</html>