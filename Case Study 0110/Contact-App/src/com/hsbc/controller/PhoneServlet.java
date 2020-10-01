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
import com.hsbc.model.exception.ProfileNotFoundException;
import com.hsbc.model.utility.FactoryPattern;
import com.hsbc.model.utility.LayerType;

/**
 * Servlet implementation class PhoneServlet
 */
@WebServlet("/PhoneServlet")
public class PhoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int profileId = Integer.parseInt(request.getParameter("profileId"));
		long upPhone = Long.parseLong(request.getParameter("upphone"));
		ServiceLayer service = (ServiceLayer) FactoryPattern.getInstance(LayerType.SERVICE);
		try {
			Profile profile = service.updatePhone(profileId, upPhone);
			HttpSession session = request.getSession();
			session.setAttribute("profileKey", profile);
			RequestDispatcher rd = request.getRequestDispatcher("LoginSuccessful.jsp");
			rd.forward(request, response);
		}catch (ProfileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
