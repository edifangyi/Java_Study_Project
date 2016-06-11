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

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("do get");
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("do post");
		// 参数应该和form表单中控件的name值相等
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		DAO dao = new DAO();
		List<User> list = dao.login(username, password);
		if (list.size() > 0) {
			// 一个新的请求，走一个新的界面
			request.getRequestDispatcher("left.html").forward(request, response);
		} else {
			request.getRequestDispatcher("login.html").forward(request, response);
		}
	}

}
