 var xmlHttpRequest = null;  
      
            function ajaxSubmit(){  
            //  window.alert(window.ActiveXObject);  
                  
                if(window.ActiveXObject){   //��IE�����  
      
                    xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");  
      
                }else if(window.XMLHttpRequest){    //��IE������������  
      
                    xmlHttpRequest = new XMLHttpRequest();  
                }  
      
                /* 
                    ʹ��Ajax׼����������˷���һ������ 
                */  
                if(null != xmlHttpRequest){ //ʹ��GET��ʽ��          //�첽  
                    var num1 = document.getElementById("num1").value;  
                    var num2 = document.getElementById("num2").value;  
                      
                      
                //  xmlHttpRequest.open("GET", "AjaxServlet?num1=" + num1 + "&num2=" + num2, "true");  
      
                    xmlHttpRequest.onreadystatechange = ajaxCallBack;   //ע��һ���ص�����  
      
                    //��������˷�������  
                //  xmlHttpRequest.send(null);  //get��ʽ����Ϊnull  
      
                    //post��ʽ  
                    xmlHttpRequest.open("POST", "AjaxServlet", "true");  
                    //ʹ��post��ʽ�ύ���ݣ���������������д���  
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
                        	//�˶��ߵ���ʾ�������һ����
                        	document.getElementById("content").innerHTML+=nextNode;
                        	/* document.getElementById("content").appendChild(text); */
                        } 
                       /*  document.getElementById("content").innerHTML =result; */ 
                    }  
                }   
            }  