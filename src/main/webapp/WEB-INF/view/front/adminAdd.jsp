<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<link href="resources/script/main.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="resources/script/jquery-1.11.2.js" ></script>
<script type="text/javascript" src="resources/script/adminAdd.js" ></script>
</head>
<body>

	<div class="body">
		<jsp:include page="include/header.jsp" />
		<div class="content">
			<form action="/lag/add" method="post">
				<p>
					选择父类:
					
					<select multiple="multiple" style="width:150px;" name="pid">
						<option value="0">顶级</option>
						<c:forEach items="${list }" var="category" >
							<option value="${category.id}" >${category.name }</option>
						</c:forEach>
					</select>
					
				</p>
				 <p> 
				 	主分类名： <input  name="name" type="text"  >	<form:errors path="category.name"/>
				 </p>	
				 <p>
				 	<input type="submit">
				 </p>	
			</form>
			
		</div>
		
		
	</div>
	
	
</body>
</html>