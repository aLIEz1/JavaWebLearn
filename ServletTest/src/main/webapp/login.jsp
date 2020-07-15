<%--
  Created by IntelliJ IDEA.
  User: super
  Date: 2020/7/15
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/servlet/login" method="get">
    <label>
        <input type="text" name="username" placeholder="请输入用户名"/>
    </label>
    <input type="submit" value="登录">
</form>
</body>
</html>
