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
	 <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	<link href="bootstrap-3.3.7-dist/css/My.css"   rel="stylesheet">
  </head>
  
  <body>
  
  <script type="text/javascript"     src="jQuery/jquery-3.1.1.js"></script>
  
  <script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
 
 <form class="form-signin"  action="user/login"    method="post" tautocomplete="off">
 <input   type="hidden"  name="pageCurrent"   value="1">
 <input   type="hidden"  name="handle"   value="flat">
       <div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
     <h4 class="modal-title" id="myModalLabel">欢迎登录</h4>
     </div>
        <label for="inputEmail" class="sr-only">账号</label>
        <input type="text" id="inputEmail" class="form-control" placeholder="username" required autofocus  name="username">
        <label for="inputPassword" class="sr-only">密码</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required     name="password">
        <div class="checkbox">
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
      </form>
 
 
  </body>
</html>
