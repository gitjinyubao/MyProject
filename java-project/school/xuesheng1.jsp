<%@ page language="java"  import="java.util.*,java.sql.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="db.DB" %>
    <% 
      request.setCharacterEncoding("utf-8"); 
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
<%
   String username="";
   String number="";
   String password="";
   String number1=request.getParameter("number1");
   String number2=request.getParameter("number2");
   String niu=request.getParameter("an");
   if(number1!=null&&niu.equals("结束"))
   {
	  
	   //request.getRequestDispatcher("admin.jsp").forward(request, response);
	   response.sendRedirect("admin.jsp");
   }
   if(number1!=null&&niu.equals("查询"))
   {
       number=request.getParameter("number").trim();
	   Connection cc=DB.getconnection();
 	   Statement s=cc.createStatement();
 	   String sql="select * from guan where number='"+number1+"'";
 	   ResultSet r=s.executeQuery(sql);
 	   if(r.next())
 	   {
 		  
 		   username=r.getString("username");
 		   number=r.getString("number");
 		   password=r.getString("password");
 		   
 		   r.close();
 	   }
 	   else
 	   {
 		   out.print("该学生不存在，请重新输学号或者重新登学生信息");
 	   }
   } 
   if(number1!=null&&niu.equals("添加"))
   {
	   password=request.getParameter("password");
	   username=request.getParameter("username");
	   number=request.getParameter("number");
	   Connection cc=DB.getconnection();
 	   Statement s=cc.createStatement();
 	   String sql="select * from stu where number='"+number+"'";
 	   ResultSet r=s.executeQuery(sql);
	   if(r.next())
	   {
	   if(number.length()==10)
	   {
		   Connection cc1=DB.getconnection();
		   Statement s1=cc1.createStatement();
		   String sql4="select * from guan where number='"+number+"'";
		   out.print(number);
		   ResultSet r4=s.executeQuery(sql4);
		   if(r4.next())
		   {
			   String sql2="update guan set password='"+password+"' where  number='"+number+"'";
			   s.executeUpdate(sql2);
	 		 
		       out.print("更新成功");
		   }
		   else
		   {
			   if(username!=""&&number!=""&&password!="")
			   {
			   String sql3="insert guan values(?,?,?)";
			   PreparedStatement p=cc.prepareStatement(sql3);
			  
			   p.setString(1, request.getParameter("username"));
			   p.setString(2, request.getParameter("number"));
			   p.setString(3, request.getParameter("password"));
			   
			   p.execute();
		       p.close();
		       out.print("插入成功");
			   }
			   else
			   {
				   out.print("请完成全部的信息输入，方可进行添加成员");
			   }
		   }
		   cc.close();
		   cc1.close();
	   } 
	   else
	   {
		   out.print("请输入学号的正确格式");
	   }
   }
	   else
	   {
		   out.print("学生中没有此人");
	   }   
   }
  if(number2!=null&&niu.equals("删除"))
   {
	  String sql3="delete from guan where   number='"+number2+"'";
	   Connection cc=DB.getconnection();
 	   Statement s=cc.createStatement();
 	   s.executeUpdate(sql3);
 	  cc.close();	   
   }
%>
<body>
<body >
   <form  name="stuform"  action="xuesheng1.jsp"  method="post" >
   <h2 align="center">学生登记初始化</h2>
 <p align="right">
学号<input type="text" value="" name="number1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit"  name="an" value="查询">
  </p>
  <hr boder=2>
   <table align="center"   border="1" width="1280px" height="180px">
   <font size="+2">
   <tr>
   <th  colspan="2" align="left"> 
 初始化信息区 
   </th>
   </tr>
   <tr>
   <td>
   姓名：&nbsp;&nbsp;
   </td>
   <td>
   <input type="text"  name="username"  value="<%=username %>">
   </td>
   <td align="left">
   学号:&nbsp;&nbsp;
   </td>
   <td>
   <input type="text"  name="number"  value="<%=number %>" >
   </td>
   </tr>
   <tr>
   <td align="left">
密码:&nbsp;&nbsp;
   </td>
   <td>
    <input type="text"  name="password"  value="<%=password%>" >
   </td>
   <td>
 <input type="submit"  name="an"  value="添加" >
   </td>
    <td>
 <input type="submit"  name="an"  value="结束" >
   </td>
   </tr>
   </font>
   </table> 
   <br>
    <P align="right"> 学号&nbsp;&nbsp;<input type="text"  name="number2"  value="" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit"  name="an"  value="删除" ></P>
    <hr>
     <div align="center">
    <table border="2"   width="1280px">
    <tr align="center">
    <th>序号</th><th>姓名</th><th>学号</th><th>密码</th>
    </tr>
    <%
            int sumrow;
            int sumpage;
            int i;
            int pagesize=4;
            int currentpage;
            String  strpage;
          
            strpage=request.getParameter("page");
            
            if(strpage==null)
            {
            	currentpage=1;
            }
            else
            {
            	currentpage=Integer.parseInt(strpage);
            	if(currentpage<1)
            	{
            		
            		currentpage=1;		
            	}
            }
            Connection cc2=DB.getconnection();
 		    Statement s3=cc2.createStatement();
 		    String sql5="select * from guan ";
 		    ResultSet r4=s3.executeQuery(sql5);
 		    r4.last();
 		    sumrow=r4.getRow();	    
 		    out.print(sumrow);	    
 		    sumpage=(sumrow+pagesize-1)/pagesize;
 		    if(currentpage>sumpage)
 		    {
 		    	currentpage=sumpage;
 		    }
 		    if(sumpage>0)
 		    { 
 		    	i=1;
 		    	 r4.absolute((currentpage-1)*pagesize+1);	    	
 		    	while(i<=pagesize&&!r4.isAfterLast())
 		    	{%>
 		    		<tr align="center">
 		    		<td><%=r4.getRow()%></td>
 		    		<td><%=r4.getString("username") %></td>
 		    		<td><%=r4.getString("number") %></td>
 		    		<td><%=r4.getString("password")%></td>
 		    		</tr>
 		    	<% r4.next();++i;}
 		    } 
 		    cc2.close();
    %>
    </table>
    
    <p align="center">第<%=currentpage%>&nbsp;&nbsp;&nbsp;&nbsp;共<%=sumpage %>
    &nbsp;&nbsp;&nbsp;&nbsp;<% 
    if(currentpage<sumpage)
    {
    	%>
    	<a href="xuesheng1.jsp?page=<%=currentpage+1 %>">下一页</a>
    	<% 
    }if(currentpage>1)
    {
    %>
    <a  href="xuesheng1.jsp?page=<%=currentpage-1 %>">上一页</a>
    <%} %> 
    </div>
   </form>
</body>
</html>