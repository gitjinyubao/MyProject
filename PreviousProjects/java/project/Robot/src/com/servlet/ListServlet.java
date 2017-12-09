package com.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Message;
import com.service.ListMessageService;

@SuppressWarnings("serial")
public class ListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
		// TODO Auto-generated method stub
		Message message=new Message();
		//���ñ���
		req.setCharacterEncoding("UTF-8");
		//����ҳ�洫�ݲ���
		String  command= req.getParameter("command");
		message.setCommand(command);
		String  description=req.getParameter("description");
		message.setDescription(description);
		//��ҳ�洫�ݵĲ���
		req.setAttribute("command", command);
		req.setAttribute("description", description);
		//��ʼ��service��
		ListMessageService    messageService=new ListMessageService();
		
		//����service��ִ����ص�ҵ����
		List<Message> listMessage;
		try {
			listMessage = messageService.queryListMessage(message);
			req.setAttribute("listMessage",listMessage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.getRequestDispatcher("WEB-INF/jsp/back/list_news.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
