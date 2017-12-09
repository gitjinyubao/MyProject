// JavaScript Document
var  username;
var  username1;
var  cookie;
function   change()
{
	     username=document.getElementById('j').value;
	    var date=new Date();
	    var cookies =document.cookie=escape("username="+username+";"+"expire="+date.setFullYear(date.getFullYear()+1)+"path=/");
		cookie=unescape(document.cookie);
		alert('haha');
}
document.getElementById('j').value=cookie;
document.writeln(cookie);