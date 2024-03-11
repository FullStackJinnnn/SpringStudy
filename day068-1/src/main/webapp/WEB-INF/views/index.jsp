<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 표지페이지</title>
</head>
<body>

   
   <h1>JSP 표지페이지입니다.</h1>
   <h3>${data}</h3>
   <hr>
   <ul>
      <c:forEach var="v" items="${datas}">
         <li>${v}</li>
      </c:forEach>
   </ul>
</body>
</html>