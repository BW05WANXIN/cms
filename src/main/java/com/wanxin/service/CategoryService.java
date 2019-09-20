package com.wanxin.service;

import java.util.List;

import com.wanxin.entity.Category;

/**
 * @author 926474
 *
 */
public interface CategoryService {

	List<Category> getCategoryByChId(Integer cid);

}
