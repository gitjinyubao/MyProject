function createXMLHttpRequest(){
	var xmlHttp;
	if(window.XMLHttpRequest){
		xmlHttp=new XMLHttpRequest();
	}
	else if(window.ActiveXObject){
		xmlHttp=new ActiveXObject(Msxml2.XMLHTTP);
		if(!xmlHttp){
			xmlHttp=new ActiveXObject(Msxml3.XMLHTTp);
			if(!xmlHttp){
				xmlHttp=new Active(Microsoft.XMLHTTP);
			}
		}
	}
	alert(xmlHttp);
}