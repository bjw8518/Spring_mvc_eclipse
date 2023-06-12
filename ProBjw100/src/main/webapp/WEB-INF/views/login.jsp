<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
    <!-- <link rel="stylesheet" href="style.css"> -->
</head>
<body>

    <div class="login-page">
        <div class="form">
        <form action="login_action" class="login-form">
            <input type="text" placeholder="ID" name="id"/>
            <input type="password" placeholder="password" name="pwd"/>
            <button>로그인</button>
            <p class="message">아직 회원이 아니신가요? <a href="join">회원가입하기</a></p>
        </form>
        </div>
    </div>

</body>
</html>