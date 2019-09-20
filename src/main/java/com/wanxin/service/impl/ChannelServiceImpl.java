package com.wanxin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanxin.dao.ChannelMapper;
import com.wanxin.entity.Channel;
import com.wanxin.service.ChannelService;

/**
 * @author 926474
 *
 */
@Service
public class ChannelServiceImpl implements ChannelService{

	@Autowired
	ChannelMapper channelMapper;
	
	@Override
	public List<Channel> getChannels() {
		// TODO Auto-generated method stub
		return channelMapper.getChannels();
	}
	

}
