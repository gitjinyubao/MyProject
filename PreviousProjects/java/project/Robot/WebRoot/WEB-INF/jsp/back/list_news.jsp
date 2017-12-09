<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib   uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <link   >
    <link  href="<%=basePath%>resources/css/all.css"  rel="stylesheet"   type="text/css"> 
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="css/all.css" rel="stylesheet" type="text/css" />
	<script src="resources/js/common/jquery-1.8.0.min.js"></script>
	<script src="resources/js/back/list_news.js"></script>
	<%request.setCharacterEncoding("UTF-8"); %>
	</head>
	<body style="background: #e1e9eb;">
		<form action="<%=basePath%>List.action" id="mainForm" method="post">
			<div class="right">
				<div class="current">当前位置：<a href="javascript:void(0)" style="color:#6E6E6E;">内容管理</a> &gt; 内容列表</div>
				<div class="rightCont">
					<p class="g_title fix">内容列表 <a class="btn03" href="#">新 增</a>&nbsp;&nbsp;&nbsp;&nbsp;<a class="btn03" href="javascript:deleteBatch();">删 除</a></p>
					<table class="tab1">
						<tbody>
							<tr>
								<td width="90" align="right">指令名称</td>
								<td>
									<input type="text" class="allInput"  name="command"/>
								</td>
								<td width="90" align="right">描述</td>
								<td>
									<input type="text" class="allInput"  name="description"/>
								</td>
	                            <td width="85" align="right"><input type="submit" class="tabSub" value="查 询" /></td>
	       					</tr>
						</tbody>
					</table>
					<div class="zixun fix">
						<table class="tab2" width="100%">
							<tbody>
									<tr>
								    <th><input type="checkbox" id="" onclick="#"/></th>
								    <th>序号</th>
								    <th>指令名称</th>
								    <th>描述</th>
								    <th>操作</th>
								</tr>
								
								 <c:forEach  var="message"   items="${listMessage}"   varStatus="status">
								<tr   <c:if test="${status.index%2!=0}">style="background-color:#ECF6EE;"</c:if>>
								<th><input type="checkbox" name="id" onclick="#" value="${message.id}"/></th>
									<td>${status.index+1}</td>
									<td>${message.command}</td>
									<td>${message.description}</td>
									<td>
										<a href="#">修改</a>&nbsp;&nbsp;&nbsp;
										<a href="DeleteOne.action?id=${message.id}">删除</a>
									</td>
								</tr>
								</c:forEach>
							</tbody>
						</table>
						<div class='page fix'>
							共 <b>4</b> 条
							<a href='###' class='first'>首页</a>
							<a href='###' class='pre'>上一页</a>
							当前第<span>1/1</span>页
							<a href='###' class='next'>下一页</a>
							<a href='###' class='last'>末页</a>
							跳至&nbsp;<input type='text' value='1' class='allInput w28' />&nbsp;页&nbsp;
							<a href='###' class='go'>GO</a>
						</div>
					</div>
				</div>
			</div>
	    </form>
	</body>
</html>
