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
<script   language=javascript>
<!--
 function ce()
 {
	confirm("确认都填写了吗？");
 }
-->
</script>
<style>
</style>
</head>
<script language=javascript>
<!--
      function ce()
      {
	               if(stuform.username=="")
	            	   {
	            	        alert("请输入姓名");
	            	        document.stuform.elements(0).focus();
	            	   }
	               if(stuform.number=="")
            	   {
           	        alert("请输入学号");
           	        document.stuform.elements(1).focus();
           	   }
	               if(stuform.system=="")
            	   {
            	        alert("请输入专业");
            	        document.stuform.elements(2).focus();
            	   }
	               if(stuform.sex=="")
            	   {
            	        alert("请选择性别");
            	        document.stuform.elements(3).focus();
            	   }
	               if(stuform.birthday="")
            	   {
            	        alert("请输入出生日期");
            	        document.stuform.elements(4).focus();
            	   }
	               if(stuform.remarks=="")
            	   {
            	        alert("请输入备注");
            	        document.stuform.elements(0).focus();
            	   }
	               if(stuform.sum=="")
            	   {
            	        alert("请输入总学分");
            	        document.stuform.elements(0).focus();
            	   }
	               
	               
      }
    
-->
</script>
<%
   String sex="";
   String password="";
   String username="";
   String birthday="1994-02-06";
   String remarks="党员......";
   String number="";
   String system="";
   String xueli="";
   String number1=request.getParameter("number1");
   String number2=request.getParameter("number2");
   String niu=request.getParameter("an");
   Connection cc=DB.getconnection();
   if(number2!=null&&niu.equals("删除"))
   {
          
           Statement s1=cc.createStatement();
           Statement s2=cc.createStatement();
           String  sql3="select * from tea";
           ResultSet  r=s2.executeQuery(sql3);
           if(r.next())
           {
        	   String sql2="delete from tea where number='"+number2+"'";
               s1.executeUpdate(sql2);
               out.print("删除成功");
           }
           else
           {
     	        out.print("没有需要删除的学号");
           }
   }
   
   if(number1!=null&&niu.equals("查询"))
   {
       number=request.getParameter("number").trim();
	  
 	   Statement s=cc.createStatement();
 	   String sql="select * from tea where number='"+number1+"'";
 	   ResultSet r=s.executeQuery(sql);
 	   if(r.next())
 	   {
 		   sex=r.getString("sex");
 		   password=r.getString("password");
 		   username=r.getString("username");
 		   number=r.getString("number");
 		   remarks=r.getString("remarks");
 		   birthday=r.getString("birthday");
 		   xueli=r.getString("xueli");
 		   system=r.getString("system");
 		   r.close();
 	   }
 	   else
 	   {
 		   out.print("该老师不存在，请重新输入工号或者重新登记老师信息");
 	   }
   }
   if(number1!=null&&niu.equals("保存"))
   {
	   sex=request.getParameter("sex");
	   password=request.getParameter("password");
	   username=request.getParameter("username");
	   number1=request.getParameter("number");
	   xueli=request.getParameter("xueli");
	   birthday=request.getParameter("birthday");
	   system=request.getParameter("system");
	   remarks=request.getParameter("remarks");
	   number=request.getParameter("number").trim();
	   if(number.length()==10)
	   { 
		   Statement s=cc.createStatement();
		   String sql="select * from tea where number='"+number+"'";
		   ResultSet r=s.executeQuery(sql);
		   if(r.next())
		   {
			   String sql2="update   tea set sex='"+sex+"',password='"+password+"',birthday='"+birthday+"',username='"+username+"',number='"+number+"',system='"+system+"',remarks='"+remarks+"',xueli='"+xueli+"' where number='"+number+"'";
			   s.executeUpdate(sql2);
	 		   r.close();
		        out.print("更新成功");
		   }
		   else
		   {		
			   if(username!=""&&sex!=""&&password!=""&&birthday!=""&&system!=""&&xueli!=""&&number!=""&&remarks!="")
			   {
			   //String sql3="insert stu(sex,+username,birthday,system+,sum,number,remarks) values('"+sex+"','"+username+"','"+birthday+"','"+system+"','"+sum+"','"+number+"','"+remarks+"')";
			   String sql3="insert tea(sex,password,username,birthday,system,xueli,number,remarks) values(?,?,?,?,?,?,?,?)";
			   PreparedStatement p=cc.prepareStatement(sql3);
			   p.setString(1, request.getParameter("sex"));
			   p.setString(2, request.getParameter("password"));
			   p.setString(3, request.getParameter("username"));
			   p.setString(4,  request.getParameter("birthday"));
			   p.setString(5, request.getParameter("system"));
			   p.setString(6, request.getParameter("xueli"));
			   p.setString(7, request.getParameter("number"));
			   p.setString(8, request.getParameter("remarks")); 
			   p.execute();
		       p.close();
		       out.print("插入成功");		  
			   }
			   else
			   {
				   out.print("请完成全部的输入信息才可以进行添加成员");
			   }
		   }		   
	   }
	   else
	   {
		   out.print("请输入工号的正确格式");
	   }
   }
   if(number1!=null&&niu.equals("结束"))
   {
	   response.sendRedirect("admin.jsp");
   }
   
