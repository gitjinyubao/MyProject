<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
  <!-- url后面如果跟的中文数据，要编码后再提交（修改tomcat的配置文件） -->
  <a href="CheckBox?country=中国" >点击</a>
  <form action="CheckBox" method="post">
    <input type="checkbox" name="likes" value="a">A
    <input type="checkbox" name="likes" value="b">B
    <input type="checkbox" name="likes" value="c">C
    <input type="checkbox" name="likes" value="d">D <br>
    <input type="submit" value="submit">
  </form>
</body>
</html>