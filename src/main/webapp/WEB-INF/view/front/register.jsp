<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Lag网注册</title>
<link href="resources/script/main.css" rel="stylesheet" type="text/css"/>
<link href="resources/script/register.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="resources/script/jquery-1.11.2.js" ></script>

<script type="text/javascript">

</script>
</head>
<body>

	<div class="body">
		
		<div class="warp_out">
			<form action="" method="post" >
				<p>
					<input type="text" placeholder="请输入常用邮箱地址" id="email"/>
				</p>
				<p>
					<input type="text" placeholder="请输入密码" id="password"/>
				</p>
				<input type="submit" value="注册" id="regBtn"/>
			</form>
		</div>
		
	</div>

</body>
</html>