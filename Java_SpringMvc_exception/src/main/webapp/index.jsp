<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/9
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>


</head>
<body>


<form action="exhandle1" method="post">
    <input type="text"  name="i"/>
    <input type="submit" value="异常演示"/>
</form>


<form action="rshandle2" method="post">
    <input type="text" name="username"/>
    <input type="text" name="password"/>
    <input type="submit" value="用户登录">
</form>
<br/> <br/> <br/>

<a href="serhandle3">测试配置的错误信息</a>


</body>
</html>
