package controller;

import java.io.IOException;

import dao.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

@WebServlet("/edit")
public class EditController extends HttpServlet {
	
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			int id = Integer.parseInt(req.getParameter("id"));
			String uname  =req.getParameter("uname");
			String email = req.getParameter("email");
			String pass = req.getParameter("pass");
			
			Student st = new Student();
			st.setId(id);
			st.setUname(uname);
			st.setEmail(email);
			st.setPass(pass);
			
			
			StudentDao dao = new StudentDao();
			int i =  dao.editStudent(st);
			
			if(i>0)
			{
				req.setAttribute("msg", "Update successful !!!");
				req.getRequestDispatcher("update.jsp").forward(req, resp);
			}
			
			
		}
}
