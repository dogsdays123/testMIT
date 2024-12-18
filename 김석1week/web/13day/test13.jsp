<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>폼 예시</title>
</head>
<body>
    <h1>입력 폼</h1>
    
    <form action="process.jsp" method="post">
        이름: <input type="text" name="username" /><br/>
        나이: <input type="text" name="age" /><br/>
        <input type="submit" value="제출" />
    </form>
</body>
</html>