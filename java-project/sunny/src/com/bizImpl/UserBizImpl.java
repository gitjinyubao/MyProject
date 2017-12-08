package com.bizImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;


import com.biz.ImageBiz;
import com.biz.UserBiz;
import com.dao.ArticleDao;
import com.dao.ImageDao;
import com.dao.UserDao;
import com.entity.Article;
import com.entity.Image;
import com.entity.Page;
import com.entity.User;
import com.utils.ContentCut;
@Service("userBizImpl")
public class UserBizImpl implements  UserBiz{
	
	@Autowired
	/*@Qualifier("userDao")*/
	private    UserDao    userDao;
	
	//添加
	@Autowired
	private    ImageDao   imageDao;
	
	@Autowired
	private    ArticleDao articleDao;
	
	@Autowired
	private    ImageBiz    imageBiz;
	
    
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	/*@Transactional*/
	public User selectUser(User user) {
		// TODO Auto-generated method stub
		return userDao.selectUser(user);
	}

	@Override
	public   User     selectUserUsername(String  username)
	{
		// TODO Auto-generated method stub
		return userDao.selectUserUsername(username);
	}

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		userDao.insertUser(user);
	}

	//新添加
	@Override
	public void doLogin(User user1,ModelAndView   mv,HttpServletRequest request) {
		// TODO Auto-generated method stub
			  Image  imagePublicShow=new Image();
			  String  url="imagesCharacter/"+user1.getUsername()+".jpg";
			  imagePublicShow.setUrl(url);
			  imagePublicShow.setUser_username(user1.getUsername());
			  Image  imagePublic=imageDao.selectCharacterImage(imagePublicShow);
			  request.getSession().setAttribute("imagePublic", imagePublic);
			  request.getSession().setAttribute("user", user1);
			  mv.addObject("user", user1);
     }

	@Override
	public void doToMyBlogger(HttpServletRequest request, ModelAndView mv,
			Map<String, Object> map, Page page) {
		// TODO Auto-generated method stub
		User user=(User)request.getSession().getAttribute("user");
		String  user_username=user.getUsername();
		map.put("user_username", user_username);
		map.put("kind_name", "life");
		int  lifeNumber=articleDao.selectKindNumber(map);
		map.put("kind_name", "technology");
		int  technologyNumber=articleDao.selectKindNumber(map);
		map.put("kind_name", "knowledge");
		int  knowledgeNumber=articleDao.selectKindNumber(map);
		mv.addObject("lifeNumber", lifeNumber);
		mv.addObject("technologyNumber", technologyNumber);
		mv.addObject("knowledgeNumber", knowledgeNumber);
		Map<String, Object>  map1=new  HashMap<String, Object>();
		map1.put("user_username", user.getUsername());
		/*selectAllArticleThree(request, mv,map1);*/
		List<Article>  listArticle=articleDao.selectAllArticleThree(map1);
		
		//个性照片:改动(添加)
		 String  url="SunnyImagesCharacter/"+user_username+".jpg";
		 Image image=new Image(); 
		 image.setUrl(url);
		 image.setUser_username(user_username);
		 Image  imagePublic=imageDao.selectCharacterImage(image);
		 mv.addObject("imagePublic", imagePublic);
		
		if(null!=listArticle){
			for (Article article : listArticle) {
				/*String [] kindContent=new String[] {"span","p","div"}; 
				String content=doContentSum(kindContent, (String)article.getContent().subSequence(0, 140));
				doContentSum(kindContent, content);*/
				String content=null;
		    	if(article.getContent().length()>=140){
		    		content=ContentCut.doContentCut((String)article.getContent().substring(0, 140));
		    	}
		    	else{
		    		content=ContentCut.doContentCut((String)article.getContent().substring(0));
		    	}
				article.setContent(content);
			}
			}
		mv.addObject("listArticle", listArticle);
		imageBiz.selectListImageTwelve(request, mv, map1, page);
	}
	
	
}
