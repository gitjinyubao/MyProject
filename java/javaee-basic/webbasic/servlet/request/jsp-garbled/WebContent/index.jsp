<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!-- charset=utf-8:网页编码类型；pageEncoding="UTF-8": 网页编程语言,设置JSP编译成Servlet时使用的编码。  -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"><!-- 告诉浏览器本文件需要使用utf-8编码打开 -->
<title>garbled(解决乱码问题)</title>
</head>
<body>
  <form action="Garbled" method="post">
         用户名：<input type="text" name="username"> <br />
    <input type="submit" value="ok"> <br />
  </form>
  
  <form action="Garbled" method="get">
         用户名：<input type="text" name="username"> <br/>
    <input type="submit" value="ok"> <br />
  </form>
  
  <!-- 超链接提交的中文，服务器想不乱码，也只能手工处理 -->
  <a href="Garbled?country=中国">点点</a>
</body>
</html>