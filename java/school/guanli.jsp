<%@ page language="java" import="java.util.*,java.sql.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ page import="db.DB" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
 <link  href="jin/style.css" rel="stylesheet"  type="text/css"  />
<title>Insert title here</title>
<%request.setCharacterEncoding("utf-8"); %>
<%
   String username="";
   String password="";
   String number1=request.getParameter("number1");
   String number2=request.getParameter("number2");
   String niu=request.getParameter("an");
   if(number1!=null&&niu.equals("结束"))
   {
	   response.sendRedirect("admin.jsp");
   }
   if(number1!=null&&niu.equals("查询"))
   {
       username=request.getParameter("username").trim();
	   Connection cc=DB.getconnection();
 	   Statement s=cc.createStatement();
 	   String sql="select * from admin where Username='"+number1+"'";
 	   ResultSet r=s.executeQuery(sql);
 	   if(r.next())
 	   {
 		   username=r.getString("username");  
 		   password=r.getString("password");
 		   r.close();
 		  cc.close();
 	   }
 	   else
 	   {
 		   out.print("该管理员不存在，请重新输管理员账号或者重新登记管理员信息");
 	   }
   } 
	   if(number1!=null&&niu.equals("添加"))
	   {
		   password=request.getParameter("password");
		   username=request.getParameter("username"); 
		   Connection cc=DB.getconnection();
	 	   Statement s=cc.createStatement();
	 	   String sql="select * from admin where Username='"+username+"'";
	 	   ResultSet r=s.executeQuery(sql);
		   if(r.next())
		   {
		   if(username.length()==3)
		   {
			   Connection cc1=DB.getconnection();
			   Statement s1=cc1.createStatement();
			   String sql4="select * from admin where username='"+username+"'";
			   ResultSet r4=s.executeQuery(sql4);
			   if(r4.next())
			   {
				   String sql2="update admin set password='"+password+"' where  username='"+username+"'";
				   s.executeUpdate(sql2);
			       out.print("更新成功");  
			   }
			   cc1.close();
		   }
		   else
		   {
			   out.print("请输入管理员账号的正确格式");
		   }
		   }
			   else
			   {
				   Connection cc2=DB.getconnection();
				   Statement s3=cc2.createStatement();
				   String sql5="select * from  admin";
				   ResultSet  r9=s3.executeQuery(sql5);
				   r9.last();
				   int b=r9.getRow();
				   out.print(b);
				   if(b<=3)
				   {   
				   String sql3="insert admin values(?,?)";
				   PreparedStatement p=cc.prepareStatement(sql3);
				   String t1=request.getParameter("username");
				   String t2=request.getParameter("password");
				   int d1=t1.length();
				   int d2=t2.length();
				   if(d1==3&&d2==10)
				   {
					   p.setString(1, request.getParameter("username"));
					   p.setString(2, request.getParameter("password"));
					   
					   p.execute();
				       p.close();
				       out.print("添加成功");
				       }
				   else
				   {
					   out.print("您输入的信息有误，管理员的账号字符长度为3；密码的字符长度为10");
				   }
				   
			       }
				   else
				   {
					   out.print("管理员人数大于最大值3,不可再进行添加");
				   }
				   
				   cc2.close();
				   cc.close();
			   }	   }	
		   
  if(number2!=null&&niu.equals("删除"))
   {
	  String sql3="delete from admin where   username='"+number2+"'";
	   Connection cc6=DB.getconnection();
 	   Statement s77=cc6.createStatement();
 	   s77.executeUpdate(sql3);
 	  cc6.close();	   
   }
%>
<style>
</style>
</head>
<body>
<form   action="guanli.jsp"   method="post">
<center>
<h2><font  size="+4"  face="隶书">
添加删除管理员</font></h2>
<br>
<p  align="right">管理员账号&nbsp;&nbsp;&nbsp;<input  type="text"   name="number1" value=""><input   type="submit"   name="an"  value="查询"></p>
<p  align="right">管理员账号&nbsp;&nbsp;&nbsp;<input  type="text"   name="number2" value=""><input   type="submit"   name="an"  value="删除"></p>
<table border="2" width="890">
<tr>
<td colspan="2">
</tr>
<tr align="center">
<td>管理员账号</td>
<td><input  type="text"  name="username" value="<%=username %>"></td>
</tr>
<tr align="center">
<td>密码</td>
<td><input type="text"  name="password"  value="<%=password%>"></td>
</tr>
<tr align="center">
<td>
<input  type="submit"   name="an"  value="添加">
<td>
<input  type="submit"   name="an"  value="结束">
</td>
</tr>
</table>
</center>
<hr>
<p align="center"  >
<font  size="+4"  face="隶书">
管理员总表
</font>
</p>
<table  align="center"  border="2"   width="1200">
<%
       Connection  ccc= DB.getconnection();
       Statement  s7=ccc.createStatement();
       String sql7="select * from admin";
       ResultSet  r5=s7.executeQuery(sql7);
       while(r5.next())
       {
    	   %>
    	   <tr  align="center">
    	   <td>管理员账号</td>
    	   <td><%=r5.getString("username") %></td>
    	   <td>密码</td>
    	   <td><%=r5.getString("password") %></td>
    	   </tr>
    	   
    	   <% 
    	  
       }

       ccc.close();
%>
</table>
</form>
</body>
</html>