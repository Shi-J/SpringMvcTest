<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<%--
rest 风格的图书增删改查操作
添加图书：/book  （post 请求 添加n号图书）
删除图书：/book   &nbsp;(delete 请求 删除n号图书)
修改图书：/book （put 请求 修改n号图书）
查询图书：/book （get 请求 查询n号图书）

发送delete 和 put 方式请求的二步骤
1.  配置springmvc中的filter,它可以吧普通的请求转为规定格式的请求
2.
    2.1.表单的提交必须为post
    2.2.表单项中携带一个_method
    2.3._method的值就是需要转为你想要提交的形式的值
--%>

<%--    添加图书    --%>
<form action="book" method="post">
    <input type="text" name="bid"/>
    <input type="submit" value="添加图书"/>
</form>

<%--    删除图书    --%>
<form action="book" method="post">
    <input type="text" name="bid"/>
    <input type="hidden" name="_method" value="delete"/>
    <input type="submit"   value="删除图书 "/>
</form>

<%--    修改图书    --%>
<form action="book" method="post">
    <input type="text" name="bid"/>
    <input type="hidden" name="_method" value="put"/>
    <input type="submit"  value="修改图书"/>
</form>

<%--    查询图书    --%>
<form action="book" method="get">
    <input type="text" name="bid"/>
    <input type="submit"  value="查询图书 "/>
</form>

</body>
</html>
