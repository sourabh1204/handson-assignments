package com.hsbc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() is called");
		PrintWriter pw =  response.getWriter();
		pw.print("<html><body><p>");
		pw.print("Login Servlet doGet");
		pw.print("</p></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost() is called");
		PrintWriter pw = response.getWriter();
		String userName = request.getParameter("user");
		String password = request.getParameter("pass");
		
		if(userName.equals("Souru") && password.equals("1234")) {
			RequestDispatcher rd = request.getRequestDispatcher("success.html");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			pw.print("<html><body><p>");
			pw.print("Invalid Credentials");
			pw.print("</p></body></html>");
			rd.include(request, response);
		}
		
//		pw.print("<html><body><p>");
//		if(userName.equals("Souru") && password.equals("1234")) {
//			pw.print("Hello "+userName+", logged in successfully");
//		} else pw.print("invalid credentials");
//		pw.print("</p></body></html>");
	}

}
