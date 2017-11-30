var xmlHttp;
function saveComment() {
	xmlHttp=createXmlHttp();
	var content=CKEDITOR.instances.test.getData();
    
	var article_id=document.getElementById("article_id").value;
	var url="comment/Comment";
	xmlHttp.open("POST",url,true);
	xmlHttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
	xmlHttp.onreadystatechange=callBack;
	xmlHttp.send("content="+content+"&article_id="+article_id);
}
function createXmlHttp() {
	
	var xmlHttp;
	if(window.XMLHttpRequest){
		xmlHttp=new XMLHttpRequest();
	}
	if(window.ActiveXObject){
		xmlHttp=new ActiveXObject(Msxml2.XMLHTTP);
		if(!xmlHttp){
			xmlHttp=new ActiveXObject(Microsoft.XMLHTTP);
		}
	}
	return xmlHttp;	
}

function callBack() {
	var i=0;
	if(xmlHttp.readyState==4&&xmlHttp.status==200){
		var result=xmlHttp.responseText;
		var json=eval("("+result+")");
		var comment=document.getElementById("comment");
		comment.innerHTML="";
		var comment1=document.getElementById("comment1");
		comment1.innerHTML="";
		var font=document.createElement("font");
		font.size="+2";
		font.innerHTML="文章评论区";
		comment1.appendChild(font);
        for(i;i<json.length;i++){
            var nextNode=json[i];
        	if((i%2)==0){
        		var comment2=document.createElement("div");
        		var span=document.createElement("span");
        		span.setAttribute("class","glyphicon glyphicon-hand-right");
        		comment2.setAttribute("class", "panel panel-default");
        		var iNow=i;
        		comment2.setAttribute("id", iNow);
        		var div1=document.createElement("div");
                div1.setAttribute("class", "panel-heading");
                var h3=document.createElement("h3");
            	h3.setAttribute("class", "panel-title");
            	h3.appendChild(span);
        		h3.innerHTML=h3.innerHTML+"&nbsp;&nbsp;"+nextNode+"评价:";
            	div1.appendChild(h3);
                comment2.appendChild(div1);
                comment1.appendChild(comment2);
        	    }else {
        	    var comment2=document.getElementById(iNow);
        		var div2=document.createElement("div");
        		div2.setAttribute("class","panel-body");
        		div2.innerHTML=nextNode;
        		comment2.appendChild(div2);
        	}
        }
	}
}