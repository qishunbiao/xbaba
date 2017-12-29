package cn.itcast.xbaba.service;

import java.util.List;

import cn.itcast.xbaba.pojo.Items;

public interface ItemService {

	List<Items> findAll();

	Items findOne(Integer id);

	void update(Items item);


}
