package com.o2o.web.shopadmin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *  主要用来解析路由并转发到相应的html中
 * @author ZhouCC
 *
 */
@Controller
@RequestMapping(value="/shopadmin",method=RequestMethod.GET)
public class ShopAdminController {
	
	@RequestMapping("/shopoperation")
	public String shopOperation() {
		// 转发至店铺注册/编辑页面
		return "shop/shopoperation";
	}
	
	@RequestMapping("/shoplist")
	public String shopList() {
		// 转发至店铺注册/编辑页面
		return "shop/shoplist";
	}
	
	@RequestMapping("/shopmanagement")
	public String shopManagement() {
		// 转发至店铺注册/编辑页面
		return "shop/shopmanagement";
	}

}
