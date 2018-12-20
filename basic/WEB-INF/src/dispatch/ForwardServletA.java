package dispatch;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardServletA extends HttpServlet{

	public void doGet(HttpServletRequest request,
						HttpServletResponse response) throws IOException,ServletException{

		//�R���\�[���ɏo��
		System.out.println("call ForwardServlet");

		//RequestDispatcher�I�u�W�F�N�g�̎擾
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("/ForwardServletB");

		//�t�H���[�h�̎��s
		dispatcher.forward(request, response);

	}

}
