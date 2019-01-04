package com.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.o2o.BaseTest;
import com.o2o.entity.Area;
import com.o2o.entity.PersonInfo;
import com.o2o.entity.Shop;
import com.o2o.entity.ShopCategory;

public class ShopDaoTest extends BaseTest {

	@Autowired
	private ShopDao shopDao;

	@Test
	@Ignore
	public void testInsertShop() {
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

		shop.setShopName("测试店铺");
		shop.setShopDesc("test");
		shop.setShopAddr("test");
		shop.setPhone("phone");
		shop.setShopImg("img");
		shop.setPriority(1);
		shop.setCreateTime(new Date());
		shop.setLastEditTime(new Date());
		shop.setEnableStatus(1);
		shop.setAdvice("advice");

		int effectNum = shopDao.insertShop(shop);
		assertEquals(1, effectNum);
	}

	@Test
	public void testUpdateShop() {
		Shop shop = new Shop();
		PersonInfo owner = new PersonInfo();
		owner.setUserId(2L);
		shop.setShopId(1L);
		shop.setOwner(owner);
		shop.setLastEditTime(new Date());
		shop.setShopDesc("测试描述");
		shop.setShopAddr("测试地址");
		shop.setAdvice("审核中");

		int effectNum = shopDao.updateShop(shop);
		assertEquals(1, effectNum);
	}

	@Test
	public void testQueryByShopId() {
		Shop shop = shopDao.queryByShopId(5L);
		Area area = shop.getArea();
		PersonInfo owner = shop.getOwner();
		ShopCategory shopCategory = shop.getShopCategory();
		System.out.println(shop + "\n" + area + "\n" + owner + "\n" + shopCategory);
	}

	@Test
	public void testQueryShopList() {
		Shop shopCondition = new Shop();
		shopCondition.setShopName("te");
		List<Shop> shops = shopDao.queryShopList(shopCondition, 0, 5);
		for (Shop shop : shops) {
			Area area = shop.getArea();
			PersonInfo owner = shop.getOwner();
			ShopCategory shopCategory = shop.getShopCategory();
			System.out.println(shop + "\n" + area + "\n" + owner + "\n" + shopCategory);
		}
		System.out.println(shopDao.queryShopCount(shopCondition));
	}

}
