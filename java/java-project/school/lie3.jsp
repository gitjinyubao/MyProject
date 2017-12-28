
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
 .p3{
       font-size:2em;
      font-family:"隶书";}
	 
	 .j3{
      font-size:1.3em;
      font-family:"隶书";    
}

	 </style>
  </head>
  
  <body>
  <div class="d2">
  <p  class="p3"  align="center">
  主&nbsp;菜&nbsp;单</p>
  <menu vspace="25px">
  <br>
  <li>
  <u><a href="stu_xue.jsp" target="frmMAIN" class="j3">个人信息查询及密码修改</a></u>
  </li>
  <br>
  <br>
  <li><u><a href="stu_course.jsp" target="frmMAIN" class="j3")>课程信息查询</a></u></li>
  <br>
   <li><u ><a href="stu_chengji.jsp"  target="frmMAIN" class="j3">成绩查询</a></u></li>
   <br>
  <font size="+1" >
    <li><u><a href="kuang.jsp"  target="_blank" class="j3">返回主界面</a></u>
  </font></li>
  </menu>
  </div>
  </body>
</html>
