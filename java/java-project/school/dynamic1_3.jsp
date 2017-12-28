<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'dynamic.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta  http-equiv="Content-type" content="text/css;charset=UTF-8">     
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script  src="js/myfocus-2.0.1.min.js"  type="text/javascript"></script>
<script src="js/mF_slide3D.js" type="text/javascript"></script>
<link  href="js/mF_slide3D.css" rel="stylesheet"  type="text/css"  />
<script type="text/javascript">
myFocus.set({id:'px'})
</script>
<link  href="jin/style.css" rel="stylesheet"  type="text/css"  />
	<style >
	*{ margin:0px;
     padding:0px; }
	</style>
 </head> 
  <body>
<font  face="隶书"  size="+1"   color="">
风景区&nbsp;&nbsp;&nbsp;&nbsp;》》
</font>
<div class="mainbody1" id="px">
<div class="loading"><img   src="Images/loading.gif" width="100%" height="194"  alt="图片加载中" /></div>
<div  class="pic">
<ul>
<li><img  class="img1" src="Images/xue1.jpg" width="870px" height="194"/></li>
<li><img   src="Images/xue3.jpg"  width="876px" height="194" /></li>
<li><img   src="Images/xue20.jpg"   width="876px" height="194" /></li>
<li><img   src="Images/xue6.jpg"   width="876px" height="194" /></li>
<li><img   src="Images/xue21.jpg"  width="876px" height="194" /></li>
<li><img   src="Images/xue10.jpg"  width="876px" height="194" /></li>
<li><img   src="Images/xue11.jpg"  width="876px" height="194" /></li>
<li><img   src="Images/xue22.jpg"  width="876px" height="194" /></li>
<li><img   src="Images/xue23.jpg"  width="876px" height="194" /></li>
<li><img   src="Images/bei7.jpg"  width="876px" height="194" /></li>
</ul>
</div>
</div>
</body>
</html>
