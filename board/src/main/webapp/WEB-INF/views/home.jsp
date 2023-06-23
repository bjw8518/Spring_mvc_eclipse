<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
<script src="${pageContext.request.contextPath}/resources/js/main.js"></script>
</head>
<body>
<div id="wrapper">
        <header>
                    <h1>Real<span>Index Page</span></h1>
                </header>
                <article>
                    <h2><a href="login">로그인</a></h2>
                </article>
                
                
                <article>
                    <h2><a href="/board/listPageSearch?num=1">글 목록</a></h2>
                </article>
                
        </div>

<!-- 
<div id="nav">
	/*
	< % @
	include file="include/nav.jsp"
	%
	>
	*/
</div>

<div id="home_msg">
	<p>
		게시판
	</p>
</div>
 -->

<!-- 
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<p>
<a href="/board/list">게시물 목록</a><br />
<a href="/board/write">게시물 작성</a>
</p>
 -->

</body>
</html>
