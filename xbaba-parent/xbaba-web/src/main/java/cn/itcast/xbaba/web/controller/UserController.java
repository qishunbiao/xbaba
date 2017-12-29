package cn.itcast.xbaba.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.xbaba.pojo.User;
import cn.itcast.xbaba.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/test.action")
	public String test(User u){
		System.out.println("测试"+u.getId());
		User user = userService.findOne(2);
		System.out.println(user);
		return "test";
	}
	
	
	
	
	
}
