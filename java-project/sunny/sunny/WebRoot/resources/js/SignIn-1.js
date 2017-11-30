function check1() {
	password=document.getElementById("password");
	var span=document.getElementById("span1");
	var objvalue=document.getElementById("password");
	var flag=objvalue.checkValidity();
	if(!flag){
		span.innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;* 格式错误";
		span.style.fontFace="隶书";
		span.style.fontSize="18px";
		span.style.color="red";
	}else{
		span.innerHTML="";
	}
}

function check2() {
	password=document.getElementById("password").value;
	var span=document.getElementById("span2");
	var objvalue=document.getElementById("password1");
	var flag=objvalue.checkValidity();
	if(!flag){
		span.innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;* 格式错误";
		span.style.fontFace="隶书";
		span.style.fontSize="18px";
		span.style.color="red";
	}
	var password1=document.getElementById("password1").value;
	if(password1!=password){
		span.innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;* 密码对应错误";
		span.style.fontFace="隶书";
		span.style.fontSize="18px";
		span.style.color="red";
	}
	else{
		span.innerHTML="";
	}
	
}

function check3() {
	var nickname=document.getElementById("nickname");
	var span=document.getElementById("span3");
	var flag=nickname.checkValidity();
	if(!flag){
		span.innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;* 格式错误";
		span.style.fontFace="隶书";
		span.style.fontSize="18px";
		span.style.color="red";
	}
	else{
		span.innerHTML="";
	}
}

function check4() {
	var question=document.getElementById("question");
	var span=document.getElementById("span4");
	var flag=question.checkValidity();
	if(!flag){
		span.innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;* 格式错误";
		span.style.fontFace="隶书";
		span.style.fontSize="18px";
		span.style.color="red";
	}
	else{
		span.innerHTML="";
	}
}

function check5() {
	var answer=document.getElementById("answer");
	var span=document.getElementById("span5");
	var flag=answer.checkValidity();
	if(!flag){
		span.innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;* 格式错误";
		span.style.fontFace="隶书";
		span.style.fontSize="18px";
		span.style.color="red";
	}else{
		span.innerHTML="";
	}
}