package control;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/customer")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
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
		
		//文字化け対策
		request.setCharacterEncoding("UTF-8");
		
		//エラーメッセージmessage定義
		String message = null;
	
		//パラメータ取得
		String name =  request.getParameter("name");
		String address = request.getParameter("address");
		String nickname = request.getParameter("nickname");
		String workplace = request.getParameter("workplace");
		
		// コンソールに出力
        System.out.println(name);
        System.out.println(nickname);
        System.out.println(address);
        System.out.println(workplace);
        
        //リクエストスコープに代入
        request.setAttribute("name", name);
        request.setAttribute("address", address);
        request.setAttribute("nickname", nickname);
        request.setAttribute("workplace", workplace);
        
        // 画面遷移
        request.getRequestDispatcher("/CustomerResult.jsp").forward(request, response);
        
	}

}
