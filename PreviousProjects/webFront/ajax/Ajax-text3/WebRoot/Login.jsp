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
	
	<style type="text/css">
		/* .login{
			position: absolute;
			margin-top: 50%;
			margin-left: 50%;
		} */
	</style>
  </head>
  
  <body>
  <div class="login">
   <form action="Login.action" method="post">
   		<input type="text" name="username"><br>
   		<input type="text" name="password"><br>
   		<input type="submit" value="确认">
   </form>
   </div>
  </body>
</html>
