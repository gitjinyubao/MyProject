<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
	<link rel="stylesheet" type="text/css" href="css/index.css">
  </head>
  
  <body>
  
    <h1>h5实现拖拽</h1>
		<div>
			<fieldset>
				<legend>图片板块</legend>
				<div id="src">
					<img draggable="true" src="img/13.jpg" id="a"/>
					<img src="img/14.jpg" draggable="true" id="b"/>
					<img src="img/15.jpg" draggable="true" id="c"/>
					<img src="img/16.jpg" draggable="true" id="d"/>
					<img src="img/23.jpg" draggable="true" id="e"/>
					<img src="img/24.jpg" draggable="true" id="f"/>
					<img src="img/25.jpg" draggable="true" id="g"/>
					<img src="img/26.jpg" draggable="true" id="h"/>
				</div>
			</frameset>
		</div>
		<div class="sc">
			<fieldset>
				<legend>图片拖拽删除区域</legend>
					<h3>图片删除框</h3>
					<div id="target">
						
					</div>
			</fieldset>
		</div>
		<script type="text/javascript" src="js/index.js"></script>
  </body>
</html>
