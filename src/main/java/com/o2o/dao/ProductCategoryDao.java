package com.o2o.dao;

import java.util.List;

import com.o2o.entity.ProductCategory;

public interface ProductCategoryDao {
	
	/**
	 * 通过shop id 查询店铺商品类别
	 * 
	 * @param shopId
	 * @return
	 */
	List<ProductCategory> queryProductCategoryList(Long shopId);

}
