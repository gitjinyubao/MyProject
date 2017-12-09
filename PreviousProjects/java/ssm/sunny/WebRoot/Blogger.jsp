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
	<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	<!-- <link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">  -->
	<link href="bootstrap-3.3.7-dist/css/My.css"   rel="stylesheet">
    <!-- <script type="text/javascript"     src="jQuery/jquery-3.1.1.js"></script>
    <script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script> -->
   <!--  <script src="js/Blogger.js"></script> -->
    
    
  </head>
  <body style="background-color:#CAE1FF ;" onclick="click1(this);">
  <div  class="container" >
  <jsp:include page="Header1.jsp"></jsp:include>
     
    <c:if test="${listArticleTechnology!=null}">
	<div class="panel panel-success"">
	 	
	    <div class="panel-heading"><span class="glyphicon glyphicon-fire"></span>最新技术篇</div>
	    <c:forEach  var="article" items="${listArticleTechnology}">
		<div class="panel-body"  style="WORD-WRAP: break-word;word-break:break-all" ><font   size="3"  ><h4><a  href="user/PublicArticle?id=${article.id}"> &nbsp;&nbsp;<span class="glyphicon glyphicon-hand-right"></span>&nbsp;&nbsp;${article.title}</a></h4><br>
		${fn:substring(article.content,0,170)},...</font></div><hr/>
	    </c:forEach> 
    </div>
    </c:if>
    <br>
   
   
    <div>
    <c:if test="${listArticleKnowledge!=null}">
    <div class="panel panel-success"">
    <div class="panel-heading"><span class="glyphicon glyphicon-fire"></span>开心分分钟</div>
    <c:forEach  var="article" items="${listArticleKnowledge}">
	<div class="panel-body"  style="WORD-WRAP: break-word;word-break:break-all" ><font   size="3"  ><h4><a  href="user/PublicArticle?id=${article.id}"> &nbsp;&nbsp;<span class="glyphicon glyphicon-hand-right"></span>&nbsp;&nbsp;${article.title}</a></h4><br>
	${fn:substring(article.content,0,170)},...</font></div><hr/>
    </c:forEach> 
    </div>
    </c:if>
    </div>
    <br>
    
    <div>
    <c:if test="${listArticleLife!=null}">
    <div class="panel panel-success"">
    <div class="panel-heading"><span class="glyphicon glyphicon-fire"></span>最近生活区</div>
    <c:forEach  var="article" items="${listArticleLife}">
	<div class="panel-body"  style="WORD-WRAP: break-word;word-break:break-all" ><font   size="3"  ><h4><a  href="user/PublicArticle?id=${article.id}"> &nbsp;&nbsp;<span class="glyphicon glyphicon-hand-right"></span>&nbsp;&nbsp;${article.title}</a></h4><br>
	${fn:substring(article.content,0,170)},...</font></div><hr/>
    </c:forEach> 
    </div>
    </c:if>
    </div>
    <br>
    
    <jsp:include page="Footer.jsp"></jsp:include>
 </div>
  </body>
</html>
