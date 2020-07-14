<%@ page language="java" pageEncoding="gb2312"%>
<html>
<head>
<meta charset="UTF-8">
    <title>Index</title></head>
<body>
<h2>Hello World!</h2>
<form action="${pageContext.request.contextPath}/reqs" method="get">
    用户名：<label>
    <input type="text" name="username">
</label><br>
    密码： <label>
    <input type="text" name="password">
</label><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
