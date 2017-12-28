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
	
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	
	<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
	<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	<link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	<!-- <link href="bootstrap-3.3.7-dist/css/My.css"   rel="stylesheet"> -->
    
     <style type="text/css">
    #nav{
     background-color:  #EDEDED ; 
    }
    </style>
    </head>
  
    <body>
    <script type="text/javascript"     src="jQuery/jquery-3.1.1.js"></script>
  
    <script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

    <nav class="navbar navbar-default" role="navigation" id="nav">
    <div class="container-fluid"> 
	<div class="navbar-header">
		<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#example-navbar-collapse">
			<span class="sr-only">切换导航</span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
		</button>
		<a class="navbar-brand" >Sunny</a>
	</div>
	
	<div class="collapse navbar-collapse" id="example-navbar-collapse">
	  <ul class="nav navbar-nav">
		 <li>
            	<%-- <c:if test="${imagePublic.url!=null}">
		        	<img  src="${imagePublic.url}" class="img-circle"   height="70px"  width="70px">
		       </c:if> --%>
         </li>
         
         <li ><a href="user/MyBlogger?pageCurrent=1&handle=flat">
              	<span class="glyphicon glyphicon-user"></span>&nbsp;用户首页
              </a>  
         </li>
         
         <li ><a href="user/Blogger">  
              	<span class="glyphicon glyphicon-home"></span>&nbsp;博客首页
              </a>  
         </li>
 
         <li ><a href="user/Article"> 
              	<span class="glyphicon glyphicon-pencil"></span>&nbsp;书写文章
              </a>  
         </li>
            
	     <li><a href="user/MyImage">
			 	<span class="glyphicon glyphicon-facetime-video"></span>&nbsp;相册
             </a> 
         </li>
    </ul>
</div>
</div>
</nav>
</body>
</html>
