<%@ page language="java" import="java.util.*,java.sql.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%> 
    <%@ page import="db.DB" %>
<%
   request.setCharacterEncoding("utf-8");
%>
<% 
     String Course_number="";
     String Course_time="";
     String Course_name="";
     String Course_fen="";
     String Course_hour="";
     Connection cc=DB.getconnection();
     String number=request.getParameter("number");
     String niu=request.getParameter("an");
     if(number!=null&&niu.equals("查询"))
     {
    	  Statement s=cc.createStatement();
    	  String sql="select * from course where Course_number='"+number+"'";
    	  ResultSet r=s.executeQuery(sql);
    	  if(r.next())
    	  {
    		  Course_number=r.getString("Course_number");
        	  Course_time=r.getString("Course_time");
        	  Course_name=r.getString("Course_name");
        	  Course_fen=r.getString("Course_fen");
        	  Course_hour=r.getString("Course_hour");
    	  }
    	  else
    	  {
    		  out.print("该课程号不存在");
    	  }
    	  s.close();
    	  r.close();
    	  cc.close();
     }
     if(niu!=null&&niu.equals("添加"))
     {  
    	
    		 
    	 
    	 Course_number=request.getParameter("Course_number");
    	 Course_time=request.getParameter("Course_time");
    	 Course_name=request.getParameter("Course_name");		 
    	 Course_fen=request.getParameter("Course_fen");	 
    	 Course_hour=request.getParameter("Course_hour");		 
    			 
    	 Statement s=cc.createStatement();
	     String sql="select * from course where Course_number='"+Course_number+"'";
	     ResultSet r=s.executeQuery(sql); 
	     if(Course_number!=""&&Course_name!=""&&Course_time!=""&&Course_hour!=""&&Course_fen!="")
	     {
    	 if(!(r.next()))
    	 {
    		   String sql2="insert course values(?,?,?,?,?)";
    	    	PreparedStatement  p=cc.prepareStatement(sql2);
    	    	p.setString(1, Course_number);
    	    	p.setString(2,Course_name );
    	    	p.setString(3, Course_time );
    	    	p.setString(4,Course_hour);
    	    	p.setString(5,Course_fen);
    	    	p.execute();
    	    	r.close();
    	    	p.close(); 
    	    	out.print("课程添加成功");
    	 }	  
    	 else
    	 {
    		 out.print("该课程号已经存在");
    	 }
	     }
	     else
	     {
	    	 out.print("请完善课程信息再进行保存添加");
	     }
    	 cc.close();
     }
     if(niu!=null&&niu.equals("删除"))
     {
    	 Course_number=request.getParameter("Course_number");
    	 Statement s=cc.createStatement();
	     String sql="select * from course";
	     ResultSet r=s.executeQuery(sql); 
    	 if((r.next()))
    	 {
    	 String sql2="delete from course where  Course_number='"+Course_number+"'";
    	 Statement ss=cc.createStatement();
    	 ss.executeUpdate(sql2);
    	 ss.close();
    	 out.print("删除成功");
    	 }
    	 else
    	 {
    		 out.print("该课程号不存在");
    	 }
    	 r.close();
    	 cc.close();	 
     }
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link  href="jin/style.css" rel="stylesheet"  type="text/css"  />
<title>Insert title here</title>
 
