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
	public String test(){
		System.out.println("测试");
		User user = userService.findOne(2);
		System.out.println(user);
		update();
		return "test";
	}
	
	public void update(){
		System.out.println("更改");
		User user = new User();
		user.setId(2);
		user.setUsername("张三丰");
		userService.updateByUser(user);
		
	}
	
	
	
	
	
}
