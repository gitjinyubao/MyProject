// JavaScript Document
function    Dog(name1,sex1)
{    
       this.name=name1;
	   this.sex=sex1;     
}
//var   dog=new    Dog("金玉","男");
//dog.name="金玉";
//dog.sex="男";
//alert("name="+dog.name+"\n"+"sex"+dog.sex);
function    showDog()
{
	alert(this.name+"\n"); 
	alert(this.sex+"\n");   
}
var   dog=new    Dog("金玉","男");
alert(dog.showDog());
//dog.showDog();