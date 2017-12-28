<%@ page language="java" import="java.util.*,java.sql.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ page import="db.DB" %>
<%
   request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
 <link  href="jin/style.css" rel="stylesheet"  type="text/css"  />
<style>
</style>
</head>
<body>
<h2 align="center">学生成绩录入</h2>
<form   action="chengji2.jsp" method="post">
<% Connection c=DB.getconnection();%>
<table align="center"  border="2"  width="666" height="385">
<tr align="center">
<td  bgcolor="">
<font size="+2" color="black" face="隶书">
课程名
</font>
</td>
<td>
<select name="Course_name">
<%
  Statement s=c.createStatement();
  String sql="select Course_name from course";
  ResultSet r=s.executeQuery(sql);
  while(r.next())
  {
%>
<option   value="<%=r.getString("Course_name")%>"  style="height:35px ; width:300px;font-size:20px;"><font size="+3"><%=r.getString("Course_name")%></font>&nbsp;&nbsp;
</option>
<% //记住value后面的表达式要用双引号括起来%>
<% }%>
</select>
</td>
</tr>
<tr align="center">
<td bgcolor="">
<font size="+2" color="black" face="隶书">
年级
</font>
</td>
<td>
<select name="grade">
<%
   Statement s1=c.createStatement();
   String sql1="select distinct substring(number,1,2) from stu";
   ResultSet r1=s.executeQuery(sql1);
   while(r1.next())
   {
%>
<option  value="<%=r1.getString(1)%>"  style="height:35px ; width:300px;font-size:20px;"><font size="+3"><%=r1.getString(1)%>&nbsp;&nbsp;级&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font>
<% }%>
</select>
</td>
</tr>
<tr align="center">
<td bgcolor="">
<font size="+2" color="black" face="隶书">
班级
</font>
</td>
<td>
<select name="classs">
<%
   Statement s2=c.createStatement();
   String sql2="select distinct substring(number,3,2) from stu";
   ResultSet r2=s.executeQuery(sql2);
   while(r2.next())
   {
%>
<option   value="<%=r2.getString(1) %>"  style="height:35px ; width:300px;font-size:20px;"><font size="+3"><%=r2.getString(1) %>&nbsp;&nbsp;班&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font>
<% }%>
<option>
<% c.close();%>
</select>
</td>
</tr>
<tr align="right"  height="40px">
<td colspan="2">
<input  type="submit" name="an" value="确定">
</td>
</tr>
</table>
</from>
</body>
</html>