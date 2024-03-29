package com.naveen.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.naveen.beans.Login;
import com.naveen.dao.LoginDao;
 
@WebServlet("/login-validate")
public class LoginValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
		 
		String userName = request.getParameter("uname"); 
		String password = request.getParameter("pass"); 
		
		Login login = new Login(); 
		login.setUserName(userName); 
		login.setPassword(password);
		
		if(new LoginDao().loginValidate(login)) {
//			// invoke login success servlet 
//			request.getRequestDispatcher("success").forward(request, response);
			
			// call the jsp 
			String uri = "WEB-INF/pages/dashboard.jsp"; 
			request.setAttribute("company-name", "SAPIENT INDIA PRIVATE LTD");
			request.setAttribute("login", new Login("DUMMY", "DUYMMY"));
			request.getRequestDispatcher(uri).forward(request, response);
			
			
		}else {
			// show the login form with the error message 
			System.out.println("in else case.. ");
			response.setContentType("text/html"); 
			response.getWriter().println("<p style='color:red;text-align:center'>Please Enter valid Credentails</p>");
			request.getRequestDispatcher("/login-form.html").include(request, response); 
			
		}
		
	}

}
