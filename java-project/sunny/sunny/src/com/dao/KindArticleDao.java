package com.dao;

import java.util.List;

import com.entity.KindArticle;

public interface KindArticleDao {
	public  void  insertKindArticle(KindArticle  kindArticle);
    public  List<KindArticle>  selectListKindArticle(KindArticle kindArticle);
    public  KindArticle  selectOneKindArticle(KindArticle kindArticle);   
}
