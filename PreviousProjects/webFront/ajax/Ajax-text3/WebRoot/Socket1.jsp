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
  		<legend>消息框</legend>
  		<div id="tbody">
  		<c:forEach var="Message" items="${listMessage}">
  		    <p>${Message.username}：</p>
  			<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${Message.message}</p>
  		</c:forEach>
  		</div>
  		<textarea rows="5" cols="80" id="text">
  		</textarea>
  		<input type="button" value="发送" onclick="sendMessage();">
  		<input type="hidden" id="friend_id" value="${friendUser.id}" name="friend_id" >${friendUser.id}
  	</fieldset>
  	</div>
  </body>
</html>
