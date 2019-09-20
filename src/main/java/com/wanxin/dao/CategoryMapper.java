package com.wanxin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.wanxin.entity.Category;

/**
 * @author 926474
 *
 */
@Mapper
public interface CategoryMapper {

	@Select("select id,name,channel_id channelId from cms_category where channel_id = #{value} ")
	List<Category> getCategoryByChId(Integer cid);

}
