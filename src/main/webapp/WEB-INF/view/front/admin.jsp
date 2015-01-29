<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Admin</title>
<!-- <link href="resources/bootstrap-3.3.2-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/> -->
<link href="resources/script/main.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="resources/script/jquery-1.11.2.js" ></script>
<!-- <script type="text/javascript" src="resources/bootstrap-3.3.2-dist/js/bootstrap.min.js" ></script> -->

<script type="text/javascript">
$(function() {
});
</script>
</head>
<body>

	<div class="body">
		<jsp:include page="include/header.jsp" />
		<div class="content">
			<a href="add">添加分类</a>
		</div>
	</div>

</body>
</html>