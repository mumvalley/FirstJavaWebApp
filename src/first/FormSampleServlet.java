package first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormSampleServlet")
public class FormSampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response
			) throws ServletException, IOException {
		
		// リクエストパラメータ送信
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		
		// リクエストパラメータのチェック
		String errMsg = "";
		if (name == null || name.length() == 0) {
			errMsg += "名前が入力されていません。";
		}
		
		if (gender == null || gender.length() == 0) {
			errMsg += "性別が入力されていません。";
		} else {
			if (gender.equals("0")) {gender = "男性";}
			else if (gender.equals("1")) {gender = "女性";}
		}
		
		// メッセージの表示
		String msg = name + "さん(" + gender + ")を登録しました";
		if (errMsg.length() != 0) {
			msg = errMsg;
		}
		
		// HTML出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>ユーザー登録結果</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>" + msg + "<p>");
		out.println("</body>");
		out.println("</html>");
	}

}
