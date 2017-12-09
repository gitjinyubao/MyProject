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
		//接收页面传参
		String [] ids=req.getParameterValues("id");
	    //初始化DeleteService层
		DeleteBatchService deleteService=new DeleteBatchService();
		//调用业务层方法进行处理
		deleteService.deleteBatch(ids);
		//返回信息列表页;并返回列表信息
		resp.sendRedirect("List.action");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
