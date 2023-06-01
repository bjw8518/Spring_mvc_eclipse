<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
        <title>Join</title>
    </head>
    <body>
        <h1>Join</h1>
        <form action="insert_action">
        	<input type="text" placeholder="이름" name="name" />
        	<input type="text" placeholder="연락처" name="phone"/>
            <input type="text" placeholder="주소"  name="address"/>
            <input type="submit" value="입력 완료"/>
        </form>
    </body>
</html>
