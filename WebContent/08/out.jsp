<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page buffer="10kb" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	out.println("nihaoma");
	out.println("henhao");
	out.flush();
	out.clearBuffer();
	out.println("<br/>");
	out.println("当前缓冲区的大小："+out.getBufferSize());
	out.println("<br/>");
	out.println("当前缓冲区剩余大小:"+out.getRemaining());

%>

</body>
</html>