package com.o2o.service;


import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.o2o.BaseTest;
import com.o2o.entity.Area;

public class AreaServiceTest extends BaseTest{
	
	@Autowired
	private AreaService areaService;
	
	@Autowired
	private CacheService cacheService;
	
	@Test
	public void testGetAreaList() {
		List<Area> list = areaService.getAreaList();
		System.out.println(list);
		cacheService.removeFromCache(AreaService.AREALISTKEY);
		System.out.println(areaService.getAreaList());
	}

}
