package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//エンコーディングとMIMEタイプ
	    resp.setContentType("text/htme; charset = UTF-8");

	    PrintWriter out = resp.getWriter();

	    out.println("<html>");
	    out.println("<<head><title>サンプルページ</title></head>>");
	    out.println("<body");
	    out.println("<h1>HelloWorld!</h1>");
	    out.println("</body>");
	    out.println("</html>");
	    out.close();


	}
}