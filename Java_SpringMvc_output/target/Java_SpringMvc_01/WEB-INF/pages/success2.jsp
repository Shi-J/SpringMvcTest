<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/6
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
</head>
<body>
<h2>map接收值</h2> <br/>
pageContext : ${pageScope.map} <br/>
request : ${requestScope.map} <br/>
session : ${sessionScope.map} <br/>
application : ${applicationScope.map}

</body>
</html>
