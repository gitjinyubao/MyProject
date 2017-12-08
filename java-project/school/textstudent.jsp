<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ page import="entitty.Student" %>
<%@ page import="Function.Dostudent"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>My JSP 'luogin.jsp' starting page</title>   
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <body>&nbsp;&nbsp; 
   <% 
      request.setCharacterEncoding("utf-8"); 
    %>
  <jsp:useBean  id="u1"  class="entitty.Student"  />
  <jsp:useBean  id="d"  class="Function.Dostudent"  />
   <jsp:useBean  id="n"  class="Function.Donum"  />
  <jsp:useBean id="s1"  class="entitty.St1" />
  <jsp:setProperty name="s1"   property="*"  />
  
  
  
  <jsp:setProperty name="u1"   property="*"  />
  <!--第二种方式  -->
  <form  action="dynamic1.jsp"  method="post">
  <h2 align="center"><font size="+8">学生信息确认</h2>
  
  <table align="center" border=2  width="800" height="400" bgcolor="#808080">
   <tr>
   <th  colspan="2" align="center">
 个人资料
   </th>
   </tr>
   <tr>
   <td>
   姓名：&nbsp;&nbsp;
   </td>
   <td>
  <%=u1.getUsername()%>
   </td>
   </tr>
   <tr>
   <td align="left">
   学号:&nbsp;&nbsp;
   </td>
   <td>
  <%=u1.getNumber() %>
   </td>
   </tr>
   <tr>
   
   <tr>
   <td>
   性别：&nbsp;&nbsp;
   </td>
   <td>
 <%=u1.getSex() %>
   </td>
   </tr>
   <tr>
   <td align="left">
   出生日期：
   </td>
   <td>
   <%=u1.getBirthday() %>
   </td>
   </tr>
   <tr>
   <td align="left">
   备注：
   </td>
   <td>
  <%=u1.getRemarks() %>
   </td>
   </tr>
   <tr></tr>
   <tr></tr>
   <tr></tr>
   <tr></tr>
   <tr></tr>
   <tr></tr>
   <tr></tr>
   <tr></tr>
   <tr></tr>
   <tr>
   <th   colspan="2">
   个人专业资料
   </th>
   </tr>
   <tr>
   <td >
   所学专业：&nbsp;&nbsp;
   </td>
   <td>
   <%=u1.getSystem() %>
   </td>
   </tr>
    <tr>
   <td >
   总学分：&nbsp;&nbsp;
   </td>
   <td>
   <%=u1.getSum() %>
   </td>
   </tr>
   <tr >
   <td  align="center">
   <input type="submit" name="submit"  value="保存"></td>
   <td align="center">
   <input type="button"  value="修改">
   </td>
   </tr> 
   </table>
   </form>
   <%  
       d.add_student(u1); 
   %>

  </body>
</html>
