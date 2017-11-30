<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib    uri="http://ckeditor.com"  prefix="ck" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<script src="js/Article.js"></script>
	
	<style type="text/css">
	 .img-circle:hover{
    width:110px;
    height:110px;
    }
	</style>
	
	<script type="text/javascript">
	function lose(){
		var container=document.getElementById("message");
		var message=document.getElementById("message");
		container.removeChild(container.childNodes[1]);
	}
	setTimeout("lose()",6000);
	</script>
  </head>
  
  <body>
    <div   class="container">
    <jsp:include page="/Header3.jsp"></jsp:include>
    
    <c:if test="${message!=null}">
    <div id="message">
    <div id="myAlert" class="alert alert-success">
	<a href="#" class="close" data-dismiss="alert">&times;</a>
	<strong id="message"  >${message}</strong>
    </div>
    </div>
    </c:if>
    
    <div class="panel-body">
    <form class="form-horizontal" role="form"   action="user/InsertArticle"   method="post">
     <span class="glyphicon glyphicon-ok"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;请选择文章分类：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   <label class="checkbox-inline">
      <input type="radio" name="kind_name" 
         value="life" checked>生活
   </label>
   <label class="checkbox-inline">
      <input type="radio" name="kind_name" 
         value="technology">技术
   </label>
   <label class="checkbox-inline">
      <input type="radio" name="kind_name" 
         value="knowledge">开心小故事
   </label>
	
    <input type="text" class="form-control"  autofocus="autofocus" required="true"   name="title"   placeholder="文章标题为："> 
    <textarea    id="test"  name="content"  required="true"   style="padding:0px;" ></textarea>
    <ck:replace replace="test" basePath="ckeditor"></ck:replace>
    <button class="btn btn-lg btn-primary btn-block" type="submit">提交</button>
    </form>
    </div>
    
    <jsp:include page="/Footer.jsp"></jsp:include>
    </div>
  </body>
</html>
