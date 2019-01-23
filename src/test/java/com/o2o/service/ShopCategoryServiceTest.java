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
		ShopCategory shopCategoryCondition = new ShopCategory();
		System.out.println(shopCategoryService.getShopCategoryList(shopCategoryCondition));
		
		System.out.println(shopCategoryService.getShopCategoryList(null));
		
		ShopCategory testCategory = new ShopCategory();
		ShopCategory parentCategory = new ShopCategory();
		parentCategory.setShopCategoryId(12L);
		testCategory.setParent(parentCategory);
		System.out.println(shopCategoryService.getShopCategoryList(testCategory));
	}
}
