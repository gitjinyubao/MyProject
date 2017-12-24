package com.sunny.demo.controller;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunny.demo.bean.Cat;
import com.sunny.demo.service.CatService;

@RestController
@RequestMapping("cat")
public class CatController {

	@Resource
	private CatService catService;

	@RequestMapping("save")
	public void save() {
		Cat cat = new Cat("david", "100");
		catService.save(cat);
		cat = new Cat("alice", "1000");
		catService.save(cat);
		cat = new Cat("hank", "10000");
		catService.save(cat);
	}

	@RequestMapping("delete")
	public void delete() {
		catService.delete(2);
	}

	@RequestMapping("all")
	public List<Cat> getAll() {
		return catService.getAll();
	}

	// 存在性
	@RequestMapping("exists")
	public boolean judgeCat() {
		return catService.judgeCat(5);
	}

	// 删除所有
	@RequestMapping("deleteAll")
	public void deleteAll() {
		catService.deleteAll();
	}

	// 根据姓名查询
	@RequestMapping("findByCatName") // http://localhost:8080/cat/findByCatName?catName=alice
	public Cat findCatByCatName(String catName) {
		return catService.findCatByCatName(catName);
	}

	// 根据姓名查询
	@RequestMapping("findByCatName2")
	public Cat findCatByCatName2(String catName) {
		return catService.findCatByCatName2(catName);
	}

	// 分页
	@RequestMapping("findCatsPage")
	public Page<Cat> findCats() {
		return catService.findCats(new PageRequest(0, 3));
	}
		// 其中Pageable是一个接口,具体的实现类为PageRequest,下面为PageRequest的一个构造方法
		/*public PageRequest(int page, int size)  
	    {  
	        this(page, size, null);  
	    }  */
		
    // 排序(id)
    public List<Cat> getCats() {
    	org.springframework.data.domain.Sort.Order[] idOrder = {new Order(Direction.DESC, "id")};
          
        Sort sort = new Sort(idOrder);  
        List<Cat> cats = (List<Cat>) catService.getCats(sort);  
        for (Cat cat : cats) {  
            System.out.println(cat);  
        }
        
		return cats;  
    }
}
