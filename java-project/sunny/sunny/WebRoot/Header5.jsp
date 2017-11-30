<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	<link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	<!-- <link href="bootstrap-3.3.7-dist/css/My.css"   rel="stylesheet"> -->
	<script type="text/javascript"     src="jQuery/jquery-3.1.1.js"></script>
    <script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
  </head>
  
  <body>
   <nav class="navbar navbar-default" role="navigation">
   <div class="container-fluid"> 
	<h2>Sunny博客</h2>
	<div class="navbar-header">
		<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#example-navbar-collapse">
			<span class="sr-only">切换导航</span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
		</button>
		<%-- <c:if test="${imagePublic.url!=null}">
		<img src="${imagePublic.url}" class="img-circle"   height="70px"  width="70px">
		</c:if> --%>
	</div>
	<div class="collapse navbar-collapse" id="example-navbar-collapse">
		<ul class="nav navbar-nav">
            <li ><a href="user/MyBlogger?pageCurrent=1&handle=flat"><span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;用户首页
       </a>  
 </li>
            <li ><a href="user/Blogger">  <span class="glyphicon glyphicon-home"></span>&nbsp;&nbsp;博客首页
       </a>  
 </li>
            <li ><a href="user/Article"> <span class="glyphicon glyphicon-pencil"></span>&nbsp;书写文章
       </a>  
 </li>
            
			<li><a href="user/MyImage"  ><span class="glyphicon glyphicon-facetime-video"></span>&nbsp;相册
       </a> 
    </li>
    </ul>
</div>
</div>
</nav>
</body>
</html>
