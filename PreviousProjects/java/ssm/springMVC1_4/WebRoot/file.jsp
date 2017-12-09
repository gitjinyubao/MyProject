<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
   <%request.setCharacterEncoding("utf-8"); %>
    <h2>文件传输</h2>
    <article>
    <h5>文件传输示例</h5>
    <fieldset>
    <legend>文件上传</legend>
    <form  action="upFile"     enctype="multipart/form-data"   method="post" >
    文件描述:<input   type="text"    name="filename"><br> 
    上传文件:<input  type="file"    name="file"    />
    <input  type="submit"  value="上传"       /><br>
    <span  style="color:red" ><font   size="4px">${state}&nbsp;&nbsp;&nbsp;&nbsp;${path}</font></span>
    </form>
    </fieldset>
    </article>
    <article>
    <fieldset>
    <legend>下载文件</legend>
    下载文件:<a   href="fileLoad?filename=1.jpg">风景照</a>
    </fieldset>
    </article>
  </body>
</html>
