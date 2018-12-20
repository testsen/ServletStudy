package session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionListServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,
						HttpServletResponse response)throws IOException,ServletException{

		//���̓p�����[�^�̎擾
		String keyParam = request.getParameter("key");
		String valueParam = request.getParameter("value");

		//�Z�b�V�����̎擾
		HttpSession session = request.getSession();

		//�Z�b�V�����ɃI�u�W�F�N�g�̊i�[
		if(keyParam != null) {

			session.setAttribute(keyParam, valueParam);

		}

		//�t�H�[���̏o��
		response.setContentType("text/html; charset=Windows-31J");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<form action=\"\">");
		out.println("key <input type=\"text\" name=\"key\"><br>");
		out.println("value <input type=\"text\" name=\"value\"><br>");
		out.println("<input type=\"submit\" value=\"�o�^\">");
		out.println("</form");

		//�Z�b�V���������̃I�u�W�F�N�g�ꗗ���o��
		Enumeration<String> names = session.getAttributeNames();
		while(names.hasMoreElements()) {
			String key = names.nextElement();
			Object value = session.getAttribute(key);
			out.println(key + "=" + value + "<br>");

		}

		out.println("</body></html>");



	}



}
