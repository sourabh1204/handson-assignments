package com.hsbc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContactServlet
 */
@WebServlet("/contactDetails")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String contact = request.getParameter("Contact");
		String email = request.getParameter("Email");
		
		pw.write("<html><body><p>");
		pw.write("Contact Number: "+contact);
		pw.write("<br />Email Id: "+email);
		pw.write("</p></body></html>");
		
		//RequestDispatcher rd = request.getRequestDispatcher("studentDetails.html");
		//rd.include(request, response);
	}

}
