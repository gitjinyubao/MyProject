package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Image;
import com.entity.Page;

public interface ImageDao {
	public    void   insertImage(Image   image);
	/*public    List<Image>   selectListImage(String type);*/
	public    List<Image>   selectAllImage(Map<String, Object>  map);
	public    List<Image>   selectListImage(Map<String, Object>  map);
	public    List<Image>   selectListImageTwelve(Page page);
	public    Image   selectCharacterImage(Image   image);
	public    void   deleteImage(Map<String, Object>  map);
	public    Image   selectOneImage(String   url);  
}
