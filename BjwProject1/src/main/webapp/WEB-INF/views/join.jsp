<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Join</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
    <!-- <link rel="stylesheet" href="style.css"> -->
</head>
<body>

    <div class="regi-page">
        <div class="form">
            <form action="insert_action">
	            <input type="text" placeholder="ID" name="id" />
	            <input type="password" placeholder="패스워드" name="pwd" />
	            <input type="password" placeholder="페스워드 확인" name="pwd2" />
	            <label><input type="radio" name="sex" value="male" />남</label>
	            <label><input type="radio" name="sex" value="female" />여</label>
	            <input type="text" placeholder="이름" name="name" />
	            <input type="text" placeholder="연락처" name="phone" />
	            <input type="text" placeholder="주소" name="address" />
	            <input type="submit" value="입력 완료" />
	        </form>
        </div>
    </div>

</body>
</html>