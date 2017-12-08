<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.augmentum.oes.Constants" %>
<%@ page import="com.augmentum.oes.util.PropertyUtil" %>
<%@ taglib uri="/WEB-INF/block.tld" prefix="block" %>

<!DOCTYPE html>
<html>
  <head>
    <% String urlHeader = PropertyUtil.getStaticUrl(); %>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link href="<%=PropertyUtil.getStaticUrl() %>/static/style/reset.css" rel="stylesheet" type="text/css">
    <link href="<%=PropertyUtil.getStaticUrl() %>/static/style/login.css" rel="stylesheet" type="text/css">
    <script lang="JavaScript" src="<%=PropertyUtil.getStaticUrl() %>/static/js/resources/jquery-1.10.2.min.js"></script>
    <script lang="JavaScript" src="<%=PropertyUtil.getStaticUrl() %>/static/js/login.js"></script>
  </head>
  <body onkeydown="keyLogin()">
    <% String tipmessage = (String) request.getAttribute(Constants.USER_ERROR_MESSAGE); Map<String, String> errorMap = (Map<String, String>) request.getAttribute(Constants.ERROR_MAP); String visibility = "hidden"; %>

    <% if (tipmessage != null && !(tipmessage.equals(""))) {
        visibility = "visible";
       }
    %>
    <div class="main">
      <input type="hidden" id="urlHeader" value="<%=urlHeader %>" onload="getUrlHeader()">
      <div id="left">
        <div id="logo">
        </div>
        <div id="title">
          Online Exam Web System
        </div>
      </div>

      <div id="login">
        <div class="login">
          Welcome to login!
        </div>
        <div id="login_position">
          <div id="errorInLine" style="visibility: <%=visibility %>" >
            <%=tipmessage %>
          </div>

          <form action="login" method="post" id="loginForm">

            <input type="text" name="userName" id="userName" placeholder="Username" autocomplete="off" autofocus="autofocus" onblur="change('userName', 'usererr')" />
            <img id="usererr" src="<%=PropertyUtil.getStaticUrl() %>/static/style/images/ICN_Client_Login_Wrong_20X20.png" />

            <input type="password" name="password" id="password" placeholder="Password" onblur="change('password', 'passerr')" />
            <img id="passerr" src="<%=PropertyUtil.getStaticUrl() %>/static/style/images/ICN_Client_Login_Wrong_20X20.png" />

            <input id="submitOne" class="loginButton" type="button" value="Login" onclick="login()" />

            <div id="convient">
              <img id="changeImg" alt="" src="<%=PropertyUtil.getStaticUrl() %>/static/style/images/ICN_Unselected_15x15.png" onclick="changeSrc()" />
              <label id="rember">Remember me</label>
              <label id="forget">
                Forgot password?
              </label>
              <input id="remberMe" type="hidden" name="remberMe" value="" />
            </div>

          </form>
        </div>
      </div>

      <div id="footer">
        Copyright &copy 2017 Augmentum Inc. All Rights reserved
      </div>
    </div>
  </body>
</html>