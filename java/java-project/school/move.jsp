<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta  http-equiv="Content-type" content="text/css;charset=UTF-8">  
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	 body{
	 background-image:url("Images/bei8.gif");
	 background-repeat:no-repeat;
	 background-size:cover;
	 background-position:top right;
	 }
	</style>
  </head>
  <marquee   behavior="scroll"   hspace="50px" loop="infinite" scrollamount="30px"><font  size="+10"  face="隶书" color="#dd0fff">致&nbsp;&nbsp;&nbsp;青&nbsp;&nbsp;&nbsp;春</font></marquee>
  <p align="center">
  <img   src="Images/xue9.jpg"  align="right"  height="97">
  <embed src="Imove/xue.mp4"  loop="true" autostart="true"  width="1600px"  height="541px"> 
  </p>
  <body >   
  </body>
</html>
