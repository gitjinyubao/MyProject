<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	<link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	<link href="bootstrap-3.3.7-dist/css/My.css"   rel="stylesheet">
     <script src="resources/js/SignIn.js"></script>
      <script src="resources/js/SignIn-1.js"></script>
  </head>
  
  <body>
  <script type="text/javascript"     src="jQuery/jquery-3.1.1.js"></script>
  
  <script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
  
     <div class="form-group">
     <form  action="user/SignIn"    method="post">
     <input   type="hidden"  name="pageCurrent"   value="1">
     <input   type="hidden"  name="handle"   value="flat">
            <div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">欢迎注册</h4>
            </div>  
      账号<input id="username" class="form-control"  type="email"     required="true"  
      autofocus="true" placeholder="QQ邮箱"  name="username"  onblur="onblur1();">
      <span id="span"></span>
    <br>
     密码<input id="password" class="form-control" type="text"     required="true"  
     autofocus="true" placeholder="6-8个字符长度的数字或字母"  pattern="^[a-zA-Z0-9]{6,8}$" name="password" onblur="check1();">
     <span id="span1"></span>
      <br>
     确认密码<input id="password1" class="form-control"  type="text"     required="true" 
      autofocus="true"   pattern="^[a-zA-Z0-9]{6,8}$"  name="password1" onblur="check2();">
      <span id="span2"></span>
      <br> 
     昵称<input id="nickname" class="form-control"  type="text"     required="true" 
     autofocus="true" placeholder="10个字符长度之内(字母或数字组成)" pattern="^[a-zA-Z0-9]{1,10}$"  name="nickname" onblur="check3();">
     <span id="span3"></span>
      <br>
      密保问题<input id="question" class="form-control" type="text"     required="true"  
      autofocus="true" placeholder="12个字符长度之内(字母或数字组成)" pattern="^[a-zA-Z0-9]{1,12}$" name="question" onblur="check4();">
      <span id="span4"></span>
      <br><!--value=${user.username}-->
      密保答案<input id="answer" class="form-control" type="text"     required="true" 
      autofocus="true" placeholder="12个字符长度之内(字母或数字组成)" pattern="^[a-zA-Z0-9]{1,12}$" name="answer"  onblur="check5();">
      <span id="span5"></span>
      <br>
      <div class="modal-footer">
     <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	 <button type="submit" class="btn btn-primary">提交</button>
	 </div>
	 </form>
      </div>
  </body>
</html>
