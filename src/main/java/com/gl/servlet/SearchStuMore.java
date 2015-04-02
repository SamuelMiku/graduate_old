package com.gl.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gl.bean.StuGraduateInfo;
import com.gl.dao.StuGraduateInfoDAO;

public class SearchStuMore extends HttpServlet {

	/**
	 * Student select By Id
	 */
	private static final long serialVersionUID = -1726027779374859632L;

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		StuGraduateInfo stu = new StuGraduateInfo();
		stu.setStuName(req.getParameter("stuName"));
		stu.setStuSpecialty(req.getParameter("stuSpecialty"));
		
		String stuId = "";
		if ((stuId = StuGraduateInfoDAO.readId2More(stu, req.getParameter("nono"), req.getParameter("note"))) != null) {
			StuGraduateInfo info = StuGraduateInfoDAO.readByid(stuId);
			req.setAttribute("stu", info);
			req.getRequestDispatcher("WEB-INF/views/show.jsp").forward(req, res);
		}
		else {
			System.out.println("hello world");
		}
	}
}
