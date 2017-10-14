<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.augmentum.oes.model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.augmentum.oes.model.Questions" %>
<%@ page import="com.augmentum.oes.model.Pagination" %>
<%@page import="com.augmentum.oes.util.StringUtil"%>
<%@ page import="com.augmentum.oes.Constants" %>
<%@ taglib uri="/WEB-INF/block.tld" prefix="block" %>
<%@ page import="com.augmentum.oes.util.PropertyUtil" %>
<!DOCTYPE html>
<html>
  <head>
  <% String urlHeader = PropertyUtil.getStaticUrl(); %>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Edit question page</title>
  <link href="<%=PropertyUtil.getStaticUrl() %>/static/style/reset.css" rel="stylesheet" type="text/css" />
  <link href="<%=PropertyUtil.getStaticUrl() %>/static/style/questions/exit.css" rel="stylesheet" type="text/css" />
  <script lang="JavaScript" src="<%=PropertyUtil.getStaticUrl() %>/static/js/resources/jquery-1.10.2.min.js"></script>
  <script lang="JavaScript" src="<%=PropertyUtil.getStaticUrl() %>/static/js/comman/judge-int.js"></script>
  <script lang="JavaScript" src="<%=PropertyUtil.getStaticUrl() %>/static/js/questions/edit.js"></script>
  </head>
  <body>
    <% Pagination pagination = (Pagination)request.getAttribute("pagination");
    String keyWord = (String) request.getAttribute("keyWords"); %>
    <input type="hidden" id="urlHeader" value="<%=urlHeader %>">
    <div id="mainBody" class="mian" onload="getUrlHeader()">
      <jsp:include page="/comman/header.jsp"></jsp:include>

      <div class="middle">
        <div class="middle-main">
          <div class="middle-head">
            <input id="keyWord" class="searchInput" name="keyWord" type="text" placeholder="Please input the keyword" value="<%=keyWord %>" />
            <img onclick="fuzzSearch()" class="searchImg" alt="" src="<%=urlHeader %>/static/style/images/ICN_Search_15x20.png" />
          </div>

          <block:display name="leftInfoBlock"/>

          <div class="middle-right">
            <div class="middle-right-main">
              <div class="navigation">
                <div class="id-sequence">
                  ID
                  <% if(pagination.getOrderId() == 0) { %>
                    <img id="orderIdImg" src="<%=urlHeader %>/static/style/images/ICN_Increase_10x15.png" onclick="orderId()" />
                  <% } else {%>
                    <img id="orderIdImg" src="<%=urlHeader %>/static/style/images/ICN_Decrese_10x15.png" onclick="orderId()" />
                  <% } %>
                </div>
                <div class="front-description">
                  Description
                </div>
                <div class="edit">
                  Edit
                </div>
                <% List<Questions> questions = new ArrayList<Questions>();
                   questions = (List<Questions>) request.getAttribute("questions");
                   int length = questions.size();
                %>
                <div class="select-all" align="center">
                  <img id="selectAll" src="<%=urlHeader %>/static/style/images/ICN_Unselected_15x15.png" onclick="changeSrc('selectAll', <%=length %>)" />
                </div>
              </div>
              <form id="batchDelete" action="delete" method="post">
                <input type="hidden" name="deleteId" id="deleteId" />
                <input type="hidden" name="orderId" value="<%=pagination.getOrderId() %>"/>
                <input type="hidden" id="psn" name="pageSizeNow" value="" />
                <input name="currentPage" type="hidden" value="<%=pagination.getCurrentPage() %>" />
                <input name="pageSize" type="hidden" value="<%=pagination.getPageSize() %>" />
                <input id="keyWord" name="keyWord" type="hidden" value="<%=keyWord %>" />
                <input id="queNumTotal" type="hidden" value="<%=questions.size() %>">
                <% for (int i = 0; i < questions.size(); ++i) { %>
                <div class="quest-list">
                  <div class="id-front-number">
                    <%=i+1 %>
                  </div>
                  <div class="id-number">
                    <%=questions.get(i).getIdNumber() %>
                    <input id="a<%=i %>" type="hidden" name="<%=i%>" value="<%=questions.get(i).getId() %>" />
                  </div>
                  <div class="description">
                    <a href="details?updateId=<%=questions.get(i).getId() %>&way=details"><%= questions.get(i).getQueTitle() %></a>
                  </div>
                  <div class="pencile">
                    <a href="details?updateId=<%=questions.get(i).getId() %>&way=edit"><img alt="" src="<%=urlHeader %>/static/style/images/ICN_Edit_15x15.png" /></a>
                  </div>
                  <div class="selection-box">
                    <img id="<%=i %>" src="<%=urlHeader %>/static/style/images/ICN_Unselected_15x15.png" onclick="changeSrc(<%=i %>, <%=length %>)" />
                  </div>
                </div>
                <% } %>
              </form>
            </div>
            <div class="paging">
              <div class="paging-navigation">

                <% if (pagination.getCurrentPage() <= 1) { %>
                <div class="img-navigation-left">
                  <img src="<%=urlHeader %>/static/style/images/BTN_PageLeft_20x15.png">
                </div>
                <% } else { %>
                <div class="img-navigation-left">
                  <input type="hidden" id="pageSizeNowUp" value="<%=pagination.getCurrentPage()-1 %>" />
                  <img src="<%=urlHeader %>/static/style/images/BTN_PageLeft_20x15.png" onclick="upOne()">
                </div>
                <% } %>

                <% if (pagination.getCurrentPage() > 1) { %>
                  <div class="number" onclick="goNumberPage('1')">
                    1
                  </div>
                <% } %>

                <% if ((pagination.getCurrentPage() - 3) > 0 && (pagination.getCurrentPage() - 2) != 1) { %>
                  <div class="number">
                    ...
                  </div> 
                <% } %>

                <% if ((pagination.getCurrentPage() - 2) > 0 && (pagination.getCurrentPage() - 2) != 1) { %>
                  <div class="number" onclick="goNumberPage(<%=pagination.getCurrentPage() - 2 %>)">
                    <%=pagination.getCurrentPage() - 2 %>
                  </div> 
                <% } %>

                <% if ((pagination.getCurrentPage() - 1) > 0 && (pagination.getCurrentPage() - 1) != 1) { %>
                  <div class="number" onclick="goNumberPage(<%=pagination.getCurrentPage() - 1 %>)">
                    <%=pagination.getCurrentPage() - 1 %>
                  </div>
                <% } %>

                <div class="currentNumber">
                  <%=pagination.getCurrentPage() %>
                </div>

                <% if ((pagination.getCurrentPage() + 1) <= (pagination.getPageCount() - 1)) { %>
                  <div class="number" onclick="goNumberPage(<%=pagination.getCurrentPage() + 1 %>)">
                    <%=pagination.getCurrentPage() + 1 %>
                  </div>
                <% } %>

                <% if ((pagination.getCurrentPage() + 2) < (pagination.getPageCount())) { %>
                  <div class="number" onclick="goNumberPage(<%=pagination.getCurrentPage() + 2 %>)">
                    <%=pagination.getCurrentPage() + 2 %>
                  </div>
                <% } %>

                <% if ((pagination.getCurrentPage() + 3) < (pagination.getPageCount())) { %>
                  <div class="number">
                    ...
                  </div>
                <% } %>

                <% if (pagination.getCurrentPage() < pagination.getPageCount()) { %>
                  <div class="number" onclick="goNumberPage(<%=pagination.getPageCount() %>)">
                    <%=pagination.getPageCount() %>
                  </div>
                <% } %>

                <% if (pagination.getCurrentPage() < pagination.getPageCount()) { %>
                <div class="img-navigation-right">
                  <input type="hidden" id="pageSizeNowDown" value="<%=pagination.getCurrentPage()+1 %>" />
                  <img src="<%=urlHeader %>/static/style/images/BTN_PageRight_20x15.png" onclick="nextOne()" />
                </div>
                <% } else { %>
                <div class="img-navigation-right">
                  <input type="hidden" id="currentPage" value="<%=pagination.getCurrentPage()+1 %>" />
                  <img src="<%=urlHeader %>/static/style/images/BTN_PageRight_20x15.png" />
                </div>
                <% } %>

                <div class="text-go-page">
                  <form id="goPage" action="show" method="post">
                    <div class="box-navigation">
                      <input type="hidden" name="keyWord" value="<%=keyWord %>" />
                      <input type="hidden" name="orderId" id="orderId" value="${pagination.orderId}"/>
                      <input type="hidden" name="pageSize" id="pageSize" value="${pagination.pageSize}" />
                      <select class="selectPageSize" id="num" onchange="changePageSize()" >

                        <% if (pagination.getPageSize() == 10) {%>
                          <option value="10" selected="selected">10</option>
                          <option value="15">15</option>
                          <option value="5">5</option>
                        <% } %>

                        <% if (pagination.getPageSize() == 15) {%>
                          <option value="10">10</option>
                          <option value="15" selected="selected">15</option>
                          <option value="5">5</option>
                        <% } %>

                        <% if (pagination.getPageSize() == 5) {%>
                          <option value="10">10</option>
                          <option value="15">15</option>
                          <option value="5" selected="selected">5</option>
                        <% } %>

                      </select>
                    </div>
                    <div class="per-page">
                      per page
                    </div>

                    <input name="currentPage" type="text" id="pageNumber" class="page-number" value="${pagination.currentPage}" />
                    <input class="go" type="button" value="Go" onclick="goPageOne()" />
                  </form>
                </div>
              </div>
            </div>
            <div class="delete" onclick="batchDelete()">
              Delete
            </div>
          </div>
        </div>

        <jsp:include page="/comman/footer.jsp"></jsp:include>
      </div>
    </div>
    <div id="dialog" class="deleteDialog">
      <img class="close-dialog" src="<%=urlHeader %>/static/style/images/BTN_Close_16x16.png.png" onclick="closeDialog()" />
      <div class="confirmDeletion">
        Are you sure delete the selected options?
      </div>
      <div class="but">
        <div class="delete-yes" onclick="deleteAll()">
          Yes
        </div>
        <div class="delete-no" onclick="cancelAll()">
          No
        </div>
      </div>
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