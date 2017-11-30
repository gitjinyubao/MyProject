<%@ page language="java"  import="java.util.*,java.sql.*"  contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ page import="db.DB" %>
     <%@ page import="entitty.course"%>
     <% 
        request.setCharacterEncoding("utf-8");
     %>
     <jsp:useBean  id="cou"  class="entitty.course"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
      String Course_number1="";
      String Course_fen="";
      String m="";
      String g="";
      String number="";
      String course_name=(String)session.getAttribute("Course_name");
      String grade=(String)session.getAttribute("number1");
      String classs=(String)session.getAttribute("number");
      String num=(String)session.getAttribute("num");
      int a=Integer.valueOf(num);
      out.print(a);
      //int b=Integer.parseInt(num);
    
     String numbersum [] =new String[a];
     //String i=Integer.toString(1);
      String i1=Integer.toString(4);
     // String g=request.getParameter(i); 
      String g1=request.getParameter(i1); 
      //out.print(g);  
      Connection c=DB.getconnection();
      Statement s=c.createStatement();
      String sql3="insert chengji values(?,?,?,?)";
      PreparedStatement p=c.prepareStatement(sql3);
%>
<%
             String sql="select Course_number,Course_fen from course where Course_name='"+course_name+"' ";
             ResultSet r=s.executeQuery(sql);
             if(r.next())
             {
            	 Course_number1=r.getString("Course_number");
            	 Course_fen=r.getString("Course_fen");
             } 
             String  sql2="select  number from stu where number like '"+grade+classs+"%' ";
             ResultSet r1=s.executeQuery(sql2);
             int i=0;
             r1.absolute(1);
             String number3;
             while(i<a)
             {
            	    number3=r1.getString("number");  
            	    numbersum[i]=number3;
            	    
            	    ++i;
            	    r1.next();   	            
             }
%>
<%
            String sql4="insert chengji  values(?,?,?,?)";
            int v=0;
            while(v<a)
            {
            	String number5="";
            	number5=numbersum[v];
            	String t;
            	t=Integer.toString((v+1));
            	t=request.getParameter(t);
            	
            	
            	sql4="insert chengji  values(?,?,?,?)";
            	PreparedStatement p1=c.prepareStatement(sql4);
            	p1.setString(1,number5);
            	p1.setString(2,Course_number1);
            	p1.setString(3,t);
            	p1.setString(4,Course_fen);
            	p1.execute();
            	++v;  	
            }
            out.print("录入成功........");
          response.sendRedirect("chengji.jsp");
%>
</body>
</html>