<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/24 0024
  Time: 上午 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${ctx}/file/upload" enctype="multipart/form-data" id="data-form" >
    <input type="file" name="uploadFile"><br>
    <button>提交</button>
</form>
</body>

</html>
