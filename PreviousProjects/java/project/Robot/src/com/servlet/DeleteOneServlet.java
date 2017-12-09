package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.DeleteOneService;

@SuppressWarnings("serial")
public class DeleteOneServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
		// TODO Auto-generated method stub
		//���ñ���
		req.setCharacterEncoding("UTF-8");
		//����ҳ�洫�ݲ���
		int id= Integer.parseInt(req.getParameter("id"));
		//��ʼ��service��
		DeleteOneService    deleteService=new DeleteOneService();
		//����service��ִ����ص�ҵ����
		deleteService.deleteOne(id);
		//���ﲢ����·��
		resp.sendRedirect("List.action");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
