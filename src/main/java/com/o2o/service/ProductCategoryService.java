package com.o2o.service;

import java.util.List;

import com.o2o.dto.ProductCategoryExecution;
import com.o2o.entity.ProductCategory;
import com.o2o.exception.ProductCategoryOperationException;

public interface ProductCategoryService {

	/**
	 * 查询指定某个店铺下的所有商品类别信息
	 * 
	 * @param shopId
	 * @return
	 */
	List<ProductCategory> getProductCategoryList(long shopId);

	/**
	 * 
	 * @param productCategoryList
	 * @return
	 * @throws ProductCategoryOperationException
	 */
	ProductCategoryExecution batchAddProductCategory(List<ProductCategory> productCategoryList)
			throws ProductCategoryOperationException;
}
