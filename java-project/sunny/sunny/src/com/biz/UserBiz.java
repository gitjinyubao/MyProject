package com.biz;




import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Image;
import com.entity.Page;
import com.entity.User;

@SuppressWarnings("unused")
public interface UserBiz {
	public    User    selectUser(User   user);
	
	public   User     selectUserUsername(String  username);
	
	public   void     insertUser(User   user);
	
	//ÐÂÌí¼Ó
	public void doLogin(User user,ModelAndView   mv,HttpServletRequest request);
	
	@SuppressWarnings("rawtypes")
	public void doToMyBlogger(HttpServletRequest request,ModelAndView   mv,Map<String, Object>  map,@ModelAttribute("page")  Page  page);
}
