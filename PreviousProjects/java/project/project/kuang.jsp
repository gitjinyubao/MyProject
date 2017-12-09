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
    <meta http-equiv="refresh" content="600"><!-- 自动刷新 -->
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style>
	*{margin:0;
	padding:0;}
	</style>
   <frameset  rows="0.01%,15%,*,3%">
   <frame src="qu.jsp">
   <frame src="zhuti.jsp" scrolling="no"  norisize  >
   <frameset cols="19%,*,20%" framespacing="1px">
   <frame src="lie.jsp" norisize="yes" >
   <frame src="dynamic1_0.jsp">
   <frame  src="tong.jsp">
   </frameset>
   <frame   src="kuangdi1.jsp"   >
   </frameset>
   <noframe>
  </head>
  
  <body>
    此网页用的是框架技术，您的浏览器显示不了
  </body>
</html>
