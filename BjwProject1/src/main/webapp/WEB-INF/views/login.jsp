<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
    <!-- <link rel="stylesheet" href="style.css"> -->
</head>
<body>

    <div class="login-page">
        <div class="form">
        <form action="login_action">
            <input type="text" placeholder="ID" name="id" />
            <input type="password" placeholder="패스워드" name="pwd" />
            <input type="submit" value="입력 완료" />
            <p class="message">아직 회원이 아니신가요? <a href="join">회원가입하기</a></p>
        </form>
        </div>
    </div>

</body>
</html>