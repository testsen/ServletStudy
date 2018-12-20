package reqattr;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GuessServlet2 extends HttpServlet {

	// 当たりの数字
	//private int hit = new Random().nextInt(10);

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String res = request.getParameter("number");

		String error = null;

		String path = null;

		final String[] index = new String[] {
				"/reqattr/guess_hit.jsp",
				"/reqattr/guess.jsp",
		};

		//必須チェック
		if(res == null || res.length() == 0) {

			error = "何か入れてね";

		}

		response.setContentType("text/plain; charset=Windows-31J");
		PrintWriter out = response.getWriter();

		request.setAttribute("number", res);

		if(error == null) {
			//型チェック
			try {

				int numStr = Integer.parseInt(res);

				//範囲チェック
				if(numStr < 0 || numStr >= 10) {

					error = "0～9までの数字を入れてください";

				}else {
					out.println("数字：" + res);

					HttpSession session = request.getSession();
					Integer hit = (Integer)session.getAttribute("hit");
					if(hit == null) {
						hit = new Integer(new Random().nextInt(10));
						session.setAttribute("hit", hit);
					}

					if (hit == numStr) {

						path = index[0];

						session.removeAttribute("hit");

					} else {

						path = index[1];

					}

				}


			}catch(NumberFormatException e){
				error = "数字を入力してください";

			}


		}

		//エラーがあれば出力
		if(error != null){
			request.setAttribute("error", error);
			path = index[1];

		}


		RequestDispatcher dispatcher = request.getRequestDispatcher(path);

		dispatcher.forward(request, response);




	}

}
