<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Deng.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0"> 
	<meta  http-equiv="Content-type" content="text/css;charset=UTF-8">   
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	
	 body{
	 background-image:url("Images/deng2.jpg");
	 background-repeat:no-repeat;
	 background-size:cover;    
	
	 background-position:botom center; 
	 }
	</style>
  </head>
  <script Language=javascript>
  <!--
    function ce()
    {   
	      if(luogin.number.value=="")
	    	  {
	    	       alert("请输入用户名");
	    	       document.luogin.elements(0).focus();
	    	       return false;
	    	  }
	      if(luogin.password.value=="")
	    	  {
	    	       alert("请输入密码");
	    	       document.luogin.elements(1).focus();
	    	       return false;
	    	  }
     }
  -->
	</script>
  <body >  
  <font  size="+12"  color="#7093DB"  face="隶书">
   <marquee align="right" behavior="slive" HSPACE="10PX" SCROLLAMOUNT="40px"  loop="infinite" >武汉轻工大学欢迎您</marquee></font>
    <form name="luogin" onSubmit="return ce(this); " action="Dotext.jsp" method="post">
    <table  align="center"  background="Images/deng5.jpg" width="480px"  height="210" VSPACE="180px"  >
    <tr >
    <th colspan="2" align="center">
    <font color="white"   face="隶书"  size="" >
            登录表单
    </font>
    </th>
    </tr>
    <tr>
    <td width="100px" height="50px"align="center">
    <font   size="">
           用户名：
           </font>
    </td>
    <td><input  type="text"   name="number"  value="" style="height:30px ; width:180px;">
    </td>
    </tr>
    <tr>
    <td width="100px" height="50px"align="center">
    <font  size="">
           密码：
           </font>
    </td>
    <td>
    <input type="password"   name="password"    value=""  height="200px" style="height:30px ; width:180px;">
    </td>
    </tr>
    <tr>
    <td colspan="2" align="right" height="35px">
    <input type="radio" name="radio" value="teacher"  checked>老师
    <input type="radio"name="radio" value="student"  >学生
    </td>
    </tr>
    <tr>
    <td  align="right" colspan="2"><input type="submit"   value="确定" name="submit" height="20px"  >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   <input id="j" type="reset"  name="reset" value="重置">
   </td>
    </tr>
    
    </table>
    </form> 
    <!-- #j{opacity: 0.6;}:透明度 -->
  </body>
</html>
