<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>変更</title>
</head>
<body>

<h1>変更</h1>

<form method="post" action="mupdate">
<input type="hidden" name="mid" value="${member.mid}"><br>
氏名:<input type="text" name="name" value="${member.name}"><br>
住所:<input type="text" name="adr" value="${member.adr}"><br>
<input type="submit" value="変更">

</form>

<form method="post" action="mdel">
<input type="hidden" name="mid" value="${member.mid}"><br>
<input type="submit" value="削除">

</form>
</body>
</html>