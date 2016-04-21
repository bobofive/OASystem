package com.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.domain.Userinfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.services.UserinfoService;
import com.utils.BaseTools;

public class LoginAction extends ActionSupport{
	
	private String usr;
	private String pwd;
	private String identity;
	private UserinfoService userinfoService;
	private Userinfo userinfo;
	
	//用户登录
	public String login(){
		
		//验证用户是否存在
		if(userinfoService.getUserinfoById(Integer.parseInt(usr)).size() == 0){
			BaseTools.error("用户不存在", null, null);
			return "err";
		}
		
		//验证密码是否正确
		if(userinfoService.getPwd(usr).equals(pwd)){
			
			HttpSession session=ServletActionContext.getRequest().getSession();	
			userinfo=(Userinfo) session.getAttribute("userinfo");
		}
		//用户身份登录验证
		if(identity.equals("user"))
			return "usr";
		//管理员身份验证
		else if(identity.equals("admin"))
			return "adm";
		
		//登录失败
		BaseTools.error("登录失败，密码错误", null, null);
		return "err";
	}
	
	//用户退出
	public String signout(){
		Map attibutes = ActionContext.getContext().getSession();
		attibutes.clear();
		return "signout";
	}

	
	
	public String getUsr() {
		return usr;
	}

	public void setUsr(String usr) {
		this.usr = usr;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public UserinfoService getUserinfoService() {
		return userinfoService;
	}

	public void setUserinfoService(UserinfoService userinfoService) {
		this.userinfoService = userinfoService;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public Userinfo getUserinfo() {	
		return userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}
	
}
