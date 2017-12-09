package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.DeleteBatchService;

@SuppressWarnings("serial")
public class DeleteBatchServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//����ҳ�洫��
		String [] ids=req.getParameterValues("id");
	    //��ʼ��DeleteService��
		DeleteBatchService deleteService=new DeleteBatchService();
		//����ҵ��㷽�����д���
		deleteService.deleteBatch(ids);
		//������Ϣ�б�ҳ;�������б���Ϣ
		resp.sendRedirect("List.action");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
