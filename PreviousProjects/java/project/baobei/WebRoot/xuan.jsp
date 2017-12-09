<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'xuan.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	-->
	<style type="text/css">
	 body{
	 background-image:url("images/a7.jpg");
	 background-repeat:no-repeat;
	 background-size:cover;    
	
	 background-position:botom center; 
	 }
	 .b
	 {
	       font-family:隶书;
	       font-size:60px;
	       height:120px;
	       background-image:url("images/a6.jpg");
	 }
	.a{
	      height:80px;
	      width:240px;
	      background-color:#FFC;
	      font-family:隶书;
	      font-size:46px;
	      border: 3px solid rgb(195, 190, 186);  
	      margin:50px auto; 
	      box-shadow:-10px 0 10px red, /*左边阴影*/  
          10px 0 10px yellow, /*右边阴影*/  
          0 -10px 10px blue, /*顶部阴影*/  
          0 10px 10px green; /*底边阴影*/   
	}
	.a:hover{

            	 background-color:#6FC;
}
	</style>

  </head>
  <body>
  <center>
    <p class="b">宝贝的世界<p>
    </center>
     <br>
     <center>
     <p ><u><a href="bei.jsp"  ><input class="a" type="submit"   value="查看明细"></a></u></p>
     <p><a href="bao.jsp" ><u><input  class="a"  type="submit"  value="登记明细"></u></a></p>
     </center>          
  </body>
</html>