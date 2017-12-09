    <%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
    <html>  
      <head>  
      <title>ajax demo</title>  
      <script type="text/javascript" src="resources/js/index.js"></script>
      </head>  
      <body>  
        <input type="text" name="num1" id="num1"/> <br/>  
        <input type="text" name="num2" id="num2"/> <br/>  
          
        <input type="button" value="从服务区端获取数据" onclick="ajaxSubmit();"/>  
      
        <div id="content"></div>  
      </body>  
    </html>  