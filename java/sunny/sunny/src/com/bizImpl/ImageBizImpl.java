package com.bizImpl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.biz.ImageBiz;
import com.dao.ImageDao;
import com.entity.Image;
import com.entity.Page;
import com.entity.User;
@Service
public class ImageBizImpl implements ImageBiz {
	

@Autowired
private  ImageDao   imageDao;

@Override
public void insertImage(Image image) {
	// TODO Auto-generated method stub
	imageDao.insertImage(image);
	
}

@Override
public    List<Image>   selectListImage(Map<String, Object>  map){
	// TODO Auto-generated method stub
	return imageDao.selectListImage(map);
}

@Override
public void deleteImage(Map<String, Object>  map) {
	// TODO Auto-generated method stub
	imageDao.deleteImage(map);
}

@Override
public Image selectOneImage(String url) {
	// TODO Auto-generated method stub
	return imageDao.selectOneImage(url);

}

@Override
public List<Image> selectListImageTwelve(Page page) {
	// TODO Auto-generated method stub
	return imageDao.selectListImageTwelve(page);
}

@Override
public Image selectCharacterImage(Image  image) {
	// TODO Auto-generated method stub
	return imageDao.selectCharacterImage(image);
}

@Override
public List<Image> selectAllImage(Map<String, Object> map) {
	// TODO Auto-generated method stub
	return imageDao.selectAllImage(map);
}

//Ìí¼Ó
@Override
public void selectListImageTwelve(HttpServletRequest request, ModelAndView mv,
		Map<String, Object> map, Page page) {
	int sum=0;
	User user=(User)request.getSession().getAttribute("user");
	map.put("user_username", user.getUsername());
	if(imageDao.selectAllImage(map).size()%5==0)
	{
		sum=imageDao.selectAllImage(map).size()/5;
	}
	else{
		sum=(imageDao.selectAllImage(map).size()/5+1);
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
    List<Image>   listImage=imageDao.selectListImageTwelve(page);
    mv.addObject("listImage", listImage);
}	
}
