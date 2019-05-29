<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>添加学生</title>
		<link href="${ctx}/css/bootstrap.css" rel="stylesheet">
		<link href="${ctx}/plugin/datetimepicker/datetimepicker.css" rel="stylesheet">
	</head>

	<body>

		<div class="panel panel-default">
			<div class="panel-heading">添加商品</div>
			<div class="panel-body">
				<form action="${ctx}/commodity/add" method="post"  class="form-horizontal">
					<%--<div class="form-group">--%>
						<%--<label class="col-md-1 control-label" for="stuSname">商品编号</label>--%>
						<%--<div class="col-md-5">--%>
							<%--<input class="form-control" type="text" name="stuSname" placeholder="请输入商品编号">--%>
						<%--</div>--%>
					<%--</div>--%>

					<div class="form-group">
						<label class="col-md-1 control-label" for="stuSage">商品二级id</label>
						<div class="col-md-5">
							<input class="form-control" type="text" name="twoid" placeholder="请输入商品二级id">
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-1 control-label" for="stuSage">商品名</label>
						<div class="col-md-5">
							<input class="form-control" type="text" name="sname" placeholder="请输入商品名">
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-1 control-label" for="stuBirthday">商品价钱</label>
						<div class="col-md-5">
							<input class="form-control " type="text" name="sprice" placeholder="请输入商品价钱">
						</div>
					</div>

                    <div class="form-group">
                        <label class="col-md-1 control-label" for="stuBirthday">商品图片</label>
                        <div class="col-md-5">
                            <input class="form-control " type="text" name="sadress" placeholder="请输入商品图片">
                        </div>
                    </div>

					<div class="form-group">
						<div class="col-md-offset-1 col-md-11">
							<button type="submit" class="btn btn-default">保存</button>
						</div>
					</div>
				</form>
			</div>
		</div>
		<%-- 引入相关的js --%>
		<script src="${ctx}/js/jquery.js"></script>
		<script src="${ctx}/js/bootstrap.js"></script>
		<script src="${ctx}/plugin/datetimepicker/datetimepicker.js"></script>
		<script src="${ctx}/plugin/datetimepicker/datetimepicker.zh-CN.js"></script>
		<script src="${ctx}/js/date.js"></script>
	</body>

</html>