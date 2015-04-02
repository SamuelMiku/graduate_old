package com.gl.route;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gl.log.Log;
import com.gl.page.Page;

/**
 * Servlet implementation class RouteLogJSP
 */
public class RouteLogJSP extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * route the request to LogServlet
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Page<Log> page = new Page<Log>();
		String totalCount = request.getParameter("totalCount");
		if (null == totalCount) {
			page.setTotalCount(0);
		} else {
			page.setTotalCount(Integer.valueOf(totalCount));
		}
		
		String num = request.getParameter("pageNo");
		if (null == num || num.equals("")) {
			page.setPageNum(0);
		} else {
			page.setPageNum(Integer.valueOf(num));
		}
		
		request.setAttribute("page", page);
		request.getRequestDispatcher("LogServlet").forward(request, response);
	}

}
