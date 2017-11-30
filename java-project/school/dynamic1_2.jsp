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
	
	<style >
	*{margin:0;
	padding:0;}
#one
{
      width:95%;  
      margin-left:30px;
 
     
}
.z1{overflow:hidden; width:98%; box-shadow:1px 1px 10px black;}
.img1{float:left; width:48%;height:81%; margin:15px;}
.p1{ display:inline-block;float:left;width:42%; margin-top:15px;background:}

.z2{overflow:hidden; width:98%; margin-top:15px;box-shadow:1px 1px 10px black;}
.img2{float:left; width:48%;height:81%;margin:15px;}
.p2{ display:inline-block;float:left;width:45%;margin-top:15px; }

.z3{overflow:hidden; width:98%; margin-top:15px;box-shadow:1px 1px 10px black;}
.img3{float:left; width:48%;height:81%;margin:15px;}
.p3{ display:inline-block;float:left;width:45%;margin-top:15px; }

.z4{overflow:hidden; width:98%; margin-top:15px;box-shadow:1px 1px 10px black;}
.img4{float:left; width:48%;height:81%;margin:15px;}
.p4{ display:inline-block;float:left;width:45%; margin-top:15px;}



</style>
</head> 
<body>
<font  face="隶书"  size="+1"   color="">
校内动态区&nbsp;&nbsp;&nbsp;&nbsp;》》
</font>
  <div  id="one"  >
  
<div class="z1">
<img class="img1" src="Images/xue14.jpg"  > 
<p class="p1" >
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;11月23日下午，湖北省“楚天学者计划”讲座教授聘期满考核暨校“常青学者计划”特聘教授聘任仪式在行政楼第四会议室举行。副校长周坚出席聘任仪式，相关职能部门及土建学院负责人和团队成员参会，人事处处长童兆坤主持了考核及聘任仪式。
 </p>
 </div>
 
 <div class="z2"> 
 <img class="img2" src="Images/xue15.jpg" >
 <p class="p2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;喜讯传来，在11月18日于北京举行的“设计一款营养健康的创新性食品”2016校企联合创意大赛复审决赛上，我校食品学院代表队以优异的表现，获得二等奖1项，三等奖1项，取得参加中粮营养健康研究院校企联合创意大赛以来的最好成绩。</p>
 </div>
 
 <div class="z3">
 <img class="img3" src="Images/xue16.jpg"  >
 <p class="p3">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;11月19日，由共青团中央、教育部、人力资源和社会保障部、中国科协、全国学联、四川省人民政府主办，电子科技大学、共青团四川省委等承办的2016年“创青春”全国大学生创业大赛终审决赛在电子科技大学落下帷幕。在本届大赛中，我校代表队获得1银1铜，取得参加“创青春”全国大学生创业大赛主体赛以来的最好成绩。</p>
 </div>
 
 <div class="z4">
 <img class="img4" src="Images/xue17.jpg"  >
 <p class="p4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;创新创业青年志 海峡两岸一家亲 “金银湖杯”第二届海峡两岸青年大学生创新创业邀请赛在我校圆满落幕</p>
  </div>
  
  
 
 </div>
  </body>
</html>
