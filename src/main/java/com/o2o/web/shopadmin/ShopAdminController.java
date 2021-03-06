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
		// 转发至店铺列表页面
		return "shop/shoplist";
	}
	
	@RequestMapping("/shopmanagement")
	public String shopManagement() {
		// 转发至店铺管理页面
		return "shop/shopmanagement";
	}
	
	@RequestMapping("/productcategorymanagement")
	public String productCategoryManagement() {
		// 转发至商品类别管理页面
		return "shop/productcategorymanagement";
	}
	
	@RequestMapping("/productoperation")
	public String productOperation() {
		// 转发至商品添加/编辑页面
		return "shop/productoperation";
	}
	
	@RequestMapping(value = "/productmanagement")
	public String productManagement() {
		// 转发至商品管理页面
		return "shop/productmanagement";
	}

}
