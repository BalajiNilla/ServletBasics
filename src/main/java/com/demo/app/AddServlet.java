package com.demo.app;

import java.io.IOException;
import java.net.http.HttpResponse;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k= i+j;
//		res.getWriter().println("yeah this is " + i+j);
		
//		req.setAttribute("k",i+j);
//		RequestDispatcher dispatcher = req.getRequestDispatcher("/ms");
//		dispatcher.forward(req, res);
		//This is for dispatcher
		
//		HttpSession session  = req.getSession();
//		session.setAttribute("k", k);           // session concept
//		
		
		Cookie ck = new Cookie("k", k +"");
		
		res.addCookie(ck);
		res.sendRedirect("ms");	//URL Rewriting	//using sendredirect
	}

}
