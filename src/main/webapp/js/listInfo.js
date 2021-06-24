$(function(){
	listInfoObj.create();
});

listInfoObj={
	
	create : function(){
		var that = this;
		
		that.bind();
		that.init();
	},
	bind : function(){
		var that = this;
	},
	init : function(){
		var that = this;
	}
};

function btn(type) {
	var urlType = "";
	if (type == "update"){
		urlType = "/update.do"
	}else if(type == "delete"){
		urlType = "/delete.do"
	}
	$.ajax({		
		url : urlType,
		type : "POST",
		async:false,
		dataType : "json",
		data :  $("#update").serialize(),
		success : function(result) {
			if(type == "update"){
			location.href="/listPage.do";
			alert("사용자 정보 수정 완료");
			}else if(type == "delete"){
				location.href="/listPage.do";
				alert("사용자 정보 삭제")
			}else {
				alert("버튼 동작 실패")
			}
		}
	})
}