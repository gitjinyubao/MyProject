<%@ page language="java"  import="java.util.*,java.sql.*"  contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ page import="db.DB" %>
     <% 
        request.setCharacterEncoding("utf-8");
     %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
 <link  href="jin/style.css" rel="stylesheet"  type="text/css"  />
<style>
</style>
</head>
<body>
<%
      String grade=request.getParameter("grade");
      String classs=request.getParameter("classs");
      String course_name=request.getParameter("Course_name");
      Connection c=DB.getconnection();
      Statement s=c.createStatement();
      String Course_number="";     
%>
<h2 align="center"><font face="隶书"><%=course_name%>课程成绩</font></h2>
<p align="right"><%=grade %>级&nbsp;&nbsp;<%=classs %>班</p>
<table border=1  align="center" width="777px">
<tr align="center" bgcolor="">
<td>
序列号
</td>
<td>
学号
</td>
<td>
姓名
</td>
<td>
课程号
</td>
<td>
课程学分
</td>
<td>
成绩
</td>
</tr>
     <% 
            String sql3="select Course_number from course where Course_name='"+course_name+"' ";
            ResultSet  r=s.executeQuery(sql3);
            if(r.next())
            {
            	Course_number=r.getString("Course_number");
            	r.close();
            }           
     %>
<%
Statement s4=c.createStatement();
String  sql2="select  username from stu where number like '"+grade+classs+"%'";
ResultSet r1=s4.executeQuery(sql2);
int i=0;
r1.last();
int a=r1.getRow();
String [] username =new String[a];
r1.absolute(1);
String number3;
          while(i<a)
             {
            	    number3=r1.getString("username");  
            	    username[i]=number3;
          	    ++i;
            	    r1.next();              	    
             } 
          r1.close();           
%>
<%         
            int v=0;
               Statement s3=c.createStatement();
            	String sql4="select * from chengji where Course_number='"+Course_number+"'";
            	ResultSet r2=s3.executeQuery(sql4);
            	r2.last();
            	int b=r2.getRow();
            	if(b>0)
            	{
            	    r2.absolute(1);
            	    while(v<a){            	    
            	%>
            	<TR  align="center">
            	       <td><%=r2.getRow() %></td>
            	       <td><%=r2.getString("number")%></td>
            	     
            	       <td><%=username[v] %></td>
            	        
            	       <td><%=r2.getString("Course_number") %></td>
            	       <td><%=r2.getString("Course_fen")%></td>
            	       <td><%=r2.getString("chengji")%></td>
            	       </TR>                 	      
            	<%             
               	r2.next();++v;}     
            %>            
            <% 
            	}
            	else
            	{
            		out.print("此次查询的班级课程暂时无成绩可以显示");
            	}
            
            c.close();            
%>
</table>
</body>
</html>