package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import com.biz.DoSocket;
import com.bizImp.DoSocketImpl;
import com.entity.Message;
import com.entity.User;

@SuppressWarnings("serial")
public class DoSockectServlet extends HttpServlet{
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
		resp.setCharacterEncoding("UTF-8");
	    //设定ajxa响应内容的格式
		resp.setContentType("text/html"); 
		
		DoSocket doSocket=new DoSocketImpl();
		User user=new User();
        //对象一定更要先实例化，再使用
		user=(User)(req.getSession().getAttribute("userSession"));
		System.out.println(user.toString());
		List<Message> listMessage=new ArrayList<Message>();
		
		//插入信息
		if(null!=req.getParameter("message")&&!("".equals(req.getParameter("message")))){
			String getMessage=req.getParameter("message");
			System.out.println("getMessage1:"+getMessage);
			Timestamp date=new Timestamp(new Date().getTime());
			Message message=new Message(date, getMessage, Integer.parseInt(req.getParameter("friend_id")), user.getId(),  user.getUsername());
			doSocket.insertMessage(message, user.getId(), Integer.parseInt(req.getParameter("friend_id")));
		}
		
		//查询信息
		System.out.println("friend_id"+req.getParameter("friend_id"));
		int get_friend_id=Integer.parseInt(req.getParameter("friend_id"));
		System.out.println("userID:"+user.getId());
		listMessage=doSocket.socket(get_friend_id,user.getId());
		
		//查询好友
		User friendUser=new User();
		friendUser.setId(get_friend_id);
		friendUser=doSocket.selectOneById(friendUser);
		
		if(null!=req.getParameter("message")){
			PrintWriter out= resp.getWriter();
			List<String> list=new ArrayList<String>();
			for (Message message2 : listMessage) {
				list.add(message2.getUsername());
				list.add(message2.getMessage());
			}
			resp.getWriter().write(JSONArray.fromObject(list).toString());
			out.flush();
		}
		else{
			req.setAttribute("friendUser", friendUser);
			req.setAttribute("listMessage",listMessage);
			req.getRequestDispatcher("Socket1.jsp").forward(req, resp);
		}
	}
}
