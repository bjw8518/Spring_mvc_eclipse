<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css">
<title>login</title>
</head>
<body>
<div class="join-wrapper">
        <h2>Join</h2>
        <!-- login_action -->
        <form method="post" action="insert_action" id="join-form">
            <label for="id">아이디</label>
            <input type="text" name="id" placeholder="아이디">
            
            <label for="password">비밀번호</label>
            <input type="password" name="password" placeholder="비밀번호">
            
            <label for="name">이름</label>
            <input type="text" name="name" placeholder="이름">
            
            <label for="phone">연락처</label>
            <input type="text" name="phone" placeholder="휴대폰번호( (-)포함 )">
            
            <label>여성<input style="width:15px;height: 10px;" type='radio' name='gender' value='female' /></label>
            <label>남성<input style="width:15px;height: 10px;" type='radio' name='gender' value='male' /></label>
            <input type="submit" value="가입하기">
        </form>
    </div>
</body>
</html>