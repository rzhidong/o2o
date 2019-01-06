package com.o2o.dao;

import java.util.List;

import com.o2o.entity.ProductImg;

public interface ProductImgDao {
	
	/**
	 * 批量添加商品详情图片
	 * 
	 * @param productImgList
	 * @return
	 */
	int batchInsertProductImg(List<ProductImg> productImgList);

}
