<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript" src="/js/add.js"></script>
<title>Insert title here</title>
</head>
<body>
	<sec:csrfInput/>
	<form method="POST" id="add" name="add">
		<table>
			<tr>
				<td>NO<input id="id" type="text" name="id"></td>
			</tr>
			<tr>
				<td>제목<input id="title" type="text" name="title"></td>
			<tr>
				<td>내용<input id="content" type="text" name="content"></td>
			</tr>
			<tr>
				<td>작성자<input id="writer" type="text" name="writer"></td>
			</tr>
			<tr>
				<td>날짜<input id="regdate" type="text" name="regdate"></td>
			</tr>
			<tr>
				<td>조회수<input id="view" type="text" name="view"></td>
			</tr>
			<tr>
				<td>좋아요<input id="love" type="text" name="love"></td>
			</tr>
		</table>
		<button type="button" onclick="btn('add');">완료</button>
	</form>
</body>
</html>