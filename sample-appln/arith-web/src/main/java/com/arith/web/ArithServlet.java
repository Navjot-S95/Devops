package com.arith.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arith.service.ArithService;

@WebServlet(urlPatterns="/arith")
public class ArithServlet extends HttpServlet {

	private ArithService arithService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		arithService = new ArithService();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String n1 = req.getParameter("n1");
		String n2 = req.getParameter("n2");
		int result = arithService.add(Integer.parseInt(n1), Integer.parseInt(n2));
		req.setAttribute("arithResult", result);
		req.getRequestDispatcher("result.jsp").forward(req, resp);
	}

}
