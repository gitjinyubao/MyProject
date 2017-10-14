function onblur1(){
	var username=document.getElementById("username");
	var span=document.getElementById("span");
	var flag=username.checkValidity();
	if((!flag)||(username.value).length>18){
		span.innerHTML="格式错误";
		span.style.fontFace="隶书";
        span.style.fontSize="18px";
        span.style.color="red";
		return;
	}
	else{
	if(username.value==""){
		//清空数据
		return;
	}
	else{
		xmlHttp=createXmlHttp();
		//给服务器发送数据
		/*var url="user/selectTitle?Title="+escape(Title.value);*/
		var url="user/SignInText?username="+username.value;
		//tru表示Javascript脚本会在send()方法执行之后,不会去等待服务器的响应而是继续还行
		xmlHttp.open("GET",url,true);
		/*xmlHttp绑定回调方法，回调方法在 xmlHttp状态改变的时候被调用
		 * xmlHttp的状态0-4,我们只是关注4(complete)这个状态,
		 * 所以说在完成之后再来调用回调方法才是有意义的
		*/
		//注意这里调用函数没有双小括号
		xmlHttp.onreadystatechange=callBack;
		xmlHttp.send(null);
	}
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
	/*alert(xmlHttp.readyState);
	alert(xmlHttp.status);*/
	if(xmlHttp.readyState==4){
		/*200代表服务器响应成功
		 * 404代表资源未找到
		 * 500服务器内部错误(程序出错)
		*/
		if(xmlHttp.status==200){
			/*alert(xmlHttp.status);*/
			//交互成功,获得相应数据,是文本
			var result=xmlHttp.responseText;
			//解析获得数据(json文本的最外层加上小括号,js才能够解析)
			var json=eval("("+result+")");
			//获得数据之后，动态显示数据,展示到输入框下面
			setContent(json);
		}
	}
}
//设置关联数据的展示
function setContent(contents){
	//清空数据
	//确定关联数据的长度,确定生成多少个<tr></tr>
	var size=contents.length;
	//设置内容
	for(var i=0;i<size;i++){
		var nextNode=contents[i];//代表的是json格式的第i个元素
		if(null!=nextNode){
	            span.innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+nextNode;
	            var inner=span.innerText;
	            span.style.fontFace="隶书";
	            span.style.fontSize="18px";
	            if(inner.indexOf("ok")>=0){
	            	 span.innerHTML="";
	            	/*span.style.color="green";*/
	            }else{
	            	span.style.color="red";
	            }
		}
	}
}
}



