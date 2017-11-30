<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="com.augmentum.oes.model.Questions"%>
<%@page import="com.augmentum.oes.util.StringUtil"%>
<%@ page import="com.augmentum.oes.Constants" %>
<%@ page import="com.augmentum.oes.util.PropertyUtil" %>
<!DOCTYPE html>
<html>
  <head>
  <%
     String urlHeader = PropertyUtil.getStaticUrl();
  %>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Create questions title</title>
  <link href="<%=PropertyUtil.getStaticUrl() %>/static/style/reset.css" rel="stylesheet" type="text/css">
  <link href="<%=PropertyUtil.getStaticUrl() %>/static/style/questions/header_que.css" rel="stylesheet" type="text/css">
  <link href="<%=PropertyUtil.getStaticUrl() %>/static/style/questions/footer.css" rel="stylesheet" type="text/css">
  <link href="<%=PropertyUtil.getStaticUrl() %>/static/style/questions/create.css" rel="stylesheet" type="text/css">
   <script lang="JavaScript" src="<%=PropertyUtil.getStaticUrl() %>/static/js/resources/jquery-1.10.2.min.js"></script>
  <script lang="JavaScript" src="<%=PropertyUtil.getStaticUrl() %>/static/js/questions/create.js"></script>

  </head>
  <body>
    <input type="hidden" id="urlHeader" value="<%=urlHeader %>">
    <div class="mian">
      <% String idNumber = (String) request.getAttribute("idNumber");
         Questions questions = (Questions) request.getAttribute("questions");
         if (StringUtil.isEmpty(idNumber)) {
             idNumber = questions.getIdNumber();
         }
         String queTitle = questions.getQueTitle() == null ? "" :questions.getQueTitle(); 
         String queA = questions.getQueA() == null ? "" :questions.getQueA();
         String queB = questions.getQueB() == null ? "" :questions.getQueB(); 
         String queC = questions.getQueC() == null ? "" :questions.getQueC(); 
         String queD = questions.getQueD() == null ? "" :questions.getQueD(); 
         String queAnswer = questions.getQueAnswer() == null ? "" :questions.getQueAnswer(); 
      %>
      <jsp:include page="/comman/header.jsp"></jsp:include>

      <form id="creQueForm" action="save" method="post">
        <div class="que-middle">
          <div class="que-middle-head">
            Question Management > Question List > <%=idNumber %>
          </div>
          <div class="que-middle-main">
            <div class="question-id">
              <div class="id-title">
                Question ID:
              </div>
              <div class="id-number">
                <input type="text" name="idNumber" value="<%=idNumber %>" readonly="readonly">
              </div>
            </div>

            <div class="que-th">
              Question:
            </div>
            <div class="question-update">
              <textarea id="queTitle" rows="6" cols="68" name="queTitle"><%=queTitle %></textarea>
            </div>

            <div class="answer">
              <div class="answer-th">
                Answer:
              </div>
              <div class="answer-content">
                <div class="content-a"><img id="A" onclick="changeImg('A')" class="radioBut" src="<%=urlHeader %>/static/style/images/BTN_Radio_Unselected_16x16.png.png"><div class="selector">A</div><input class="answ" type="text" id="ansA" name="queA" placeholder ="Please input the answer" value="<%=queA %>" required="required" /></div>
                <div class="content-b"><img id="B" onclick="changeImg('B')" class="radioBut" src="<%=urlHeader %>/static/style/images/BTN_Radio_Unselected_16x16.png.png"><div class="selector">B</div><input class="answ" type="text" id="ansB" name="queB" placeholder="Please input the answer" value="<%=queB %>" required="required" /></div>
                <div class="content-c"><img id="C" onclick="changeImg('C')" class="radioBut" src="<%=urlHeader %>/static/style/images/BTN_Radio_Unselected_16x16.png.png"><div class="selector">C</div><input class="answ" type="text" id="ansC" name="queC" placeholder="Please input the answer" value="<%=queC %>" required="required" /></div>
                <div class="content-d"><img id="D" onclick="changeImg('D')" class="radioBut" src="<%=urlHeader %>/static/style/images/BTN_Radio_Unselected_16x16.png.png"><div class="selector">D</div><input class="answ" type="text" id="ansD" name="queD" placeholder="Please input the answer" value="<%=queD %>" required="required" /></div>
                <input type="hidden" id="answerNow" name="queAnswer" value="<%=queAnswer %>" />
                <script lang="JavaScript" src="<%=PropertyUtil.getStaticUrl() %>/static/js/comman/answer_radio.js"></script>
              </div>
            </div>

            <div class="button">
              <input id="way" type="hidden" name="way" value="" />
              <% if (Constants.SUCCESS_MESSAGE.equals(request.getAttribute(Constants.MESSAGE))) { %>
              <div class="create-but">
                Create
              </div>
              <% } else { %>
              <div class="create-but" onclick="create()">
                Create
              </div>
              <% } %>
              <div class="cancel-but" onclick="cancel()">
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