$(function(){
	listDataObj.create();
});

listDataObj={
	
	create : function(){
		var that = this;
		
		that.bind();
		that.init();
	},
	bind : function(){
		var that = this;
		list1();
	},
	init : function(){
		var that = this;
	}
};

function list1(){
	$.ajax({
		url : "/listAjax.do",
		type : "POST",
		dataType : "json",
		success : function(result) {
			for(i=0;i<result.resultList.length;i++){
				tBody += "<td>"+result.resultList[i].id+"</td>";
				tBody += "<td>"+result.resultList[i].title+"</td>";
				tBody += "<td>"+result.resultList[i].content+"</td>";
				tBody += "<td>"+result.resultList[i].writer+"</td>";
				tBody += "<td>"+result.resultList[i].regDate+"</td>";
				tBody += "<td>"+result.resultList[i].view+"</td>";
				tBody += "<td>"+result.resultList[i].love+"</td>";
				$("#tBody").append(tBody);
			}
		}
	})
}