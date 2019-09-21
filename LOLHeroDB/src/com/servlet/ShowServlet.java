package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Hero;
import com.pojo.Message;
import com.service.Service;

/**
 * Servlet implementation class ShowBook
 */
@WebServlet("/Show")
public class ShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Service service = new Service();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//List<Hero> List = service.getHeros();
		List<Message> List = service.getMessages();
		request.setAttribute("List", List);
		request.getRequestDispatcher("/show.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
