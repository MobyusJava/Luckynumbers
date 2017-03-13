package be.mobyus.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import be.mobyus.bean.NumberBean;

@WebServlet("/lucknumber")
public class NumberService extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			 throws ServletException, IOException {
		NumberBean bean = new NumberBean();
		bean.setName(req.getParameter("name"));
		List<Integer> numbers = new ArrayList();
		numbers.add(new Integer(7));
		numbers.add(new Integer(21));
		numbers.add(new Integer(8));
		bean.setNumbers(numbers);
		
		//We add the bean to the request and not the session or application!!
		req.setAttribute("lucky", bean);
		
		//Get the result url and forward the result
		RequestDispatcher dis = req.getRequestDispatcher("/WEB-INF/result.jsp");
		dis.forward(req, resp);
		}

}
