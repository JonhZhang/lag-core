<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>用户编辑</h1>
	
	<div>
		<form:form modelAttribute="user" method="post">
			<form:hidden path="id"/>
			username:<form:input path="username" /> <form:errors path="username"/>  <br/>
			age: <form:input path="age"/> <form:errors path="password"/> <br/>
			<input type="submit"/>
		</form:form>
	</div>
	
</body>
</html>