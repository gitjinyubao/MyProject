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
	<style >
	 *{
	 background-image:url("Images/dong28.jpg");
	 background-repeat:no-repeat;
	 background-size:cover; 
	 }
	 	</style>
	 	<frameset  rows="8%,53%,*">
   <frame src="dynamic1_1.jsp">
   <frame src="dynamic1_2.jsp"  >
   <frame  src="dynamic1_3.jsp"   >
   </frameset>
   <noframe>
   
   <% 
   //谨记：设置浮动时一定要注意设置这个盒子的宽度！！！！！！切记
   %>
  </head>
  
  <body>
  此网页用的是框架技术，您的浏览器显示不了
  </body>
</html>
