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
	
	//�û���¼
	public String login(){
		
		//��֤�û��Ƿ����
		if(userinfoService.getUserinfoById(Integer.parseInt(usr)).size() == 0){
			BaseTools.error("�û�������", null, null);
			return "err";
		}
		
		//��֤�����Ƿ���ȷ
		if(userinfoService.getPwd(usr).equals(pwd)){
			
			HttpSession session=ServletActionContext.getRequest().getSession();	
			userinfo=(Userinfo) session.getAttribute("userinfo");
		}
		//�û���ݵ�¼��֤
		if(identity.equals("user"))
			return "usr";
		//����Ա�����֤
		else if(identity.equals("admin"))
			return "adm";
		
		//��¼ʧ��
		BaseTools.error("��¼ʧ�ܣ��������", null, null);
		return "err";
	}
	
	//�û��˳�
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
