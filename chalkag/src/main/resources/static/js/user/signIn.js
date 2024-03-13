function signIn() {
	var id = $("#memberId").val();
	var password = $("#memberPw").val();

	$.ajax({
		url: "/chalKag/loginCheck.do",
		type: "POST",
		/*dataType: "text",*/
		data: {
			"id": id,
			"pw": password
		},
		success: function(data) {
			if (data == '1') {
				swal("success", "moving to main page", "success", {
					button: "OK",
				}).then((result) => {
					if (result.isConfirmed) {
						location.href = "main";
					}
				});
			}
			else {
				swal("fail", "check ID or PW", "error", {
					button: "OK",
				});
			}
		},
		error: function(error) {
			console.log('에러' + error);
		}
	});
}
