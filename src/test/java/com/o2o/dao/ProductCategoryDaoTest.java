package com.o2o.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.o2o.BaseTest;
import com.o2o.entity.ProductCategory;

public class ProductCategoryDaoTest extends BaseTest{
	
	@Autowired
	private ProductCategoryDao productCategoryDao;

	@Test
	public void testQueryProductCategoryList() {
		List<ProductCategory> list = productCategoryDao.queryProductCategoryList(23L);
		System.out.println(list);
	}
}
