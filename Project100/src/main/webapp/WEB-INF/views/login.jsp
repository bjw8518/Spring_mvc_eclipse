<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/login.css" />
        <title>Test</title>
    </head>
    <body>
        <h1>LOGIN</h1>
        <form action="login_action">
            <input type="text" placeholder="ID" name="id" />
            <input type="password" placeholder="패스워드" name="pwd" />
            <input type="submit" value="입력 완료" />
        </form>
    </body>
</html>