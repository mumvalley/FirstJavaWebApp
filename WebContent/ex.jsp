<%@ page language="java" contentType="text/html; charset=UTF-8" import="first.Employee"
    pageEncoding="UTF-8"%>

<%
Employee emp = new Employee("0001", "そうくん");
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>エンプロイー</title>
</head>
<body>
<%for (int i = 0; i < 10; i++) { %>
	<%if(i % 3 == 0){ %>
		<p style="color:red">
	<% } else { %>
	<p>
	<%} %>
<p>IDは<%= emp.getId() %>、名前は<%= emp.getName() %>です。</p>
<%} %>
</body>
</html>