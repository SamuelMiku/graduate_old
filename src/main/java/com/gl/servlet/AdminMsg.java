package com.gl.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gl.bean.Message;
import com.gl.dao.MessageDAO;

/**
 * Servlet implementation class AdminMsg
 */
public class AdminMsg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminMsg() {
        super();
        
    }
    
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	req.getRequestDispatcher("WEB-INF/views/adminmsg.jsp").forward(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	Message msg1 = new Message();
    	Message msg2 = new Message();
    	Message msg3 = new Message();
    	
    	msg1.setMsgTitle(req.getParameter("msg1_title"));
    	msg1.setMsgContent(req.getParameter("msg1_content"));
    	msg1.setMsgUrl(req.getParameter("msg1_url"));
    	System.out.println(req.getParameter("msg1_show"));
    	if(req.getParameter("msg1_show") != null && req.getParameter("msg1_show").equals("on")){
    		msg1.setMsgShow(true);
    	}else {
			msg1.setMsgShow(false);
		}
    	
    	
    	msg2.setMsgTitle(req.getParameter("msg2_title"));
    	msg2.setMsgContent(req.getParameter("msg2_content"));
    	msg2.setMsgUrl(req.getParameter("msg2_url"));
    	if(req.getParameter("msg2_show") != null && req.getParameter("msg2_show").equals("on")){
    		msg2.setMsgShow(true);
    	}else {
			msg2.setMsgShow(false);
		}
    	
    	msg3.setMsgTitle(req.getParameter("msg3_title"));
    	msg3.setMsgContent(req.getParameter("msg3_content"));
    	msg3.setMsgUrl(req.getParameter("msg3_url"));
    	if(req.getParameter("msg3_show") != null && req.getParameter("msg3_show").equals("on")){
    		msg3.setMsgShow(true);
    	}else {
			msg3.setMsgShow(false);
		}
    	
    	MessageDAO dao = new MessageDAO();
    	dao.updateAll(msg1, msg2, msg3);
    }
}
