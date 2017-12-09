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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	 body{
	 font-family:隶书;
	 background-image:url("images/a4.jpg");
	 background-repeat:no-repeat;
	 background-size:cover;   
	 background-position:botom center;
	 height:100%;
	 }
	 table
	 {
	      font-size:40px;
	      font-weight:100;
	 }
	.a
	 {
	      font-family:隶书;
	      height:32px;
	       margin:50px auto;  
           background:#FFC;         
	 }
	 .b
	 {
	      font-family:隶书;
	      font-size:24px;
	      height:35px;
          box-shadow:-10px 0 10px red, /*左边阴影*/  
          10px 0 10px yellow, /*右边阴影*/  
          0 -10px 10px blue, /*顶部阴影*/  
          0 10px 10px green; /*底边阴影*/  
}  
.b:hover{

            	 background-color:#6FC;
}
	 }
	 .c
	 {
	      font-family:隶书;
	      height:28px; 
	      margin:50px auto;  
          background:#FFC;    
	 }
	</style>
	<script type="text/javascript">
	function   test()
	{
	if(login.money.value==""||login.explain.value==""||login.time.value=="")
	{
	   
	       alert("请完成信息再提交");
	}
	}
	</script>
  </head>
  <body>
  <form name="login"  onSubmit="return test(this);"  action="bei.jsp"   method="post" >
  <center>
  <h1><font  size="+6"   face="隶书">宝贝计划</font></h1>
  <br></br><br></br><br></br></br>
  <table cellspacing=120px  ><tr ><td  align="center">金额</td><td><input   class="a" type="text"  name="money" ></td></tr>
  <tr><td >明细<img alt="" src="">说明</td><td><input class="a"  type="text"  name="explain" ></td></tr>
  <tr><td align="center">时间</td><td><input  class="c" type="text"  name="time" value="2017-02-24"></td></tr>
  <tr><td align="right"><input  type="reset"   value="重置"  class="b" ></td><td align="right"><input   class="b" type="submit"  value="提交" onclick="test()"></td></tr>
  </table>
  </center>
  </form>
  </body>
</html>