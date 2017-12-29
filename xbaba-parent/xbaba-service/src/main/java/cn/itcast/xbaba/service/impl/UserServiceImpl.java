package cn.itcast.xbaba.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.xbaba.mapper.UserMapper;
import cn.itcast.xbaba.pojo.User;
import cn.itcast.xbaba.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	//根据用户id查询用户
	public User findOne(Integer id){
		return userMapper.selectByPrimaryKey(id);
	}

	public void updateByUser(User user) {
		userMapper.updateByPrimaryKeySelective(user);
		deleteByUserId(11);
	}
	
	public void deleteByUserId(Integer id){
		userMapper.deleteByPrimaryKey(id);
	}
	
	
	
}
