package cn.itcast.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.xbaba.mapper.UserMapper;
import cn.itcast.xbaba.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class MapperTest {
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void test(){
		User user = userMapper.selectByPrimaryKey(2);
		System.out.println(user);
	}
	
	

}
