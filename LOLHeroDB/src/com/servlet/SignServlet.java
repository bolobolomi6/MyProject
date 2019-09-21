package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.User;
import com.service.Service;

/**
 * Servlet implementation class SignServlet
 */
@WebServlet("/Sign")
public class SignServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Service service = new Service();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		response.setContentType("text/html;charset=utf-8");

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		User user = new User(name, password);
		service.Sign(user);
		PrintWriter out = response.getWriter();
		
		out.println("<a href='index.html'>"+"注册成功点击返回登录页面"+"</a>");
		out.flush();
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
