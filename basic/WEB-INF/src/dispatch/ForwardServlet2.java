package dispatch;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardServlet2 extends HttpServlet{

	public void doGet(HttpServletRequest request,
						HttpServletResponse response) throws IOException,ServletException{


		//RequestDispatcherオブジェクトの取得
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("/dispatch/forward_ok.jsp");

		//フォワードの実行
		dispatcher.forward(request, response);

	}

}
