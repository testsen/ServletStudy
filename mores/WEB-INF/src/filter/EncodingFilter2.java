package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter2 implements Filter{

	private String encode;

	public void init(FilterConfig filterConfig)
						throws ServletException{

		//次の1行で初期化パラメータを読み込む
		encode = filterConfig.getInitParameter("Encode");

		System.out.println("encode=" + encode);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("calls EncodingFilter#doFilter()");

		request.setCharacterEncoding(encode);
		chain.doFilter(request, response);

	}

	public void destroy() {
		//何もしない
	}

}
