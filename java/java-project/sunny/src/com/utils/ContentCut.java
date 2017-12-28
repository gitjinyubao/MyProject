package com.utils;

public class ContentCut {
	//截取去掉处理富文本
			public  static  String    doContentCut(String content){
				for(int i=0;i<content.length();i++){
					if(content.indexOf("<")!=(-1)){
						if(content.indexOf(">")!=(-1)){
							if(content.indexOf("<")==0){
								content=(String)content.substring(content.indexOf(">")+1, content.length());
							}else{
							content=(String) content.substring(0,content.indexOf("<")-1)+content.substring(content.indexOf(">")+1, content.length());
							}
						}
						else{
							content=(String) content.substring(0,content.indexOf("<")-1);
						}
					}
				}
				return content;
			}

}
