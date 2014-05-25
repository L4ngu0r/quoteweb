<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String contextPath = getServletContext().getContextPath();
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index Quote Web</title>
</head>
<body>
INDEX
<a href="<%= contextPath %>/addQuote">Add quote</a>
</body>
</html>