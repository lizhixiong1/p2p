<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    

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

<link rel="stylesheet" href="<%=path%>/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=path%>/bootstrap/css/bootstrap-theme.min.css">
<script src="<%=path%>/bootstrap/jquery.js"></script>
<script src="<%=path%>/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(function(){
		$(".page").click(function(){
			alert($(this).val())
			location.href = "<%=path%>/getList?cpage="+$(this).val()
		})
	})
</script>
</head>
<body>
	<table>
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>年龄</td>
		</tr>
		<c:forEach items="${list}" var = "u">
			<tr>
				<td>${u.id}</td>
				<td>${u.name}</td>
				<td>${u.age}</td>
			</tr>
		</c:forEach>
		<tr>
    		<td colspan="10"><button class = "page" value = "1">首页</button>
    			<button class = "page" value = "${pageUtil.prevPage}">上一页</button>
    			<button class = "page" value = "${pageUtil.nextPage}">下一页</button>
    			<button class = "page" value = "${pageUtil.lastPage}">尾页</button>
    			<input type = "text" size = "1" value = "${pageUtil.currentPage}" >
    			<button class = "jump">跳转</button>
    		</td>
    	</tr>
	</table>
</body>
</html>