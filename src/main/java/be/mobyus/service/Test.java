package be.mobyus.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class Test extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			 throws ServletException, IOException {
		
		
		resp.getWriter().println("TEST");
		}
}
