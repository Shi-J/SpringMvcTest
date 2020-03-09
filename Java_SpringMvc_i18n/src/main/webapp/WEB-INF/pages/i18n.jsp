<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/10
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--    导入fmt核心库标签    --%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2><fmt:message key="welcomelog"/></h2>
<form action="/a">
    <fmt:message key="usernamelog"/> <input type="text"/> <br/>
    <fmt:message key="passwordlog"/> <input type="text"/> <br/>
    <input type="submit" value="<fmt:message key="loginlog"/>" />
</form>


</body>
</html>
