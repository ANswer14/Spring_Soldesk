<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table id="miniTbl">
		<tr>
			<td>
				${info.m_id }님 환영합니다! 
			</td>
		</tr>
		<tr>
			<td id="photoTd">
				${info.m_name } <img src="resources/m_photo/${info.m_photo }">
			</td>
		</tr>
		<tr>
			<td><button id="updateBtn">정보 수정</button></td>
			<td><button id="logoutBtn">로그아웃</button></td>
		</tr>
	</table>
</body>
</html>