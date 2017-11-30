<%@ page language="java" import="java.util.*,java.sql.*,java.net.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
      <%@ page import="db.DB" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
 <link  href="jin/style.css" rel="stylesheet"  type="text/css"  />
<style type="text/css">
</style>
</head>
<body>
<h2 align="center">您的课程如下表</h2>
<br>
<table align="center"  border="2"   width="1100" >
<tr align="center"  bgcolor="">
<td>课程名</td>
<td>课程学期</td>
<td>课程学时</td>
<td>课程号</td>
<td>课程学分</td>
</tr>
<% 
String  number=(String)session.getAttribute("number");
request.setCharacterEncoding("utf-8");
Connection   c=DB.getconnection();
Statement  s=c.createStatement();
String sql="select  course_number,course_fen  from   chengji where  number='"+number+"'";
ResultSet  r=s.executeQuery(sql);
r.last();
int a=r.getRow();
if(a>0)
{
	r.absolute(0);
	while(r.next())
	{%>
		<tr align="center">
		<%
		String Course_number=r.getString("Course_number");
		Connection   c1=DB.getconnection();
		Statement  s1=c1.createStatement();
		String sql1="select  Course_name,Course_time,course_hour  from   course where  Course_number='"+Course_number+"'";
		ResultSet  r1=s1.executeQuery(sql1);
		while(r1.next())
		{%>
			<td><%=r1.getString("Course_name") %></td>
			<td><%=r1.getString("Course_time") %></td>
			<td><%=r1.getString("course_hour") %></td>
	<%}  c1.close(); %>	
		<td><%=r.getString("Course_number") %></td>
		<td><%=r.getString("Course_fen") %></td>
		</tr>
	<% }
}
c.close();
%>
</table>
</body>
</html>