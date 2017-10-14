<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'dynamic.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta  http-equiv="Content-type" content="text/css;charset=UTF-8">     
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style>
	
	</style>
	
  </head>
  
  <body>
  <div class="j">
  <marquee   style="font-size: 1.5em;font-weight: 700;font-family:cursive;">动&nbsp;&nbsp;&nbsp;&nbsp;态&nbsp;&nbsp;&nbsp;展&nbsp;&nbsp;&nbsp;示</marquee>
  </div>
  </body>
</html>
