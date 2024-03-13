function checkID(){
	var id=$('#memberId').val();
	$.ajax({
		type : "POST",
		url : "/checkID",
		data : {'memberId':id},
		dataType: 'text',
		success : function(data){
			if(data=='1'){
				$("#IDErrMsg").text("사용가능한 이메일 입니다.");
				$("#IDErrMsg").css("color","green");
			}
			else{
				$("#IDErrMsg").text("중복된 이메일입니다. 다시 입력해주세요");
				$("#IDErrMsg").css("color","red");
				
			}
		},
		error: function(error){
			console.log('에러'+error);
		}
	});
}