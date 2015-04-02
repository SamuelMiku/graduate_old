package com.gl.select;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.gl.bean.StuGraduateInfo;
import com.gl.dao.StuGraduateInfoDAO;
import com.gl.utils.AuthVar;

public class SearchStuMore extends HttpServlet {

	/**
	 * Student select By Id
	 */
	private static final long serialVersionUID = -1726027779374859632L;
	static final Logger LOGGER = Logger.getLogger(SearchStuMore.class);
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		String code = (String) req.getSession().getAttribute(AuthVar.AUTHENTICATION_CODE);
		String reqCode = req.getParameter("authcode");

		StuGraduateInfo stu = new StuGraduateInfo();
		stu.setStuName(req.getParameter("stuName"));
		stu.setStuSpecialty(req.getParameter("stuSpecialty"));
		String stuId = "";
		
		if (!reqCode.equals(code)) {
			res.sendRedirect("error.jsp");//TODO: 验证码错误 
			return ;
		}
		if ((stuId = StuGraduateInfoDAO.readId2More(stu, req.getParameter("nono"), req.getParameter("note"))) != null) {
			StuGraduateInfo info = StuGraduateInfoDAO.readByid(stuId);
			LOGGER.info(stu.getStuName() + " query success");
			req.setAttribute("stu", info);
			req.getRequestDispatcher("WEB-INF/views/show.jsp").forward(req, res);
		}
		else {
			LOGGER.info(stu.getStuName() + " query fail");
			res.sendRedirect("error.jsp");
		}
	}
}
