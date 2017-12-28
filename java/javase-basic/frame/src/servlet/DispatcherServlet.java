package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comman.spring.iocdi.BeanFactory;
import comman.spring.iocdi.ClassPathApplicationContext;
import controller.Controller;

public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获得前台传过来的URL
		String url = request.getServletPath();
		int indexPakage = url.lastIndexOf('/');
		String pakageName = url.substring(1, indexPakage);
		int indexController = url.indexOf('.');
		String controllerName = pakageName + url.substring(indexPakage + 1, indexController) + "Action";
		try {
			BeanFactory beanFactory = new ClassPathApplicationContext();
			Controller ctr = (Controller) beanFactory.getBean(controllerName);
			String view = ctr.execute(request, response);
			request.getRequestDispatcher(view).forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