<style>
</style>
</head>
<body>
<p align="center">课程信息录入</p>
<form action="course.jsp" method="post">
<div align="right">
课程号&nbsp;&nbsp;<input type="text" name="number"  value="">&nbsp;&nbsp;<input type="submit" name="an" value="查询">
</div>
<table align="center" border=1 width="750px">
<tr align="center">
<td>
课程号
</td>
<td>
<input type="text"  name="Course_number" value=<%=Course_number %>>
</td>
<td>
学期
</td>
<td>
<select name="Course_time">
<option value="第一学期"<%=Course_time.equals("第一学期")?"selected":"" %>>第一学期</option>
<option value="第二学期"<%=Course_time.equals("第二学期")?"selected":"" %>>第二学期</option>
<option value="第三学期"<%=Course_time.equals("第三学期")?"selected":"" %>>第三学期</option>
<option value="第四学期"<%=Course_time.equals("第四学期")?"selected":"" %>>第四学期</option>
<option value="第五学期"<%=Course_time.equals("第五学期")?"selected":"" %>>第五学期</option>
<option value="第六学期"<%=Course_time.equals("第六学期")?"selected":"" %>>第六学期</option>
<option value="第七学期"<%=Course_time.equals("第七学期")?"selected":"" %>>第七学期</option>
<option value="第八学期"<%=Course_time.equals("第八学期")?"selected":"" %>>第八学期</option>
</select>
</td>
</tr>
<tr align="center">
<td>
课程名
</td>
<td>
<input type="text"  name="Course_name" value=<%=Course_name%>>
</td>
<td>
学分
</td>
<td>
<select name="Course_fen">
<option value="1个学分"<%=Course_fen.equals("1个学分")? "selected" :"" %>>1个学分</option>
<option value="2个学分"<%=Course_fen.equals("2个学分")? "selected" :"" %>>2个学分</option>
<option value="3个学分"<%=Course_fen.equals("3个学分")? "selected" :"" %>>3个学分</option>
<option value="4个学分"<%=Course_fen.equals("4个学分")? "selected" :"" %>>4个学分</option>
<option value="5个学分"<%=Course_fen.equals("5个学分")? "selected" :"" %>>5个学分</option>
</select>
</td>
</tr>
<tr align="center">
<td>
学时
</td>
<td>
<input type="text"   name="Course_hour"  value=<%=Course_hour %>>
</td>
<td>
<input  type="submit"  name="an"  value="添加"  >
</td>
&nbsp;&nbsp;&nbsp;
<td>
<input type="submit"  name="an" value="删除">
</td>
</tr>
</table>
<hr>
<p>
<center>
显示所有课程表的记录
<table align="center" border=1  width="777px">
<tr bgcolor="#808080" style="font-color:width;">
<th>
课程号
</th>
<th>
课程名
</th>
<th>
学期
</th>
<th>
学时
</th>
<th>
学分
</th>
</tr>
<%
      int pageSize=6;
      int sumPage;
      int currentPage;
      int rowCount;
      String browerPage;
      browerPage=request.getParameter("page");
      int i;
      if( browerPage==null)
      {
    	  currentPage=1;  
      }
      else
      {
    	  currentPage=Integer.parseInt(browerPage);
    	  if( currentPage<1)
    	  {
    		  currentPage=1;
    	  }
      }
      Connection c=DB.getconnection();
      Statement s=c.createStatement();
      String sql="select * from  course";
      ResultSet r=s.executeQuery(sql);
      r.last();
      rowCount =r.getRow();
      sumPage=( rowCount+pageSize-1)/pageSize;
      if(currentPage>sumPage)
      {
    	  currentPage=sumPage;
      }
      if(sumPage>0)
      {
    	  i=0;
    	  r.absolute((currentPage-1)*pageSize+1);
      %>
      <% 
         while(i<pageSize&&!r.isAfterLast())
         {
      %>
      <tr align="center">
      <td>
      <%=r.getString("Course_number") %>
      </td>
      <td>
      <%=r.getString("Course_name") %>
      </td>
      <td>
      <%=r.getString("Course_time")%>
      </td>
      <td>
      <%=r.getString("Course_hour") %>
      </td>
      <td>
      <%=r.getString("Course_fen") %>
      </td>
      </tr> 
      <% 
      r.next();
      ++i;
         }
      }
      %>
</table>
</center>
<hr size="2">
<div align="center">
第<%=currentPage%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;共<%=sumPage%>&nbsp;&nbsp;&nbsp;
<% 
if(currentPage<sumPage)
{%>
<a href="course.jsp?page=<%=currentPage+1 %>">下一页</a>&nbsp;
 <% }%>
 <%
 if(currentPage>1)	 
{%>
<a href="course.jsp?page=<%=currentPage-1 %>">上一页</a>
<%} %>
<% 
s.close();
r.close();
c.close();
   %>
</div>
</form>
</body>
</html>