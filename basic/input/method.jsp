<%@page contentType="text/html; charset=Windows-31J" %>

<HTML>
<BODY>

<H2>MethodServlet�̓���

<A HREF="../MethodServlet?MethodServlet?message=hello">�����N��GET���M</A>

<FORM ACTION="../MethodServlet" METHOD="GET">
<INPUT TYPE="TEXT" NAME="message">
<INPUT TYPE="SUBMIT" VALUE="�t�H�[����GET���M">

</FORM>

<FORM ACTION="../MethodServlet" METHOD="POST">
<INPUT TYPE="TEXT" NAME="message">
<INPUT TYPE="SUBMIT" VALUE="�t�H�[����post���M">
</FORM>

</BODY>
</HTML>
