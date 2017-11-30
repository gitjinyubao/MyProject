package com.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.biz.ArticleBiz;
import com.biz.CharacterBiz;
import com.biz.CommentBiz;
import com.biz.ImageBiz;
import com.biz.KindArticleBiz;
import com.biz.UserBiz;
import com.entity.Article;
import com.entity.Comment;
import com.entity.Image;
import com.entity.KindArticle;
import com.entity.Page;
import com.entity.User;
import com.entity.Character;
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	/*@Qualifier("userBizImpl")*/
	private UserBiz userBiz;				
	
	@Autowired
	private   CharacterBiz   characterBiz;
	
	@Autowired
	private   ImageBiz       imageBiz;
	
	@Autowired
	private   ArticleBiz     articleBiz;
	
	@Autowired
	private   CommentBiz     commentBiz;
	
	@Autowired
	private   KindArticleBiz   kindArticleBiz;
	
	//�����¼
	@RequestMapping(value="/login")
	public ModelAndView doLogin(HttpServletRequest   request, @ModelAttribute("user")    User   user,ModelAndView   mv,Map<String, Object>  map,@ModelAttribute("page")  Page  page)
	{
		User   user1=userBiz.selectUser(user);
		if(user1!=null)
		{
			  userBiz.doLogin(user1, mv, request);
			  doToMyBlogger(request, mv,map,page);
		}
		else
		{
			doToBlogger(request, mv, map);
		}
		return mv;
	}
	
	//����ע��
	@RequestMapping(value="/SignIn")
	public   ModelAndView     doSignIn(HttpServletRequest   request,ModelAndView   mv,@ModelAttribute("user")   User   user,Map<String, Object>  map,String password1) throws IOException
	{
		User   user1=userBiz.selectUserUsername(user.getUsername());
		String password=user.getPassword();
		if(null!=user1)
		{
			mv.addObject("user", user);
			doToBlogger(request, mv,map);
		}
		else
		{
			if(password.equals(password1)){
				userBiz.insertUser(user);
				/*mv.addObject("message", "ע��ɹ�,�뷵�ص�¼ҳ��");*/
				doToBlogger(request, mv,map);
			}
			else{
				doToBlogger(request, mv,map);
			}
		}
		return mv;
	}
	
	@RequestMapping(value="/SignInText")
	public   void     doSignInText(HttpServletResponse resp,@ModelAttribute("user")   User   user) throws IOException
	{
		User   user1=userBiz.selectUserUsername(user.getUsername());
		List<String> listString=new ArrayList<String>();
		if(null!=user1)
		{
			resp.setCharacterEncoding("UTF-8");
			listString.add("* ���˺��Ѿ���ʹ��,�����");
			resp.getWriter().write(JSONArray.fromObject(listString).toString());
		}
		else
		{
			listString.add("* ok");
			resp.getWriter().write(JSONArray.fromObject(listString).toString());
		}
	}
	
	//�����û���ҳ
			@RequestMapping(value="/MyBlogger")
			public   ModelAndView     doToMyBlogger(HttpServletRequest request,ModelAndView   mv,Map<String, Object>  map,@ModelAttribute("page")  Page  page)
			{  
				if(null!=(User)request.getSession().getAttribute("user"))
				{
					userBiz.doToMyBlogger(request, mv, map, page);
					mv.setViewName("WEB-INF/jsp/user/MyBlogger");
				}
				else
				{
					doToBlogger(request, mv, map);
				}
				return mv;
	        }
	
     //���ﲩ����ҳ	
			@RequestMapping(value="/Blogger")
			public   ModelAndView     doToBlogger(HttpServletRequest request,ModelAndView   mv,Map<String, Object> map)
			{  
			    
				String  user_username=null;
				map.put("user_username", user_username);
				selectAllArticleThree(request, mv,map);
				mv.setViewName("Blogger");
				return mv;
	        }
				
	//�����������
	@RequestMapping(value="/Character")
	public   ModelAndView     doCharacter(HttpServletRequest   request,ModelAndView   mv,@ModelAttribute("character")   Character  character,Map<String, Object> map,@ModelAttribute("page")  Page  page)
	{
		    User  user=(User) request.getSession().getAttribute("user");
		    Character   character2=characterBiz.selectCharacter(user.getUsername());
		    if(null!=character2){
		    	characterBiz.updateCharacter(character);
		    	mv.addObject("message", "ok!���³ɹ�");
		    	doToMyBlogger(request, mv,map,page);
		    }
		    else
		    {
		    	character.setUser_username(user.getUsername());
				characterBiz.insertCharacter(character);
				mv.addObject("message", "ok!���óɹ�");
		    	doToMyBlogger(request, mv,map,page);
		    }
		    return mv;
	}
	
	@RequestMapping(value="/CharacterJsp")
	public   ModelAndView     doToCharacter(HttpServletRequest   request,ModelAndView   mv,@ModelAttribute("character")   Character  character)
	{
		    mv.setViewName("WEB-INF/jsp/user/character/Character");
		    return mv;
	}
	
	public  void     doCharacterImage(HttpServletRequest   request,ModelAndView   mv)
	{
		String  type1="imagesCharacter";
		Map<String, Object>  map=new HashMap<String, Object>();
		map.put("type1",type1);
	    List<Image>   list=imageBiz.selectListImage(map);
	    mv.addObject("list", list);
	}
	
	//������Ƭ
		@RequestMapping(value="/ImageInsert")
		public   ModelAndView     doImage(HttpServletRequest   request,
		ModelAndView   mv,@RequestParam("file")   MultipartFile  file,
	    @RequestParam("name")    String  name,@RequestParam("type")  String  type,
	    Map<String, Object> map1) 
	    		throws Exception, IOException
		{
			
			Page page=new Page();
	        page.setHandle("flat");
	        page.setPageCurrent(1);
	        
			Map<String, Object>  map=new HashMap<String, Object>();
			User user=(User)request.getSession().getAttribute("user");
			String  user_username=user.getUsername();
			map.put("user_username", user_username);
			    Image  image=new Image();
			    String fileSuffix=null;
			    String fileOriginalName=null;
			    String path=null;
			    String url=null;
			    String trueName=null;
			    if(!file.isEmpty())
			    {
			    		fileOriginalName=file.getOriginalFilename();
			    		fileSuffix=fileOriginalName.substring(fileOriginalName.indexOf("."));
			    		if(fileSuffix.equals(".jpg")||fileSuffix.equals(".gif")
			    				||fileSuffix.equals(".JPG")||fileSuffix.equals(".jpeg")
			    				||fileSuffix.equals(".rgb")||fileSuffix.equals(".RGB")
			    				||fileSuffix.equals(".png")||fileSuffix.equals(".PNG"))
			    		{
			    			if(type.equals("Image"))
						    {
			    				Date   date=new Date();
			    				SimpleDateFormat  format=new SimpleDateFormat("yyyyMMdHHmmssSS");
			    				String date1=format.format(date);
			    				name=name+date1;
			    				trueName=name+fileSuffix;
			    				String  path1=request.getRealPath("");
			    				path=request.getRealPath("/images/");
						    }
			    			else
			    			{
			    				trueName=name+fileSuffix;
			    				path="C://Program Files/Apache Software Foundation/Tomcat 7.0/webapps/SunnyImagesCharacter/";
			    				/*path=request.getRealPath("/imagesCharacter/");*/
			    			}
				          File  file1=new File(path,trueName);
				          if(!file1.getParentFile().exists())	  
				          {
				        	  file1.mkdirs();
				          }
				          if(type.equals("Image"))
				          {
				        	      url="images/"+trueName;
					        	  //���浽Ŀ���ļ���
					        	  file.transferTo(new  File(path+File.separator+trueName));
						          image.setUrl(url);
						          image.setUser_username(user.getUsername());
						          imageBiz.insertImage(image);
						          mv.addObject("message", "ok!��Ƭ�ɹ�����");
						          mv.setViewName("WEB-INF/jsp/user/image/Image");
				          }
				          else
				          {
				        	       url="SunnyImagesCharacter/"+trueName;
				        	      /*url="imagesCharacter/"+trueName;*/
				        	      map.put("url", url);
					        	  file1.delete();
					        	  imageBiz.deleteImage(map);
					        	  //���浽Ŀ���ļ���
					        	  file.transferTo(new  File(path+File.separator+trueName));
						          image.setUrl(url);
						          image.setUser_username(user.getUsername());
						          imageBiz.insertImage(image);
						          System.out.println(path+trueName+"llllllllllllll");
						          System.out.println("����KKKKKKKKKkkkkkkkkkkkkkkkkkkkkKKK");
						          mv.addObject("message", "ok!��Ƭ�ɹ�����");
						          doToMyBlogger(request, mv,map1,page);
				          }		
			    		}
			    		else
			    		{
			    			mv.addObject("message", "ѡ�е�ͼƬ��ʽ������");
			    			if(type.equals("Image"))
						    {
					    	mv.setViewName("WEB-INF/jsp/user/image/Image");
						    }
			    			else
			    			{
			    				doToMyBlogger(request, mv,map1,page);
			    			}
			    		}      
			    	}
			    else
			    {
			    	if(type.equals("Image"))
				    {
			    		mv.setViewName("WEB-INF/jsp/user/image/Image");
				    }
			    	else
			    	{
			    		mv.setViewName("WEB-INF/jsp/user/character/Character");
			    	}
			    	
			    }
			    if(type.equals("Image"))
			    {
			    	String  type1=null;
			    	map.put("type1",type1);
			    	List<Image>   list=imageBiz.selectListImage(map);
					mv.addObject("list", list);
			    }
			    else
			    {
			    	String  type1="imagesCharacter";
			    	map.put("type1",type1);
			    	List<Image>   list=imageBiz.selectListImage(map);
					mv.addObject("list", list);
			    }
			   
       	    return mv;
		}
		
		@RequestMapping(value="/MyImage")
		public   ModelAndView     doToImage(HttpServletRequest  request,ModelAndView   modelAndView)
		{   
			Map<String, Object>  map=new HashMap<String, Object>();
			User user=(User)request.getSession().getAttribute("user");
			String  type1=null;
			String  user_username=user.getUsername();
			map.put("type1", type1);
			map.put("user_username", user_username);
			
			//�Ķ���Ƭ
			/*List<Image>   list=imageBiz.selectListImage(map);*/
			List<Image>   list=imageBiz.selectAllImage(map);
			
			modelAndView.addObject("list", list);
			modelAndView.setViewName("WEB-INF/jsp/user/image/Image");
			return modelAndView;
        }
		/*
		 *1.delete()������
		 * ������delete()����ʱ��ֱ��ɾ���ļ������ܸ��ļ��Ƿ���ڣ�һ����������ִ�У�
		 * 2.deleteOnExit()������
		 *  ������deleteOnExit()����ʱ��ֻ���൱�ڶ�deleteOnExit������һ�����������������н�����JVM��ֹʱ����������deleteOnExit()����ʵ��ɾ�����������÷����ǽ�ɾ�����������һ�£�������ֹͣ��ʱ���ٽ��в�����
		 */
		@RequestMapping(value="/ImageDelete")
		public   ModelAndView    doImageDelete(HttpServletRequest  request,ModelAndView   mv,@RequestParam("url")   String   url)
		{  
			Map<String, Object>  map=new HashMap<String, Object>();
			User user=(User) request.getSession().getAttribute("user");
	        String  user_username=user.getUsername();
	        String  path=request.getRealPath("")+"/"+url;
	        		/*String    path="C:/Users/Administrator/Workspaces/MyEclipse 10/.metadata/.me_tcat/webapps/Sunny/"+url;*/
			map.put("url", url);
			map.put("user_username", user_username);
			imageBiz.deleteImage(map);
			File   file=new  File(path);
			if(file.delete())
			{
			}
			else
			{
				mv.addObject("message","��ر�ʹ�ø���Ƭ�����н���");
			}
			return  doToImage(request, mv);
        }
		
		public   void   selectListImageTwelve(HttpServletRequest request,ModelAndView   mv,Map<String, Object>  map,@ModelAttribute("page")  Page   page)
		{  
			int sum=0;
			User user=(User)request.getSession().getAttribute("user");
			map.put("user_username", user.getUsername());
			if(imageBiz.selectAllImage(map).size()%5==0)
			{
				sum=imageBiz.selectAllImage(map).size()/5;
			}
			else{
				sum=(imageBiz.selectAllImage(map).size()/5+1);
			}
			page.setPageSum(sum);
			int   pageCurrent=page.getPageCurrent();
			String handle=page.getHandle();
			page.setUser_username(user.getUsername());
			if(pageCurrent==1&&"flat".equals(handle)){
				page.setPageCurrent(pageCurrent);
				page.setStart1(0);
			}
			else  if(sum>=pageCurrent&&pageCurrent>1&&"up".equals(handle)){
				pageCurrent-=1;
				page.setStart1((pageCurrent-1)*5);
				page.setPageCurrent(pageCurrent);
			}
			else   if(pageCurrent<=sum&&"down".equals(handle)){
				if(pageCurrent==sum){
					pageCurrent=1;
					page.setPageCurrent(pageCurrent);
				}
				else{
					pageCurrent=pageCurrent+1;
					page.setStart1((pageCurrent-1)*5);
					page.setPageCurrent(pageCurrent);
				}
			}
			mv.addObject("page", page);
		    List<Image>   listImage=imageBiz.selectListImageTwelve(page);
		    mv.addObject("listImage", listImage);
        }
		
		//��������
		@RequestMapping(value="/Article")
		public   ModelAndView     doToArticle(ModelAndView   mv)
		{        
			mv.setViewName("WEB-INF/jsp/user/artical/UserArticle");
			return mv;
        }
	
		@RequestMapping(value="/InsertArticle")
		public   ModelAndView     insertArticle(HttpServletRequest   request,
		ModelAndView   mv,@ModelAttribute("article")  Article  article,KindArticle  kindArticle) 
		{
			User   user=(User) request.getSession().getAttribute("user");
			article.setUser_username(user.getUsername());
			Timestamp  date=new Timestamp(new Date().getTime());
			article.setDate(date);
			articleBiz.insertArticle(article);
			kindArticle.setKind_name(article.getKind_name());
			kindArticle.setUser_username(article.getUser_username());
			kindArticleBiz.insertKindArticle(kindArticle);
			mv.addObject("message", "һƪ�����ϴ�ok,�ɵ� ���ķ�������鿴.....");
			return doToArticle(mv);	
		}	
		
		public   void    selectAllArticleThree(HttpServletRequest   request,
		ModelAndView   mv ,Map<String, Object> map ) 
		{
			map.put("kind_name", "technology");
			List<Article>  listArticleTechnology=articleBiz.selectAllArticleThree(map);
			if(null!=listArticleTechnology){
		    for (Article article : listArticleTechnology) {
		    	String content=null;
		    	if(article.getContent().length()>=140){
		    		content=doContentCut((String)article.getContent().substring(0, 140));
		    	}
		    	else{
		    		content=doContentCut((String)article.getContent().substring(0));
		    	}
				article.setContent(content);
			}
			}
			mv.addObject("listArticleTechnology", listArticleTechnology);
			
			map.put("kind_name", "knowledge");
			List<Article>  listArticleKnowledge=articleBiz.selectAllArticleThree(map);
			if(null!=listArticleKnowledge){
			for (Article article : listArticleKnowledge) {
				String content=null;
		    	if(article.getContent().length()>=140){
		    		content=doContentCut((String)article.getContent().substring(0, 140));
		    	}
		    	else{
		    		content=doContentCut((String)article.getContent().substring(0));
		    	}
				article.setContent(content);
			}
			}
			mv.addObject("listArticleKnowledge", listArticleKnowledge);
			
			map.put("kind_name", "life");
			List<Article>  listArticleLife=articleBiz.selectAllArticleThree(map);
			if(null!=listArticleLife){
			for (Article article : listArticleLife) {
				String content=null;
		    	if(article.getContent().length()>=140){
		    		content=doContentCut((String)article.getContent().substring(0, 140));
		    	}
		    	else{
		    		content=doContentCut((String)article.getContent().substring(0));
		    	}
				article.setContent(content);
			}
			}
			mv.addObject("listArticleLife", listArticleLife);
		}	
		
		//������
		@RequestMapping(value="/PublicArticleByTitle")
		public   ModelAndView     PublicArticleByTitle(HttpServletRequest   request,
		ModelAndView   mv,String title,Image  image,Comment  comment) 
		{
			  @SuppressWarnings("unused")
			  Article   articleSeeKind=new Article();
			  String  type1="imagesCharacter";
			  Article   article=articleBiz.selectArticleByTitle(title);
			  if(article!=null){
			  articleSeeKind.setUser_username(article.getUser_username());
			  Map<String, Object>   map5=new HashMap<String, Object>();
			  
			    articleSeeKind.setKind_name("life");
				List<Article>  listLifeArticle  =articleBiz.selectAllUserArticle(articleSeeKind);
				mv.addObject("listLifeArticle", listLifeArticle);
				for (Article article2 : listLifeArticle) {
				}
				
				
				articleSeeKind.setKind_name("technology");
				List<Article>  listTechnologyArticle  =articleBiz.selectAllUserArticle(articleSeeKind);
				mv.addObject("listTechnologyArticle", listTechnologyArticle);
				
				articleSeeKind.setKind_name("knowledge");
				List<Article>  listKnowledgeArticle  =articleBiz.selectAllUserArticle(articleSeeKind);
				mv.addObject("listKnowledgeArticle", listKnowledgeArticle);
				
			    map5.put("user_username", article.getUser_username());
				map5.put("kind_name", "life");
				int  lifeNumber=articleBiz.selectKindNumber(map5);
				map5.put("kind_name", "technology");
				int  technologyNumber=articleBiz.selectKindNumber(map5);
				map5.put("kind_name", "knowledge");
				int  knowledgeNumber=articleBiz.selectKindNumber(map5);
				mv.addObject("lifeNumber", lifeNumber);
				mv.addObject("technologyNumber", technologyNumber);
				mv.addObject("knowledgeNumber", knowledgeNumber);
			  
			  //�Ķ�
			 /* Comment  comment=new Comment();*/
			  String username=null;
			  comment.setArticle_id(article.getId());
			  List<Comment>  listComment=commentBiz.selectListComment(comment);
			  username=article.getUser_username();
			  User user=userBiz.selectUserUsername(username);
			  Timestamp  date=article.getDate();
			  mv.addObject("date", date);
			  User   userPublic=userBiz.selectUserUsername(article.getUser_username());
			  String  user_username=article.getUser_username();
			 
			  String  url="SunnyImagesCharacter/"+user_username+".jpg";
			  
			  
			  image.setUrl(url);
			  image.setUser_username(user_username);
			  Image  imagePublic=imageBiz.selectCharacterImage(image);
			  Character  characterPublic=characterBiz.selectCharacter(article.getUser_username());
			  
			  mv.addObject("imagePublic",imagePublic);
			  mv.addObject("characterPublic",characterPublic);
			  mv.addObject("userPublic", userPublic);
		      mv.addObject("article", article);
		      mv.addObject("listComment", listComment);
		      
		      //�Ķ�user��Ϊuser1
		      mv.addObject("user1", user);
		      
		      mv.addObject("userPublic", userPublic);
		      mv.setViewName("WEB-INF/jsp/artical/Article");
			  }else{
				 Map<String, Object>   map5=new HashMap<String, Object>();
				 doToBlogger(request, mv, map5);
			  }
		      return  mv;
		}
		
		@RequestMapping(value="/PublicArticle")
		public   ModelAndView     PublicArticle(HttpServletRequest   request,
		ModelAndView   mv,@RequestParam("id")   int   id,Image  image,Comment  comment) 
		{
			  @SuppressWarnings("unused")
			  Article   articleSeeKind=new Article();
			  String  type1="imagesCharacter";
			  Article   article=articleBiz.selectOneArticle(id);
			  articleSeeKind.setUser_username(article.getUser_username());
			  Map<String, Object>   map5=new HashMap<String, Object>();
			  
			    articleSeeKind.setKind_name("life");
				List<Article>  listLifeArticle  =articleBiz.selectAllUserArticle(articleSeeKind);
				mv.addObject("listLifeArticle", listLifeArticle);
				for (Article article2 : listLifeArticle) {
				}
				
				
				articleSeeKind.setKind_name("technology");
				List<Article>  listTechnologyArticle  =articleBiz.selectAllUserArticle(articleSeeKind);
				mv.addObject("listTechnologyArticle", listTechnologyArticle);
				
				articleSeeKind.setKind_name("knowledge");
				List<Article>  listKnowledgeArticle  =articleBiz.selectAllUserArticle(articleSeeKind);
				mv.addObject("listKnowledgeArticle", listKnowledgeArticle);
				
			    map5.put("user_username", article.getUser_username());
				map5.put("kind_name", "life");
				int  lifeNumber=articleBiz.selectKindNumber(map5);
				map5.put("kind_name", "technology");
				int  technologyNumber=articleBiz.selectKindNumber(map5);
				map5.put("kind_name", "knowledge");
				int  knowledgeNumber=articleBiz.selectKindNumber(map5);
				mv.addObject("lifeNumber", lifeNumber);
				mv.addObject("technologyNumber", technologyNumber);
				mv.addObject("knowledgeNumber", knowledgeNumber);
			  
			  
			 /* Comment  comment=new Comment();*/
			  String username=null;
			  comment.setArticle_id(id);
			  List<Comment>  listComment=commentBiz.selectListComment(comment);
			  username=article.getUser_username();
			  User user=userBiz.selectUserUsername(username);
			  Timestamp  date=article.getDate();
			  mv.addObject("date", date);
			  User   userPublic=userBiz.selectUserUsername(article.getUser_username());
			  String  user_username=article.getUser_username();
			  
			  //������Ƭurl�Ķ�
			  String  url="SunnyImagesCharacter/"+user_username+".jpg";
			 /* String  url="imagesCharacter/"+user_username+".jpg";*/
			  
			  
			  image.setUrl(url);
			  image.setUser_username(user_username);
			  Image  imagePublic=imageBiz.selectCharacterImage(image);
			  Character  characterPublic=characterBiz.selectCharacter(article.getUser_username());
			  
			  mv.addObject("imagePublic",imagePublic);
			  mv.addObject("characterPublic",characterPublic);
			  mv.addObject("userPublic", userPublic);
		      mv.addObject("article", article);
		      mv.addObject("listComment", listComment);
		      
		      //��user��Ϊuser1:�����ο�����
		      mv.addObject("user1", user);
		      
		      mv.addObject("userPublic", userPublic);
		      mv.setViewName("WEB-INF/jsp/artical/Article");
		      return  mv;
		}
		
		//public   ModelAndView   doArticleManage(HttpServletRequest  request,ModelAndView  mv,@ModelAttribute("article") Article article,@RequestParam("kind")   String  kind)
		@RequestMapping("/ArticleManage")
		public   ModelAndView   doArticleManage(HttpServletRequest  request,ModelAndView  mv,@ModelAttribute("article") Article article)
		{
			/* System.out.println(kind+"kkkkkkkkkkk");
			 mv.addObject("kind", kind);*/
			 User   user=(User)request.getSession().getAttribute("user");
			 mv.addObject("user", user);
			 article.setUser_username(user.getUsername());
			 List<Article> list=articleBiz.selectAllUserArticle(article);
			 mv.addObject("list",list);
			 mv.setViewName("WEB-INF/jsp/user/MyBloggerManage");
			 return   mv;
		}	
		
		@RequestMapping("/ArticleManage1")
		public   ModelAndView   doArticleManage(HttpServletRequest  request,ModelAndView  mv,@ModelAttribute("article") Article article,Page page)
		{
			/* System.out.println(kind+"kkkkkkkkkkk");
			 mv.addObject("kind", kind);*/
			 int pageSize=15;
			 mv.addObject("kind_name", article.getKind_name());
			 Map<String,Object> maplist=new HashMap<String, Object>();
			 int sum=0;
			 User   user=(User)request.getSession().getAttribute("user");
			 mv.addObject("user", user);
			 article.setUser_username(user.getUsername());
			 maplist.put("article", article);
			 List<Article> list=articleBiz.selectAllUserArticle(article);
				if(list.size()%pageSize==0)
				{
					sum=list.size()/pageSize;
				}
				else{
					sum=(list.size()/pageSize+1);
				}
				page.setPageSum(sum);
				int   pageCurrent=page.getPageCurrent();
				String handle=page.getHandle();
				page.setUser_username(user.getUsername());
				if(pageCurrent==1&&"flat".equals(handle)){
					page.setPageCurrent(pageCurrent);
					page.setStart1(0);//yige
				}
				else  if(sum>=pageCurrent&&pageCurrent>1&&"up".equals(handle)){
					pageCurrent-=1;
					page.setStart1((pageCurrent-1)*pageSize);//yige
					page.setPageCurrent(pageCurrent);
				}
				else if(pageCurrent<=sum&&"down".equals(handle)){
					if(pageCurrent==sum){
						pageCurrent=1;
						page.setPageCurrent(pageCurrent);//yige
					}
					else{
						pageCurrent=pageCurrent+1;
						page.setStart1((pageCurrent-1)*pageSize);
						page.setPageCurrent(pageCurrent);
					}
				}
				else if("delete".equals(handle)){
					if(pageCurrent>1&&pageCurrent<=sum){
						page.setStart1((pageCurrent-1)*pageSize);
						page.setPageCurrent(pageCurrent);
					}
					else if(pageCurrent==1){
						page.setStart1((pageCurrent-1)*pageSize);
						page.setPageCurrent(pageCurrent);
					}
				}
			 maplist.put("page", page);
			 mv.addObject("page", page);
			 list=articleBiz.selectUserArticle(maplist);
			 mv.addObject("list",list);
			 mv.setViewName("WEB-INF/jsp/user/MyBloggerManage");
			 return   mv;
		}	
		
		@RequestMapping("/ArticleDelete")
		public   ModelAndView   doArticleDelete(HttpServletRequest  request,ModelAndView  mv,@ModelAttribute("article") Article article,
				@RequestParam("kind")   String  kind,@RequestParam("date1")  String  date1,
				String pageCurrent,String handle) throws Exception
		{
			 int pageCurrent1=Integer.parseInt(pageCurrent);
			 Page page=new Page();
			 page.setPageCurrent(pageCurrent1);
			 page.setHandle(handle);
			 SimpleDateFormat   format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			 Date   date2=format.parse(date1);
			 Timestamp   date=new  Timestamp(date2.getTime());
			 article.setDate(date);
			 Article  article2=articleBiz.selectOneArticleByArticle(article);
			 Comment   comment=new Comment();
			 comment.setArticle_id(article2.getId());
			 commentBiz.deleteComment(comment);
			 articleBiz.deleteArticle(article);
			 //doArticleManage(request, mv, article);
			 doArticleManage(request, mv, article, page);
			 return   mv;
		}	
		@RequestMapping("/User")
		public   ModelAndView   doToUser(ModelAndView  mv,@RequestParam("user_username")   String user_username)
		{
			 mv.setViewName("WEB-INF/jsp/comment/User");
			 return   mv;
		}	
		
		//���ϱ�ǩ�����ı�
		public    String   doContentSum(String [] kindContent,String content){
			for (String string : kindContent) {
				content=docontent(content, string);
			}
			return  content;
		}
		
		public    String   docontent(String  content,String kind_content){
			int  count=0;
			int  count1=0;
			int  j=0;
			String content1=content;
			for(int i=0;i<content1.length();i++){
				    if(content1.indexOf("<"+kind_content)!=(-1)){
				    j=content1.indexOf(kind_content);
			        count++;
					content1=(String) content1.substring(j+1, content1.length());
				    }
				}
			j=0;
			content1=content;
			for(int i=0;i<content1.length();i++){
				if(content1.indexOf("<"+"/"+kind_content+">")!=(-1)){
				    j=content1.indexOf("<"+"/"+kind_content+">");
					count1++;
					content1=(String) content1.substring(j+1, content1.length());
				}
			}
			if(count>count1){
				for(int i=0;i<(count-count1);i++){
					content+="<"+"/"+kind_content+">";
				}
			}
			return content;
		}
		//��ȡȥ�������ı�
		public    String    doContentCut(String content){
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
		
		//����������
		@RequestMapping("/selectTitle")
		public void doSelectTitle(HttpServletResponse resp,String Title) throws Exception{
			resp.setCharacterEncoding("UTF-8");
			List<String> list=new ArrayList<String>();
			list=articleBiz.selectTitle(Title);
			resp.getWriter().write(JSONArray.fromObject(list).toString());
		}
		
	  //������Ƭ�ϴ��첽��Ӧ
		//Ajax��Ӧ
        @RequestMapping("/CharacterPicture")
		public void doCharacterPicture(HttpServletRequest request, HttpServletResponse response) throws Exception{
        	response.setCharacterEncoding("UTF-8");
        	User user=(User)request.getSession().getAttribute("user");
			String trueName=user.getUsername()+".jpg";
        	String urlAjax="http://www.jinyubei.xyz:8080/SunnyImagesCharacter/"+trueName;
            PrintWriter write=response.getWriter();
            write.print(urlAjax.toString());
		}
}