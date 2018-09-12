<%@page contentType="text/html; charset=Windows-31J" %>

<HTML>
<BODY>

<H2>MethodServletの入力

<A HREF="../MethodServlet?MethodServlet?message=hello">リンクでGET送信</A>

<FORM ACTION="../MethodServlet" METHOD="GET">
<INPUT TYPE="TEXT" NAME="message">
<INPUT TYPE="SUBMIT" VALUE="フォームでGET送信">

</FORM>

<FORM ACTION="../MethodServlet" METHOD="POST">
<INPUT TYPE="TEXT" NAME="message">
<INPUT TYPE="SUBMIT" VALUE="フォームでpost送信">
</FORM>

</BODY>
</HTML>
