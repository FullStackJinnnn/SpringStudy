<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>유효성 검증 객체 실습</title>
</head>
<body>

<form action="/test" method="POST">
   <input type="text" name="name"> <br>
   <input type="number" name="age"> <br>
   <input type="submit">
</form>   

</body>
</html>