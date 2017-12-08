package com.entity;

import java.util.List;


/**
 * @author Jin
 *分页插件工具类
 */
public class Pager<T> {
	
	private int totalRecord;//总的记录数
	
	private int pageSize;//页面显示的记录数
	
	private int currentPage;//当前页数
	
	private int totalPage;//一共多少页
	
	private List<T> dataList;//要显示的数据
	

}
