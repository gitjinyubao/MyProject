package com.sunny.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ����ת�����Լ�ʹ��request���������ݴ���ת����Դ
// ����ת���ص㣺
//          1. �ͻ���ֻ�Ƿ���һ�����󣬷��������ж����Դ����
//          2. �ͻ��������ַû�仯
public class Forword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data = "aaaa";
		request.setAttribute("data", data);
		
		/*
		          ����ڵ���forword����֮ǰ����servlet������д��Ĳ��������Ѿ��������Ĵ��͵��ͻ��ˣ�
	   		forword���������׳�lllegalStateException
		 */
		
		PrintWriter writer = response.getWriter(); // java.lang.IllegalStateException: Cannot forward after response has been committed
	    writer.write("bbb");
	    writer.close(); 
	    // �Ὣ��������ˢ�µ��������д���������.close()������һ���̶��Ͽ������.flush()������
	    // ���û��д.close()�����������������Ӧʱ�Զ��رգ�����.close()��,������ˢ�µ������;
	    // �������ȥ��  writer.close();�򲻻ᱨ�쳣�����һὫд��������������
	    /*
	                   ����ڵ���forword����֮ǰ��servlet����Ļ�����(response)д��������,
		         ֻҪд�뵽�����������ݻ�ô�������ı����䵽�ͻ��ˣ�forword�����Ϳ��Ա�����ִ�У�
		         ԭ��д�뵽 ���뻺�����е����ݽ�����գ�������д�뵽HttpResponse�����е���Ӧͷ�ֶ���Ϣ������Ч
	     */
		
		/*
		   if(true){
		       request.getRequestDispatcher("/message.jsp").forward(request, response);  
		       // java.lang.IllegalStateException: Cannot forward after response has been committed
		       // ����ת��ʱ��forword�������Ѿ����������ʼд�������ݣ���������תд��ͻ������
		       // �����ʽ���������
		       // return; // ��ִ�к������ת
		   }
		*/
		
		// requestҲ����ʵ��ת��
		request.getRequestDispatcher("/message.jsp").forward(request, response);
	}
	
	/* 
	        ע�⣺
	       ����ڵ���forword����֮ǰ��servlet����Ļ�����(response)д��������,
	       ֻҪд�뵽�����������ݻ�ô�������ı����䵽�ͻ��ˣ�forword�����Ϳ��Ա�����ִ�У�
	       ԭ��д�뵽 ���뻺�����е����ݽ�����գ�������д�뵽HttpResponse�����е���Ӧͷ�ֶ���Ϣ������Ч
	*/

}
