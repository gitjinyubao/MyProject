<%@ page language="java" import="java.util.*,java.sql.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="entitty.Student"%>
    <%@ page import="Function.delete" %>
    <%@ page import="db.DB"%>
    <jsp:useBean id="d" class="Function.delete"/>
    <% request.setCharacterEncoding("utf-8"); %>
    <%
         String number=request.getParameter("number1");
         String niu=request.getParameter("an"); 
          if(number!=null&&niu.equals("删除"))
          {
              Connection cc=DB.getconnection();
              Statement s1=cc.createStatement();

              String sql2="delete from stu where number='"+number+"'";
              s1.executeUpdate(sql2);
          }
          else
          {
        	  out.print("没有需要删除的学号");
          }
    %>
   
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<form action="delete.jsp"  method="post">
<hr>


<p align="right">删除学号&nbsp;&nbsp;<input type="text" name="number1">&nbsp;&nbsp;<input type="submit" name="an" value="删除"></p>
<br>
<TABLE ALIGN="center" border=1  width="777px" >
<TR  ALIGN="center">
<td>序列号</td>
<TD>姓名</TD>
<td>工号</td>
<td>性别</td>
<td>出生日期</td>
<td>所在专业</td>
</TR>
<% Connection c=DB.getconnection(); %>
<% 
      
       Statement s=c.createStatement();
       String sql="select * from stu ";
       ResultSet r=s.executeQuery(sql);
       while(r.next())
       {
%>
<tr ALIGN="center">
<td><%=r.getRow() %></td>
<td ><%=r.getString("username") %></td>
<td  name="number"><%=r.getString("number") %></td>
<td><%=r.getString("sex")%></td>
<td><%=r.getString("birthday") %></td>
<td><%=r.getString("system") %></td>
</tr>
<% }%>
<%c.close(); %>
</TABLE>
</form>
</body>
</html>