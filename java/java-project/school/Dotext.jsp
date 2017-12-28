<%@ page language="java" import="java.util.*,java.sql.*,java.net.*" contentType="text/html; charset=utf-8"%>
<%@  page import="java.sql.ResultSet" %>

<%@ page import="db.DB" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>My JSP 'luogin.jsp' starting page</title>   
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
<body>
 <% 
      request.setCharacterEncoding("utf-8"); 
    %>
<%       
           String number1=request.getParameter("number");
           String password1=request.getParameter("password");
           Connection c=DB.getconnection();
           Statement s =c.createStatement();
           String sql="select * from tea where number='"+number1+"'and password='"+password1+"'";
           String sql1="select * from guan where number='"+number1+"'and password='"+password1+"'";
           Statement s1 =c.createStatement();
           ResultSet r=s.executeQuery(sql);
           ResultSet r1=s1.executeQuery(sql1);
           //String b="student";
           
           if(r.next()||r1.next())
           {
        	   String a =request.getParameter("radio");
        		   if( a.equals("student"))
        		   {
        			   r1.absolute(0);
        			   if(r1.next())
        			   {
        			   out.print(a);
        			   r.close();  
        			   session.setAttribute("number", number1);
        			   session.setAttribute("password", password1);
                	   request.getRequestDispatcher("kuang3.jsp").forward(request, response);
        			   }
        			   else
        			   {
        				   out.print("您的账号和身份属性不对称");
        			   }
        		   }
        		   else if(a.equals("teacher"))
        		   {
        			   r.absolute(0);
        			   if(r.next())
        			   {
        				   out.print(a);
            			   r.close();
                    	   request.getRequestDispatcher("kuang2.jsp").forward(request, response); 
                    	   session.setAttribute("number", number1);
            			   session.setAttribute("password", password1);
        			   }
        			   else
        			   {
        				   out.print("您的账号和身份属性不对称");
        			   }
        		   }  
        		   else
        		   {
        			   out.print("不存在此用户名");
        		   }
           }
           else
           {
        	   r.close();
        	   out.print("此用户名不存在");
        	   response.sendRedirect("Deng.jsp");
           }    
           c.close();
%>
</body>
</html>