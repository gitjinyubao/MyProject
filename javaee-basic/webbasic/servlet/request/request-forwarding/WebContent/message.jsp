<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>message</title>
</head>
<body>
  ${data}<!-- 从四个域中取出数据 -->
  <br />
  <%
  	String data = (String) request.getAttribute("data");
    out.print(data);
  %>
</body>
</html>