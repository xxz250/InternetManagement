package com.chinatelecom.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.chinatelecom.serviceimp.ThreadServiceImpl;

public class SocketServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		ThreadServiceImpl socketservice=new ThreadServiceImpl();
		socketservice.start();
 	}
}
