<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
        <title>Insert title here</title>
    </head>

    <body>
    

        <ul>

	<li>
		<a href="/board/listPageSearch?num=1">글 목록(페이징 + 검색)</a>	
	</li>
	
	<li>
		<a href="/board/listPage?num=1">글 목록(페이징)</a>	
	</li>
	
	<li>
		<a href="/board/list">글 목록</a>	
	</li>
	
	<li>
		<a href="/board/write">글 작성</a>	
	</li>	

</ul>

    </body>

    </html>