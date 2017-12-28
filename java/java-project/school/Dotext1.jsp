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
           String sql="select * from admin where username='"+number1+"'and password='"+password1+"'";
           ResultSet r=s.executeQuery(sql);
           
           if(r.next())
           {
        			   r.close();  
        			   request.getRequestDispatcher("admin.jsp").forward(request, response);
                	
           }
           else
           {
        	   r.close();
        	   out.print("此用户名不存在");
        	   response.sendRedirect("Deng1.jsp");
           }
%>
</body>
</html>