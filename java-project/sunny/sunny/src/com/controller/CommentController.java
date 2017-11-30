package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biz.CommentBiz;
import com.biz.UserBiz;
import com.entity.Comment;
import com.entity.User;

@Controller
@RequestMapping("/comment")
public class CommentController {
	
	@Autowired
	private   CommentBiz    commentBiz;
	
	@Autowired
	private   UserBiz       userBiz;
	
	@RequestMapping(value="/Comment")
	public   void   insertArticleComment(HttpServletRequest   request,HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		Comment comment=new Comment();
	    comment.setContent(request.getParameter("content"));
	    comment.setArticle_id(Integer.parseInt(request.getParameter("article_id")));
		User   user=(User)request.getSession().getAttribute("user");
		if(null!=user)
		{
			User  userComment=userBiz.selectUser(user);
			comment.setUser_nickname(userComment.getNickname());
			comment.setUsername(userComment.getUsername());
			commentBiz.insertArticleComment(comment);
			List<Comment>  listComment1=commentBiz.selectListComment(comment);
			List<String> listComment=new ArrayList<String>();
			for (Comment comment2 : listComment1) {
				listComment.add(comment2.getUser_nickname());
				listComment.add(comment2.getContent());
			}
			response.getWriter().write(JSONArray.fromObject(listComment).toString());
		}
	}
}
