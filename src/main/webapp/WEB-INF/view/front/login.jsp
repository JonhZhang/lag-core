<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Lag网登入</title>
<link href="resources/script/main.css" rel="stylesheet" type="text/css"/>
<link href="resources/script/register.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="resources/script/jquery-1.11.2.js" ></script>

<script type="text/javascript">

</script>
</head>
<body>

	<div class="body">
		
		<div class="warp_out">
			<p>请登入</p>
			<form action="login" method="post" >
				<p>
					<input type="text" name="email" placeholder="请输入常用邮箱地址" id="email"/> <form:errors path="user.email"/> ${errorMessage}
				</p>
				<p>
					<input type="text" name="password" placeholder="请输入密码" id="password"/> <form:errors path="user.password"/>
				</p>
				<input type="submit" value="登入" id="regBtn"/>
			</form>
		</div>
		
	</div>

</body>
</html>