<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"  %>
<%@ taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib    uri="http://ckeditor.com"  prefix="ck" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Article.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="bootstrap-3.3.7-dist/css/My.css"   rel="stylesheet">
	<script src="js/Blogger.js"></script>
	<script type="text/javascript" src="resources/js/Article.js"></script>

	<style type="text/css">
	.actor
	{
	     font-family:微软  雅黑;
	     font-size:2em;
	}
	</style>
  </head>
  
  <body style="background-color: #4D4D4D;">
  <div   class="container" style="background-color: RGB(238,232,171);" ">
  <jsp:include page="/Header4.jsp"></jsp:include>
  
  <div  class="row">
  <div  class="col-md-9">
  <div class="panel panel-success" onclick="click2(this);">
  <h2>${article.title}</h2>
  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${date}</p>              
  <div class="panel-body"  style="WORD-WRAP: break-word;word-break:break-all; line-height:250%;"><font   size="3">${article.content}</font></div>
  </div><br>
   <div class="panel-body" id="comment">
   <font size="+2">文章评论区</font><c:if test="${null==user}"><font size="2px" color="red">(登录之后显示评论编辑框)</font></c:if>
   <c:forEach   var="comment"    items="${listComment}">
   <div class="panel panel-default" >
	<div class="panel-heading" >
		<h3 class="panel-title">
			<span class="glyphicon glyphicon-hand-right"></span>&nbsp;&nbsp;${comment.user_nickname}评价
		</h3>
	</div>
	<div class="panel-body">
		   ${comment.content}
	</div>
</div>
   </c:forEach>
    </div><br>
    
     <div class="panel-body" id="comment1">
     </div>
     
    <div class="panel-body" >
    <c:if test="${null!=user}">
    <!-- 改动为ajax -->
    <input    type="hidden"   name="article_id"  value="${article.id}" id="article_id">
    <textarea    id="test"  name="content"  required="true"   style="padding:0px;"></textarea>
    <ck:replace replace="test" basePath="ckeditor"></ck:replace>
    <button class="btn btn-lg btn-primary btn-block" type="submit" onclick="saveComment();">提交</button>
    </c:if>
    </div>
  </div>
  
  
  <div   class="col-md-3" >
  <div class="panel panel-default" >
    <div class="panel-body" style="background-color: RGB(238,232,171);">
          <c:if test="${imagePublic.url!=null}">
          <img id="img" src="http://www.jinyubei.xyz:8080/${imagePublic.url}" class="img-circle"   height="120px"  width="120px">
          </c:if>
          
          <%-- <p  class="actor">作者：&nbsp;&nbsp;<span class="glyphicon glyphicon-hand-right"></span>&nbsp;&nbsp;<a  href="user/User?user_username=${imagePublic.user_username}">${user.nickname}</a></p> --%> 
         <%--  <p  class="actor">作者：&nbsp;&nbsp;<span class="glyphicon glyphicon-hand-right"></span>&nbsp;&nbsp;<a>${user1.nickname}</a></p>  --%> 
          <p  class="actor"><font face="隶书" size="5px">作者</font>(<font face="隶书" size="4px" color="green">${user1.nickname}</font>)</p> 
    </div>
    
    <div  id='calendar' class="panel-body calendar" style="background-color:RGB(238,232,171);"></div>
    <script src="js/Article.js"></script>
            
    </div >
    <ul class="list-group">
		<li class="list-group-item"><a ><span class="glyphicon glyphicon-hand-right"></span>&nbsp;&nbsp;生活</a>
		&nbsp;&nbsp;&nbsp;&nbsp;(${lifeNumber})篇<ul class="list-group">
		<hr>
		<c:forEach  var="LifeArticle"  items="${listLifeArticle}">
		 <li>标题:&nbsp;&nbsp;&nbsp;&nbsp;<a  href="user/PublicArticle?id=${LifeArticle.id}"><span class="glyphicon glyphicon-eye-open"></span>
			&nbsp;&nbsp;&nbsp;&nbsp;${LifeArticle.title}</a></li>
			<li>日期:&nbsp;&nbsp;&nbsp;&nbsp;${LifeArticle.date}</li>
			<li>评论量:&nbsp;&nbsp;&nbsp;&nbsp;${fn:length(LifeArticle.list_comment)}</li>
			<hr>
		</c:forEach>
		</ul></li>
		<li class="list-group-item"><a  ><span class="glyphicon glyphicon-hand-right"></span>&nbsp;&nbsp;技术</a>
		&nbsp;&nbsp;&nbsp;&nbsp;(${technologyNumber})篇<ul class="list-group">
		<hr>
		<c:forEach  var="TechnologyArticle"  items="${listTechnologyArticle}">
		 <li>标题:&nbsp;&nbsp;&nbsp;&nbsp;<a  href="user/PublicArticle?id=${TechnologyArticle.id}"><span class="glyphicon glyphicon-eye-open"></span>
			&nbsp;&nbsp;&nbsp;&nbsp;${TechnologyArticle.title}</a></li>
			<li>日期:&nbsp;&nbsp;&nbsp;&nbsp;${TechnologyArticle.date}</li>
			<li>评论量:&nbsp;&nbsp;&nbsp;&nbsp;${fn:length(TechnologyArticle.list_comment)}</li>
			<hr>
		</c:forEach>
		</ul></li>
		<!-- <a   href="user/ArticleSee?kind_name=knowledge&kind=理论知识"><span class="glyphicon glyphicon-hand-right"></span>&nbsp;&nbsp;理论知识</a> -->
		<li class="list-group-item"><a   ><span class="glyphicon glyphicon-hand-right"></span>&nbsp;&nbsp;开心小故事</a>
		&nbsp;&nbsp;&nbsp;&nbsp;(${knowledgeNumber})篇<ul class="list-group">
		<hr>
		<c:forEach  var="KnowledgeArticle"  items="${listKnowledgeArticle}">
		 <li>标题:&nbsp;&nbsp;&nbsp;&nbsp;<a  href="user/PublicArticle?id=${KnowledgeArticle.id}"><span class="glyphicon glyphicon-eye-open"></span>
			&nbsp;&nbsp;&nbsp;&nbsp;${KnowledgeArticle.title}</a></li>
			<li>日期:&nbsp;&nbsp;&nbsp;&nbsp;${KnowledgeArticle.date}</li>
			<li>评论量:&nbsp;&nbsp;&nbsp;&nbsp;${fn:length(KnowledgeArticle.list_comment)}</li>
			<hr>
		</c:forEach>
		</ul></li>
	</ul>
</div>
</div>
 </div>
  <jsp:include page="/Footer.jsp"></jsp:include> 
  </body>
</html>
