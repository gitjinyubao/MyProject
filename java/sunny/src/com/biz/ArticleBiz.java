package com.biz;

import java.util.List;
import java.util.Map;

import com.entity.Article;

public interface ArticleBiz {
	public   void    insertArticle(Article   article);
	public   List<Article>    selectAllUserArticle(Article  article);
	public   List<Article>    selectAllArticle();
	public   int         selectKindNumber(Map<String, Object>   map);
	public   List<Article>    selectUserArticle(Map<String,Object>  map);
	public   Article          selectOneArticle(int id);
	public   Article          selectOneArticleByArticle(Article  article);
	public   List<Article>    selectAllArticleThree(Map<String, Object>  map);
	public   void             updateArticle(Article   article);
	public   void             deleteArticle(Article   article);
	public   List<String>     selectTitle(String title);
	public   Article          selectArticleByTitle(String title);
}
