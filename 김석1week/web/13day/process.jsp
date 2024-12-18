<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>처리 결과</title>
</head>
<body>
    <h1>폼 처리 결과</h1>
    
    <% 
        // 요청 파라미터 받기
        String username = request.getParameter("username");
        String age = request.getParameter("age");

        // 결과 출력
        out.println("<p>이름: " + username + "</p>");
        out.println("<p>나이: " + age + "</p>");
    %>
</body>
</html>
