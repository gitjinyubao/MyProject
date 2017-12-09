var xmlHttp;
function sendMessage(){
   //完成XMLHttpRequest对象的初始化
	xmlHttp=createXmlHttp();
	//定发送请求的目标URL
	var text_area=document.getElementById("text");
	var message=text_area.value;
	var friend_id=document.getElementById("friend_id").value;
	var url="Socket.action";
	//发送post请求
	xmlHttp.open("POST",url,true);
	//设置请求头
	xmlHttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
	//指定xmlHttp状态改变时的处理函数
	xmlHttp.onreadystatechange=callBack;
	//获得输入框中的值，清空输入框的内容
    text_area.value="";	
	//发送请求，send的参数包含很多key-value对
	xmlHttp.send("message="+message+"&friend_id="+friend_id);
}

//获得xmlHttp对象
function createXmlHttp(){
	var xmlHttp;
	//对于大多数浏览器适用
	if(window.XMLHttpRequest){
		xmlHttp=new XMLHttpRequest();
	}
	//考虑浏览器的兼容问题
	if(window.ActiveXObject){
		xmlHttp=new ActiveXObject(Msxml2.XMLHTTP);
		if(!xmlHttp){
			xmlHttp=new ActiveXObject(Microsoft.XMLHTTP);
		}
	}
	return xmlHttp;
}

//回调函数
function callBack(){
	if(xmlHttp.readyState==4){
		if(xmlHttp.status==200){
			//交互成功,获得相应数据,是文本
			var result=xmlHttp.responseText;
			var json=eval("("+result+")");
			document.getElementById("tbody").innerHTML="";
			for(var i=0;i<json.length;i++){
				if(i<40){
							var tbody=document.getElementById("tbody");
							var nextNode=json[i];
							var text=document.createTextNode(nextNode);
							var p=document.createElement("p");
							p.appendChild(text);
							if(i%2==0){
								p.innerHTML=p.innerHTML+":";
							}else{
								p.innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+p.innerHTML;
							}
							tbody.appendChild(p);
				}
			}
		}
	}
	setTimeout("sendMessage()", 10000);
}