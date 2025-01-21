package controller;

import java.io.IOException;

import dao.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Student;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		Student st = new Student();
		st.setEmail(email);
		st.setPass(pass);
		
		
		StudentDao dao = new StudentDao();
		Student std = dao.logincheck(st);
		if(std==null)
		{
			req.setAttribute("err", "Invalid crednetials");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
		else
		{
			HttpSession session = req.getSession();
			session.setAttribute("email", std.getEmail());
			session.setAttribute("uname", std.getUname());
			req.getRequestDispatcher("display").forward(req, resp);
		}
		
		
		
	}
}
