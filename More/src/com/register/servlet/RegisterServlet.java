package com.register.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MoreDB.MoreDB;
import com.more.model.MoreModel;
import com.morebusinesslogic.MoreBusinessLogicClass;

/**
 * Servlet implementation class RegisterServlet
 */
// @WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);

		System.out.println("We have successfully received your details");
		String empid = request.getParameter("employeeid");
		String empname = request.getParameter("employeename");
		String depcode = request.getParameter("departmentcode");
		String doj = request.getParameter("dateofjoining");
		String pass = request.getParameter("password");
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(depcode);
		System.out.println(doj);
		System.out.println(pass);

		MoreModel modobj = new MoreModel();
		modobj.setEmpid(empid);
		modobj.setEmpname(empname);
		modobj.setDepcode(depcode);
		modobj.setDoj(doj);
		modobj.setPass(pass);

		MoreBusinessLogicClass busobj = new MoreBusinessLogicClass();
		boolean result = busobj.businesslogic(modobj);
		if (result == true) {
			System.out.println("Registered in DB sucessfully");
			
			MoreDB dbobj=new MoreDB();
			dbobj.adduser(modobj);
			
		} else {
			response.sendRedirect("https://www.google.co.in");
	}
	}
}
