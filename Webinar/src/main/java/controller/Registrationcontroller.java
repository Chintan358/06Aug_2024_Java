package controller;

import java.io.IOException;

import dao.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

@WebServlet("/reg")
public class Registrationcontroller extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		
		Student std = new Student();
		std.setName(uname);
		std.setEmail(email);
		
		
		StudentDao dao = new StudentDao();
		int i = dao.addStudent(std);
		if(i>0)
		{
			req.setAttribute("msg", "Registration successfully !!!!");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
		
		
		
	}
}
