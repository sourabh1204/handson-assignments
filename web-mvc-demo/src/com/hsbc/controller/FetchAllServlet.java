package com.hsbc.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hsbc.model.beans.User;
import com.hsbc.model.service.UserService;
import com.hsbc.model.util.FactoryPattern;
import com.hsbc.model.util.Type;

/**
 * Servlet implementation class FetchAllServlet
 */
@WebServlet("/FetchAllServlet")
public class FetchAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchAllServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<User> userList = new ArrayList<User>();
		UserService service = (UserService)FactoryPattern.getInstacnce(Type.SERVICE);
		userList = service.getAllUsers();
		request.setAttribute("listKey", userList);
		RequestDispatcher rd = request.getRequestDispatcher("fetchAll.jsp");
		rd.forward(request, response);
	}

	

}
