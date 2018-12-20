package validate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EtoServlet extends HttpServlet{

	final static String[] ETOS = new String[] {
			"�q�i�ˁj",
			"�N�i�����j",
			"�Ёi�Ƃ�j",
			"�K�i���j",
			"�C�i���j",
			"���i�݁j",
			"�߁i���܁j",
			"���i�Ђ��j",
			"�\�i����j",
			"�сi�Ƃ�j",
			"���i���ʁj",
			"��i���j",
	};

	public void doGet(HttpServletRequest request,
						HttpServletResponse response) throws ServletException,IOException {

		String yearStr = request.getParameter("year");
		int year = Integer.parseInt(yearStr);

		//����0�N���\�̂��߃v���X8���s���Ă���
		int index = (year + 8) % 12;
		String etoText = ETOS[index];

		response.setContentType("text/plain; charset=Windows-31J");
		PrintWriter out = response.getWriter();
		out.println("���Ȃ��̊��x�F" + etoText);
	}
}
