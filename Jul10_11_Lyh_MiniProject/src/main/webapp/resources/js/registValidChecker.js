function registValidCheck() {
	let id = document.getElementById("regId");
	let pw = document.getElementById("regPw");	
	let pwchk = document.getElementById("regPwchk");
	let name = document.getElementById("regName");
	if (isEmpty(id) || isEmpty(pw) || isEmpty(pwchk) || isEmpty(name)) {
		alert('공백 없이 입력');
		return false;
	} else if(notEqualPw(pw, pwchk)) {
		alert("비밀번호가 같지 않음");
		pw.value = "";
		pwchk.value = "";
		return false;
	} else if (containsAnother(id)) {
		alert("id에 특수문자 / 한글 X")
		id.value = "";
		return false;
	}
return true;
}
