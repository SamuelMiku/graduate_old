package com.gl.servlet;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gl.utils.AuthCodeGenerator;
import com.gl.utils.AuthVar;

/**
 * Servlet implementation class AuthServlet
 */
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AuthCodeGenerator authCodeGenerator = new AuthCodeGenerator();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BufferedImage image = authCodeGenerator.getAuthCodeImage();
		request.getSession().setAttribute(AuthVar.AUTHENTICATION_CODE, null);
		request.getSession().setAttribute(AuthVar.AUTHENTICATION_CODE, authCodeGenerator.getString());
		ImageIO.write(image, "JPEG", response.getOutputStream());
	}

}
