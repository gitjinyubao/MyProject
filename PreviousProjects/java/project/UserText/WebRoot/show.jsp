<%@ page language="java" import="java.util.*,entitty.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'show.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
   <%request.setCharacterEncoding("utf-8"); %>
  </head>
  
  <body>
  <center>
  <h1><font size="+10" face="隶书">客户区</font></h1>
  <br>
  <% if(null!=session.getAttribute("Textuser"))
  {%>
<p  align="right" > <font  face="隶书"> 当前共<input   type="text"   name="countuser"    value=<%=CountUser.USER_COUNt%>   style="width:30px"  >人在线</font></p>
  <% }%>
  <br>
  <form  action="UserServlect1"  method="post">
       <input  type="hidden"   name="method"   value="select">
      <p align="left"><font size="+3" face="隶书" ><input  type="submit"  name="select"  value="查询"  width="100px"></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font size="+2" face="隶书" >用户名:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  name="username"></p>
  </form>
  
  
  <form  action="UserServlect1"  method="post">
       <input  type="hidden"   name="method"   value="select1">
      <p align="left"><font size="+3" face="隶书" ><input  type="submit"  name="select1"  value="查询"  width="100px"></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font size="+2" face="隶书" >用户名:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <select  name="username" style="width:160px" >
				<c:forEach items="${list}" var="user">
				<option>${user.username}</option>
				</c:forEach>
				
				<%//$的使用 %>
				
      </select></p>
  </form>    
     <table  width="1080px" border=3>
     <tr>
     <th  style="font-size:1.5em;font-family:隶书">序号</th>
     <th style="font-size:1.5em;font-family:隶书">姓名</th>
     <th style="font-size:1.5em;font-family:隶书">密码</th>
     <th style="font-size:1.5em;font-family:隶书">年龄</th>
     <th  colspan="2" align="center" style="font-size:1.5em;font-family:隶书">操作</th>
     </tr>
     <c:forEach  items="${list}"  var="user">
     <tr>
     <td>${user.id}</td>
     <td>${user.username}</td>
     <td>${user.password}</td>
     <td>${user.age}</td>
     <td align="center"><a  href="UserServlect1?id=${user.id}&method=delete&CurrentPage=${page.currentPage}&pagekind=stop">删除</a></td>
     <td align="center"><a  href="update1.jsp?id=${user.id}&method=update1&CurrentPage=${page.currentPage}&pagekind=stop">修改</a></td>
     </tr>
     </c:forEach>
     <%//注意书写 %>
     <tr>
     <td colspan="6"  align="center"><font  size="+2"  face="隶书">共${page.sumPage}页&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${page.currentPage}/${page.sumPage}页&nbsp;&nbsp;
    <c:if test="${page.currentPage<page.sumPage}">
    <a href="UserServlect1?CurrentPage=${page.currentPage}&method=updown&pagekind=down">下一页</a>&nbsp;&nbsp;&nbsp;
    <c:if test="${page.currentPage>1}">
    <a href="UserServlect1?CurrentPage=${page.currentPage}&method=updown&pagekind=up">上一页</a> 
    </c:if>
    </c:if>
    <c:if test="${page.currentPage==page.sumPage}">
    <a href="UserServlect1?CurrentPage=${page.currentPage}&method=updown&pagekind=up">上一页</a> 
    </c:if>
    </font>
    &nbsp;&nbsp; <form  action="UserServlect1"   method="post"><input type="hidden"  name="method"   value="go">
    <input type="hidden"  name="CurrentPage"   value="lo">
     <input type="hidden"  name="pagekind"   value="tiao">
    <input type="submit" value="GO"><input  type="text"   name="number" style="width:30px" >页</form>
     </td>
     </tr>
     <tr>
     <td colspan="6"  align="center"><a href="insert.jsp"><font  size="+3"  face="隶书">添加新用户</font></a></td>
     </tr>
     <tr><td  colspan="6"  align="right"><a   href="Luogin.jsp"><font   size="+2"  face="隶书">离开</font></a></td></tr>
     </table>
  </center>
  </body>
</html>