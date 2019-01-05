package com.o2o.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.o2o.BaseTest;
import com.o2o.entity.ProductCategory;

public class ProductCategoryServiceTest extends BaseTest{
	
	@Autowired
	private ProductCategoryService productCategoryService;
	
	@Test
	public void testGetProductCategoryList() {
		List<ProductCategory> list = productCategoryService.getProductCategoryList(23L);
		System.out.println(list);
	}

}
