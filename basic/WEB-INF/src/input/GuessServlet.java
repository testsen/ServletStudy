package input;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GuessServlet extends HttpServlet {

	// ������̐���
	private int hit = new Random().nextInt(10);

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("Windows-31J");

		String res = request.getParameter("number");

		String error = null;

		//�K�{�`�F�b�N
		if(res == null || res.length() == 0) {

			error = "��������Ă�";

		}

		response.setContentType("text/plain; charset=Windows-31J");
		PrintWriter out = response.getWriter();

		if(error == null) {
			//�^�`�F�b�N
			try {

				int numStr = Integer.parseInt(res);

				//�͈̓`�F�b�N
				if(numStr < 0 || numStr >= 10) {

					error = "0�`9�܂ł̐��������Ă�������";

				}else {
					out.println("�����F" + res);

					if (hit == numStr) {

						out.println("������!");

					} else {

						out.println("�͂���");

					}

				}


			}catch(NumberFormatException e){
				error = "��������͂��Ă�������";

			}


		}

		//�G���[������Ώo��
		if(error != null){
			out.println(error);

		}







	}

}
