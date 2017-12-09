
$(document).ready(function()
			{
				//基本选择器
				$("#j").css("background","chartreuse");
				$(".j").css("background","cadetblue");
				
				
				//属性选择器
				$("[list='j']").css("align-self","flex-end");
				
				//其他选择器
				$("ul li:first").css("background","bisque");
				$("ul.i").css("background-color","aquamarine");
			}
		);
		