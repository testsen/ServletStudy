<%@ page language="java" contentType="text/html; charset=Windows-31J"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J">
<title>Insert title here</title>
</head>
<body>
<h2>�哖����</h2>

<%
String number = (String)request.getAttribute("number");
if(number != null){
	out.println("������B����=" + number);
}
%>

</body>
</html>