 var xmlHttpRequest = null;  
      
            function ajaxSubmit(){  
            //  window.alert(window.ActiveXObject);  
                  
                if(window.ActiveXObject){   //是IE浏览器  
      
                    xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");  
      
                }else if(window.XMLHttpRequest){    //除IE外的其他浏览器  
      
                    xmlHttpRequest = new XMLHttpRequest();  
                }  
      
                /* 
                    使用Ajax准备向服务器端发送一个请求 
                */  
                if(null != xmlHttpRequest){ //使用GET方式，          //异步  
                    var num1 = document.getElementById("num1").value;  
                    var num2 = document.getElementById("num2").value;  
                      
                      
                //  xmlHttpRequest.open("GET", "AjaxServlet?num1=" + num1 + "&num2=" + num2, "true");  
      
                    xmlHttpRequest.onreadystatechange = ajaxCallBack;   //注册一个回调函数  
      
                    //向服务器端发送数据  
                //  xmlHttpRequest.send(null);  //get方式设置为null  
      
                    //post方式  
                    xmlHttpRequest.open("POST", "AjaxServlet", "true");  
                    //使用post方式提交数据，必须加上下面这行代码  
                    xmlHttpRequest.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");  
                      
                    xmlHttpRequest.send("num1=" + num1 + "&num2=" + num2);  
      
                }  
            }  
      
            function ajaxCallBack(){  
                if(xmlHttpRequest.readyState == 4){  
                    if(xmlHttpRequest.status == 200){  
                        var responseText = xmlHttpRequest.responseText;  
                      
                        var result=responseText;
                        var json=eval("("+result+")"); 
                        /* document.getElementById("content").innerHTML =json;  */
                        for(var i=0;i<json.length;i++){
                        	var nextNode=json[i];
                        	var text=document.createTextNode(nextNode);
                        	//此二者的显示结果都是一样的
                        	document.getElementById("content").innerHTML+=nextNode;
                        	/* document.getElementById("content").appendChild(text); */
                        } 
                       /*  document.getElementById("content").innerHTML =result; */ 
                    }  
                }   
            }  