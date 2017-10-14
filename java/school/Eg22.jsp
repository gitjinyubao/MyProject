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
<title>Insert title here</title>
<script   language=javascript>
<!--
 function ce()
 {
	confirm("确认都填写了吗？");
 }
-->
</script>
<link  href="jin/style.css" rel="stylesheet"  type="text/css"  />
<style>
	
</style>
</head>
<%
   String sex="";
   String username="";
   String birthday="1994-02-06";
   String remarks="团员......";
   String number="";
   String system="";
   String sum="0";
   String number1=request.getParameter("number1");
   String niu=request.getParameter("an");
   if(number1!=null&&niu.equals("确定"))
   {
       number=request.getParameter("number").trim();
	   Connection cc=DB.getconnection();
 	   Statement s=cc.createStatement();
 	   String sql="select * from stu where number='"+number1+"'";
 	   ResultSet r=s.executeQuery(sql);
 	   if(r.next())
 	   {
 		   sex=r.getString("sex");
 		   username=r.getString("username");
 		   number=r.getString("number");
 		   remarks=r.getString("remarks");
 		   birthday=r.getString("birthday");
 		   sum=r.getString("sum");
 		   system=r.getString("system");
 		   r.close();
 	   }
 	   else
 	   {
 		   out.print("该学生不存在，请重新输入学号或者重新登记学生信息");
 	   }
   }
   
   if(number1!=null&&niu.equals("保存"))
   {
	   sex=request.getParameter("sex");
	   username=request.getParameter("username");
	   number=request.getParameter("number");
	   sum=request.getParameter("sum");
	   birthday=request.getParameter("birthday");
	   system=request.getParameter("system");
	   remarks=request.getParameter("remarks");
	   number=request.getParameter("number").trim();
	   if(number.length()==10)
	   {
		   Connection cc=DB.getconnection();
		   Statement s=cc.createStatement();
		   String sql="select * from stu where number='"+number+"'";
		   ResultSet r=s.executeQuery(sql);
		   if(r.next())
		   {
			   String sql2="update stu set sex='"+sex+"',birthday='"+birthday+"',username='"+username+"',number='"+number+"',system='"+system+"',remarks='"+remarks+"',sum='"+sum+"' where number='"+number+"'";
			   s.executeUpdate(sql2);
	 		   r.close();
		        out.print("更新成功");
		   }
		   else
		   {
			  if(sex!=""&&username!=""&&birthday!=""&&system!=""&&sum!=""&&number!=""&&remarks!="")
			  {
			   //String sql3="insert stu(sex,+username,birthday,system+,sum,number,remarks) values('"+sex+"','"+username+"','"+birthday+"','"+system+"','"+sum+"','"+number+"','"+remarks+"')";
			   String sql3="insert stu(sex,username,birthday,system,sum,number,remarks) values(?,?,?,?,?,?,?)";
			   PreparedStatement p=cc.prepareStatement(sql3);
			   p.setString(1, request.getParameter("sex"));
			   p.setString(2, request.getParameter("username"));
			   p.setString(3,  request.getParameter("birthday"));
			   p.setString(4, request.getParameter("system"));
			   p.setString(5, request.getParameter("sum"));
			   p.setString(6, request.getParameter("number"));
			   p.setString(7, request.getParameter("remarks"));
			   
			   p.execute();
		       p.close();
		       out.print("插入成功");
			  }
			  else{
				   out.print("请将信息补充完整方可进行添加成员");
			  }
			  
		   }
		   cc.close();
	   }
	   else
	   {
		   out.print("请输入学号的正确格式");
	   }  
   }
%>
<body>
<body >
   <form  name="stuform"  action="Eg22.jsp"  method="post" >
   <h2 align="center">学生信息登记</h2>
 <p align="right">
学号<input type="text" value="" name="number1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit"  name="an" value="确定">
  </p>
  <hr boder=2>
   <table id="j" align="center" bgcolor=""   border="1" width="740px" height="370px">
   <font size="+2">
   <tr>
   <th  colspan="2" align="left"> 
 个人资料 
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
专业:&nbsp;&nbsp;
   </td>
   <td>
    <select   name="system" size=1>
   <option   value="软件工程"<%=system.equals("软件工程")?"selected":"" %>  >软件工程
   <%//注意value后面的表示 %>
   <option   value="数字媒体"<%=system.equals("数字媒体")?"selected":"" %>>数字媒体
   <option  value="计算机科学" <%=system.equals("计算机科学")?"selected":"" %>>计算机科学
   <option  value="网络工程" <%=system.equals("网络工程")?"selected":"" %>>网络工程
   </select>
   </td>
   <td>
   性别：&nbsp;&nbsp;
   </td>
   <td>
 <input type="radio"  value="男"<%=sex.equals("男")?"checked":"" %> name="sex">男&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio"  value="女"<%=sex.equals("女")?"checked":"" %> name="sex">女
   </td>
   </tr>
   <tr>
   <td align="left">
   出生日期：
   </td>
   <td>
   <input type="text"  name="birthday"  value=<%= birthday%>>
   </td>
   </tr>
   <tr>
   <td align="left" rowspan="2">
   备注：
   </td>
   <td  rowspan="2">
   <textarea    cols="16"    name="remarks"><%=remarks %></textarea>
   </td>
   </tr>
   <tr>
   <td>
   总学分：&nbsp;&nbsp;
   </td>
   <td>
   <input type="text" value=<%=sum %> name="sum">
   </td>
   </tr>
   <tr align="center"> 
   <td colspan="2">
   <input type="submit" name="an"  value="保存"  onclick="ce()">
   </td>
   <td colspan="2">
   <a  href="kuang2.jsp"  target="_blank"><font  size="+2"   color="green">返回</font></a>
   </td>
   </tr>
   </font>
   </table> 
   
   </form>
  </body>
</body>
</html>