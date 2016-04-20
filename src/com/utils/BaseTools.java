package com.utils;

import java.util.Calendar;

import com.opensymphony.xwork2.ActionContext;

public class BaseTools {
	
	/**
	 * ʧ�ܵ���תҳ��
	 * @param message ��ʾ��Ϣ
	 * @param jumpURL ��ת��url��ַ
	 * @param waitSecond �ȴ�ʱ��
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
	 * �ɹ�����תҳ��
	 * @param message ��ʾ��Ϣ
	 * @param jumpURL ��ת��url��ַ
	 * @param waitSecond �ȴ�ʱ��
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
