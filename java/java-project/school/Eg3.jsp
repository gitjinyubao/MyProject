<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Eg2.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <body > 
   <form  action="textteacher.jsp"  method="post">
   <table align="center" bgcolor="">
   <tr>
   <th  colspan="2" align="left">
 个人资料
   </th>
   </tr>
   <tr>
   <td>
   姓名：&nbsp;&nbsp;
   </td>
   <td>
   <input type="text"  name="username"  value="">
   </td>
   </tr>
   
   
   <tr>
   <td>
   性别：&nbsp;&nbsp;
   </td>
   <td>
 <input type="radio" checked value="男" name="sex">男&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio"  value="女" name="sex">女
   </td>
   </tr>
   <tr>
   <td align="left">
   出生日期：
   </td>
   <td>
   <input type="text"  name="birthday"  value="1994-02-06">
   </td>
   </tr>
   <tr>
   <td align="left">
   工号:&nbsp;&nbsp;
   </td>
   <td>
   <input type="text"  name="number"  value="">
   </td>
   </tr>
   <tr>
   <td align="left">
   初始密码:&nbsp;&nbsp;
   </td>
   <td>
   <input type="password"  name="password"  value="">
   </td>
   </tr>
   <tr>
   <td align="left">
   确认密码:&nbsp;&nbsp;
   </td>
   <td>
   <input type="password"  name="password1"  value="">
   </td>
   </tr>
   <tr>
   <td align="left">
 政治背景：&nbsp;&nbsp;
   </td>
   <td>
   <select  name="background"  size=1>
   <option  >群众
   <option  >团员
   <option  selected>党员
   </select>
   </td>
   </tr>
   <tr>
   <td align="left">
   学历：&nbsp;&nbsp;
   </td>
   <td>
   <select  name="education" size=1>
   <option  >本科
   <option  >硕士
   <option selected>博士
   </select>
   </td>
   </tr>
   <tr>
   <td align="left">
   备注：
   </td>
   <td>
   <textarea   rows="5" cols="15"  name="remarks">研究方向.....</textarea>
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
   <th>
   个人授课资料
   </th>
   </tr>
   <tr>
   <td VALIGN="top">
   教学专业：&nbsp;&nbsp;
   </td>
   <td>
   <select  name="system"  size=1>
   <option  value="软件工程"  selected>软件工程</option>
   <option value="数字媒体">数字媒体</option>
   <option value="计算机科学">计算机科学</option>
   <option value="网络工程">网络工程</option>
   </select>
   </td>
   </tr>
   <tr>
   <td>
   教学课程：&nbsp;&nbsp;
   </td>
   <td>
   <select  name="course" size=6 multiple>
   <option value="计算机导论" selected>计算机导论
   <option value="数据结构" >数据结构
   <option value="c语言" >c语言
   <option value="软件工程导论" >软件工程导论
   <option value="C++" >C++
   <option value="java" >java
   </select>
   </td>
   </tr>
   <tr>
   <td>
   <input type="submit" name="submit"  value="提交">
   </td>
   <td>
   <input type="reset"  name="reset" value="重置">
   </td>
   </tr>
   </table>
   </form>
  </body>
</html>