<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/11/11
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

 <form action="/identification" enctype="multipart/form-data" method="post">
      图片：<input type="file" name="file1"><br/>
     英文：<input type="radio" value="eng" name="language">
     简体中文：<input type="radio" value="chi_sim" name="language"><br>
     <input type="submit" value="提交">
 </form>
  </body>
</html>
