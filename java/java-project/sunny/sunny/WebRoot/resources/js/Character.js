var image;
var imgBody;
function imgID() {
	imgBody=document.getElementById("imgBody");
	image=document.getElementById("characterPicture");
	alert(image.src+"image");
}
var xmlHttp;
function uploadPicture(){
	//��ȡxmlhttp
	xmlHttp=createXmlHttp();
	//������
	var url="user/CharacterPicture";
	xmlHttp.open("POST",url,true);
	//�ص�����
	xmlHttp.onreadystatechange=callBack;
	//����
	xmlHttp.send(null);
}

function createXmlHttp() {
	
	var xmlHttp;
	//���ڴ�������������
	if(window.XMLHttpRequest){
		xmlHttp=new XMLHttpRequest();
	}
	//����������ļ�������
	if(window.ActiveXObject){
		xmlHttp=new ActiveXObject(Msxml2.XMLHTTP);
		if(!xmlHttp){
			xmlHttp=new ActiveXObject(Microsoft.XMLHTTP);
		}
	}
	return xmlHttp;	
}

function callBack() {
	alert(xmlHttp.readyState);
	alert(xmlHttp.status);
	if(xmlHttp.readyState==4&&xmlHttp.status==200){
		var result=xmlHttp.responseText;
		if(image){
			alert("have");
			alert("result"+result);
			alert("result"+image);
			image.src=result;
		}else{
			alert("no");
			var img=document.createElement("img");
			img.setAttribute("class", "img-circle");
			img.setAttribute("id", "characterPicture");
			img.height="70px";
			img.width="70px";
			img.src=result;
			alert(img.src);
			imgBody.appendChild(img);
		}
	}
}