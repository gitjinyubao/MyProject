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
	<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	<link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	<link href="bootstrap-3.3.7-dist/css/My.css"   rel="stylesheet">
    <script type="text/javascript"     src="jQuery/jquery-3.1.1.js"></script>
    <script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script src="js/My.js"></script>
	
	<style type="text/css">
	 .img-circle:hover{
    width:110px;
    height:110px;
    }
	</style>
  </head>
  <body style="background-color: RGB(238,232,171);">
  <div   class="container">
  <jsp:include page="/Header3.jsp"></jsp:include>
  <br>
    <div class="panel panel-success"  >
    <div class="panel-heading"><span class="glyphicon glyphicon-folder-open"></span>&nbsp;&nbsp;&nbsp;&nbsp;文章如下</div>
    <div class="table-responsive">
    <table class="table">
	<tbody>
	<thead>
		<tr>
		    <th>文章标题</th>
			<th>时间</th>
			<th>评论量</th>
			<th>操作</th>
		</tr>
	</thead>
	
	<c:forEach   var="article"   items="${list}"  varStatus="status">
	 <tr <c:if test="${status.index%2!=0}">class="active"</c:if> <c:if test="${status.index%2==0}">class="warning"</c:if> >
			<td><a  href="user/PublicArticle?id=${article.id}"><span class="glyphicon glyphicon-eye-open"></span>
			&nbsp;&nbsp;&nbsp;&nbsp;${article.title}</a>
			</td>
			<td>${article.date}</td>
			<td>${fn:length(article.list_comment)}</td>
			<td>
			 <form  action="user/ArticleDelete"   method="post">
			 <input  type="hidden"   name="date1"   value="${article.date}">
			 <input  type="hidden"   name="kind_name"   value="${article.kind_name}">
			 <input  type="hidden"   name="kind"   value="${kind}">
			 <input  type="hidden"   name="handle"   value="delete">
			 <input  type="hidden"   name="pageCurrent"   value="${page.pageCurrent}">
			 <button type="submit" class="btn btn-default btn-sm">
             <span class="glyphicon glyphicon-remove"></span> 删除
             </button>
             </form>
             </td>
		</tr>
	 </c:forEach>
	</tbody>
</table>
<ul class="pager">
  <li><a href="user/ArticleManage1?pageCurrent=${page.pageCurrent}&handle=up&kind_name=${kind_name}">&laquo;上一页</a></li>
  <li><a href="user/ArticleManage1?pageCurrent=${page.pageCurrent}&handle=down&kind_name=${kind_name}">下一页&raquo;</a></li>
</ul> 
</div>
</div>
<jsp:include page="/Footer.jsp"></jsp:include> 
  </div>  
  </body>
</html>
