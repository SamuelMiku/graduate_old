package com.gl.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gl.bean.StuGraduateInfo;
import com.gl.dao.StuGraduateInfoDAO;

@SuppressWarnings("serial")
public class SelectByIDServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		StuGraduateInfo stu = new StuGraduateInfo();
		stu.setStuName(req.getParameter("stuName"));
		stu.setStuIdentificationNum(req.getParameter("stuIdentificationNum"));
		stu.setStuGraduationCardNum(req.getParameter("stuGraduationCardNum"));
		
		String stuId = "";
		if ((stuId = StuGraduateInfoDAO.readId2Less(stu)) != null) {
			req.setAttribute("stu", StuGraduateInfoDAO.readByid(stuId));
			req.getRequestDispatcher("WEB-INF/views/show.jsp").forward(req, resp);
		}
		else {
			System.out.println("hello world");
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/views/index.jsp").forward(req, resp);
	}
}
