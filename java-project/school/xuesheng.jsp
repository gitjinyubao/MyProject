<%@ page language="java"  import="java.util.*,java.sql.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ page import="db.DB" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<% request.setCharacterEncoding("utf-8"); %>
<script    language=javascript>
<!--
        function   que()
        {
	           alert("确定提交吗？");
        }
-->
</script>
<body>
<div align="center">
<h2>学生登录账号及密码初始化</h2>
<br>
<form action="chuli.jsp"   method="post">
<div align="center">
<table   border="1"   width="1200">
<%
         String username;
         String number="";
         Connection   c=DB.getconnection();
         Connection   c1=DB.getconnection();
         Statement s1=c1.createStatement();
         Statement s=c.createStatement();
         String sql="select username,number from  stu";
         
         ResultSet r=s.executeQuery(sql);
         r.last();
        
         int a=r.getRow();
       
         int b=1;
         r.absolute(1);
         while(b<=a)
         {
        	 username=r.getString("username");
        	
             number=r.getString("number");
             %>
<tr  align="center">
<td>
姓名
</td>
<td>
<input  type="text"   name="xingming"   value="<%=username%>">
</td>
<td>
用户名
</td>
<td>

<input   type="text"  name="number"   value="<%=number%>"  >
</td>
         <%     
        	 String sql2="select * from  guan  where number='"+number+"'"  ;
        	 ResultSet r1=s1.executeQuery(sql2);
        	 r1.last();
        	 int d=r1.getRow();
        	 
        	 if(d>0)
        	 { 
  String password=r1.getString("password");
  %>
        	       	
        	 <td colspan="4">
密码&nbsp;&nbsp;&nbsp;
<input type="text"  name="<%=b %>"   value="password"   >
</tr>
        		 
        	 <% }
        	 else
        	 {
        		 %>        		 
<td colspan="4">
密码&nbsp;&nbsp;&nbsp;
<input type="text"  name="<%=b %>"   value=""   >
</tr>
        		 <%  
        	 }  	 
        	 ++b;
        	 r.next();
         }       
%>
<% c.close();
c1.close();%>
<tr align="right">
<td colspan="4">
<input type="submit" name="tijiao"   value="提交"   onclick="que()">
</td>
</tr>
</table>
</div>
</form>
</body>
</html>