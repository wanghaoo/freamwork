<%--
  Created by IntelliJ IDEA.
  User: datadriver
  Date: 2017/7/13
  Time: 下午4:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String path = request.getContextPath();%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    hello, spring4 no xml config! ${test}
    <form name="loginForm" action="doLogin" method="post">
        <label>username:</label><input name="username" type="text">
        <label>password:</label><input name="password" type="password">
        <button type="submit">submit</button>
    </form>
<a href="<%=path%>/registered">I registered now.</a>
</body>
</html>
