package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.User;
import com.dao.DAO;

/**
 * Servlet implementation class UserInitServlet
 */
@WebServlet("/UserInitServlet")
public class UserInitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("do get");
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String sid = request.getParameter("id");
		int id = 0;
		if (sid != null && !"".equals(sid)) {
			id = Integer.parseInt(sid);
		}	
		DAO dao = new DAO();
		User user = dao.findUserById(id);

		request.setAttribute("user", user);
		
		request.getRequestDispatcher("update.jsp").forward(request, response);
	}

}
