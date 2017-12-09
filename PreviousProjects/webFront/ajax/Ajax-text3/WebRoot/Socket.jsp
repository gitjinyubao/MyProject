<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="resources/socket.js"></script>
  </head>
  
  <body>
  	<div>
  	<fieldset>
  		<legend>好友列表</legend>
  		<table style="border:2px;">
  		<c:forEach var="friend" items="${list}">
  			<tr>
  			<td><a href="Socket.action?friend_id=${friend.id}">${friend.username}</a></td>
  			</tr>
  		</c:forEach>
  		</table>
  	</fieldset>
  	</div>
  </body>
</html>
