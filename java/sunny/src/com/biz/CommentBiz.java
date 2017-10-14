package com.biz;

import java.util.List;

import com.entity.Comment;

public interface CommentBiz {
	public   void     insertArticleComment(Comment   comment);
	public  List<Comment>  selectListComment(Comment  comment);
	public  void      deleteComment(Comment   comment);

}
