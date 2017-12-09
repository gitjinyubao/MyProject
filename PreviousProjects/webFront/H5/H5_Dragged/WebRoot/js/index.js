var src=document.getElementById("src");
var target=document.getElementById("target");
var span=document.getElementById("span");
var graggedId;
var newElement;
var i=0;
var img;
src.ondragstart=function(e){
	i++;
	graggedId=e.target.id;
	img=document.getElementById(graggedId);
	/*span.innerHTML="图片开始拖拽";*/
}

target.ondragenter=function(e){
	/*span.innerHTML="目标元素进入";*/
	e.preventDefault();
}

target.ondragover=function(e){
	/*span.innerHTML="在目标元素内移动";*/
	e.preventDefault();
}

src.ondragend=function(e){
	/*span.innerHTML="结束拖拽";*/
}

target.ondrop=function(e){
	var j=target.childNodes.length;
	if(j<=8){
		newElement=document.getElementById(graggedId).cloneNode(false);
		target.appendChild(newElement);
		/*alert(newElement.src);*/
		e.preventDefault();
		img.parentNode.removeChild(img);
	}
}


target.ondragstart=function(e){
	graggedId=e.target.id;
	img=document.getElementById(graggedId);
	/*span.innerHTML="图片开始拖拽";*/
}

src.ondragenter=function(e){
	/*span.innerHTML="目标元素进入";*/
	e.preventDefault();
}

src.ondragover=function(e){
	/*span.innerHTML="在目标元素内移动";*/
	e.preventDefault();
}

target.ondragend=function(e){
	/*span.innerHTML="结束拖拽";*/
}

src.ondrop=function(e){
		newElement=document.getElementById(graggedId).cloneNode(false);
		src.appendChild(newElement);
		e.preventDefault();
		img.parentNode.removeChild(img);
}

