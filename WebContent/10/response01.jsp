<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>response对象示例01</title>
</head>
<body>
<%
	response.setHeader("Cache-control", "no-cache");
	response.setIntHeader("Refresh", 2);
	out.println("系统时间是："+new java.util.Date().toString()+"<br/>");
%>
</body>
</html>