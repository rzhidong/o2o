package com.o2o.service;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.o2o.BaseTest;
import com.o2o.dto.ShopExecution;
import com.o2o.entity.Area;
import com.o2o.entity.PersonInfo;
import com.o2o.entity.Shop;
import com.o2o.entity.ShopCategory;
import com.o2o.enums.ShopStateEnum;

public class ShopServiceTest extends BaseTest{
	
	@Autowired
	private ShopService shopService;
	
	@Test
	public void testAddShop() throws FileNotFoundException {
		Shop shop = new Shop();
		PersonInfo owner = new PersonInfo();
		Area area = new Area();
		ShopCategory shopCategory = new ShopCategory();
		owner.setUserId(1L);
		area.setAreaId(1);
		shopCategory.setShopCategoryId(1L);
		
		shop.setOwner(owner);
		shop.setArea(area);
		shop.setShopCategory(shopCategory);
		
		shop.setShopName("店铺test");
		shop.setShopDesc("test");
		shop.setShopAddr("test");
		shop.setPhone("phone");
		shop.setPriority(1);
		shop.setEnableStatus(ShopStateEnum.CHECK.getState());
		shop.setAdvice("advice");
		
		File shopImg = new File(System.getProperty("user.dir") + "\\src\\main\\resources\\Thumbnailator\\java.jpg");
		InputStream shopImgInputStream = new FileInputStream(shopImg);
		ShopExecution shopExecution = shopService.addShop(shop, shopImgInputStream,shopImg.getName());
		assertEquals(ShopStateEnum.CHECK.getState(), shopExecution.getState());
	}

}
