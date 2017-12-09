<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%@ taglib prefix="ck" uri="http://ckeditor.com"%>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <base href="<%=basePath%>">  
    <title>My JSP 'index.jsp' starting page</title>  
    <meta http-equiv="pragma" content="no-cache">  
    <meta http-equiv="cache-control" content="no-cache">  
    <meta http-equiv="expires" content="0">      
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
    <meta http-equiv="description" content="This is my page">  
     
    
    <!--  <script type="text/javascript"   src="ckeditor/config.js"></script> -->
     <script type="text/javascript">
     /* CKEDITOR.editorConfig = function( config )  
{  
    // Define changes to default configuration here. For example:  
     //config.language = 'fr';//语言  
     config.width = '800px';//宽度  
     config.height = '200px';//高度  
     config.uiColor = '#AADC6E';//颜色  
     //config.toolbar = 'Basic';//有Full和Basic基本属性。也可以详细配置  
     config.skin = 'kama';//如果不设置默认为kama,还有office2003和v2属性  
};   */
</script>
  </head>  
  
  <body> 
  <%!
          int  i=0;
          synchronized   void  setCount()
          {
              i++;
              }
   %>
   <%
           setCount();
           out.print(i);
    %> 
    <textarea rows="10" cols="10" id="my_txt"></textarea>  
    <ck:replace replace="my_txt" basePath="ckeditor"></ck:replace>  
  </body>  
</html>  