%>
<body>
<body >
   <form  name="stuform"  action=""  method="post" >
   <h2 align="center">教师信息登记</h2>
 <p align="right">
工号<input type="text" value="" name="number1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit"  name="an" value="查询">
  </p>
  <p align="right">
工号<input type="text" value="" name="number2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit"  name="an" value="删除">
  </p>
  <hr boder=2>
   <table align="center" bgcolor=""  border="1" width="1470px" height="300px">
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
   工号:&nbsp;&nbsp;
   </td>
   <td>
   <input type="text"  name="number"  value="<%=number %>" >
   </td>
   </tr>
   <tr>
   <td align="left">
所在专业:&nbsp;&nbsp;
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
   <td align="left">
  初始密码：
   </td>
   <td>
   <input type="text"  name="password"  value=<%= password%>>
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
 学历：&nbsp;&nbsp;
   </td>
  </td>
   <td>
    <select   name="xueli" size=1>
   <option   value="硕士"<%=system.equals("硕士")?"selected":"" %>  >硕士
   <%//注意value后面的表示 %>
   <option   value="博士"<%=system.equals("博士")?"selected":"" %>>博士
   <option  value="博士后" <%=system.equals("博士后")?"selected":"" %>>博士后
   </select>
   </td>
   </tr>
   <tr align="center"> 
   <td colspan="2">
   <input type="submit" name="an"  value="保存"  onclick="ce()">
   </td>
   <td colspan="2">
   <input type="submit"  name="an"  value="结束">
   </td>
   </tr>
   </font>
   </table> 
   </form>
   
   <br>
   <hr>
  <TABLE ALIGN="center" border=1  width="1470px" >
<TR  ALIGN="center">
<td>序列号</td>
<TD>姓名</TD>
<td>工号</td>
<td>性别</td>
<td>出生日期</td>
<td>所在专业</td>
<td>学历</td>
<td>初始密码</td>
<td>备注</td>
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
   Statement s3=cc.createStatement();
   String sql5="select * from tea ";
   ResultSet r4=s3.executeQuery(sql5);
   r4.last();
   sumrow=r4.getRow();
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
</TR>
<tr ALIGN="center">
<td><%=r4.getRow() %></td>
<td ><%=r4.getString("username") %></td>
<td  ><%=r4.getString("number") %></td>
<td><%=r4.getString("sex")%></td>
<td><%=r4.getString("birthday") %></td>
<td><%=r4.getString("system") %></td>
<td><%=r4.getString("xueli") %></td>
<td><%=r4.getString("password") %></td>
<td><%=r4.getString("remarks") %></td>
</tr>
<%++i;r4.next(); }
}%>
</TABLE>
<hr>
<p align="center">第<%=currentpage%>&nbsp;&nbsp;&nbsp;&nbsp;共<%=sumpage %>
    &nbsp;&nbsp;&nbsp;&nbsp;<% 
    if(currentpage<=sumpage)
    {
    	%>
    	<a href="laoshi.jsp?page=<%=currentpage+1 %>">下一页</a>
    	<% 
    }if(currentpage>1)
    {
    %>
    <a  href="laoshi.jsp?page=<%=currentpage-1 %>">上一页</a>
    <%} %> 
    <%cc.close(); %>
</body>
</html>