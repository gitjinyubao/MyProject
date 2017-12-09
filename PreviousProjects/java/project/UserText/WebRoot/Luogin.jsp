<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Luogin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <% session.invalidate();%>
    <center>
    <br><br><br><br>
    <form  action="UserServlect1"   method="post">
             <font   size="+4"  face="隶书">登录区域</font>
             <input   type="hidden"    name="method"   value="Luogin">
             <br><br><br>
    <table  width="400px" height="250px">
    <tr>
    <td>用户姓名:</td>
    <td><input  type="text"   name="username"></td>
    </tr>
    <tr>
    <td>用户密码:</td>
    <td><input  type="password"  name="password"></td>
    </tr>
    <tr>
    <td align="right">
    <input  type="submit"   value="确定">
    </td>
    <td  align="center">
    <input  type="reset"     value="重置">
    </td>
    </tr>
    </table>
    </form>
    </center>
  </body>
</html>
