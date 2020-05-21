<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>会議について</title>

</head>
<body>

<h1>会議について</h1>

<p>${memo.title}</p>
<p>${memo.body}</p>
<a href="memolist">戻る</a>
</body>
</html>