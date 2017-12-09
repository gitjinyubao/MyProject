<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
        <form action="jin/login.spring"   method="post">
        <center>
        <table>
        <tr><th colspan="2">登录界面</th></tr>
        <tr><td>username</td><td><input   type="text"   name="username"></td></tr>
        <tr><td>password</td><td><input type="text"   name="password"></td></tr>
        <tr><td   colspan="2"><input  type="submit" value="登录"></td></tr>
        </table>
        </center>
        </form>
  </body>
</html>
