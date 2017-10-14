package com.bizImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.KindArticleBiz;
import com.dao.KindArticleDao;
import com.entity.KindArticle;
@Service
public class KindArticleBizImpl implements KindArticleBiz {

	@Autowired
	private   KindArticleDao   kindArticleDao;
	
	@Override
	public void insertKindArticle(KindArticle kindArticle) {
		// TODO Auto-generated method stub
		kindArticleDao.insertKindArticle(kindArticle);
		System.out.println("≤Â»Î÷¥––");
	}

	@Override
	public List<KindArticle> selectListKindArticle(KindArticle kindArticle) {
		// TODO Auto-generated method stub
           return  kindArticleDao.selectListKindArticle(kindArticle);
	}

	@Override
	public KindArticle selectOneKindArticle(KindArticle kindArticle) {
		// TODO Auto-generated method stub
        return   kindArticleDao.selectOneKindArticle(kindArticle);
	}
}
