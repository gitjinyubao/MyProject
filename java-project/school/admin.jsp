<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'kuang.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	 <link  href="jin/style.css" rel="stylesheet"  type="text/css"  />
	<style>
	 h1{font-family:"隶书";font-size:2.8em;}
</style>
	</head>
  <body>
     <h1 align="center">管理员控制人员登录窗口<h1>
     <br>
     <br>
   
     <center>
     <p  ><u><a href="xuesheng1.jsp" target="_blank" class="a">学生登录控制</a></u>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u><a href="laoshi.jsp"  target="_blank" class="a">老师登录控制</a></u>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="guanli.jsp"  target="_blank" class="a"><u>添加管理员</u></a></p>
     </center>              
  </body>
</html>