<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
  <script src="javascr.js"></script>
  <script type="text/javascript" src="ckeditor/ckeditor.js"></script>   
  <script type="text/javascript">  
    function getData(){  
        var editor_data = CKEDITOR.instances.editor1.getData();       
        alert(editor_data);  
    }  
  </script>   
  </head>    
       
  <body>    
        <form id="form1" name="form1" method="get" action="display.jsp">    
            <table width="650" height="400" border="0" align="center">    
                <tr>    
                    <td valign="top">    
                        内容:     
                    </td>    
                    <td>    
                        <textarea id="editor1" name="editor1">&lt;p&gt;Initial value.&lt;/p&gt;</textarea>    
                        <script type="text/javascript">    
                            CKEDITOR.replace( 'editor1' );     
                        </script>    
                    </td>    
                </tr>    
                <tr>    
                    <td></td>    
                    <td>    
                        <input type="submit" name="Submit" value="提交"  onclick="getData()"/>    
                        <input type="reset" name="Reset" value="重置" />    
                    </td>    
                </tr>    
            </table>    
        </form>    
    </body>    
  
</html>
