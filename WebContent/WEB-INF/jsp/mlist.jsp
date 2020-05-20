<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メンバー一覧</title>
</head>
<body>

<h1>メンバー一覧</h1>
<table>
<tr><th>氏名</th><th>住所</th></tr>
<c:forEach var="member" items="${list}">
	<tr>
		<td>${member.name}</td>
		<td>${member.adr}</td>

	</tr>
</c:forEach>
</table>
</body>
</html>