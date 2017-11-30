<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
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
	<link href="bootstrap-3.3.7-dist/css/My.css"   rel="stylesheet">
  </head>
  
  <body>
     <div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
     <h4 class="modal-title" id="myModalLabel"><font   face="隶书"   size="+2"><strong>个性设置</strong></font></h4><br>
     </div>
        <form class="form-signin"  action="user/ImageInsert?type=Character&&name=${user.username}"    method="post"  enctype="multipart/form-data">
        <h5><font   face="隶书"   size="+1"><strong>个性头像:</strong></font></h5><hr>
        <input type="file" id="inputfile"  required="true"  name="file" style="width:100%;">
        <button class="btn btn-lg btn-primary btn-block" type="submit">上传</button>
        </form>
        
        <form action="user/Character"  method="post">
        <input   type="hidden"  name="start1"   value="0">
        <h5><font   face="隶书"   size="+1"><strong>个性标题与签名:</strong></font></h5>
        <input type="text" id="inputEmail" class="form-control" placeholder="blogtitle(博客标题)" required autofocus  name="blogtitle"  value=${character.blogtitle}>
        <br>
        <input type="text" id="inputEmail"  class="form-control" placeholder="signature(个性签名)" required     name="signature"  value=${character.signature} >
        <br>
        <button class="btn btn-lg btn-primary btn-block" type="submit">提交</button>
        </form>
  </body>
</html>
