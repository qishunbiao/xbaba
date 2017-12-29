package cn.itcast.xbaba.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.xbaba.mapper.ItemsMapper;
import cn.itcast.xbaba.mapper.UserMapper;
import cn.itcast.xbaba.pojo.Items;
import cn.itcast.xbaba.pojo.User;
import cn.itcast.xbaba.service.ItemService;
import cn.itcast.xbaba.service.UserService;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemsMapper itemsMapper;
	
	//查询所有商品
	public List<Items> findAll() {
		return itemsMapper.selectAll();
	}

	public Items findOne(Integer id) {
		return itemsMapper.selectByPrimaryKey(id);
	}

	//保存商品
	public void update(Items item) {
		itemsMapper.updateByPrimaryKeySelective(item);
	}
	
	
	
}
