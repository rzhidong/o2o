package com.o2o.dao;

import org.apache.ibatis.annotations.Param;

import com.o2o.entity.Product;

public interface ProductDao {
	
	/**
	 * 插入商品
	 * 
	 * @param product
	 * @return
	 */
	int insertProduct(Product product);
	
	/**
	 * 通过productId查询唯一的商品信息
	 * 
	 * @param productId
	 * @return
	 */
	Product queryProductById(@Param("productId")long productId);
	
	/**
	 * 更新商品信息
	 * 
	 * @param product
	 * @return
	 */
	int updateProduct(Product product);

}
