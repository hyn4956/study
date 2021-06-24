<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript" src="/js/listInfo.js"></script>
<title>Insert title here</title>
</head>
<body>
<h1>리스트 상세 페이지</h1>
<form method="POST" id="update" name="update">
<table border="1px solid black">
	<tbody>
		<tr>
			<td>NO</td>
			<td>
			${result.id }
			</td>
			<td><input id="id" type="text" name="id" readonly="readonly" value="${result.id}"></td>
		</tr>
		<tr>
			<td>제목</td>
			<td>
			${result.title }
			</td>
			<td><input id="title" type="text" name="title"></td>
		</tr>
		<tr>
			<td>내용</td>
			<td>
			${result.content }
			</td>
			<td><input id="content" type="text" name="content"></td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>
			${result.writer }
			</td>
			<td><input id="writer" type="text" name="writer"></td>
		</tr>
		<tr>
			<td>날짜</td>
			<td>
			${result.regdate }
			</td>
			<td><input id="regdate" type="text" name="regdate"></td>
		</tr>
		<tr>
			<td>조회수</td>
			<td>
			${result.view }
			</td>
			<td><input id="view" type="text" name="view"></td>
		</tr>
		<tr>
			<td>좋아요</td>
			<td>
			${result.love }
			</td>
			<td><input id="love" type="text" name="love"></td>
		</tr>
	</tbody>
</table>
<button type="button" onclick="btn('update');">수정</button>
<button type="button" onclick="btn('delete');">삭제</button>
</form>
</body>
</html>