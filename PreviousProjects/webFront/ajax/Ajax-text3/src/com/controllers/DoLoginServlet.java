package com.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.biz.DoLogin;
import com.bizImp.DoLuoginImpl;
import com.entity.User;

@SuppressWarnings("serial")
public class DoLoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		    doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("进入");
		DoLogin doLogin=new DoLuoginImpl();
		User user=new User();
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		user.setUsername(username);
		user.setPassword(password);
		//为后面信息查询做铺垫
		user.setId(3);
		User userSession=doLogin.login(user);
		if(null!=userSession){
			List<User> list=new ArrayList<User>();
			list=doLogin.selectList();
			req.setAttribute("list", list);
			req.getSession().setAttribute("userSession",userSession);
			req.getRequestDispatcher("Socket.jsp").forward(req, resp);
		}else{
			resp.sendRedirect("Login.jsp");
		}
	}
}
