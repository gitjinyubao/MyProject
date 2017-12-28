package com.bizImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.CommentBiz;
import com.dao.CommentDao;
import com.entity.Comment;
@Service("CommentBizImpl")
public class CommentBizImpl implements   CommentBiz{
	@SuppressWarnings("unused")
	@Autowired
	private    CommentDao    commentDao;

	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}

	@Override
	public void insertArticleComment(Comment comment) {
		// TODO Auto-generated method stub
		commentDao.insertArticleComment(comment);
	}

	@Override
	public List<Comment> selectListComment(Comment comment) {
		// TODO Auto-generated method stub
		return commentDao.selectListComment(comment);
	}

	@Override
	public void deleteComment(Comment comment) {
		// TODO Auto-generated method stub
		commentDao.deleteComment(comment);
	} 
}
