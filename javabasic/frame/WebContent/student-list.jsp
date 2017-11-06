<%@ page language="java" import= "java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import= "model.*"%>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
    <% List<Student> list = new ArrayList<Student>();
       list = (List<Student>) request.getAttribute("studentList");%>
	<form action="student/list.action" method="post">
	  <table width="500px" height="600px">
	  <%for(Student s : list){%>
	    <tr>
	      <td><%=s.getId() %></td>
	      <td><%=s.getName() %></td>
	      <td><%=s.getSex() %></td>
	      <td><%=s.getStunumber() %></td>
	    </tr>
	  <%}%>
	    </c:forEach>
	  </table>
      <input type="submit" value="测试">
	</form>
</body>
</html>