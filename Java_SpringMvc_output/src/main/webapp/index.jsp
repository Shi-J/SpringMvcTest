<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<html>
<body>


<form action="exhandle1" method="post">
    <input type="text"  name="i"/>
    <input type="submit" value="异常演示"/>
</form>

<br/><br/><br/><br/><br/><br/>

<a href="handle0">  错误演示</a> <br/>
<a href="handle1"> 转发测试</a> <br/>
<a href="handle2"> 重定向测试</a> <br/>


<br/><br/><br/><br/><br/><br/>



原生aip测试： <br/>
<form action="output1" method="post">
   请输入你需要传递的值 ：  <input type="text" name="value"/>
    <input type="submit" />
</form> <br>


map测试： <br/>
<form action="output2" method="post">
    请输入你需要传递的值 ：  <input type="text" name="valueMap"/>
    <input type="submit" />
</form>


model测试： <br/>
<form action="output3" method="post">
    请输入你需要传递的值 ：  <input type="text" name="valueModel"/>
    <input type="submit" />
</form>


valueModelMap测试： <br/>
<form action="output4" method="post">
    请输入你需要传递的值 ：  <input type="text" name="valueModelMap"/>
    <input type="submit" />
</form>


modelandview测试： <br/>
<form action="output5" method="post">
    请输入你需要传递的值 ：  <input type="text" name="modelandview"/>
    <input type="submit" />
</form>


modelandview测试2： <br/>
<form action="output6" method="post">
    请输入你需要传递的值 ：  <input type="text" name="modelandview2"/>
    <input type="submit" />
</form><br/><br/><br/><br/><br/>






</body>
</html>
