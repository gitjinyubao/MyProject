<%@ page language="java"  import="java.util.*,java.sql.*"   contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
      <%@ page import="db.DB" %>
    <%request.setCharacterEncoding("utf-8") ;%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script   language=javascript>
<!--
 function ce()
 {
	confirm("确认提交吗？");
 }
-->
</script>
<link  href="jin/style.css" rel="stylesheet"  type="text/css"  />
<style>
</style>
</head>
<body>
<%
      String grade=request.getParameter("grade");
      String classs=request.getParameter("classs");
      String course_name=request.getParameter("Course_name");
      Connection c5=DB.getconnection();
      Statement s5=c5.createStatement();
      String Course_number="";
      int i=1;
      session.setAttribute("number1",grade);
      session.setAttribute("number", classs);
      session.setAttribute("Course_name", course_name);
      
   
      
%>
     <% 
            String sql3="select Course_number from course where Course_name='"+course_name+"' ";
            ResultSet  r5=s5.executeQuery(sql3);
            if(r5.next())
            {
            	Course_number=r5.getString("Course_number");
            }
          
     %>
<%
String  sql2="select  username from stu where number like '"+grade+classs+"%'";
ResultSet r1=s5.executeQuery(sql2);
int i1=0;
r1.last();

int a=r1.getRow();
String [] username =new String[a];
r1.absolute(1);
String number3;


           
             while(i1<a)
             {
            	    number3=r1.getString("username");  
            	    username[i1]=number3;
            
            	    
            	    ++i1;
            	    r1.next();  
            	    
             }         
%>
<%         
            int v=0;
            
            	String sql4="select * from chengji where Course_number='"+Course_number+"'and number like '"+grade+classs+"%'";
            	ResultSet r2=s5.executeQuery(sql4);
            	r2.last();
            	int b=r2.getRow();
            	if(b<=0)
            	{
            	
            	%>
<%
%>

<div align="center"><leble><%=course_name %>成绩<leble>
     <p align="right"><%=grade %>级&nbsp;&nbsp;<%=classs %>班&nbsp;&nbsp;</p>
</div>
<form  action="insert_chengji.jsp" method="post">
<table border=2 align="center" width="780">
<tr bgcolor="" align="center">
<th  width="40" >
<font color="block"   face="隶书"   >
序列号
</font>
</th>
<th  width="180" >
<font color="block"   face="隶书"   >
学号
</font>
</th>
<th width="280" >
<font color="block"   face="隶书"   >
姓名
</font>
</th>
<th width="280" >
<font color="block"   face="隶书"   >
成绩
</font>
</th>
</tr>
<tr align="center">
<%
   Connection c=DB.getconnection();
   Statement s=c.createStatement();
   String sql="select number,username from stu where number like '"+grade+classs+"%'";
   ResultSet r=s.executeQuery(sql);
   r.last();
   int sumRow=r.getRow();
   if(sumRow>20)
   {
	   out.print("<p>班级人数超过行政班上限20人</p>");
   }
   else if(sumRow<0)
   {
	   out.print("<p>班级人数为空</p>");
   }
   else if(sumRow>=0)
   {
	   r.absolute(0);
     while(r.next())
     {
%>
<tr align="center">
<td>
<%=r.getRow() %>
</td>
<td>
<%=r.getString("number") %>
</td>
<td>
<%=r.getString("username") %>
</td>
<td>
<input type="text"  name="<%=i %>" value="">
</td>
</tr>
<%String num=Integer.toString(i);session.setAttribute("num", num);++i;}
   }c.close();  }else
   {
         out.print("<h1>此班这门功课的成绩已经被录入<h1>");
   }
            	c5.close();
   %>
   
   <tr align="center"><td colspan="4"><input type="submit" name="an" value="提交"   onclick="ce()">&nbsp;&nbsp;&nbsp;&nbsp;<a href="kuang2.jsp"   target="_blank">返回</a><td></tr>
</table>
</form>
</body>
</html>