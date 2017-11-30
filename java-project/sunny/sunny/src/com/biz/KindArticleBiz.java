package com.biz;

import java.util.List;

import com.entity.KindArticle;

public interface KindArticleBiz {
	public  void  insertKindArticle(KindArticle  kindArticle);
    public  List<KindArticle>  selectListKindArticle(KindArticle kindArticle);
    public  KindArticle  selectOneKindArticle(KindArticle kindArticle); 
}
