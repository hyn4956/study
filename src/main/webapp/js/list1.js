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
			console.log(result.resultList.length);
			for(i=0;i<result.resultList.length;i++){
				var tBody = "<tr onclick='infoView(\""+result.resultList[i].id+"\")' data='"+result.resultList[i].id+"'>";
				tBody += "<td>"+result.resultList[i].id+"</td>";
				tBody += "<td>"+result.resultList[i].title+"</td>";
				tBody += "<td>"+result.resultList[i].content+"</td>";
				tBody += "<td>"+result.resultList[i].writer+"</td>";
				tBody += "<td>"+result.resultList[i].regdate+"</td>";
				tBody += "<td>"+result.resultList[i].view+"</td>";
				tBody += "<td>"+result.resultList[i].love+"</td>";
				tBody += "</tr>"
				$("#tBody").append(tBody);
			}
		}
	})
}

function infoView(data){
	location = "/listInfoPage.do?id="+data
}