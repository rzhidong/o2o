package com.o2o.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.o2o.BaseTest;
import com.o2o.entity.HeadLine;

public class HeadLineServiceTest extends BaseTest{
	
	@Autowired
	private HeadLineService headLineService;
	
	@Test
	public void testGetHeadLineList() {
		HeadLine headLineCondition = new HeadLine();
		headLineCondition.setEnableStatus(1);
		System.out.println(headLineService.getHeadLineList(headLineCondition ));
	}
}
