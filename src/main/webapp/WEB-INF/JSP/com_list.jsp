<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
  //request.getContextPath();//获取应用的上下文
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>信息列表</title>
		<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
        <script src="${ctx}/js/jquery.js"></script>
        <script>
            function del(id) {
                var sid = id;
                $.ajax({
                    url:"${ctx}/commodity/delete",
                    type:"GET",
                    data :{
                       sid : sid
                    },
                    dataType:"json",
                    success:function(data){
                        if(data.code==200){
                            alert("删除成功");
                            window.location.href="${ctx}/commodity/list";
                        }
                    }
                });
            }
        </script>
	</head>
	<body>
		<div class="panel panel-default">
			<div class="panel-heading">用户列表</div>
			<div class="panel-body">
				<!--新增链接-->
				<div style="margin-top: 5px;">
					<a class="btn btn-primary" href="${ctx}/commodity/add">新增</a>
				</div>
				<div id="info"></div>
				<!--列表模板-->
				<table class="table table-bordered" style="margin-top: 5px;">
					<thead>
					<%--表头--%>
                    <tr align="center">
                        <td>商品ID</td>
                        <td>二级分类ID</td>
                        <td>商品名</td>
                        <td>商品价格</td>
                        <td>商品图片</td>
                        <td colspan="2">操作</td>
                    </tr>

					</thead>
					<tbody>
					<%--循环显示列表信息--%>
                    <c:forEach items="${comList}" var="s">
                        <tr>
                            <td>${s.sid}</td>
                            <td>${s.twoid}</td>
                            <td>${s.sname}</td>
                            <td>${s.sprice}</td>
                            <td>${s.sadress}</td>
                            <td><a href="${ctx}/commodity/update?id=${s.sid}">修改</a></td>
                            <%--<td><a href="${ctx}/commodity/delete?sid=${s.sid}">删除</a></td>--%>
                            <td><a onclick="del(${s.sid})">删除</a></td>
                        </tr>
                    </c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</body>
</html>