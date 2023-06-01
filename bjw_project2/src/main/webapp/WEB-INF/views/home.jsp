<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	메인페이지입니다  
</h1>
<div class="mainlist">
    <ul>
        <li><a href="join.html">회원가입</a></li>
        <li><a href="login.html">로그인</a></li>
        <li><a href="list.html">회원목록</a></li>
    </ul>
</div>
<P></P>
${serverTime}. 
</body>
</html>
