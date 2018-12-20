package input;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GuessServlet extends HttpServlet {

	// 当たりの数字
	private int hit = new Random().nextInt(10);

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("Windows-31J");

		String res = request.getParameter("number");

		String error = null;

		//必須チェック
		if(res == null || res.length() == 0) {

			error = "何か入れてね";

		}

		response.setContentType("text/plain; charset=Windows-31J");
		PrintWriter out = response.getWriter();

		if(error == null) {
			//型チェック
			try {

				int numStr = Integer.parseInt(res);

				//範囲チェック
				if(numStr < 0 || numStr >= 10) {

					error = "0～9までの数字を入れてください";

				}else {
					out.println("数字：" + res);

					if (hit == numStr) {

						out.println("当たり!");

					} else {

						out.println("はずれ");

					}

				}


			}catch(NumberFormatException e){
				error = "数字を入力してください";

			}


		}

		//エラーがあれば出力
		if(error != null){
			out.println(error);

		}







	}

}
