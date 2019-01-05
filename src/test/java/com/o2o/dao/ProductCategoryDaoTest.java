package com.o2o.dao;

import java.util.ArrayList;
import java.util.Date;
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
	
	@Test
	public void testBatchInsertProductCategory() {
		List<ProductCategory> productCategoryList = new ArrayList<ProductCategory>();
		ProductCategory productCategory = new ProductCategory();
		productCategory.setShopId(6L);
		productCategory.setProductCategoryName("商品类别5");
		productCategory.setPriority(0);
		productCategory.setCreateTime(new Date());
		productCategoryList.add(productCategory);
		
		ProductCategory productCategory1 = new ProductCategory();
		productCategory1.setShopId(6L);
		productCategory1.setProductCategoryName("商品类别6");
		productCategory1.setPriority(6);
		productCategory1.setCreateTime(new Date());
		productCategoryList.add(productCategory1);
		System.out.println(productCategoryList);
		
		int effectedNum = productCategoryDao.batchInsertProductCategory(productCategoryList);
		System.out.println(effectedNum);
	}
}
