var canvas=document.getElementById("Mycanvas");
var context=canvas.getContext("2d");
//为文字添加渐变效果
var linearText=context.createLinearGradient(300,50,600,50);
   linearText.addColorStop(0,"yellow");
   linearText.addColorStop(0.5,"green");
   linearText.addColorStop(1,"red");
   context.fillStyle=linearText;
   context.font="30px Arial";
   context.textBaseLine="top";//文字对齐方式
   context.fillText("HTML5线性渐变文字",300,50);//参数表示文字的起始位置