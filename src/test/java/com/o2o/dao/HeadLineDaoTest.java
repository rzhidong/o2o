package com.o2o.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.o2o.BaseTest;
import com.o2o.entity.HeadLine;

public class HeadLineDaoTest extends BaseTest{
	
	@Autowired
	private HeadLineDao headLineDao;
	
	@Test
	public void testQueryHeadLine() {
		HeadLine headLineCondition = new HeadLine();
		headLineCondition.setEnableStatus(1);
		List<HeadLine> headLineList = headLineDao.queryHeadLine(headLineCondition);
		if (headLineList != null) {
			for (HeadLine headLine : headLineList) {
				System.out.println(headLine);
			}
		}
	}

}
