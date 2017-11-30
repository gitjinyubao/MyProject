<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.augmentum.oes.model.Questions" %>
<%@ page import="com.augmentum.oes.util.PropertyUtil" %>
<!DOCTYPE html>
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Questions details page</title>
  <link href="<%=PropertyUtil.getStaticUrl() %>/static/style/reset.css" rel="stylesheet" type="text/css">
  <link href="<%=PropertyUtil.getStaticUrl() %>/static/style/questions/header_que.css" rel="stylesheet" type="text/css">
  <link href="<%=PropertyUtil.getStaticUrl() %>/static/style/questions/footer.css" rel="stylesheet" type="text/css">
  <link href="<%=PropertyUtil.getStaticUrl() %>/static/style/questions/details.css" rel="stylesheet" type="text/css">
  <script lang="JavaScript" src="<%=PropertyUtil.getStaticUrl() %>/static/js/resources/jquery-1.10.2.min.js"></script>
  <script lang="JavaScript" src="<%=PropertyUtil.getStaticUrl() %>/static/js/questions/details.js"></script>
  </head>

  <body>
    <div class="mian">
      <jsp:include page="/comman/header.jsp"></jsp:include>

      <form id="detailsForm" action="details" method="post">
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
                ${questions.idNumber}
              </div>
            </div>

            <div class="question-title-detail">
              <div class="question-th">
                Question:
              </div>
              <div class="question-title">
                ${questions.queTitle}
              </div>
            </div>

            <div class="answer">
              <div class="answer-th">
                Answer:
              </div>
              <div class="answer-content">
                <input type="hidden" id="answer" value="${questions.queAnswer}">
                <div id="A" class="content-a">A ${questions.queA}</div>
                <div id="B" class="content-b">B ${questions.queB}</div>
                <div id="C" class="content-c">C ${questions.queC}</div>
                <div id="D" class="content-d">D ${questions.queD}</div>
                <script lang="JavaScript" src="<%=PropertyUtil.getStaticUrl() %>/static/js/comman/answer_background_color.js"></script>
              </div>
            </div>

            <div class="button">
              <input type="hidden" name="updateId" value="${questions.id}" />
              <input type="hidden" id="way" name="way" value="" />
              <input type="hidden" name="deleteId" id="deleteId" value=${questions.id}>
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