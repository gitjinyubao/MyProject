<%@ page language="java" import="java.util.*,entitty.*,java.sql.*,doentitty.*" pageEncoding="utf-8"%>
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
	<%//request.setCharacterEncoding("utf-8"); %>
	    <%
	    	String sql="select    *  from   tbl_user   where id=?  ";
	    	    	    int id=Integer.parseInt(request.getParameter("id"));
	    	    		Connection  con=Jdbc.getcon();
	    	    		PreparedStatement  p=con.prepareStatement(sql);
	    	    		p.setInt(1, id);
	    	    		ResultSet r=p.executeQuery();
	    	    		User user=null;
	    	    		if(r.next())
	    	    		{
	    	    	user=new User(r.getString("username"),r.getString("password"),r.getString("age"),r.getInt("id"));
	    	    		}
	    	    		Jdbc.close1(p, r);
	    %>
  </head>
  
  <body>
   <%//User   user=(User)request.getAttribute("user");%>
   <form action="UserServlect1"  method="post">
   <input  type="hidden"   name="method"   value="update2">
   <%//<input	type="hidden" name="id" value="${requestScope.user['id'] }" />  %>
   <center>
     <h1><font  face="隶书">用户信息登记</font></h1>
     <br>
     <br>
     <br>
     <br>
   <table  width="400px" height="410px" >
   <tr>
   <td>用户编号:</td>
   <td><input  type="text"   name="id"   value=<%=user.getId() %>>
                                          <%// value="${requestScope.user.id}" %>
   </tr>
   <tr>
   <td>用户姓名:</td>
   <td><input  type="text"   name="username"   value=<%=user.getUsername() %>></td>
   </tr>
   <tr>
   <td>用户密码:</td>
   <td><input  type="text"  name="password"  value=<%=user.getPassword() %>></td>
   </tr>
   <tr>
   <td>用户年龄:</td>
   <td><input  type="text"  name="age"  value=<%=user.getAge()%>></td>
   </tr>
   <tr  >
   <td align="center" colspan="2">
   <input type="submit"   value="确定提交">
   </td>
   </tr>
   </table>
   </center>
   </form>
  </body>
</html>