<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.pojo.Hero"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>所有英雄</h1>
	<table border=1 width=400 id="td">
		<tr>
			<th>ID</th>
			<th>USERID</th>
			<th>DATE</th>
			<th>OPERATE</th>
		</tr>
 		<% 
 			List<Hero> list = (List<Hero>) request.getAttribute("List");
 			for (Hero hero : list) {
				out.println("<tr>");
 				out.print("<td>" + hero.getId()+"</td>");
 				out.print("<td>" + hero.getName()+"</td>");
 				out.print("<td>" + hero.getNickName()+"</td>");
 				out.print("<td>" + "<a href=\"Delete?id=" + hero.getId() + "\">修改</a>"+"/"+
 				"<a href=\"Delete?id=" + hero.getId() + "\">删除</a>");
 				out.println("</tr>");
 			}

 		%> 

	</table>
</body>
</html>