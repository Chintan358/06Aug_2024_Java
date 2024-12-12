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
public class RegistrationController extends HttpServlet {
	
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			String uname  =req.getParameter("uname");
			String email = req.getParameter("email");
			String pass = req.getParameter("pass");
			
			Student st = new Student();
			st.setUname(uname);
			st.setEmail(email);
			st.setPass(pass);
			
			
			StudentDao dao = new StudentDao();
			
			boolean b = dao.isEmailExist(email);
			
			if(b)
			{
				req.setAttribute("err", "Email already exist  !!!");
				req.getRequestDispatcher("form.jsp").forward(req, resp);
			}
			else
			{
				int i =  dao.addStudent(st);
				
				if(i>0)
				{
					req.setAttribute("msg", "Registration successful !!!");
					req.getRequestDispatcher("form.jsp").forward(req, resp);
				}
			}
			
		}
}
