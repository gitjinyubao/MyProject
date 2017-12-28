<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>My JSP 'tong.jsp' starting page</title>
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
  </style>
  </head>
  <body>
  <br>
  <br>
  <div class="gong">
    <p  align="center"> <font face="隶书" size="+3"  >
 公&nbsp;&nbsp;告</font></p>
	<p  class="j1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;中央巡视组已于11月20日莅临学校视察</p>
	<br>
	<p  class="j1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;11月22日下午停水供应，请做好准备</p>
	<br>
	<p  class="j1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;11月24日下午停电，请做好准备</p>
	<br>
	<p class="j1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;11月28日学校举办中国粮油大会，各单位做好举办工作</p>
	<br>
	</div>
  </body>
</html>
