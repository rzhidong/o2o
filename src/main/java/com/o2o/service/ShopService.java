package com.o2o.service;

import java.io.InputStream;

import com.o2o.dto.ShopExecution;
import com.o2o.entity.Shop;

public interface ShopService {
	
	ShopExecution addShop(Shop shop,InputStream shopImgInputStream,String fileName);

}
