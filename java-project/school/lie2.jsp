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
	.j2{
      font-size:1.2em;
      font-family:"隶书";    
}
.j2:hover{
       background:rgba(43,201,184,0.19)  ;  
        color:black;
        box-shadow:1px 1px 3px  #000;
        transition:box-shadow 1s , background 1s;
}
.p1{
       font-size:2em;
      font-family:"隶书";
	 }
	 </style>
  </head>
  <body>
  <div class="d">
  <p class="p1">
 主&nbsp;菜&nbsp;单</p>
  <menu vspace="25px">
  <br>
  <li>
  <u><a href="Eg22.jsp" target="frmMAIN" class="j2">学生信息录入</a></u>
  </li>
  <br>
  <br>
  <li>
  <u><a href="delete.jsp" target="frmMAIN" class="j2">学生信息查询及删除</a></u>
  </li>
  <br>
  <br>
  <li><u><a href="course.jsp" target="frmMAIN") class="j2">课程信息录入</a></u></li>
  <br>
   <li><u ><a href="chengji.jsp"  target="frmMAIN" class="j2">学生成绩录入</a></u></li>
   <br>
  <li><u><a href="see_course.jsp" target="frmMAIN" class="j2")>学生成绩查询</a></u></li>
  <br>
   <br>
  <font size="+1" >
    <li><u><a href="kuang.jsp"  target="_blank" class="j2">返回主界面</a></u>
  </font></li>
  </menu>
  </div>
  </body>
</html>
