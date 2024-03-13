// 이용약관 체크박스 확인
var agreeTermsCheckbox = document.getElementById("agreeTerms1");
var pwError = document.getElementById("pwError");
var successPhCheck = document.getElementsByClassName("successPhCheck");
var IDErrMsg = document.getElementById("IDErrMsg");
var nicknameErrMsg = document.getElementById("nicknameErrMsg");
var genderInputs = document.getElementsByName("memberGender");

function validateForm() {
	if (IDErrMsg !== "사용가능한 이메일 입니다." || IDErrMsg == null) {
		alert("ID 중복확인을 해주세요.");
		return false;
	} else if(pwError !== "비밀번호가 일치합니다." || pwError == null) {
		alert("비밀번호 인증을 해주세요.");
		return false;
	} else if (nicknameErrMsg !== "사용가능한 닉네임 입니다." || nicknameErrMsg == null) {
		alert("닉네임 중복확인을 해주세요.");
		return false;
	} else if(document.querySelectorAll('input[type="radio"][name="member_gender"]:checked').length < 1){
		alert('성별을 선택해주세요');     
		return false;                  
	} else if (successPhCheck !== "인증번호가 일치합니다." || successPhCheck == null) {
		alert("문자 인증을 해주세요.");
		return false;
	} else if (!agreeTermsCheckbox.checked) {
		alert("이용약관의 동의해주세요.");
		return false;
	} else {
		return true; 
	}
	// Additional form validation logic can be added here if needed
};
