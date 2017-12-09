<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"  %>

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
	
    <link href="bootstrap-3.3.7-dist/css/My.css"   rel="stylesheet">
	<script src="js/Article.js"></script>
    <script src="js/My.js"></script>
    <style type="text/css">
     .img-circle:hover{
    width:110px;
    height:110px;
    }
    #myTab2{
    	background-color: #FDF5E6;
    }
    #boke{
    	background-color: #FDF5E6;
    }
   /*  h{
    	background-color:#EED8AE;
    } */
    </style>
  </head>
  
   <body style="background-color: RGB(238,232,171);">
   <div   class="container">
   <jsp:include page="/Header2.jsp"></jsp:include>
  
   <ul id="myTab2" class="nav nav-tabs" role="tablist" data-toggle="pill">
  	<li>
  		<a href="#h" class="active" role="tab" data-toggle="pill">博文</a>
  	</li>
  	
    <li>
    	<a href="#m" role="tab" data-toggle="pill">分类</a>
    </li>
</ul>

<!-- 选项卡面板 -->
<div id="myTabContent2" class="tab-content">
	
 <div class="tab-pane " id="m"  >
 	<div class="panel panel-success"  >
 		<div class="panel-heading"><span class="glyphicon glyphicon-folder-open"></span>&nbsp;&nbsp;&nbsp;&nbsp;博文分类详情</div>
 			<table class="table">
				<tbody>
					<tr class="active">
						<!-- <td><a  href="user/ArticleManage?kind_name=life&kind=生活"><span class="glyphicon glyphicon-hand-right"></span>&nbsp;&nbsp;生活</a></td> -->
						<td><a  href="user/ArticleManage1?kind_name=life&pageCurrent=1"><span class="glyphicon glyphicon-hand-right"></span>&nbsp;&nbsp;生活</a></td>
						<td>(${lifeNumber})篇</td>
					</tr>
					<tr class="success">
						<td><a  href="user/ArticleManage1?kind_name=technology&pageCurrent=1"><span class="glyphicon glyphicon-hand-right"></span>&nbsp;&nbsp;技术</a></td>
						<td>(${technologyNumber})篇</td>
					</tr>
					<tr  class="warning">
						<td><a   href="user/ArticleManage1?kind_name=knowledge&pageCurrent=1"><span class="glyphicon glyphicon-hand-right"></span>&nbsp;&nbsp;开心小故事</a></td>
						<td>(${knowledgeNumber})篇</td>
					</tr>
			</tbody>
		</table>
	</div>
 </div>
 
    <div class="panel panel-success  tab-pane active"  id="h" >
    	<div class="panel-heading"><span class="glyphicon glyphicon-fire"></span>最近博文</div>
    		<c:forEach  var="article" items="${listArticle}">
    			<div  style="margin:2px;">
    				<h4><a  href="user/PublicArticle?id=${article.id}"> &nbsp;&nbsp;<span class="glyphicon glyphicon-hand-right"></span>&nbsp;&nbsp;${article.title}</a></h4>
					<div class="panel-body"  style="WORD-WRAP: break-word;word-break:break-all" ><font   size="3"  >${fn:substring(article.content,0,150)},...</font></div><hr/>
				</div>
    		</c:forEach> 
    	</div>
</div>
   
   
  <div>
  	<div class="panel panel-success"  id="boke">
		<div class="panel-heading">
			<h3 class="panel-title"><span class="glyphicon glyphicon-camera"></span> 我的照片</h3>
	    </div>
	    <div class="panel-body"  >
			<c:forEach   var="image"   items="${listImage}">
            	<img  class="img-thumbnail" src="${image.url}"  style="margin:14px;width:160px;height:100px;" class="img">
            </c:forEach>
	   </div>
  </div>
  
       <ul class="pager">
  	   	<li><a href="user/MyBlogger?pageCurrent=${page.pageCurrent}&handle=up">&laquo;上一页</a></li>
  	    <li><a href="user/MyBlogger?pageCurrent=${page.pageCurrent}&handle=down">下一页&raquo;</a></li>
       </ul> 
  </div>
   
   <jsp:include page="/Footer.jsp"></jsp:include>
</div>

  </body>
</html>
