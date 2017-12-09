package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import com.entity.User;

public class AjaxServlet extends HttpServlet {

	 private static final long serialVersionUID = 1L;  
     
	    public void doGet(HttpServletRequest request, HttpServletResponse response)  
	            throws ServletException, IOException {  
	  
	        response.setContentType("text/html");  
	  
	        String num1 = request.getParameter("num1");  
	        String num2 = request.getParameter("num2");  
	        
	        User user=new User("jin","1");
	        User user1=new User("yu","2");
	        List<User> list=new ArrayList<User>();
	        list.add(user);
	        list.add(user1);
	        
	        List<String> listString=new ArrayList<String>();
	          
	        /*int num3 = Integer.valueOf(num1) + Integer.valueOf(num2);  */
	        String num3=num1+num2;
	          
	        PrintWriter out = response.getWriter();  
	          
	        System.out.println("AjaxServlet.doGet()");
	        
	        //先将对象中的字符提取出来，单独保存在一个字符串类型的list集合中
	        for (User user2 : list) {
				listString.add(user2.getName());
				listString.add(user2.getPassword());
			}
	          
	        out.println(JSONArray.fromObject(listString).toString());  
	  
	    }  
	  
	    public void doPost(HttpServletRequest request, HttpServletResponse response)  
	            throws ServletException, IOException {  
	          
	        System.out.println("AjaxServlet.doPost()");  
	          
	        this.doGet(request, response);  
	    }  
	}  
