package com.services;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.dao.BaseDaoHibImpl;
import com.domain.Userinfo;

public class UserinfoServiceImpl implements UserinfoService {

	private BaseDaoHibImpl<Userinfo> baseDao;
	@Override
	public String getPwd(String usr) {
		// TODO Auto-generated method stub
		Userinfo userinfo=baseDao.get(Userinfo.class, Integer.parseInt(usr));
		if(userinfo!=null){
			HttpSession session=ServletActionContext.getRequest().getSession();
			session.setAttribute("userinfo", userinfo);
			return userinfo.getPassword();
		}
		else 
			return "#";
	}

	@Override
	public int creatUserinfo(Userinfo userinfo) {
		// TODO Auto-generated method stub
		baseDao.save(userinfo);
		return 0;
	}

	@Override
	public boolean deleteUserinfo(Integer userId) {
		// TODO Auto-generated method stub
		//System.out.println(userId);
		try {
			baseDao.delete(Userinfo.class,userId,"userId");
		} catch (Exception e) {
			// TODO: handle exception
			
			return false;
		}
		return true;
	}

	@Override
	public boolean updateUserinfo(Userinfo userinfo) {
		// TODO Auto-generated method stub
		try {
			System.out.println(userinfo);
			baseDao.update(userinfo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public List getAllUserinfo() {
		// TODO Auto-generated method stub
		String hql="";
		return baseDao.find(hql);
	}

	@Override
	public List getUserinfoById(Integer userId) {
		// TODO Auto-generated method stub
		String hql="";
		return baseDao.find(hql);
	}

	@Override
	public List getUserinfoByIdOnly(Integer userId) {
		// TODO Auto-generated method stub
		String hql="select u from Userinfo u where u.userId="+userId;
		return baseDao.find(hql);
	}

	
	
	public BaseDaoHibImpl<Userinfo> getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDaoHibImpl<Userinfo> baseDao) {
		this.baseDao = baseDao;
	}
}
