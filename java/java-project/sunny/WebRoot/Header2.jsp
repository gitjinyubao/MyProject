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
    .j{
    	background-color: RGB(238,232,171);
    }
    #dao_hang{
    	/* background: url("image/1.jpg"); */
    	background-color: #F4F4F4;
    }
    </style>
  </head>
  
  <body>
  <script type="text/javascript"     src="jQuery/jquery-3.1.1.js"></script>
  
  <script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
  
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid" id="dao_hang"> 
    	<!-- <h4>Sunny</h4> -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#example-navbar-collapse">
				<span class="sr-only">切换导航</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
				<!-- <a class="navbar-brand" >Sunny</a> -->
		        <c:if test="${imagePublic.url!=null}">
		        	<img src="http://www.jinyubei.xyz:8080/${imagePublic.url}" class="img-circle"   height="70px"  width="70px">
		        </c:if>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</div>
	
	<div class="collapse navbar-collapse" id="example-navbar-collapse">
	  <ul class="nav navbar-nav">
            <li >
            	<a href="user/MyBlogger?pageCurrent=1&handle=flat"><span class="glyphicon glyphicon-user"></span>&nbsp;用户首页
                </a>  
 			</li>
 			
            <li >
            	<a href="user/Blogger">  <span class="glyphicon glyphicon-home"></span>&nbsp;博客首页
       			</a>  
 			</li>
 
            <li >
            	<a href="user/Article"> <span class="glyphicon glyphicon-pencil"></span>&nbsp;书写文章
       			</a>  
 			</li>
            
			<li>	
				<a href="user/MyImage"><span class="glyphicon glyphicon-facetime-video"></span>&nbsp;相册
       			</a> 
    		</li>
    		
    		<li>
    			<c:if test="${imagePublic.url==null}">
        			<a href="user/CharacterJsp"  data-toggle="modal" data-target="#myModal"  class="popover-toggle"
            		data-container="body"
            		data-toggle="popover" data-placement="right"
            		data-content="完善个人信息，获得博客个性头像哟"><span class="glyphicon glyphicon-wrench"></span>&nbsp;个性化设置
       				</a>
       			</c:if>
       			
       			<c:if test="${imagePublic.url!=null}">
        			<a href="user/CharacterJsp"  data-toggle="modal" data-target="#myModal">
          				<span class="glyphicon glyphicon-wrench"></span>&nbsp;个性化设置
      				 </a>
       			</c:if>
    		</li>
    </ul>
    
    <script>
		$(function () { $('.popover-show').popover('show');});
		$(function () { $('.popover-hide').popover('hide');});
		$(function () { $('.popover-destroy').popover('destroy');});
		$(function () { $('.popover-toggle').popover('toggle');});
		$(function () { $(".popover-options a").popover({html : true });});
	</script>
    
	</div>
	</div>
</nav>

<!-- 照片墙 -->
<div class="jumbotron"  class="jumbotron" class="thumbnail"  style="background-image:url('http://www.jinyubei.xyz:8080/SunnyImage/19.jpg'); background-position:center;background-repeat: no-repeat ;  background-size:cover ;">
	<div class="container">
		<h1>Welcome to our hotel </h1>
		<p  style="font-size:42px;color:white;">Every day is not the same </p>
		<p><!-- <a class="btn btn-primary btn-lg" role="button">
			know  more</a> -->
		</p>
	</div>
</div>

<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="myModalLabel">
					个性化设置
				</h4>
			</div>
			<div class="modal-body">
				个性自我.......
			</div>
		</div>
	</div>
</div>   
</body>
</html>
