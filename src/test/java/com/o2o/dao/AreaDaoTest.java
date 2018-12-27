package com.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.o2o.BaseTest;
import com.o2o.entity.Area;

public class AreaDaoTest extends BaseTest{
	
	@Autowired
	private AreaDao areaDao;
	
	@Test
	public void testQueryArea() {
		List<Area> list = areaDao.queryArea();
		System.out.println(list);
		assertEquals(2, list.size());
	}

}
