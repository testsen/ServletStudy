package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CounterServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,
						HttpServletResponse response)throws IOException,ServletException{

		//�Z�b�V�����̎擾
		HttpSession session = request.getSession();

		//�Z�b�V��������̃I�u�W�F�N�g�̎擾
		Integer count =(Integer) session.getAttribute("count");

		//�J�E���^��+1
		if(count == null) {
			count = new Integer(0);
		}

		count = new Integer(count.intValue() + 1);

		//�Z�b�V�����ɃI�u�W�F�N�g�̊i�[
		session.setAttribute("count", count);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		//�Z�b�V����ID�̕\��
		out.println("<p>sessionId=" + session.getId());

		//�J�E���^�̕\��
		out.print("<p>count=" + count);

		//���̃T�[�u���b�g�ւ̃����N�̕\��
		String linkUrl = request.getRequestURI();
		out.println("<p><a href=\"" + linkUrl + "\">RELOAD</a>");
		out.println("<body></html>");

	}

}
