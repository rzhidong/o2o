package com.o2o.util;

import org.junit.Test;

public class PathUtilTest {
	
	@Test
	public void testGetImgBasePath() {
		System.out.println(System.getProperty("os.name"));
		System.out.println( System.getProperty("file.separator"));
		
		System.out.println(PathUtil.getImgBasePath());
	}
	
	@Test
	public void testGetShopImagePath() {
		System.out.println(PathUtil.getShopImagePath(1L));
	}

}
