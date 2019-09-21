<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
     .cur{ background:red;}
     
   span{
     	width:34px;
     	height:34px;
     	border:1px solid #e1e2e3;
     	display:block;
     }
     
    a{
        text-align:center;
        text-decoration: none;
        line-height:34px;
        display:inline-block;
     }
     
     span:hover{
     	border:1px solid blue;
     	background:skyblue;
     }
     

</style>
</head>
<body>
	<h3 align="center">英雄信息</h3>
	<table border="1" width="70%" align="center">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>NICKNAME</th>
			<th>OPERATE</th>
		</tr>
		<c:forEach items="${data}" var="hero">
			<tr>
				<td>${hero.id }</td>
				<td>${hero.name }</td>
				<td>${hero.nickName}</td>
				<td><a href="<c:url value='/Modify?id=${hero.id }'/>">修改</a>/<a
					href="<c:url value='/Delete?id=${hero.id }'/>">删除</a></td>
			</tr>
		</c:forEach>
		<div class="page" align="center">
			<c:forEach begin="${pb.beginNum}" end="${pb.endNum}" varStatus="k">
				<c:if test="${k.index==pb.currPage}">
					<a><span class='cur'>${k.index}</span></a>
				</c:if>
				<c:if test="${k.index!=pb.currPage}">
					<a href="page?page=${k.index}"><span>${k.index}</span></a>
				</c:if>
			</c:forEach>
		</div>
	</table>

</body>
</html>