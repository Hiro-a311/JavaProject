package control;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PasswordServlet
 */
@WebServlet("/PasswordServlet")
public class PasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//文字化け対策
				request.setCharacterEncoding("UTF-8");
				
				//password分岐処理用エラーメッセージmessage定義
				String message = null;
				
				//画面遷移用dispacher定義
				RequestDispatcher dispatcher = null;
			
				//パラメータ取得
				String loginId =  request.getParameter("loginId");
				String password = request.getParameter("password");
				
				// コンソールに出力
		        System.out.println(loginId);
		        System.out.println(password);
		        
		        //リクエストスコープに代入
		        request.setAttribute("loginId", loginId);
		        request.setAttribute("password", password);
		        
		        
		        //【password分岐処理】
		        //passwordがJava1234ならログイン成功
		        //passwordが空ならエラーメッセージ出力
		        //passwordがJava1234以外ならエラーメッセージ出力
		        
		        //空の時の処理
		        if (password != null && password.equals("")) {
		        	
		        	//エラーメッセージを定義
		        	message = "パスワードか空白です。パスワードを入力してください。";
		        	
		        	//エラーメッセージをリクエストオブジェクトに登録
		        	request.setAttribute("message",message);
		        	
		        	//PasswordEntry.jspに遷移先指定
		        	request.getRequestDispatcher("/src/main/webapp/PasswordEntry.jsp");
		        
		        //Java1234の時の処理
		        }else if(password.equals("Java1234")) {
		        
		        	//メッセージを定義
		        	message = "ログインユーザー：荒木さん！おはようございます";
		        	
		        	//メッセージを理消すとオブジェクトに登録
		        	request.setAttribute("message", message);
		        	
		        	//PasswordSuccess.jspへ遷移
		        	dispatcher = request.getRequestDispatcher("/PasswordSuccess.jsp");
		        
		        //パスワードが違う時の処理
		        }else {
		        	
		        	//エラーメッセージ定義
		        	message = "パスワードが違います。正しいパスワードを入力してください。";
		        	
		        	//エラーメッセージをリクエストオブジェクトに登録
		        	request.setAttribute("message",message);
		        	
		        	//PasswordEntry.jspに遷移先指定
		        	dispatcher = request.getRequestDispatcher("PasswordEntry.jsp");
		        	
		        }
		        
		        //画面遷移処理
		        dispatcher.forward(request,response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
