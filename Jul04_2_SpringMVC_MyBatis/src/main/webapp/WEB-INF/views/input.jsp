<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
int y = 1959;
int m = 0;
int d = 0;
%>
	<form action="student.reg">
		이름 : <input name="s_name"> <p>
		별명 : <input name="s_nickname"> <p>
		<button>등록</button>
	</form>
	<hr>
	<c:forEach var="s" items="${students }">
		${s.s_name } - ${s.s_nickname } <p>
	</c:forEach>
	<hr>
	<form action="test.info">
		과목명<input name="t_subject">
		시험날짜 <select name="t_year">
		<c:forEach var="y" begin="1" end="65" step="1">
		<%
		y++;
		%>
			<option value="<%=y %>">
				<%=y %>
			</option>
		</c:forEach>
		</select>년
		<select name="t_month">
			<c:forEach var="m" begin="1" end="12" step="1">
			<%
			m++;
			%>
				<option value="<%=m %>">
				<%=m %></option>
			</c:forEach>
		</select>월
		<select name="t_day">
			<c:forEach var="d" begin="1" end="31" step="1">
			<%d++; %>
				<option value="<%=d %>"><%=d %></option>
			</c:forEach>
		</select>일
		<p>
		<button>버튼</button>
	</form>
	<hr>
	${r2 }
	<hr>
	<c:forEach var="t" items="${testInfo }">
	${t.t_subject } -
		<fmt:formatDate value="${t.t_when }" type="date" dateStyle="long"/><p>
	</c:forEach>
	<hr>
	${r }
	
</body>
</html>