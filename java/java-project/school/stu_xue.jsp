<%@ page language="java" import="java.util.*,java.sql.*,java.net.*"  contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="db.DB" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
 <link  href="jin/style.css" rel="stylesheet"  type="text/css"  />
<%
        request.setCharacterEncoding("utf-8");
        String number=(String)session.getAttribute("number");
        String niu=request.getParameter("an");
        String password=(String)session.getAttribute("password");
        String password2=request.getParameter("password2");
        if(password2!=null&&niu.equals("更改密码")){
        Connection  c1= DB.getconnection();
        Statement s1=c1.createStatement();
        String sql2="update guan  set password='"+password2+"' where number='"+number+"' ";
        s1.executeUpdate(sql2);
        out.print("更改成功");
        session.setAttribute("number", number);
        session.setAttribute("password", password2);
       // request.getRequestDispatcher("stu_xue.jsp").forward(request, response);
       response.sendRedirect("stu_xue.jsp");
        c1.close();
        }
        
%>
<style type="text/css">
</style>
</head>
<body>
<h2  align="center">学生个人基本信息</h2>
<br>
<form action="stu_xue.jsp"   method="post">
<table  border="2"   width="880"   align="center" >
<% 
      
     
      Connection   c=DB.getconnection();
      Statement  s=c.createStatement();
      String sql="select   * from   stu  where number='"+number+"'";
      ResultSet  r=s.executeQuery(sql);
      if(r.next())
      {
    	  %>
    	  <tr    align="center">
    	  <td>姓名</td>
    	  <td><%=r.getString("username") %></td>
    	  <td>性别</td>
    	  <td><%=r.getString("sex") %></td>
    	  </tr>
    	  <tr  align="center">
    	  <td>出生日期</td>
    	  <td><%=r.getString("birthday") %></td>
    	  <td>学号</td>
    	  <td><%=number%></td>
    	  </tr>
    	  <tr  align="center">
    	  <td>备注</td>
    	  <td><%=r.getString("remarks") %></td>
    	  <td>专业</td>
    	  <td><%=r.getString("system") %></td>
    	  </tr>
    	  <tr  align="center">
    	  <td>总分</td>
    	  <td><%=r.getString("sum") %></td>
    	  <td>密码</td>
    	  <td><%=password%></td>
    	  </tr> 
    	  <% 
      }
      c.close();
     
%>
<tr align="center">
<td colspan="4">重新设定密码</td>
</tr>
<tr align="center">
<td  colspan="2" >新密码号码</td>
<td><input   type="text"    value=""  name="password2"><input   type="submit"   name="an"   value="更改密码"></td>
</tr>
<tr align="center">
<td  colspan="4">
<input  type="submit"   name="an"   value="如上所示">
</td>
</tr>
</table>
</form>
</body>
</html>