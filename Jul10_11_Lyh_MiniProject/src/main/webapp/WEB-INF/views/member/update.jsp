<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<table>
	<form action="member.update" method="post" enctype="multipart/form-data" id="updateForm" onsubmit="return updateValidCheck();">
			<tr>
				<td>
					ID <input value="${info.m_id }" readonly="readonly">
				</td>
			</tr>
			<tr>
				<td>
					비밀번호 <input name="m_pw" id="upPw" placeholder="비밀번호">
				</td>
			</tr>
			<tr>
				<td>
					비밀번호 재확인 <input name="m_pwchk" id="upPwchk" placeholder="비밀번호재확인">
				</td>
			</tr>
			<tr>
				<td>
					이름 <input name="m_name" placeholder="이름" id="upName">
				</td>
			</tr>
			<tr>
				<td>
					생일 <input value="${info.m_birth }" readonly="readonly">
				</td>
			</tr>
			<tr>
				<td>
					사진 <input type="file" name="m_photo" id="upPhoto">
				</td>
			</tr>
			<tr>
				<td>
				<button>확인</button>
	</form>
				<button id="deleteBtn">회원 탈퇴</button>
				</td>
			</tr>
		</table>
</body>
</html>