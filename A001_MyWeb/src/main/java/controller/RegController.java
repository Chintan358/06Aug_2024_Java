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
public class RegController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name =  req.getParameter("name");
		String email =  req.getParameter("email");
		
		Student st = new Student();
		st.setName(name);
		st.setEmail(email);
		
		StudentDao dao = new StudentDao();
		int i = dao.addStudent(st);
		if(i>0)
		{
			req.setAttribute("msg", "Registration success !!!");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
		
	}
}
