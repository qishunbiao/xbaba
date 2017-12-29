package cn.itcast.xbaba.service;

import cn.itcast.xbaba.pojo.User;

public interface UserService {

	User findOne(Integer id);
	
	void updateByUser(User user);

	void deleteByUserId(Integer id);

}
