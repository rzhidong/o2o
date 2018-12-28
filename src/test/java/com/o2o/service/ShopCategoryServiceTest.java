package com.o2o.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.o2o.BaseTest;
import com.o2o.entity.ShopCategory;

public class ShopCategoryServiceTest extends BaseTest{
	
	@Autowired
	private ShopCategoryService shopCategoryService;
	
	@Test
	public void testGetShopCategoryList() {
		System.out.println(shopCategoryService.getShopCategoryList(new ShopCategory()));
	}
}
