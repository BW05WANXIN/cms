package com.wanxin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanxin.dao.CategoryMapper;
import com.wanxin.entity.Category;
import com.wanxin.service.CategoryService;

/**
 * @author 926474
 *
 */
@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryMapper categoryMapper; 
	
	@Override
	public List<Category> getCategoryByChId(Integer cid) {
		// TODO Auto-generated method stub
		return categoryMapper.getCategoryByChId(cid) ;
	}

}
