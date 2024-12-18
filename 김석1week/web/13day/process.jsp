<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");

    String username = request.getParameter("username");
    String age = request.getParameter("age");
%>

<html>
<head>
    <title>입력 결과</title>
</head>
<body>
    <h1>입력된 값</h1>
    <p>이름: <%= username %></p>
    <p>나이: <%= age %></p>
</body>
</html>
