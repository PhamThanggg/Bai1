package MyPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;

@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("Text/html");

		PrintWriter out = response.getWriter();

		// Khoi tao list
		List<User> list = Bean.ExportUsers();
		
		 out.println("<head>"); 
		 out.println("<title> Ket qua </title>");
		 out.println("</head>");
		 
		 out.println("<body>"); 
		 out.println("<table border = '1'>");
		 out.println("<tr>");
		 for(User user:list) {
			  
			 out.println("<td>"+user.getName1()+"</td>");
			 out.println("<td>"+user.getName2()+"</td>"); 
			  
		 }
		 out.println("<\tr>");
		 out.println("</table>"); 
		 out.println("</body>");
		 out.println("</html>");
		 
	}

}
