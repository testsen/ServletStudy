<%@page contentType="text/html; charset=Windows-31J" %>

<HTML>
<BODY>

<H2>�����ȃp�����[�^</H2>

<FORM ACTION="../ParamListServlet">

<P>�e�L�X�g�t�B�[���h
<INPUT TYPE="text" NAME="text1" VALUE="�e�L�X�g�t�B�[���h">

<P>�e�L�X�g�G���A
<TEXTAREA NAME="textarea1" COLS="30" ROWS="5">�e�L�X�g�G���A</TEXTAREA>

<P>���W�I�{�^��
<INPUT TYPE="RADIO" NAME="radio1" VALUE="value1" CHECKED>��

<P>�`�F�b�N�{�b�N�X
<INPUT TYPE="CHECKBOX" NAME="check1">�S���t
<INPUT TYPE="CHECKBOX" NAME="check2">�e�j�X
<INPUT TYPE="CHECKBOX" NAME="check3">�T�b�J�[

<P>�Z���N�g
<SELECT NAME="lang" SIZE="3" MULTIPLE="true">
<OPTION VALUE="se1">VB
<OPTION VALUE="se2">C
<OPTION VALUE="se3">Java
	</SELECT>

	<P>
	<INPUT TYPE="SUBMIT">
	<INPUT TYPE="RESET">


</FORM>
</BODY>
</HTML>