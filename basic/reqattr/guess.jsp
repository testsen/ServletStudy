<%@ page language="java" contentType="text/html; charset=Windows-31J"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J">
<title>Insert title here</title>
</head>
<body>
<H2>数字当てゲーム</H2>

（画面遷移＆リクエスト属性バージョン）<br>

0～9の数字を入れてください

<FORM ACTION="GuessServlet2">
<INPUT TYPE="TEXT" NAME="number">
<INPUT TYPE="SUBMIT" VALUE="送信">
</FORM>

<%
String error = (String)request.getAttribute("error");
String number = (String)request.getAttribute("number");
if(error != null){
	out.println(error);
}else if(number != null){
	out.println("はずれ。数字=" + number);
}


%>

</body>
</html>