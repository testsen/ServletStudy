package input;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MethodServlet extends HttpServlet{

		public void doGet(HttpServletRequest request,
						HttpServletResponse response)
								throws ServletException,IOException{

			System.out.println("doGet");
			perform(request, response);

		}

		public void doPost(HttpServletRequest request,
							HttpServletResponse response)
								throws ServletException,IOException{

			System.out.println("doPost");
			perform(request, response);

		}

		private void perform(HttpServletRequest request,
							HttpServletResponse response)
									throws ServletException,IOException{


			//���̓G���R�[�f�B���O�̎w��
			request.setCharacterEncoding("Shift-JIS");

			//���̓p�����[�^�\�̎擾
			String msg = request.getParameter("message");

			response.setContentType("text/plain; charset=Shif-JIS");
			PrintWriter out = response.getWriter();
			out.println("message="+ msg);


		}

}
