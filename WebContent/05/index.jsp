<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:forward page="login.jsp">
	<jsp:param value="xiaoming" name="username"></jsp:param>
	<jsp:param value="123" name="password"></jsp:param>
</jsp:forward>