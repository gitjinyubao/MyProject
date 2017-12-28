<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'lie.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta  http-equiv="Content-type" content="text/css;charset=UTF-8">  
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	 <link  href="jin/style.css" rel="stylesheet"  type="text/css"  />
<style type="text/css">
 .j{
      font-size:1.3em;
      font-family:"隶书";    
}	 
	 </style>
  </head>
  
  <body>
  <br>
  <br>
  <br>
  <div class="lie">
  <p bgcolor="#fff000" align="center">
  <font face="隶书" size="+3" >主&nbsp;菜&nbsp;单</font></p>
  <menu vspace="25px">
  <li >
  <a href="http://baike.baidu.com/link?url=CEP7tAOH8QmOROLk8XhjnBWd5FxSqQqWgs-Htdk_1zuYwhVKXNy3bWaODCW4mvRWd3cot1zZ4ab8gaIHOeAV3DQNnyNjxXIMyt3rFCjhGpag_jMtvPCMAdTPeaQXJAFYlnq-_A2duYpF4l1INCCrLqv" target="_blank" class="j">学校情况简介</a>
  </li>
  <br>
  <li >
  <u><a href="move.jsp" target="_blank" class="j">学校形象视频</a></u>
  </li>
  <br>
  <li ><a href="Deng.jsp" target="_blank") class="j">师生系统登录</a></li>
  <br>
   <li ><a href="Deng1.jsp"  target="_blank" class="j">系统维护登录</a></li>
    <br>
   <li ><a href="http://jyb.whpu.edu.cn/"  target="_blank" class="j">招聘信息</a></li> 
    <br>
     <br>
     <br>
    <li ><a  href="lie.jsp" class="j"> <font size="+2" >刷新</font></a>
  </li>
  </menu>
  </div>
  </body>
</html>
