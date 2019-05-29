<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>修改界面</title>
		<link href="${ctx}/css/bootstrap.css" rel="stylesheet">
		<link href="${ctx}/plugin/datetimepicker/datetimepicker.css" rel="stylesheet">
	</head>

	<body>

		<div class="panel panel-default">
			<div class="panel-heading">修改学生</div>
			<div class="panel-body">
				<form action="${ctx}/commodity/update" method="post" role="form" id="data-form" class="form-horizontal">
					<input type="hidden" value="${stu.stuSno}" name="id">
					<div class="form-group">
						<label class="col-md-1 control-label" for="stuSname">商品编号</label>
						<div class="col-md-5">
							<input class="form-control" type="text" name="sid" value="${com.sid}" readonly="readonly">
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-1 control-label" for="stuSname">商品二级id</label>
						<div class="col-md-5">
							<input class="form-control" type="text" name="twoid" value="${com.twoid}">
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-1 control-label" for="stuSage">商品名</label>
						<div class="col-md-5">
							<input class="form-control" type="text" name="sname" value="${com.sname}">
						</div>
					</div>

                    <div class="form-group">
                        <label class="col-md-1 control-label" for="stuSage">商品价钱</label>
                        <div class="col-md-5">
                            <input class="form-control" type="text" name="sprice" value="${com.sprice}">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-1 control-label" for="stuSage">商品图片</label>
                        <div class="col-md-5">
                            <input class="form-control" type="text" name="sadress" value="${com.sadress}">
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