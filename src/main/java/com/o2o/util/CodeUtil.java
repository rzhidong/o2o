package com.o2o.util;

import javax.servlet.http.HttpServletRequest;

public class CodeUtil {

	/**
	 * 检查验证码是否和预期相符
	 * 
	 * @param request
	 * @return
	 */
	public static boolean checkVerifyCode(HttpServletRequest request) {
		String verifyCodeExpected = (String) request.getSession()
				.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
		verifyCodeExpected = verifyCodeExpected.toLowerCase();
		System.out.println("verifyCodeExpected: " + verifyCodeExpected);
		
		String verifyCodeActual = HttpServletRequestUtil.getString(request, "verifyCodeActual");
		verifyCodeActual = verifyCodeActual.toLowerCase();
		System.out.println("verifyCodeActual: " + verifyCodeActual);
		
		if (verifyCodeActual == null || !verifyCodeActual.equals(verifyCodeExpected)) {
			return false;
		}
		return true;
	}

}
