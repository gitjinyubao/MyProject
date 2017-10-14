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
    
    <title>My JSP 'Image.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="bootstrap-3.3.7-dist/css/My.css"   rel="stylesheet">
	<script src="js/Article.js"></script>
    <script src="js/My.js"></script>
    <style type="text/css">
    img:hover{
    width:240px;
    height:180px;
    }
    .img-rounded{
    width:160px;
    height:100px;
    }
     .img-circle:hover{
    width:110px;
    height:110px;
    }
    </style>
    
  </head>
  
  <body style="background-color: RGB(238,232,171);">
    <div   class="container">
    	<jsp:include page="/Header3.jsp"></jsp:include>
    	
    	<form class="form-inline" role="form"  action="user/ImageInsert?type=Image"    method="post"  enctype="multipart/form-data">
			<div class="form-group">
				<label class="sr-only" for="name">名称</label>
				<input   type="text"  id="name"   name="name"   required="true"
			   	placeholder="请输入名称">
			</div>
	
			<div class="form-group">
				<label class="sr-only" for="inputfile">文件输入</label>
				<input  type="file" id="inputfile"  required="true"  name="file" style="width:100%;">
			</div>
			<!-- &nbsp;&nbsp;&nbsp;&nbsp; -->
			<button type="submit" > <span class="glyphicon glyphicon-hand-up"></span>上传</button>
		</form>

<div class="panel panel-success">
	<div class="panel-heading">
		<h3 class="panel-title">我的照片</h3>
	</div>
	<div class="panel-body"  >
		 <c:forEach   var="image"   items="${list}" varStatus="status">
       		<img  class="img-rounded" src="${image.url}" name="image"  style="border:inset;0px;color:rgba(255,255,255,0.2);padding:3px;">
       		<lable   class="Image_lable"> <span class="glyphicon glyphicon-trash"></span><a   href="user/ImageDelete?url=${image.url}">删除</a></lable>
       	</c:forEach>
	</div>
</div>


<jsp:include page="/Footer.jsp"></jsp:include>
</div>
  </body>
</html>
