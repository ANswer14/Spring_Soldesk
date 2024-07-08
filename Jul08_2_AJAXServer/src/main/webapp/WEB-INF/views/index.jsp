<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		MyBatis 활용
		전체 과일데이터를 가격순으로
		이름 - 가격 형태로 출력
		(ex : 귤 - 2,800원)
	 -->
	 
	 <h1><button onclick="location.href='FruitController'">버튼</button></h1>
	 <c:forEach var="f" items="${fruits }">
	 ${f.f_name } - ${f.f_price }<br>
	 </c:forEach>
	 
	 
</body>
</html>