package com.sample.servlet;

import java.io.*;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Loginservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		String userId = request.getParameter("userid");
		// creating a new hidden form field
		out.println("<form action='dashboard' method='post'>");
		out.println("<input type='hidden' name='userid' id='userid' value='" + userId + "'>");
		out.println("<input type='submit' value='submit' >");
		out.println("</form>");
		out.println("<script>document.forms[0].submit();</script>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}