package com.sachin.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sachin.web.daoImpl.UserDaoImpl;
import com.sachin.web.model.User;

/**
 * Servlet implementation class GetUserController
 */
public class GetUserController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int uid = Integer.parseInt(request.getParameter("uid"));
		/*
		 * UserDao dao = new UserDao(); User a1 = dao.getUser(uid);
		 */
		/*
		 * UserDaoNEW dao = new UserDaoNEW(); User a1 = dao.getUser1(uid);
		 */

		UserDaoImpl daoimpl = new UserDaoImpl();
		User a1 = daoimpl.getUser(uid);

		// User a1 = dao.getUser();
		request.setAttribute("user", a1);
		// ud.getUser(uid);
		RequestDispatcher rd = request.getRequestDispatcher("showuser.jsp");
		rd.forward(request, response);
	}
}
