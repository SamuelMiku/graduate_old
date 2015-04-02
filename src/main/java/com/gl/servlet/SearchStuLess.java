package com.gl.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gl.bean.StuGraduateInfo;
import com.gl.dao.StuGraduateInfoDAO;
import com.gl.utils.AuthVar;

public class SearchStuLess extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7211643377672490229L;

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		String code = (String) req.getSession().getAttribute(AuthVar.AUTHENTICATION_CODE);
		System.out.println(code);
		
		String reqCode = req.getParameter("code");
		if (reqCode.equals(code)) {	//验证码验证通过
			StuGraduateInfo stu = new StuGraduateInfo();
			stu.setStuName(req.getParameter("stuName"));
			stu.setStuIdentificationNum(req.getParameter("stuIdentificationNum"));
			
			String stuId = "";
			if ((stuId = StuGraduateInfoDAO.readId2Less(stu)) != null) {
				StuGraduateInfo info = StuGraduateInfoDAO.readByid(stuId);
				req.setAttribute("stu", info);
				req.getRequestDispatcher("WEB-INF/views/show.jsp").forward(req, res);
				return;
			}
		} 
			
		res.sendRedirect("main");
		
		
//		StuGraduateInfo stu = new StuGraduateInfo();
//		stu.setStuName(req.getParameter("stuName"));
//		stu.setStuIdentificationNum(req.getParameter("stuIdentificationNum"));
//		
//		String stuId = "";
//		if ((stuId = StuGraduateInfoDAO.readId2Less(stu)) != null) {
//			StuGraduateInfo info = StuGraduateInfoDAO.readByid(stuId);
//			req.setAttribute("stu", info);
//			req.getRequestDispatcher("WEB-INF/views/show.jsp").forward(req, res);
//		}
//		else {
//			System.out.println("hello world");
//		}
		
	}

}
