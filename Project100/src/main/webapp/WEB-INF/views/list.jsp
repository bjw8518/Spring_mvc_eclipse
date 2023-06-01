<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/list.css" />
        <title>Test</title>
    </head>
    <body>
        <h1>LIST</h1>
        <table>
            <thead>
                <tr>
                    <th>no</th><th>id</th><th>name</th><th>phone</th><th>sex</th><th>address</th><th></th>
                </tr>
            </thead>
            <tbody>
                ${list }
            </tbody>
        </table>
		<a href="/project100">Home</a>
    </body>
</html>