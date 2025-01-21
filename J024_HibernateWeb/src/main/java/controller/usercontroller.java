package controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import model.User;


@WebServlet("/reg")
@MultipartConfig
public class usercontroller extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String gender = req.getParameter("gender");
		String[] lang = req.getParameterValues("lang");
		String country = req.getParameter("country");
		Part image = req.getPart("file");
		
		String filename = Paths.get(image.getSubmittedFileName()).getFileName().toString();
		
		String filenameToStore =  System.currentTimeMillis()+"_"+filename;	
		String path =  req.getServletContext().getRealPath("")+File.separator+"img";
		
		File f = new File(path);
		if(!f.exists())
		{
			f.mkdir();
		}
		
		image.write(path+File.separator+filenameToStore);
		
		
		
		
		String row = "";
		for(String s : lang)
		{
			row +=s+",";
		}
		
		User u = new User();
		u.setUsername(uname);
		u.setEmail(email);
		u.setPhone(phone);
		u.setGender(gender);
		u.setLanguages(row);
		u.setCountry(country);
		u.setImage(filename);
		
		UserDao dao = new UserDao();
		int i = dao.addUser(u);
		if(i>0)
		{
			req.setAttribute("success", "Registration successfully ");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
		
		
		
	}
}
