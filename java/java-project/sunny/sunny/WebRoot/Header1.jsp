<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <%response.setCharacterEncoding("UTF-8");%>
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
	<link href="bootstrap-3.3.7-dist/css/My.css"   rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="resources/css/search.css">
    <script src="resources/js/search.js"></script>
    
    <style type="text/css">
    #nav{
     background-color:  #24282C  ;
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
			<li ><a href="user/Blogger" >  <span class="glyphicon glyphicon-home"></span>&nbsp;博客首页
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

<!-- 照片墙 -->
<div class="jumbotron" class="thumbnail"  style="background-image:url('http://www.jinyubei.xyz:8080/SunnyImage/0.jpg'); background-position:center;background-repeat: no-repeat ;  background-size:cover ;">
	<div class="container">
		<h1 >Welcome to our hotel </h1>
		
		<form action="user/PublicArticleByTitle" class="bs-example bs-example-form" role="form">
	         <div>
				<div class="input-group">
				<div>
					<input type="text" size="148" id="KeyWord" class="form-control" name="title" style="width:60%"   onkeyup="changeKeyWord();" onblur="keyWordBlur();" onfocus="changeKeyWord();">
					<span class="input-group-btn">
						<button class="btn btn-default" type="submit">
							Go!
						</button>
					</span>
					</div>
					<div id="popDiv">
   	                <table id="content_table" bgcolor="#FFFAFA" border="0" cellspacing="0" cellpadding="0">
   		            <tbody id="content_table_body">
   		            </tbody>
   	                </table>
                    </div>
                    </div><!-- /input-group -->
			</div>
	</form>
		
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
					博客注册
				</h4>
			</div>
			<div class="modal-body">
				欢迎注册......
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
					博客登录
				</h4>
			</div>
			<div class="modal-body">
				欢迎登录......
			</div>
		</div>
	</div>
</div>  
</body>
</html>
