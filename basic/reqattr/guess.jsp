<%@ page language="java" contentType="text/html; charset=Windows-31J"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J">
<title>Insert title here</title>
</head>
<body>
<H2>�������ăQ�[��</H2>

�i��ʑJ�ځ����N�G�X�g�����o�[�W�����j<br>

0�`9�̐��������Ă�������

<FORM ACTION="GuessServlet2">
<INPUT TYPE="TEXT" NAME="number">
<INPUT TYPE="SUBMIT" VALUE="���M">
</FORM>

<%
String error = (String)request.getAttribute("error");
String number = (String)request.getAttribute("number");
if(error != null){
	out.println(error);
}else if(number != null){
	out.println("�͂���B����=" + number);
}


%>

</body>
</html>