package com.wanxin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.wanxin.entity.Channel;

/**
 * @author 926474
 *
 */
@Mapper
public interface ChannelMapper {

	@Select("select * from cms_channel order by id")
	@ResultType(Channel.class)
	List<Channel> getChannels();
	
}
