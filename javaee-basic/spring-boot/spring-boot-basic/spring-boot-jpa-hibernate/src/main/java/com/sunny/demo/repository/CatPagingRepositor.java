package com.sunny.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.sunny.demo.bean.Cat;

/**  PagingAndSortingRepository 接口继承于 CrudRepository 接口，拥有CrudRepository 接口的所有方法 
 *   特有方法有两个 分页，和 排序， 这两个方法的缺陷是不能有筛选条件 
 */
public interface CatPagingRepositor extends PagingAndSortingRepository<Cat, Integer> {
}
