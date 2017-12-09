<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.db.*"%>
<%@page import="java.sql.ResultSet"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login_ok.jsp' starting page</title>
    
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
        DBHelper db=new DBHelper();
    	Connection con=db.getConn();
    	System.out.println("-----------"+con);
    /*String sql="select StuName,StuPassword from Student";   
    	ResultSet rs=db.executeQuery(con,sql);
    	String check_password=null;
    	String check_username=null;
    	String password=request.getParameter("password");
    	String username=request.getParameter("username");
    	Boolean ok=false;
    	while(rs.next()){
    		check_password=rs.getString("StuName");
    		check_username=rs.getString("StuPassword");
    		if(check_password.equals(password)&&check_username.equals("username")){
    			ok=true;
    			return;
    		}
    	}
    	if(ok){
    	out.print("登录成功");}
    	else{
    	response.sendRedirect("login.jsp");
    	} */
    %>
  </body>
</html>
