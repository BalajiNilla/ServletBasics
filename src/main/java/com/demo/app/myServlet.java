package com.demo.app;

import java.io.IOException;
import java.net.http.HttpRequest;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ms")
public class myServlet  extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
//		HttpSession session = req.getSession();
		
		Cookie cookies[]= req.getCookies();
		
		int k = 1;
		
		for(Cookie c : cookies) {
			if(c.getName().equals("k")){
				 k =Integer.parseInt( c.getValue());
			}
		}
		
		
		
//		int k = (int)session.getAttribute("k");
		
//		int k = Integer.parseInt(req.getParameter("k"));
		
		k =k*k;
		
		res.getWriter().println("K value is "+ k);
	}
	

}
