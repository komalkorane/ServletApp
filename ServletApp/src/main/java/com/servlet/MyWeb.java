package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyWeb extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		PrintWriter out = res.getWriter();
		out.print("Hey shreee!!!!!!");

		out.close();
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("name");
		String phNum = req.getParameter("phone");

		res.setContentType("text/html");

		PrintWriter out = res.getWriter();

		out.println("<html><body>");
		out.print("<h3>Details Entered</h3><br/>");

		out.print("Full Name: " + name + "<br/>");
		out.print("Phone Number: " + phNum + "<br/>");
		out.print("</body></html>");

	}

}
