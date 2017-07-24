<%--
  Created by IntelliJ IDEA.
  User: datadriver
  Date: 2017/7/22
  Time: 上午9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>this is registered page!</title>
</head>
<body>
<form name="registeredForm" method="post" action="doregistered">
    <label>user name:</label>
    <input name="userName" type="text">
    <label>password:</label>
    <input name="password" type="password">
    <label>confirm password:</label>
    <input name="cpassword" type="password">
    <input type="submit" name="subbtn" value="submit"/>
</form>
</body>
</html>
