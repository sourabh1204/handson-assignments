package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
@SuppressWarnings("unchecked")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		String item = request.getParameter("item");
		ArrayList<String> list = null;
		HttpSession session = request.getSession();
		if(session.getAttribute("itemList") == null) {
			list = new ArrayList<String>();
			list.add(item);
		} else {
			list = (ArrayList<String>) session.getAttribute("itemList");
			list.add(item);
		}
		session.setAttribute("itemList", list);
		printWriter.print("itemCount "+((ArrayList<String>) session.getAttribute("itemList")).size());
		RequestDispatcher rd = request.getRequestDispatcher("list.html");
		rd.include(request, response);
	}

}
