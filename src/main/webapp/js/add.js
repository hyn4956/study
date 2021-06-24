$(function(){
	addObj.create();
});

addObj={
	
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
	$.ajax({		
		url : "/add.do",
		type : "POST",
		async:false,
		dataType : "json",
		data :  $("#add").serialize(),
		success : function(result) {
			if(type == "add"){
			location.href="/listPage.do";
			alert("게시글 추가 완료");
			}else {
				alert("버튼 동작 실패")
			}
		}
	})
}