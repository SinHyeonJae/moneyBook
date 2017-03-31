<%@page import="java.sql.Connection"%>
<%@page import="javafx.util.converter.DateStringConverter"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Context ic = new InitialContext();
	Context envContext = (Context) ic.lookup("java:/comp/env");
	DataSource ds = (DataSource) envContext.lookup("jdbc/mysql");
	Connection con = ds.getConnection();
	out.println("연결 성공");
	%>
</body>
</html>