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
	
</script>
<body ng-app="app" ng-controller="myctrl">
<h2>欢迎登陆！</h2>
</body>
</html>