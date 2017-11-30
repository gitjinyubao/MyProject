var i=0;
function click1(obj){
//js
i++;
if(i==0){
	obj.style.backgroundColor="#CAE1FF";
}
if(i==1){
	obj.style.backgroundColor="#FFFFE0";
}else if(i==2){
	obj.style.backgroundColor="#EEE5DE";
}else if(i==3){
	obj.style.backgroundColor="#96CDCD";
	i=-1;
}
}

function click2(obj){
	//js
	i++;
	if(i==0){
		obj.style.backgroundColor="#FFFFE0";
	}
	if(i==1){
		obj.style.backgroundColor="#CAE1FF";
	}else if(i==2){
		obj.style.backgroundColor="#EEE5DE";
	}else if(i==3){
		obj.style.backgroundColor="#96CDCD";
		i=-1;
	}
	}