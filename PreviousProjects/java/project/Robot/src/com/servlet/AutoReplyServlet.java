package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Command;
import com.entity.Message;
import com.service.ListCommandService;
import com.service.ListMessageService;

@SuppressWarnings("serial")
public class AutoReplyServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		/*ListMessageService listMessageService=new ListMessageService();
		Message message=new Message();
		message.setCommand(req.getParameter("content"));
		message.setDescription(null);
		out.write(listMessageService.queryCommandMassage(message));*/
		ListCommandService listCommandService=new ListCommandService();
		Command command=new Command();
		command.setName(req.getParameter("content"));
		command.setDescription(null);
		out.write(listCommandService.queryByCommand(command));
		out.flush();
		out.close();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
