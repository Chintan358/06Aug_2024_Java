package controller;

import java.io.IOException;

import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

@WebServlet("/update")
public class Updatecontroller extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int uid = Integer.parseInt(req.getParameter("uid"));
		String action = req.getParameter("action");
		
		UserDao dao = new UserDao();
		
		if(action.equals("delete"))
		{
			int i = dao.deleteUser(uid);	
			if(i>0)
			{
				req.getRequestDispatcher("display").forward(req, resp);
			}
		}
		else if(action.equals("edit"))
		{
			User u = dao.userById(uid);
			req.setAttribute("udata", u);
			req.getRequestDispatcher("index.jsp").forward(req, resp);
			
		}
		
		
	}
	
}
