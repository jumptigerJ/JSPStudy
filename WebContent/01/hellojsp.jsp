<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
JSP表达式输出：<%="hello world" %>
<!-- 全局变量 -->
<%!
	String str = "hello world";
%>
<%
	//String str = "hello world!";
	out.println(str);
%>

</body>
</html>