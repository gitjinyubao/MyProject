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
	</style>
  </head>
  <body>
    <p>
  <marquee><font face="隶书" size="+4" >动&nbsp;态&nbsp;展&nbsp;示</font></marquee></p>
  <br>
<font  face="隶书"  size="+1"   color="">
风景区&nbsp;&nbsp;&nbsp;&nbsp;》》
</font>
<div class="mainbody" id="px">
<div class="loading"><img   src="Images/loading.gif" width="900px" height="220"  alt="图片加载中" /></div>
<div  class="pic">
<ul>
<li><img   src="Images/xue1.jpg" width="850px" height="220"/></li>
<li><img   src="Images/xue3.jpg" width="850px" height="220" /></li>
<li><img   src="Images/xue20.jpg"  width="850px" height="220" /></li>
<li><img   src="Images/xue6.jpg"  width="850px" height="220" /></li>
<li><img   src="Images/xue21.jpg" width="850px" height="220" /></li>
<li><img   src="Images/xue10.jpg"  width="850px" height="220" /></li>
<li><img   src="Images/xue11.jpg" width="850px" height="220" /></li>
<li><img   src="Images/xue22.jpg" width="850px" height="220" /></li>
<li><img   src="Images/xue23.jpg" width="850px" height="220" /></li>
<li><img   src="Images/bei7.jpg" width="850px" height="220" /></li>
</ul>
</div>
</div>
<font  face="隶书"  size="+1"   color="">
校内动态区&nbsp;&nbsp;&nbsp;&nbsp;》》
</font>
  <div  id="one"  >
  <img  src="Images/xue14.jpg"  width="850px" height="220">
 <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;11月23日下午，湖北省“楚天学者计划”讲座教授聘期满考核暨校“常青学者计划”特聘教授聘任仪式在行政楼第四会议室举行。副校长周坚出席聘任仪式，相关职能部门及土建学院负责人和团队成员参会，人事处处长童兆坤主持了考核及聘任仪式。</p>
 <img  src="Images/xue15.jpg"  width="850px" height="220">
 <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;喜讯传来，在11月18日于北京举行的“设计一款营养健康的创新性食品”2016校企联合创意大赛复审决赛上，我校食品学院代表队以优异的表现，获得二等奖1项，三等奖1项，取得参加中粮营养健康研究院校企联合创意大赛以来的最好成绩。</p>
 <img  src="Images/xue16.jpg"  width="850px" height="220">
 <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;11月19日，由共青团中央、教育部、人力资源和社会保障部、中国科协、全国学联、四川省人民政府主办，电子科技大学、共青团四川省委等承办的2016年“创青春”全国大学生创业大赛终审决赛在电子科技大学落下帷幕。在本届大赛中，我校代表队获得1银1铜，取得参加“创青春”全国大学生创业大赛主体赛以来的最好成绩。</p>
 <img  src="Images/xue17.jpg"  width="850px" height="220">
 <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;创新创业青年志 海峡两岸一家亲 “金银湖杯”第二届海峡两岸青年大学生创新创业邀请赛在我校圆满落幕</p>
 </div>
<!--<figure>
	    <div class="butterfly">
	    <img src="http://p7.qhimg.com/t01a4c54ef5309e561c.png" alt="" />
	  </div>
	
	</figure>
	  -->
  <marquee><img src="xue1.jpg" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="xue1.jpg" ></marquee></p>
     
  </body>
</html>
