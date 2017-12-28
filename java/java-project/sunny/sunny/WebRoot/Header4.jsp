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
			<li ><a href="user/Blogger">  <span class="glyphicon glyphicon-home"></span>&nbsp;博客首页
                 </a>  
            </li>
 
		    <li><a href="SignIn.jsp"  data-toggle="modal" data-target="#myModal">
                <span class="glyphicon glyphicon-pencil"></span>&nbsp;博客注册
                </a>
            </li>
       
            <li ><a href="Login.jsp" data-toggle="modal" data-target="#myModal1">
                 <span class="glyphicon glyphicon-share"  ></span>&nbsp;博客登录
                 </a>
            </li>
           
            <li ><a href="user/MyBlogger?pageCurrent=1&handle=flat" >
                 <span class="glyphicon glyphicon-share-alt"></span>&nbsp;返回个人首页
                 </a>
            </li>
	</ul>
	</div>
  </div>
</nav>




<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="myModalLabel">
					模态框（Modal）标题
				</h4>
			</div>
			<div class="modal-body">
				在这里添加一些文本
			</div>
		</div>
	</div>
</div>   

<div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="myModalLabel">
					模态框（Modal）标题
				</h4>
			</div>
			<div class="modal-body">
				在这里添加一些文本
			</div>
		</div>
	</div>
</div>  
</body>
</html>
