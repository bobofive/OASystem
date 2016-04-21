package com.utils;

import java.util.Calendar;

import com.opensymphony.xwork2.ActionContext;

public class BaseTools {
	
	/**
	 * 失败的跳转页面
	 * @param message 显示信息
	 * @param jumpURL 跳转的url地址
	 * @param waitSecond 等待时间
	 */
	public static void success(String message, String jumpURL, String waitSecond) {
		waitSecond = waitSecond == null ? "2": waitSecond;
		ActionContext context = ActionContext.getContext();
		context.put("issuccess", "1");
		context.put("message", message);
		context.put("waitSecond", waitSecond);
		context.put("jumpURL", jumpURL);
	}
	
	/**
	 * 成功的跳转页面
	 * @param message 显示信息
	 * @param jumpURL 跳转的url地址
	 * @param waitSecond 等待时间
	 */
	public static void error(String message,  String jumpURL, String waitSecond) {
		waitSecond = waitSecond == null ? "4": waitSecond;
		ActionContext context = ActionContext.getContext();
		context.put("issuccess", "0");
		context.put("message", message);
		context.put("waitSecond", waitSecond);
		context.put("jumpURL", jumpURL);
	}
	
	

}
