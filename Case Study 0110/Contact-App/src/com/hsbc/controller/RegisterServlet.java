package com.hsbc.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hsbc.model.beans.Profile;
import com.hsbc.model.business.ServiceLayer;
import com.hsbc.model.utility.FactoryPattern;
import com.hsbc.model.utility.LayerType;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("pass");
		long phone = Long.parseLong(request.getParameter("phone"));
		String dob = request.getParameter("dob");
		ServiceLayer service = (ServiceLayer) FactoryPattern.getInstance(LayerType.SERVICE);
		Profile profile = new Profile();
		profile.setName(name);
		profile.setPassword(password);
		profile.setPhone(phone);
		profile.setDob(dob);
		Profile profile1 = service.storeProfile(profile);
		HttpSession session = request.getSession();
		session.setAttribute("profileKey", profile1);
		RequestDispatcher rd = request.getRequestDispatcher("Login.html");
		rd.forward(request, response);
	}

}
