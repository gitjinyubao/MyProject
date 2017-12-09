package com.sunny.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * �����ض����ܲ��þ;������ã���Ϊ�ᵼ�·�����������������
 * ��½ʹ�������ض����ԭ���õ�ַ�������仯�������û���ַ�Ѿ���ת����½�ɹ���������ҳ
 * �̳�ʹ���ض�����������֮�����servle��ʵ�����ݿ������֮����ת�������嵥ҳ�棺
 *                   ���ʹ��ת����������ַ����ˢ��һ�Σ����ε��ֶ�����һ�Σ���ִ����һ��servlet������
 *                   ʹ���ض���Ļ����������µĵ�ַ��������ˢ���ٴζ�����ִ��servlet����Ĳ�����
 * �ض�����ص�:
 *          �������������������������󣻻��������response������request
 *          ��ַ���ᷢ���ı�
 *           
 * servlet��servetOutputStream��printWriter������д������ݣ�
 * ����servlet�����response�����ȡ��servlet���潫��Щ���ݵ�����Ӧ��Ϣ�����ģ�
 * Ȼ��������Ӧ״̬�к͸���Ӧͷ���������ͻ���
 * 
 * Serlvet��service����������Servlet���潫���getWriter��getOutputStream
 * �������ص�����������Ƿ��Ѿ����ù�close������
 * ���û�У�Servlet���潫����close�����رո����������
 */
public class Redirection extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* ע�����response.getWrite()��response.getOutputStream()���߲���ͬʱʹ��)
		   ����java.lang.IllegalStateException: getWriter() has already been called for this response
		   EG: (����servlet֮��ʹ��ת����ֻ��һ��response)servelt1����servlet2��servlet1����ʹ��response.getWriter();servlet2����ʹ��response.getOutputStream();�����ᱨ��
		                 ���ʹ���ض������������������response����������ֱ���
		   */
		
		/*response.getWriter();
		response.getOutputStream();*/
		
		// ״̬��302:�������Դ�Ҳ������������Ǹ���Դ�ĵ�ַ��������ȥ����
		/*response.setStatus(302);
		response.setHeader("location", "/requestRedirections/index.jsp");*/
		
		// ���˽�HTTPЭ���ʹ�����ַ���
		response.sendRedirect("/requestRedirections/index.jsp");
	}
}
