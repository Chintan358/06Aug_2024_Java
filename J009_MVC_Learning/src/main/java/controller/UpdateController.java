package controller;

import java.io.IOException;
import java.net.http.HttpClient;

import dao.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

@WebServlet("/update")
public class UpdateController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		int uid = Integer.parseInt(req.getParameter("uid"));
		String action = req.getParameter("action");
		
		StudentDao dao = new StudentDao();
		
		if(action.equals("delete"))
		{
			int i =  dao.deleteStudent(uid);
			if(i>0)
			{
				req.getRequestDispatcher("display").forward(req, resp);
			}
		}
		else if(action.equals("update"))
		{
			Student st =  dao.getStudentById(uid);
			req.setAttribute("st", st);
			req.getRequestDispatcher("update.jsp").forward(req, resp);
		}
	}
	
	
	
}
