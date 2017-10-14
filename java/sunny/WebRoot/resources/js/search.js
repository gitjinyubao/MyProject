
function changeKeyWord(){
	if (!!window.ActiveXObject || "ActiveXObject" in window){
		var Title=document.getElementById("KeyWord");
		Title.setAttribute("placeholder", "目前不支持在IE浏览器上 '中文' 搜索");
	}
	setLocation();
	var Title=document.getElementById("KeyWord");
	if(Title.value==""){
		//清空数据
		clearDate();
	}
	else{
		xmlHttp=createXmlHttp();
		//给服务器发送数据
		/*var url="user/selectTitle?Title="+escape(Title.value);*/
		var url="user/selectTitle?Title="+Title.value;
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
	clearDate();
	//确定关联数据的长度,确定生成多少个<tr></tr>
	var size=contents.length;
	//设置内容
	for(var i=0;i<size;i++){
		var nextNode=contents[i];//代表的是json格式的第i个元素
		var tr=document.createElement("tr");
		var td=document.createElement("td");
	    td.setAttribute("border","0");
	    td.setAttribute("bgcolor","FFFAFA");
	    td.onmouseout=function(){
	    	this.className='mouseOut';
	    }
	    td.onclick=function(){
	    	//当鼠标点击一个关联数据时，关联数据自动变为输入框的数据
		}
	    var text=document.createTextNode(nextNode);
	    td.appendChild(text);
	    tr.appendChild(td);
	    var tbody=document.getElementById("content_table_body");
	    tbody.appendChild(tr);
	    
	    td.onmouseover=function(){
	    	this.className='mouseOver';
	    	var input=document.getElementById("KeyWord");
	    	input.value=this.innerHTML;
	    }
	}
}

//清空之前的数据
function clearDate(){
	var tbody=document.getElementById("content_table_body");
	var size=tbody.childNodes.length;
	for(var i=size-1;i>=0;i--){
		tbody.removeChild(tbody.childNodes[i]);
	}
	document.getElementById("popDiv").style.border="none";
}

//输入框失去焦点时
function keyWordBlur(){
	//清空数据
	clearDate();
}

//设置关联信息的位置
function setLocation(){
	var input=document.getElementById("KeyWord");
    var width=input.offsetWidth;//输入框的宽度
    var left=input["offsetLeft"];//距离左边框距离
    var top=input["offsettop"]+input.offsetHeight;//input的下边框距离外层的上边框距离
    //获得显示数据的DIV
    var popDiv=document.getElementById("popDiv");
    popDiv.style.border="black 1px solid";
    //注意加上px
    popDiv.style.left=left+"px";
    popDiv.style.top=top+"px";
    popDiv.style.width=width+"px";
    //获得显示数据的table
    var content_table=document.getElementById("content_table");
    content_table.style.width=width;
}