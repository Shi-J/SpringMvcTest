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

<h2>valueModelMap</h2> <br/>
pageContext : ${pageScope.valueModelMap} <br/>
request : ${requestScope.valueModelMap} <br/>
session : ${sessionScope.valueModelMap} <br/>
application : ${applicationScope.valueModelMap}


</body>
</html>
