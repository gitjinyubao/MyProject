package com.bizImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.ArticleBiz;
import com.dao.ArticleDao;
import com.entity.Article;
@Service("articleBizImpl")
public class ArticleBizImpl implements ArticleBiz {

	@Autowired
	private    ArticleDao   articleDao;

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	@Override
	public void insertArticle(Article article) {
		// TODO Auto-generated method stub
		articleDao.insertArticle(article);
	}

	@Override
	public List<Article> selectAllUserArticle(Article  article) {
		// TODO Auto-generated method stub
		return articleDao.selectAllUserArticle(article);
	}

	@Override
	public List<Article> selectAllArticle() {
		// TODO Auto-generated method stub
		return articleDao.selectAllArticle();
	}

	@Override
	public List<Article> selectAllArticleThree(Map<String, Object>  map) {
		// TODO Auto-generated method stub
		return articleDao.selectAllArticleThree(map);
	}

	@Override
	public void updateArticle(Article article) {
		// TODO Auto-generated method stub
		articleDao.updateArticle(article);
	}

	@Override
	public void deleteArticle(Article article) {
		// TODO Auto-generated method stub
		articleDao.deleteArticle(article);
	}

	@Override
	public Article selectOneArticle(int id) {
		// TODO Auto-generated method stub
		return articleDao.selectOneArticle(id);
	}

	@Override
	public int selectKindNumber(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return articleDao.selectKindNumber(map);
	}

	@Override
	public Article selectOneArticleByArticle(Article article) {
		// TODO Auto-generated method stub
		return articleDao.selectOneArticleByArticle(article);
	}

	@Override
	public List<Article> selectUserArticle(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return articleDao.selectUserArticle(map);
	}

	@Override
	public List<String> selectTitle(String title) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list=articleDao.selectTitle(title);
		int j=0;
		for (String string : list) {
			System.out.println("haha");
			System.out.println("list"+string);
		}
		return list;
	}

	@Override
	public Article selectArticleByTitle(String title) {
		// TODO Auto-generated method stub
		return articleDao.selectArticleByTitle(title);
	}
}
