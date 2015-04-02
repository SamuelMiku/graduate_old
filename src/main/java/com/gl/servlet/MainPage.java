package com.gl.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gl.bean.Message;
import com.gl.dao.MessageDAO;

/**
 * Servlet implementation class MainPage
 */
public class MainPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public int newscode = 0;
    
    public MainPage() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MessageDAO med = new MessageDAO();
		List<Message> list = med.readAll();
		for (Message message : list) {
			request.setAttribute("news" + Integer.valueOf(message.getMsgTag()) + "_show", message.isMsgShow());
//			request.setAttribute("news" + Integer.valueOf(message.getMsgTag()) + "_tag", message.getMsgTag());
			request.setAttribute("news" + Integer.valueOf(message.getMsgTag()) + "_title", message.getMsgTitle());
			request.setAttribute("news" + Integer.valueOf(message.getMsgTag()) + "_content", message.getMsgContent());
			request.setAttribute("news" + Integer.valueOf(message.getMsgTag()) + "_url", message.getMsgUrl());
			
		}
		request.getRequestDispatcher("WEB-INF/views/index.jsp").forward(request, response);
	}

}
