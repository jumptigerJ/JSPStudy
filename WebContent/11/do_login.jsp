<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<body>
<%
	String userName = request.getParameter("userName");
	String password = request.getParameter("password");
	
	if(userName != null && password != null){
		session.setAttribute("userName", userName);
		response.setHeader("Refresh", "2;URL=welcome.jsp");
	}
	
%>

</body>
</html>