<%@ page language="java"  import="java.util.*,java.sql.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ page import="db.DB" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
         String username;
         String number="";
         int h=0;
         Connection   c=DB.getconnection();
         Connection   c1=DB.getconnection();
         Connection   c2=DB.getconnection();
         Connection   c3=DB.getconnection();
         Connection   c5=DB.getconnection();
         Statement s5=c5.createStatement();
         Statement s1=c1.createStatement();
         Statement s=c.createStatement();
         Statement s2=c2.createStatement();
         Statement s3=c3.createStatement();
         String sql3="select * from guan";
         ResultSet r2=s2.executeQuery(sql3);
         String sql5="select * from stu";
         ResultSet r5=s5.executeQuery(sql3);
         r5.last();
         h=r5.getRow();
         r2.last();
         int g=1;
         int c4=r2.getRow();
         if(h>c4)
         {
        	 while(g<=h)
        	 {
        		 
        	 }
         }
         if(c4>0)
         {

             String sql="select username,number from  stu";
             
             ResultSet r=s.executeQuery(sql);
             r.last();
            
             int a=r.getRow();
             int b=1;
             r.absolute(1);
             while(b<=a)
             {
            	 username=r.getString("username");
            	 //out.println(username);
                 number=r.getString("number");
                 String t="";
                 t=Integer.toString(b);
                 t=request.getParameter(t);
                 //out.println(t);
                  String sql2="update guan   set   username='"+username+"',number='"+number+"',password='"+t+"'   where  number='"+number+"'";
                   s3.executeLargeUpdate(sql2);
                 //s1.executeUpdate(sql2);   
                 b++;  
                 r.next();
         }
         }
             else
             {
         String sql="select username,number from  stu";
         
         ResultSet r=s.executeQuery(sql);
         r.last();
        
         int a=r.getRow();
         int b=1;
         r.absolute(1);
         while(b<=a)
         {
        	 username=r.getString("username");
        	 //out.println(username);
             number=r.getString("number");
             String t="";
             t=Integer.toString(b);
             t=request.getParameter(t);
             //out.println(t);
            // String sql2="update guan   set   username='"+username+"',number='"+number+"',password='"+t+"'";
               String sql2="insert  guan  values(?,?,?)";
               PreparedStatement p=c1.prepareStatement(sql2);
               p.setString(1,username);
               p.setString(2,number);
               p.setString(3,t);
               p.execute();
             out.println("yu");
             //s1.executeUpdate(sql2);   
             b++;  
             r.next();
             %>
        <%}
             }c.close();
             c1.close();
             c2.close();
             c3.close();
             request.getRequestDispatcher("xuesheng.jsp").forward(request, response);
           %>
</body>
</html>