<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.augmentum.oes.model.Questions" %>
<%@ page import="com.augmentum.oes.Constants" %>
<%@page import="com.augmentum.oes.util.StringUtil"%>
<%@ page import="com.augmentum.oes.util.PropertyUtil" %>
<!DOCTYPE html>
<html>
  <head>
  <% String urlHeader = PropertyUtil.getStaticUrl(); %>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Questions update page</title>
  <link href="<%=PropertyUtil.getStaticUrl() %>/static/style/reset.css" rel="stylesheet" type="text/css">
  <link href="<%=PropertyUtil.getStaticUrl() %>/static/style/questions/header_que.css" rel="stylesheet" type="text/css">
  <link href="<%=PropertyUtil.getStaticUrl() %>/static/style/questions/footer.css" rel="stylesheet" type="text/css">
  <link href="<%=PropertyUtil.getStaticUrl() %>/static/style/questions/update.css" rel="stylesheet" type="text/css">
  <script lang="JavaScript" src="<%=PropertyUtil.getStaticUrl() %>/static/js/resources/jquery-1.10.2.min.js"></script>
  <script lang="JavaScript" src="<%=PropertyUtil.getStaticUrl() %>/static/js/questions/update.js"></script>

  </head>
  <body>
    <div class="mian">
      <jsp:include page="/comman/header.jsp"></jsp:include>
      <form id="updateQueForm" action="update" method="post">
        <input type="hidden" id="urlHeader" value="<%=urlHeader %>">
        <div class="que-middle">
          <div class="que-middle-head">
            Question Management > Question List > <label>${questions.idNumber}</label>
          </div>
          <div class="que-middle-main">
            <div class="question-id">
              <div class="id-title">
                Question ID:
              </div>
              <div class="id-number">
                <input type="text" name="idNumber" readonly="readonly" value="${questions.idNumber}">
              </div>
            </div>

            <div class="que-th">
              Question:
            </div>
            <div class="question-update">
              <textarea rows="6" cols="68" id="queTitle" name="queTitle">${questions.queTitle}</textarea>
            </div>

            <div class="answer">
              <div class="answer-th">
                Answer:
              </div>
              <div class="answer-content">
                <input type="hidden" name="id" value="${questions.id}" />
                <input type="hidden" id="answer" name="queAnswer" value="${questions.queAnswer}" />
                <div class="content-a"><img id="A" onclick="changeImg('A')" class="radioBut" src="<%=urlHeader %>/static/style/images/BTN_Radio_Unselected_16x16.png.png"><div class="selector">A</div><input id="ansA" class="answ" type="text" name="queA" value="${questions.queA}" /></div>
                <div class="content-b"><img id="B" onclick="changeImg('B')" class="radioBut" src="<%=urlHeader %>/static/style/images/BTN_Radio_Unselected_16x16.png.png"><div class="selector">B</div><input id="ansB" class="answ" type="text" name="queB" value="${questions.queB}" /></div>
                <div class="content-c"><img id="C" onclick="changeImg('C')" class="radioBut" src="<%=urlHeader %>/static/style/images/BTN_Radio_Unselected_16x16.png.png"><div class="selector">C</div><input id="ansC" class="answ" type="text" name="queC" value="${questions.queC}" /></div>
                <div class="content-d"><img id="D" onclick="changeImg('D')" class="radioBut" src="<%=urlHeader %>/static/style/images/BTN_Radio_Unselected_16x16.png.png"><div class="selector">D</div><input id="ansD" class="answ" type="text" name="queD" value="${questions.queD}" /></div>
                <input type="hidden" id="answerNow" value="${questions.queAnswer}">
                <script lang="JavaScript" src="<%=PropertyUtil.getStaticUrl() %>/static/js/comman/answer_radio.js"></script>
              </div>
            </div>

            <div class="button" >
              <input id="way" type="hidden" name="way" value="" />
              <div class="save-but" onclick="update()">
                Save
              </div>
              <div class="cancel-but">
                Cancel
              </div>
            </div>
          </div>
          <jsp:include page="/comman/footer.jsp"></jsp:include>
        </div>
      </form>
    </div>
    <div id="excuteMessage" class="excuteMessage">
      <% String excuMess = (String) request.getAttribute(Constants.MESSAGE);
         if (!StringUtil.isEmpty(excuMess)) {
                out.write(excuMess);
      %>
      <script lang="JavaScript" src="<%=PropertyUtil.getStaticUrl() %>/static/js/comman/message.js"></script>
      <% }%>
    </div>
  </body>
</html>