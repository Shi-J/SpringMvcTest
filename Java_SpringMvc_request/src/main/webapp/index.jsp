<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<html>
<body>
<a href="request1"> RequestParam测试 </a>

<form action="request4" method="get">
    用户姓名: <input type="text" name="name"/> <br/>
    用户年龄: <input type="text" name="age"/><br/>
    用户性别: <input type="text" name="sex"/><br/>
    用户住址信息:
    用户所在省: <input type="text" name="address.province"/>
    用户所在市: <input type="text" name="address.town"/>
    用户所在区: <input type="text" name="address.district"/>

    <br/>   <input type="submit" value="提交user信息"/>
</form>

</body>
</html>
