<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>
<%@page import="reqattr.SampleBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J">
<title>Insert title here</title>
</head>
<body>

<H2>値を受け取るJSP</H2>

<%
SampleBean bean = (SampleBean)request.getAttribute("bean");
String message = bean.getMessage();

out.println(message);

%>

</body>
</html>