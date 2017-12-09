<%@ page language="java" import="java.util.*,java.sql.*,java.net.*" pageEncoding="utf-8"%>
<%@  page import="java.sql.ResultSet" %>
<%@ page import="entity.Jdbc" %>
<%@ page import="entity.Ji" %>
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
	<style type="text/css">
	*
	{
	     padding: 0;
	     margin: 0;
	}
	 body{
background:url("images/a3.jpg");
-moz-background-size:100% 100%; /* 老版本的 Firefox */
background-size:100% 100%;
background-repeat:no-repeat;
background-origin:content-box;
height:100%;
	 }
	 h1
	 {
	    color:#6FF;
	 }
	 table
	 {
	      color:#6FF;
	      font-size:3em;
	 }
	</style>
  </head>
  <body>
  <% 
      request.setCharacterEncoding("utf-8"); 
    %>
   <%
      String   money=request.getParameter("money");
      String   explain=request.getParameter("explain");
      String   time=request.getParameter("time");
      String   method=request.getParameter("method");
	  if("delete".equals(method))
	  {
		      int id=Integer.parseInt(request.getParameter("id"));  
		      String sql="delete   from    ji   where   id=?";  
              Connection c=Jdbc.getcon();
              PreparedStatement p=c.prepareStatement(sql);
              p.setInt(1,id);
              p.executeUpdate();
			  Jdbc.close1(p);
	  }
      if(money==""||explain==""||time=="")
      {
          response.sendRedirect("bao.jsp");
           
      }
      if(money!=""&& explain!=""&&time!="")
      {
      if(money!=null&& explain!=null&&time!=null)
      {
              int  money1=Integer.parseInt(money);
              Ji   j=new  Ji(money1,explain,time);
              String sql="insert ji(money,explain1,time)   values(?,?,?)";  
              Connection c=Jdbc.getcon();
              PreparedStatement p=c.prepareStatement(sql);
              p.setInt(1,j.getMoney());
              p.setString(2,j.getExplain());
              p.setString(3,j.getTime());
              p.executeUpdate();
			  Jdbc.close1(p);
			  }
      }
    %>
   <center>
   <h1><font  size="+6"   face="隶书">宝贝计划财务明细</font></h1>
   <br></br><br></br><br>
   <table  border="2"   width="100%"  >
   <tr><th><font  size="+2"   face="隶书">序号</font></th><th><font  size="+2"   face="隶书">金额</font></th><th colspan="2"><font  size="+2"   face="隶书">明细</font></th><th colspan="0.9"><font  size="+2"   face="隶书">余额</font></th><th><font  size="+2"   face="隶书">时间</font></th><th><font  size="+2"   face="隶书">操作</font></th></tr>
   <%
            int   sum=0;
            String sql="select   *   from    ji";  
            Connection c=Jdbc.getcon();
            PreparedStatement  p=Jdbc.getcon().prepareStatement(sql);
         	ResultSet r=p.executeQuery();
			while(r.next())
			{
			       sum+=r.getInt("money");
			%>
			 <tr>
			 <td   align="center"><%=r.getRow()%></td>
			 <td   align="center"><%=r.getInt("money")%></td>
			 <td   align="center" colspan="2"><%=r.getString("explain1")%></td>
			 <td   align="center" colspan="0.9"><%=1400-sum%></td>
			 <td   align="center"><%=r.getString("time")%></td>
			 <td   align="center"><a  href="bei.jsp?id=<%=r.getInt("id")%>&method=delete"><font  size="+2"   face="隶书">删除</font></a></td>
			 </tr>
	       <%
			}
			  Jdbc.close1(p, r);
           %>  
   </table>
   </center>
  </body>
</html>
