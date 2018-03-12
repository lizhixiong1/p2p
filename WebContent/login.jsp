<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="<%=path%>/bootstrap/css/bootstrap.min.css">

<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link rel="stylesheet"
	href="<%=path%>/bootstrap/css/bootstrap-theme.min.css">

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="<%=path%>/bootstrap/jquery.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="<%=path%>/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/angular-1.2.5/angular.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/angular-1.2.5/angular-route.js"></script>
<script type="text/javascript"
	src="<%=path%>/angular-1.2.5/angularjs/login.js"></script>

</head>
<base href="<%=basePath%>">
<script type="text/javascript">
	var InterValObj; //timer变量，控制时间
	var count = 30; //间隔函数，1秒执行
	var curCount;//当前剩余秒数
	function sendMessage() {
		curCount = count;
		$("#btn").attr("disabled", "true");
		$("#btn").val(curCount + "秒后可重新发送");
		InterValObj = window.setInterval(SetRemainTime, 1000); //启动计时器，1秒执行一次请求后台发送验证码 TODO
	}
	//timer处理函数
	function SetRemainTime() {
		if (curCount == 0) {
			window.clearInterval(InterValObj);//停止计时器
			$("#btn").removeAttr("disabled");//启用按钮
			$("#btn").val("重新发送验证码");
		} else {
			curCount--;
			$("#btn").val(curCount + "秒后可重新发送");
		}
	}
</script>
<body ng-app="app" ng-controller="myctrl">
	<div class="container" style="margin: 300px">
		<form class="form-horizontal">
			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">手机号:</label>
				<div class="col-sm-3">
					<input type="text" class="form-control" id="phone" name="phone"
						ng-model="user.name">
				</div>
				<input class="btn btn-info" id="btn" type="button" value="获取验证码" onclick="sendMessage()">
			</div>
			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">输入验证码:</label>
				<div class="col-sm-3">
					<input type="text" class="form-control" name="code"  id = "code">
				</div>

			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<input type="button" class="btn btn-info" id = "lo"
						value="确定">
				</div>
			</div>
		</form>
	</div>
</body>
<script type="text/javascript">
	var sms = "";
	$("#btn").click(function() {
		var phone = $("#phone").val();
		alert(phone);
		if (phone != "") {
			$.ajax({
				url : "sendSMS",
				type : "post",
				data : {
					"phone" : phone
				},
				success : function(result) {
					sms = result;
					alert(sms);
				}
			});
		} else {
			alert("请输入手机号");
			return false;
		}

	});
	$("#lo").click(function() {
		var code = $("#code").val();
		alert(sms);
		alert(code);
		if (code == "") {
			alert("请输入验证码");
		} else {
			if (sms == code) {
				location.href = "success.jsp";
			} else {
				alert("验证码错误");
			};
		};
	});
</script>
</html>