package com.o2o.service;

import java.util.List;

import com.o2o.dto.ImageHolder;
import com.o2o.dto.ProductExecution;
import com.o2o.entity.Product;
import com.o2o.exception.ProductOperationException;

public interface ProductService {

	/**
	 * 添加商品信息以及图片处理
	 * 
	 * @param product
	 * @param thumbnail 缩略图
	 * @param productImgList 详情图列表
	 * @return
	 * @throws ProductOperationException
	 */
	ProductExecution addProduct(Product product, ImageHolder thumbnail, List<ImageHolder> productImgHolderList)
			throws ProductOperationException;
	
	/**
	 * 通过商品Id查询唯一的商品信息
	 * 
	 * @param productId
	 * @return
	 */
	Product getProductById(long productId);
	
	/**
	 * 修改商品信息以及图片处理
	 * 
	 * @param product
	 * @param thumbnail
	 * @param productImgHolderList
	 * @return
	 */
	ProductExecution modifyProduct(Product product,ImageHolder thumbnail,List<ImageHolder> productImgHolderList)
		throws ProductOperationException;

}
