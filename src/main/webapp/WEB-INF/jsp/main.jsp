<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>메인화면입니다</h1>
<div>
	<c:forEach var="v" items="${result}">
		<c:out value="${v.id}"></c:out>
		<c:out value="${v.title}"></c:out>
		<c:out value="${v.content}"></c:out>
		<c:out value="${v.writer}"></c:out>
		<c:out value="${v.regDate}"></c:out>
		<c:out value="${v.view}"></c:out>
		<c:out value="${v.love}"></c:out>
	</c:forEach>
</div>
</body>
</html>