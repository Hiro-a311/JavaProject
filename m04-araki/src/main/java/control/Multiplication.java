package control;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Multiplication
 */
public class Multiplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Multiplication() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//HTML出力
		PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE html>");
			out.println("<html lang=\"ja\">");
			out.println("<head>");
			out.println("    <meta charset=\"UTF-8\">");
			out.println("    <title>9×9表</title>");
	        out.println("    <style>");
	        out.println("        table {");
	        out.println("            border-collapse: collapse;");
	        out.println("            width: 50%;");
	        out.println("            margin: 20px auto;");
	        out.println("        }");
	        out.println("        th, td {");
	        out.println("            border: 1px solid #000;");
	        out.println("            padding: 10px;");
	        out.println("            text-align: center;");
	        out.println("        }");
	        out.println("    </style>");
	        out.println("</head>");
	        out.println("<body>");
	        out.println("    <table>");
	        out.println("        <thead>");
	        out.println("            <tr>");
	        out.println("                <th></th>");
	        
	        //【1行目】横の1～9を表示
	        for (int i = 1; i <= 9; i++) {
	        	out.println("<th>" + i + "</th>");
	        }
	        out.println("            </tr>");
	        out.println("        </thead>");
	        out.println("        <tbody>");
	        
	        //【2行目】
	        for (int i = 1; i <= 9; i++) {
	            out.println("            <tr>");
	            out.println("                <th>" + i + "</th>");
	            for (int j = 1; j <= 9; j++) {
	                out.println("                <td>" + (i * j) + "</td>");
	            }
	            out.println("            </tr>");
	        }
	        out.println("        </tbody>");
	        out.println("    </table>");
	        out.println("</body>");
	        out.println("</html>");
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
