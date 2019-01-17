package com.o2o.dao;

import java.util.Date;
import java.util.UUID;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.o2o.BaseTest;
import com.o2o.entity.PersonInfo;
import com.o2o.entity.WechatAuth;

public class WechatAuthDaoTest extends BaseTest{
	
	@Autowired
	private WechatAuthDao wechatAuthDao;
	
	@Autowired
	private PersonInfoDao personInfoDao;
	
	@Test
	public void testQueryWechatInfoByOpenId() {
		System.out.println(wechatAuthDao.queryWechatInfoByOpenId("ovLbns-gxJHqC-UTPQKvgEuENl-E"));
	}
	
	@Test
	public void testInsertWechatAuth() {
		WechatAuth wechatAuth = new WechatAuth();
		wechatAuth.setOpenId(UUID.randomUUID().toString());
		PersonInfo personInfo = personInfoDao.queryPersonInfoById(9L);
		wechatAuth.setPersonInfo(personInfo);
		wechatAuth.setCreateTime(new Date());
		int effectedNum = wechatAuthDao.insertWechatAuth(wechatAuth);
		System.out.println(effectedNum);
	}
}
