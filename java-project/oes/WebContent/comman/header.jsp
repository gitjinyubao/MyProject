<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.augmentum.oes.model.User" %>
<%@ page import="com.augmentum.oes.Constants" %>
<%@ page import="com.augmentum.oes.util.PropertyUtil" %>
<link href="<%=PropertyUtil.getStaticUrl() %>/static/style/reset.css" rel="stylesheet" type="text/css" />
<link href="<%=PropertyUtil.getStaticUrl() %>/static/style/questions/header_que.css" rel="stylesheet" type="text/css" />
<% User user = (User)session.getAttribute("user"); %>
<div class="header">
  <div class="header-head">
    <div class="header-head-title">
      <div>
        Online Exam Web System
      </div>
    </div>
    <div class="header-head-language">
                     中文
    </div>
    <div class="header-head-userInformation">
      <div class="user-logout">
        <a href="<%=request.getContextPath()%>/user/logout">Logout</a>
      </div>
      <div class="user-name">
        <%=user.getUserName() %>
      </div>
      <div class="user-picture">
        <img src="<%=PropertyUtil.getStaticUrl() %>/static/style/images/ICN_Web_PersonalInformation_20x20.png">
      </div>
    </div>
  </div>

  <div class="header-main">
    <div class="question">
      <a href="show">Question Management</a>
    </div>
    <div class="exam">
      <a href="#">Exam Management</a>
    </div>
  </div>
</div>
