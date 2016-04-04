<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>page对象示例</title>
</head>
<body>
<%
	out.println("page对象的字符串"+page.toString());
	out.println("<br/>");
	page.getClass();
	out.println("<br/>");
	page.hashCode();
	//page.equals(obj);
%>
</body>
</html>