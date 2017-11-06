package servlet;

import java.io.IOException;
import java.lang.reflect.Constructor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Controller;

public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获得前台传过来的URL
		String url = request.getServletPath();
		System.out.println(url);
		int indexPakage = url.lastIndexOf('/');
		String pakageName = url.substring(1, indexPakage);
		int indexController = url.indexOf('.');
		System.out.println();
		String controllerName = url.substring(indexPakage + 1, indexPakage + 2).toUpperCase() + url.substring(indexPakage + 2, indexController);
		System.out.println(controllerName);
		
		// 根据url寻找相应的controller
		String className = "controller." + pakageName + "." + controllerName + "Action";
		try {
			Class<?> cs = Class.forName(className);
			Constructor<?> c = cs.getConstructor();
			Controller ctr = (Controller) c.newInstance(null);
			String view = ctr.execute(request, response);
			request.getRequestDispatcher(view).forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
