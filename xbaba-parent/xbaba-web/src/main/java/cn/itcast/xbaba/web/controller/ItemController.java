package cn.itcast.xbaba.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.xbaba.pojo.Items;
import cn.itcast.xbaba.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	/**
	 * 展示商品列表
	 */
	@RequestMapping("ItemController_list.action")
	public ModelAndView list(){
		List<Items> list = itemService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.addObject("itemList", list);
		mav.setViewName("itemList");
		return mav;
	}
	
	@RequestMapping("ItemController_edit.action")
	public ModelAndView edit(Integer id){
		Items item = itemService.findOne(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("item", item);
		mav.setViewName("editItem");
		return mav;
	}
	
	@RequestMapping("ItemController_update.action")
	public ModelAndView edit(Items item){
		itemService.update(item);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("test");
		return mav;
	}
	
	
	
}
