package com.biz;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Image;
import com.entity.Page;

public interface ImageBiz {
	public    void   insertImage(Image  image);
	/*public    List<Image>   selectListImage(String type);*/
	public    List<Image>   selectAllImage(Map<String, Object>  map);
	public    List<Image>   selectListImage(Map<String, Object>  map);
	public    List<Image>   selectListImageTwelve(Page page);
	public    Image  selectCharacterImage(Image  image);
	public    void   deleteImage(Map<String, Object>  map);
	public   Image   selectOneImage(String  url);  
	
	//Ìí¼Ó
	public   void   selectListImageTwelve(HttpServletRequest request,ModelAndView   mv,Map<String, Object>  map,@ModelAttribute("page")  Page   page);
}
