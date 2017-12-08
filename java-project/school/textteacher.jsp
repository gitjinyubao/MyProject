<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ page import="entitty.Teacher" %>
<%@ page import="Function.Doteacher"%>
<%@ page import="entitty.St1" %>
<%@  page import="Function.Donum" %>
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
  <body>
   <%
    request.setCharacterEncoding("utf-8");
    %>
  <jsp:useBean  id="u1"  class="entitty.Teacher"  />
  <jsp:useBean  id="t"  class="Function.Doteacher" />
  
  <!--第二种方式  -->
  <jsp:setProperty name="u1"   property="*"  />
  <jsp:useBean  id="n"  class="Function.Donum"  />
  <jsp:useBean id="s1"  class="entitty.St1" />
  <jsp:setProperty name="s1"   property="*"  />
   <form  action="kuang.jsp"  method="post">
  <table align="center" border=2  width="1200" height="600" bgcolor="red">
   <tr>
   <th  colspan="2" align="left">
 个人资料
   </th> 
   </tr>
   <tr align="center">
   <td>
   姓名&nbsp;&nbsp;
   </td>
   <td>
  <%=u1.getUsername()%>
   </td>
   </tr>
   <tr align="center">
   <td >
   工号&nbsp;&nbsp;
   </td>
   <td>
  <%=u1.getNumber() %>
   </td>
   </tr>
   <tr align="center">
   <td >
   初始密码&nbsp;&nbsp;
   </td>
   <td>
   <%=u1.getPassword()%>
   </td>
   </tr>
   <tr align="center">
   <td >
   确认密码&nbsp;&nbsp;
   </td>
   <td>
   <%=u1.getPassword1()%>
   </td>
   </tr>
   <tr>
   <tr align="center">
   <td >
 政治背景&nbsp;&nbsp;
   </td>
   <td>
   <%=u1.getBackground()%>
   </td>
   </tr>
   <tr align="center">
   <td >
   学历&nbsp;&nbsp;
    </td>
   <td>
   <%=u1.getEducation() %>
   </td>
   </tr>  
   <tr align="center">
   <td>
   性别&nbsp;&nbsp;
   </td>
   <td>
 <%=u1.getSex() %>
   </td>
   </tr>
   <tr align="center">
   <td >
   出生日期
   </td>
   <td>
   <%=u1.getBirthday() %>
   </td>
   </tr>
   <tr align="center">
   <td >
   备注
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
   <tr align="center">
   <th colspan="2" align="left" >
 个人授课资料
   </th>
   </tr>
   <tr  align="center">
   <td >
   教学专业&nbsp;&nbsp;
   </td>
   <td>
   <%=u1.getSystem() %>
   </td>
   </tr>
   <tr align="center">
   <td>
   教学课程&nbsp;&nbsp;
   </td>
   <td>
   <%=u1.getCourse()%>
   </td>
   </tr>
   <tr >
   <td colspan="2" align="right">
   <input type="submit" name="submit"  value="确定">
   </td>
   </tr>
   </table>
   </form>
   <%
         n.add_num1(s1);
         t.add_teacher(u1);
   %>
  </body>
</html>
