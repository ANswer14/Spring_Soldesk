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
<%
	int y = 1919;
	int m = 0;
	int d = 0;
%>
<form action="member.regist" onsubmit="return registValidCheck();" id="regForm" enctype="multipart/form-data" method="post">
	<table id="registTbl">
		<tr>
			<td>
				ID <input name="m_id" id="regId" maxlength="15">
			</td>
		<tr>
		</tr>
		<tr>
			<td>
				PW <input type="password" name="m_pw" id="regPw" maxlength="15">
			</td>
		</tr>
		<tr>
			<td>
				PWCHK <input type="password" name="m_pwchk" id="regPwchk" maxlength="15">
			</td>
		</tr>
		<tr>
			<td>
				이름 <input name="m_name" id="regName" maxlength="10">
			</td>
		</tr>
		<tr>
			<td>
				생년월일  <select name="m_year">
				<c:forEach var="q" begin="1920" end="2024" step="1">
					<%
						y ++;
					%>
					<option value="<%=y %>"><%=y %></option>
				</c:forEach>
				</select>년
				<select name="m_month">
				<c:forEach var="q" begin="1" end="12" step="1">
					<%
						m ++;
					%>
					<option value="<%=m %>"><%=m %></option>
				</c:forEach>
				</select>월
				<select name="m_day">
				<c:forEach var="q" begin="1" end="31" step="1">
				<%
					d ++;
				%>
					<option value="<%=d %>"><%=d %></option>
				</c:forEach>
				</select>일
					
			</td>
		</tr>
		<tr>
			<td>
				photo <input type="file" name="m_photo" id="photo">
			</td>
		</tr>
	</table>
	<button id="regBtn">회원가입</button>
</form>
</body>
</html>