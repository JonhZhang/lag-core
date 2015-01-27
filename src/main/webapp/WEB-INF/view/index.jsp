<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h3>
		<a href="users/add">Add</a>
	</h3>
	<table>
		<tr>
			<td>username</td>
			<td>age</td>
			<td>operate</td>
		</tr>
	
	<c:forEach items="${users}" var="u">
		<tr>
			<td>${u.username }</td>
			<td>${u.age }</td>
			<td><a href="users/edit/${u.id }">Edit</a></td>
		</tr>			
	</c:forEach>
	</table>	
</body>
</html>