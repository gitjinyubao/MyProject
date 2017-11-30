<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.augmentum.oes.model.Questions" %>
<%@ page import="com.augmentum.oes.util.PropertyUtil" %>
<!DOCTYPE html>
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Questions questions page</title>
  <link href="<%=PropertyUtil.getStaticUrl() %>/static/style/reset.css" rel="stylesheet" type="text/css">
  <link href="<%=PropertyUtil.getStaticUrl() %>/static/style/questions/header_que.css" rel="stylesheet" type="text/css">
  <link href="<%=PropertyUtil.getStaticUrl() %>/static/style/questions/footer.css" rel="stylesheet" type="text/css">
  <link href="<%=PropertyUtil.getStaticUrl() %>/static/style/questions/questions.css" rel="stylesheet" type="text/css">
  <script lang="JavaScript" src="<%=PropertyUtil.getStaticUrl() %>/static/js/resources/jquery-1.10.2.min.js"></script>
  <script lang="JavaScript" src="<%=PropertyUtil.getStaticUrl() %>/static/js/questions/question.js"></script>

  </head>
  <body>
    <div class="mian">
      <% Questions questions = (Questions)request.getAttribute("questions"); %>
      <jsp:include page="/comman/header.jsp"></jsp:include>

      <form id="queform" action="details" method="post">
        <div class="que-middle">
          <div class="que-middle-head">
            Question Management > Question List > <label><%=questions.getIdNumber() %></label>
          </div>
          <div class="que-middle-main">
            <div class="question-id">
              <div class="id-title">
                <input type="hidden" name="updateId" value="<%=questions.getId() %>">
                Question ID:
              </div>
              <div class="id-number">
                <%=questions.getIdNumber() %>
              </div>
            </div>

            <div class="question-title-detail">
              <div class="question-th">
                Question:
              </div>
              <div class="question-title">
                <%=questions.getQueTitle() %>
              </div>
              <div class="tab">
                <table class="empty-table" cellspacing="0" cellpadding="0" border="1">
                  <tr>
                    <th class="first" width="60px"></th>
                    <th></th>
                  </tr>
                  <% for(int i = 0; i < 3; i++) { %>
                  <tr>
                    <td></td>
                    <td></td>
                  </tr>
                  <% } %>
                </table>
              </div>
            </div>

            <div class="answer">
              <div class="answer-th">
                Answer:
              </div>
              <div class="answer-content">
                <input type="hidden" id="answer" value="<%=questions.getQueAnswer() %>">
                <div id="A" class="content-a">A <%=questions.getQueA() %></div>
                <div id="B" class="content-b">B <%=questions.getQueB() %></div>
                <div id="C" class="content-c">C <%=questions.getQueC() %></div>
                <div id="D" class="content-d">D <%=questions.getQueD() %></div>
                <script lang="JavaScript" src="<%=PropertyUtil.getStaticUrl() %>/static/js/comman/answer_background_color.js"></script>
              </div>
            </div>

            <div class="button">
              <input type="hidden" id="way" name="way" value="" />
              <input type="hidden" name="deleteId" id="deleteId" value=<%=questions.getId() %>>
              <div class="edit-but" onclick="update()">
                Edit
              </div>
              <div class="delete-but" onclick="deleteQue()">
                Delete
              </div>
            </div>
          </div>

          <jsp:include page="/comman/footer.jsp"></jsp:include>
        </div>
      </form>
    </div>
  </body>
</html>