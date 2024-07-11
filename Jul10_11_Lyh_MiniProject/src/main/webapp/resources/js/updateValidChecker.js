function updateValidCheck() {
	let pw = document.updateForm.getElementById("upPw");
	let pwchk = document.updateForm.getElementById("upPwchk");
	let name = document.updateForm.getElementById("upName");
	
	if (isEmpty(pw) || isEmpty(pwchk) || isEmpty(name)) {
		alert("공백 없이 입력");
		pw.value = "";
		pwchk.value = "";
		name.value = "";
		
		return false;
	}
	return true;
}




























