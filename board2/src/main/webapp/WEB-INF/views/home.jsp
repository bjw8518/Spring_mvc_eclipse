<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
	<title>Home</title>
</head>
<body>

<div id="nav">
	<%@ include file="include/nav.jsp" %>
</div>

<p><a href="/board/list">게시물 목록</a></p>
<p><a href="/board/write">게시물 작성</a></p>

</p>


</body>
</html>
