package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Hero;
import com.pojo.PageBean;
import com.service.Service;

/**
 * Servlet implementation class PageShowServlet
 */
@WebServlet("/page")
public class PageShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Service service = new Service();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PageBean pb = new PageBean();
		String spage=request.getParameter("page");
		if(spage==null) {
			spage="1";
		}
		int page = Integer.parseInt(spage);
		List<Hero> list = service.getPage(page);
		int n = service.getHeroCount();
		pb.setTotalCount(n);
		pb.setCurrPage(page);

		request.setAttribute("data", list);
		request.setAttribute("pb", pb);
		request.getRequestDispatcher("pageShow.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
