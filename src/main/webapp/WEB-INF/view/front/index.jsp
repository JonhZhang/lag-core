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
<title>Lag网主页</title>
<link href="resources/script/main.css" rel="stylesheet" type="text/css"/>
<link href="resources/script/index.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="resources/script/jquery-1.11.2.js" ></script>

<script type="text/javascript">
$(function() {
});
</script>
</head>
<body>

	<div class="body">
		<jsp:include page="include/header.jsp" />
		
		
		<div class="content">
			<div class="sidebar">
				<div class="technology_box box">
					<h3>技术</h3>
					<a href="">PHP</a>
					<a href="">C</a>
					<a href="">C++</a>
					<a href="">Android</a>
					<a href="">iOS</a>
					<a href="">测试</a>
					<a href="">前端开发</a>
					<a href="">技术经理</a>
					<a href="">技术总监</a>
					<a href="">架构师</a>
					<a href="">CTO</a>
				</div>
				
				<div class="product_box box">
					<h3>产品</h3>
					<a href="">PHP</a>
					<a href="">C</a>
					<a href="">C++</a>
					<a href="">Android</a>
					<a href="">iOS</a>
				</div>
				
				<div class="desig_box box">
					<h3>设计</h3>
					<a href="">PHP</a>
					<a href="">C</a>
					<a href="">C++</a>
					<a href="">Android</a>
					<a href="">iOS</a>
				</div>
				
				<div class="operation_box box">
					<h3>运营</h3>
					<a href="">PHP</a>
					<a href="">C</a>
					<a href="">C++</a>
					<a href="">Android</a>
					<a href="">iOS</a>
				</div>
				
				<div class="market_box box">
					<h3>市场与销售</h3>
					<a href="">PHP</a>
					<a href="">C</a>
					<a href="">C++</a>
					<a href="">iOS</a>
				</div>
				
				<div class="function_box box">
					<h3>职能</h3>
					<a href="">PHP</a>
					<a href="">C</a>
					<a href="">C++</a>
				</div>
				
			</div>
			
			<div class="content-right ">
					<div class="search_area">
						 <div class="search_condition">
						 	职位
						 </div>	
						 <div class="search_wrap">
						 	<input type="text" id="search_box" /><input type="submit" id="search_button" value="搜索">
						 </div>
					</div>
					<div class="hot_search">
						热门搜索：<a href="#">交互设计</a>
						<a href="#">交互设计</a>
						<a href="#">交互设计</a>
						<a href="#">交互设计</a>
						<a href="#">交互设计</a>
					</div>
					
					<div class="table">
						<div class="head">
							<ul>
								<li class="current">热门职位</li>
								<li>最新职位</li>
							</ul>
						</div>
						<table>
							<tr>
								<td>
									<h3>反作弊策略运营经理  <span>[北京]</span></h3>
									<p>月薪： 20k-25k 经验： 3-5年 最低学历： 本科 </p>
									<p>职位诱惑：创业环境、团队氛围、上升空间</p>
									<p>14:35发布</p>
								</td>
								<td>
									<h3>滴滴打车</h3>
									<p>领域： 移动互联网 创始人：程维 </p>
									<p>阶段： 成熟型(C轮) 规模：500-2000人</p>
									<p>弹性工作 节日礼物</p>
								</td>
							</tr>
							
							<tr>
								<td>
									<h3>反作弊策略运营经理  <span>[北京]</span></h3>
									<p>月薪： 20k-25k 经验： 3-5年 最低学历： 本科 </p>
									<p>职位诱惑：创业环境、团队氛围、上升空间</p>
									<p>14:35发布</p>
								</td>
								<td>
									<h3>滴滴打车</h3>
									<p>领域： 移动互联网 创始人：程维 </p>
									<p>阶段： 成熟型(C轮) 规模：500-2000人</p>
									<p>弹性工作 节日礼物</p>
								</td>
							</tr>
							
							<tr>
								<td>
									<h3>反作弊策略运营经理  <span>[北京]</span></h3>
									<p>月薪： 20k-25k 经验： 3-5年 最低学历： 本科 </p>
									<p>职位诱惑：创业环境、团队氛围、上升空间</p>
									<p>14:35发布</p>
								</td>
								<td>
									<h3>滴滴打车</h3>
									<p>领域： 移动互联网 创始人：程维 </p>
									<p>阶段： 成熟型(C轮) 规模：500-2000人</p>
									<p>弹性工作 节日礼物</p>
								</td>
							</tr>
							
							<tr>
								<td>
									<h3>反作弊策略运营经理  <span>[北京]</span></h3>
									<p>月薪： 20k-25k 经验： 3-5年 最低学历： 本科 </p>
									<p>职位诱惑：创业环境、团队氛围、上升空间</p>
									<p>14:35发布</p>
								</td>
								<td>
									<h3>滴滴打车</h3>
									<p>领域： 移动互联网 创始人：程维 </p>
									<p>阶段： 成熟型(C轮) 规模：500-2000人</p>
									<p>弹性工作 节日礼物</p>
								</td>
							</tr>
						</table>
					</div>
			</div>
			
		</div>
		
		<div class="footer">
			帮助中心 联系我们 互联网公司导航 拉勾微博 拉勾微信 ©2013-2014 Lagou 京ICP备14023790号-2
		</div>
	</div>

</body>
</html>