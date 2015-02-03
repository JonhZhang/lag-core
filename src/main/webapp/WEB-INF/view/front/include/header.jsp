		<%@ page language="java" contentType="text/html; charset=utf-8"pageEncoding="utf-8"%>
		<div class="nav">
				<a href="#" class="logo">
				</a>
				<ul>
					<li><a href="index">首页</a></li>
					<li>公司</li>
					<li>我的简历</li>
					<li><a href="admin">GO管理</a></li>
				</ul>
				<div class="collapsible_menu">
					${sessionScope.loginUser}
				</div>
		</div>
		
