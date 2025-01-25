package controller;

import java.io.IOException;
import java.util.List;

import dao.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

@WebServlet("/display")
public class displaycontroller extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		StudentDao dao = new StudentDao();
		List<Student> al =  dao.viewAllStudents();
	
		req.setAttribute("data", al);
		req.getRequestDispatcher("display.jsp").forward(req, resp);
		
	
	}
}
